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
package com.aoapps.html.servlet;

import com.aoapps.html.any.AnyBLOCKQUOTE_c;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-blockquote-element">4.4.4 The blockquote element</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/blockquote">&lt;blockquote&gt;: The Block Quotation element</a>.</li>
 * </ul>
 *
 * @param  <PC>  The parent content model this element is within
 *
 * @author  AO Industries, Inc.
 */
public final class BLOCKQUOTE_c<
	PC extends PalpableContent<PC>
>
	extends AnyBLOCKQUOTE_c<DocumentEE, PC, BLOCKQUOTE_c<PC>>
	implements FlowContent<BLOCKQUOTE_c<PC>> {

	BLOCKQUOTE_c(BLOCKQUOTE<PC> element) {
		super(element);
	}
}
