/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2019, 2020  AO Industries, Inc.
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

import com.aoindustries.encoding.Doctype;
import com.aoindustries.encoding.Serialization;
import com.aoindustries.encoding.servlet.DoctypeEE;
import com.aoindustries.encoding.servlet.EncodingContextEE;
import com.aoindustries.encoding.servlet.SerializationEE;
import com.aoindustries.html.Html;
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
final public class HtmlEE {

	// Make no instances
	private HtmlEE() {}

	public static Html get(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response, Writer out) {
		Serialization serialization = SerializationEE.get(servletContext, request);
		Doctype doctype = DoctypeEE.get(servletContext, request);
		return new Html(
			// TODO: Should we continue to override this context to be fixed values, as we are doing here?
			// TODO: Seems that context changing with Html not changing would be reasonable?
			// TODO: Or don't store serialization at all?  This, however, would incur more lookups and what would happen if changing output mid-page?
			new EncodingContextEE(servletContext, request, response) {
				@Override
				public Serialization getSerialization() {
					return serialization;
				}
				@Override
				public Doctype getDoctype() {
					return doctype;
				}
			},
			serialization,
			doctype,
			out
		);
	}

	/**
	 * @see  ServletResponse#getWriter()
	 */
	public static Html get(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response) throws IOException {
		return get(servletContext, request, response, response.getWriter());
	}

	public static Html get(HttpServletRequest request, HttpServletResponse response, Writer out) {
		return get(request.getServletContext(), request, response, out);
	}

	/**
	 * @see  ServletRequest#getServletContext()
	 * @see  ServletResponse#getWriter()
	 */
	public static Html get(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return get(request.getServletContext(), request, response, response.getWriter());
	}
}
