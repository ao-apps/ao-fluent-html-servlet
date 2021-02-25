/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2019, 2020, 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-fluent-html-servlet.
 *
 * ao-fluent-html-servlet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-fluent-html-servlet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-fluent-html-servlet.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoindustries.html.servlet;

import com.aoindustries.encoding.servlet.EncodingContextEE;
import com.aoindustries.html.Document;
import java.io.IOException;
import java.io.Writer;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 *
 * @author  AO Industries, Inc.
 */
final public class DocumentEE {

	// Make no instances
	private DocumentEE() {}

	/**
	 * Context init parameter that may be used to configure the default document indent within an application.
	 * Must be one of "true", "false", or "auto" (the default).
	 */
	public static final String INDENT_INIT_PARAM = Document.class.getName() + ".indent";

	/**
	 * Determines the default document indent by first checking for {@linkplain ServletContext#getInitParameter(java.lang.String) context-param}
	 * of {@link #INDENT_INIT_PARAM}, then using {@code false} when unspecified or "auto".
	 */
	public static boolean getDefaultIndent(ServletContext servletContext) {
		String initParam = servletContext.getInitParameter(INDENT_INIT_PARAM);
		if(initParam != null) {
			initParam = initParam.trim();
			if(!initParam.isEmpty()) {
				if("true".equalsIgnoreCase(initParam)) {
					return true;
				} else if("false".equalsIgnoreCase(initParam)) {
					return false;
				} else if(!"auto".equalsIgnoreCase(initParam)) {
					throw new IllegalArgumentException("Unexpected value for " + INDENT_INIT_PARAM + ": Must be one of \"true\", \"false\", or \"auto\": " + initParam);
				}
			}
		}
		return false;
	}

	private static final String INDENT_REQUEST_ATTRIBUTE = INDENT_INIT_PARAM;

	/**
	 * Registers the document indent in effect for the request.
	 * <p>
	 * This does not change existing instances of {@link Document};
	 * it only affects the configuration of new instances.
	 * </p>
	 */
	public static void setIndent(ServletRequest request, Boolean indent) {
		request.setAttribute(INDENT_REQUEST_ATTRIBUTE, indent);
	}

	/**
	 * Replaces the document indent in effect for the request.
	 * <p>
	 * This does not change existing instances of {@link Document};
	 * it only affects the configuration of new instances.
	 * </p>
	 *
	 * @return  The previous attribute value, if any
	 */
	public static Boolean replaceIndent(ServletRequest request, Boolean indent) {
		Boolean old = (Boolean)request.getAttribute(INDENT_REQUEST_ATTRIBUTE);
		request.setAttribute(INDENT_REQUEST_ATTRIBUTE, indent);
		return old;
	}

	/**
	 * Gets the document indent in effect for the request, or {@linkplain #getDefaultIndent(javax.servlet.ServletContext) the default}
	 * when not yet {@linkplain #setIndent(javax.servlet.ServletRequest, java.lang.Boolean) set}.
	 * <p>
	 * Once the default is resolved,
	 * {@linkplain #setIndent(javax.servlet.ServletRequest, java.lang.Boolean) sets the request attribute}.
	 * </p>
	 * <p>
	 * This does not change existing instances of {@link Document};
	 * it only affects the configuration of new instances.
	 * </p>
	 */
	public static boolean getIndent(ServletContext servletContext, ServletRequest request) {
		Boolean indent = (Boolean)request.getAttribute(INDENT_REQUEST_ATTRIBUTE);
		if(indent == null) {
			indent = getDefaultIndent(servletContext);
			request.setAttribute(INDENT_REQUEST_ATTRIBUTE, indent);
		}
		return indent;
	}

	public static Document get(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response, Writer out, boolean indent) {
		return new Document(
			new EncodingContextEE(servletContext, request, response),
			out
		).setIndent(indent);
	}

	/**
	 * Uses the {@linkplain #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default indentation settings}.
	 *
	 * @see  #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #get(javax.servlet.ServletContext, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.io.Writer, boolean)
	 */
	public static Document get(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response, Writer out) {
		return get(
			servletContext, request, response, out,
			getIndent(servletContext, request)
		);
	}

	/**
	 * @see  ServletResponse#getWriter()
	 */
	public static Document get(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response, boolean indent) throws IOException {
		return get(servletContext, request, response, response.getWriter(), indent);
	}

	/**
	 * Uses the {@linkplain #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default indentation settings}.
	 *
	 * @see  #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #get(javax.servlet.ServletContext, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, boolean)
	 */
	public static Document get(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return get(
			servletContext, request, response,
			getIndent(servletContext, request)
		);
	}

	public static Document get(HttpServletRequest request, HttpServletResponse response, Writer out, boolean indent) {
		return get(request.getServletContext(), request, response, out, indent);
	}

	/**
	 * Uses the {@linkplain #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default indentation settings}.
	 *
	 * @see  #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #get(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.io.Writer, boolean)
	 */
	public static Document get(HttpServletRequest request, HttpServletResponse response, Writer out) {
		return get(request.getServletContext(), request, response, out);
	}

	/**
	 * @see  ServletRequest#getServletContext()
	 * @see  ServletResponse#getWriter()
	 */
	public static Document get(HttpServletRequest request, HttpServletResponse response, boolean indent) throws IOException {
		return get(request.getServletContext(), request, response, response.getWriter(), indent);
	}

	/**
	 * Uses the {@linkplain #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default indentation settings}.
	 *
	 * @see  #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #get(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, boolean)
	 */
	public static Document get(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return get(request.getServletContext(), request, response, response.getWriter());
	}
}
