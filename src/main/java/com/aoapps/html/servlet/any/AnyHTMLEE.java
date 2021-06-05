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
 * along with ao-fluent-html-servlet.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoapps.html.servlet.any;

import com.aoapps.html.any.AnyHTML;
import com.aoapps.html.any.Closeable;
import java.io.IOException;
import javax.servlet.ServletResponse;

/**
 * See <a href="https://html.spec.whatwg.org/multipage/semantics.html#the-html-element">4.1.1 The html element</a>.
 *
 * @param  <D>   This document type
 * @param  <PC>  The parent content model this element is within
 * @param  <E>   This element type
 * @param  <__>  This content model, which will be the parent content model of child elements
 * @param  <_c>  This content model as {@link Closeable}, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
abstract public class AnyHTMLEE<
	D  extends AnyDocumentEE<D>,
	PC extends ContentEE<D, PC>,
	E  extends AnyHTMLEE<D, PC, E, __, _c>,
	__ extends AnyHTMLEE__<D, PC, __>,
	// Would prefer "_c extends __ & Closeable<D, PC>", but "a type variable may not be followed by other bounds"
	_c extends AnyHTMLEE_c<D, PC, _c>
> extends
	AnyHTML<D, PC, E, __, _c> {

	protected AnyHTMLEE(D document, PC pc) {
		super(document, pc);
	}

	/**
	 * Adds a lang attribute based on the {@linkplain ServletResponse#getLocale() response locale}.
	 */
	public E lang() throws IOException {
		return lang(document.response.getLocale());
	}
}
