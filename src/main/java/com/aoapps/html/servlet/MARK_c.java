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
package com.aoapps.html.servlet;

import com.aoapps.html.any.AnyMARK_c;

/**
 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-mark-element">4.5.23 The mark element</a>.
 *
 * @param  <PC>  The parent content model this element is within
 *
 * @author  AO Industries, Inc.
 */
public final class MARK_c<
	PC extends Union_Palpable_Phrasing<PC>
>
	extends AnyMARK_c<DocumentEE, PC, MARK_c<PC>>
	implements PhrasingContent<MARK_c<PC>> {

	MARK_c(MARK<PC> element) {
		super(element);
	}
}
