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

import com.aoapps.html.any.AnyVAR;
import java.io.IOException;
import java.io.Writer;

/**
 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-var-element">4.5.16 The var element</a>.
 *
 * @param  <PC>  The parent content model this element is within
 *
 * @author  AO Industries, Inc.
 */
public final class VAR<
	PC extends Union_Palpable_Phrasing<PC>
> extends
	AnyVAR<DocumentEE, PC, VAR<PC>, VAR__<PC>, VAR_c<PC>> {

	VAR(DocumentEE document, PC pc) {
		super(document, pc);
	}

	// Expose to this package, avoiding public to keep a clean API for optimal code assist
	@Override
	protected VAR<PC> writeOpen(Writer out) throws IOException {
		return super.writeOpen(out);
	}

	@Override
	protected VAR__<PC> new__() {
		return new VAR__<>(this);
	}

	@Override
	protected VAR_c<PC> new_c() {
		return new VAR_c<>(this);
	}
}
