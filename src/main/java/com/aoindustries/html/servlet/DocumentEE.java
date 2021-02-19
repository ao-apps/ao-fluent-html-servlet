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

	public static Document get(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response, Writer out) {
		return new Document(
			new EncodingContextEE(servletContext, request, response),
			out
		);
	}

	/**
	 * @see  ServletResponse#getWriter()
	 */
	public static Document get(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return get(servletContext, request, response, response.getWriter());
	}

	public static Document get(HttpServletRequest request, HttpServletResponse response, Writer out) {
		return get(request.getServletContext(), request, response, out);
	}

	/**
	 * @see  ServletRequest#getServletContext()
	 * @see  ServletResponse#getWriter()
	 */
	public static Document get(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return get(request.getServletContext(), request, response, response.getWriter());
	}
}
