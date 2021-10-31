/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2021  AO Industries, Inc.
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
 * along with ao-fluent-html-servlet.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.aoapps.html.servlet.any;

import com.aoapps.encoding.servlet.EncodingContextEE;
import com.aoapps.html.any.AnyDocument;
import java.io.IOException;
import java.io.Writer;
import javax.servlet.ServletContext;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 *
 * @author  AO Industries, Inc.
 */
// TODO: Add tests
public abstract class AnyDocumentEE<D extends AnyDocumentEE<D>> extends AnyDocument<D> implements AnyContentEE<D, D> {

	protected final HttpServletResponse response;

	protected AnyDocumentEE(
		ServletContext servletContext, HttpServletRequest request, HttpServletResponse response,
		EncodingContextEE encodingContext,
		Writer out
	) {
		super(
			encodingContext,
			out
		);
		this.response = response;
	}

	// <editor-fold desc="Versions of methods that benefit from servlet API state">
	/**
	 * Writes the XML declaration, if needed, using the character encoding of the current response.
	 *
	 * @see  ServletResponse#getCharacterEncoding()
	 * @see  #xmlDeclaration(java.lang.String)
	 */
	public D xmlDeclaration() throws IOException {
		return xmlDeclaration(response.getCharacterEncoding());
	}
	// </editor-fold>
}
