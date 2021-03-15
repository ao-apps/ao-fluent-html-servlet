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
import com.aoindustries.html.servlet.any.AnyDocumentEE;
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
final public class DocumentEE extends AnyDocumentEE<DocumentEE> implements AnyContentEE<DocumentEE> {

	// <editor-fold desc="Automatic Newline and Indentation">
	// TODO: Configure at AnyDocumentEE level?
	/**
	 * Context init parameter that may be used to configure the default document autonli within an application.
	 * Must be one of "true", "false", or "auto" (the default).
	 */
	public static final String AUTONLI_INIT_PARAM = Document.class.getName() + ".autonli";

	/**
	 * Determines the default document autonli by first checking for {@linkplain ServletContext#getInitParameter(java.lang.String) context-param}
	 * of {@link #AUTONLI_INIT_PARAM}, then using {@code false} when unspecified or "auto".
	 */
	public static boolean getDefaultAutonli(ServletContext servletContext) {
		String initParam = servletContext.getInitParameter(AUTONLI_INIT_PARAM);
		if(initParam != null) {
			initParam = initParam.trim();
			if(!initParam.isEmpty()) {
				if("true".equalsIgnoreCase(initParam)) {
					return true;
				} else if("false".equalsIgnoreCase(initParam)) {
					return false;
				} else if(!"auto".equalsIgnoreCase(initParam)) {
					throw new IllegalArgumentException("Unexpected value for " + AUTONLI_INIT_PARAM + ": Must be one of \"true\", \"false\", or \"auto\": " + initParam);
				}
			}
		}
		return false;
	}

	private static final String AUTONLI_REQUEST_ATTRIBUTE = AUTONLI_INIT_PARAM;

	/**
	 * Registers the document autonli in effect for the request.
	 * <p>
	 * This does not change existing instances of {@link DocumentEE};
	 * it only affects the configuration of new instances.
	 * </p>
	 */
	public static void setAutonli(ServletRequest request, Boolean autonli) {
		request.setAttribute(AUTONLI_REQUEST_ATTRIBUTE, autonli);
	}

	/**
	 * Replaces the document autonli in effect for the request.
	 * <p>
	 * This does not change existing instances of {@link DocumentEE};
	 * it only affects the configuration of new instances.
	 * </p>
	 *
	 * @return  The previous attribute value, if any
	 */
	public static Boolean replaceAutonli(ServletRequest request, Boolean autonli) {
		Boolean old = (Boolean)request.getAttribute(AUTONLI_REQUEST_ATTRIBUTE);
		request.setAttribute(AUTONLI_REQUEST_ATTRIBUTE, autonli);
		return old;
	}

	/**
	 * Gets the document autonli in effect for the request, or {@linkplain #getDefaultAutonli(javax.servlet.ServletContext) the default}
	 * when not yet {@linkplain #setAutonli(javax.servlet.ServletRequest, java.lang.Boolean) set}.
	 * <p>
	 * Once the default is resolved,
	 * {@linkplain #setAutonli(javax.servlet.ServletRequest, java.lang.Boolean) sets the request attribute}.
	 * </p>
	 * <p>
	 * This does not change existing instances of {@link DocumentEE};
	 * it only affects the configuration of new instances.
	 * </p>
	 */
	public static boolean getAutonli(ServletContext servletContext, ServletRequest request) {
		Boolean autonli = (Boolean)request.getAttribute(AUTONLI_REQUEST_ATTRIBUTE);
		if(autonli == null) {
			autonli = getDefaultAutonli(servletContext);
			request.setAttribute(AUTONLI_REQUEST_ATTRIBUTE, autonli);
		}
		return autonli;
	}
	// </editor-fold>

	// <editor-fold desc="Indentation">
	// TODO: Configure at AnyDocumentEE level?
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
	 * This does not change existing instances of {@link DocumentEE};
	 * it only affects the configuration of new instances.
	 * </p>
	 */
	public static void setIndent(ServletRequest request, Boolean indent) {
		request.setAttribute(INDENT_REQUEST_ATTRIBUTE, indent);
	}

	/**
	 * Replaces the document indent in effect for the request.
	 * <p>
	 * This does not change existing instances of {@link DocumentEE};
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
	 * This does not change existing instances of {@link DocumentEE};
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
	// </editor-fold>

	// TODO: Track DocumentEE that is current on the request (maybe in a Stack)
	//       Default new DocumentEE to settings and indentation depth of the last DocumentEE.
	//           Use default settings when no existing document, unless settings specified by caller then use them.
	//       Possibly re-use the existing DocumentEE when has the same out object - but this might cause unexpected interaction (nested code changing configuration affecting outer)
	//       Caller would then need to release the DocumentEE, which would remove it from the stack (and possibly all above it, in case they didn't remove themselves) - implements AutoCloseable for this?
	//       Sub-requests would need to reset the state fully, which could be done by removing the stack, then restoring after subrequest.
	//           Sub-requests include semanticcms-core-servlet:capturePage along with aoweb-framework searches.
	//       Track at AnyDocumentEE level?
	public DocumentEE(
		ServletContext servletContext, HttpServletRequest request, HttpServletResponse response,
		EncodingContextEE encodingContext,
		Writer out,
		boolean autonli, boolean indent
	) {
		super(
			servletContext, request, response,
			encodingContext,
			out
		);
		setAutonli(autonli);
		setIndent(indent);
	}

	public DocumentEE(
		ServletContext servletContext, HttpServletRequest request, HttpServletResponse response, Writer out,
		boolean autonli, boolean indent
	) {
		this(
			servletContext, request, response,
			new EncodingContextEE(servletContext, request, response),
			out,
			autonli, indent
		);
	}

	/**
	 * Uses the {@linkplain #getAutonli(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default autonli settings}
	 * and {@linkplain #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default indentation settings}.
	 *
	 * @see  #getAutonli(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #DocumentEE(javax.servlet.ServletContext, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.io.Writer, boolean, boolean)
	 */
	public DocumentEE(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response, Writer out) {
		this(
			servletContext, request, response, out,
			getAutonli(servletContext, request),
			getIndent(servletContext, request)
		);
	}

	/**
	 * @see  ServletResponse#getWriter()
	 */
	public DocumentEE(
		ServletContext servletContext, HttpServletRequest request, HttpServletResponse response,
		boolean autonli, boolean indent
	) throws IOException {
		this(servletContext, request, response, response.getWriter(), autonli, indent);
	}

	/**
	 * Uses the {@linkplain #getAutonli(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default autonli settings}
	 * and {@linkplain #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default indentation settings}.
	 *
	 * @see  #getAutonli(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #DocumentEE(javax.servlet.ServletContext, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, boolean, boolean)
	 */
	public DocumentEE(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response) throws IOException {
		this(
			servletContext, request, response,
			getAutonli(servletContext, request),
			getIndent(servletContext, request)
		);
	}

	public DocumentEE(
		HttpServletRequest request, HttpServletResponse response, Writer out,
		boolean autonli, boolean indent
	) {
		this(request.getServletContext(), request, response, out, autonli, indent);
	}

	/**
	 * Uses the {@linkplain #getAutonli(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default autonli settings}
	 * and {@linkplain #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default indentation settings}.
	 *
	 * @see  #getAutonli(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #DocumentEE(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.io.Writer, boolean, boolean)
	 */
	public DocumentEE(HttpServletRequest request, HttpServletResponse response, Writer out) {
		this(request.getServletContext(), request, response, out);
	}

	/**
	 * @see  ServletRequest#getServletContext()
	 * @see  ServletResponse#getWriter()
	 */
	public DocumentEE(
		HttpServletRequest request, HttpServletResponse response,
		boolean autonli, boolean indent
	) throws IOException {
		this(request.getServletContext(), request, response, response.getWriter(), autonli, indent);
	}

	/**
	 * Uses the {@linkplain #getAutonli(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default autonli settings}
	 * and {@linkplain #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest) current or default indentation settings}.
	 *
	 * @see  #getAutonli(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #getIndent(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 * @see  #DocumentEE(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, boolean, boolean)
	 */
	public DocumentEE(HttpServletRequest request, HttpServletResponse response) throws IOException {
		this(request.getServletContext(), request, response, response.getWriter());
	}
}
