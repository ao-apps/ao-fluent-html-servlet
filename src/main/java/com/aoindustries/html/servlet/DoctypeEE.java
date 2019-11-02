/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2019  AO Industries, Inc.
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

import com.aoindustries.html.Doctype;
import static com.aoindustries.html.Doctype.HTML5;
import java.util.Locale;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;

/**
 * @author  AO Industries, Inc.
 */
public class DoctypeEE {

	// Make no instances
	private DoctypeEE() {}

	/**
	 * Context init parameter that may be used to configure the default doctype within an application.
	 */
	public static final String DEFAULT_INIT_PARAM = Doctype.class.getName() + ".default";

	/**
	 * Determines the default doctype by first checking for {@linkplain ServletContext#getInitParameter(java.lang.String) context-param}
	 * of {@link #DEFAULT_INIT_PARAM}, the using {@link Doctype#HTML5} when unspecified or "default".
	 */
	public static Doctype getDefault(ServletContext servletContext) {
		String initParam = servletContext.getInitParameter(DEFAULT_INIT_PARAM);
		if(initParam != null) {
			initParam = initParam.trim();
			if(!initParam.isEmpty() && !"default".equalsIgnoreCase(initParam)) {
				return Doctype.valueOf(initParam.toUpperCase(Locale.ROOT));
			}
		}
		return HTML5;
	}

	private static final String REQUEST_ATTRIBUTE_NAME = Doctype.class.getName();

	/**
	 * Registers the doctype in effect for the request.
	 */
	public static void set(ServletRequest request, Doctype doctype) {
		request.setAttribute(REQUEST_ATTRIBUTE_NAME, doctype);
	}

	/**
	 * Replaces the doctype in effect for the request.
	 *
	 * @return  The previous attribute value, if any
	 */
	public static Doctype replace(ServletRequest request, Doctype doctype) {
		Doctype old = (Doctype)request.getAttribute(REQUEST_ATTRIBUTE_NAME);
		request.setAttribute(REQUEST_ATTRIBUTE_NAME, doctype);
		return old;
	}

	/**
	 * Gets the doctype in effect for the request, or {@linkplain #getDefault(javax.servlet.ServletContext) the default}
	 * when not yet {@linkplain #set(javax.servlet.ServletRequest, com.aoindustries.html.Doctype) set}.
	 * <p>
	 * Once the default is resolved,
	 * {@linkplain #set(javax.servlet.ServletRequest, com.aoindustries.html.Doctype) sets the request attribute}.
	 * </p>
	 */
	public static Doctype get(ServletContext servletContext, ServletRequest request) {
		Doctype doctype = (Doctype)request.getAttribute(REQUEST_ATTRIBUTE_NAME);
		if(doctype == null) {
			doctype = getDefault(servletContext);
			request.setAttribute(REQUEST_ATTRIBUTE_NAME, doctype);
		}
		return doctype;
	}

	/**
	 * @see #get(javax.servlet.ServletContext, javax.servlet.ServletRequest)
	 */
	public static Doctype get(ServletRequest request) {
		return get(request.getServletContext(), request);
	}
}
