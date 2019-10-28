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

import com.aoindustries.encoding.ChainWriter;
import com.aoindustries.html.Doctype;
import com.aoindustries.html.Html;
import com.aoindustries.html.Serialization;
import java.io.Writer;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 *
 * @author  AO Industries, Inc.
 */
public class HtmlEE {

	// Make no instances
	private HtmlEE() {}

	public static Html get(ServletContext servletContext, HttpServletRequest request, Writer out) {
		return new Html(
			SerializationEE.get(servletContext, request),
			DoctypeEE.get(servletContext, request),
			out
		);
	}

	public static Html get(HttpServletRequest request, Writer out) {
		return get(request.getServletContext(), request, out);
	}

	/**
	 * Unwraps the given chain writer.
	 */
	public static Html get(ServletContext servletContext, HttpServletRequest request, ChainWriter out) {
		return get(servletContext, request, out.getPrintWriter());
	}

	/**
	 * Unwraps the given chain writer.
	 */
	public static Html get(HttpServletRequest request, ChainWriter out) {
		return get(request.getServletContext(), request, out.getPrintWriter());
	}
}
