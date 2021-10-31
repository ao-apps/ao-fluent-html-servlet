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

import com.aoapps.html.any.AnyHTML_content;
import com.aoapps.lang.io.function.IOConsumerE;
import java.io.IOException;

/**
 * See <a href="https://html.spec.whatwg.org/multipage/semantics.html#the-html-element">4.1.1 The html element</a>.
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface HTML_content<
	__ extends HTML_content<__>
> extends AnyHTML_content<DocumentEE, __>,
	//
	// Content models:
	//
	ContentEE<__>
{
	//
	// Factories:
	//
	// <editor-fold defaultstate="collapsed" desc="HEAD">
	@Override
	default HEAD<__> head() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new HEAD<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a head element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/semantics.html#the-head-element">4.2.1 The head element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ head__(IOConsumerE<? super HEAD__<__>, Ex> head) throws IOException, Ex {
		return head().__(head);
	}

	@Override
	default HEAD_c<__> head_c() throws IOException {
		return head()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="BODY">
	@Override
	default BODY<__> body() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new BODY<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a body element with no attributes and the given body.
	 * <ul>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/sections.html#the-body-element">4.3.1 The body element</a>.</li>
	 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/body">&lt;body&gt;: The Document Body element - HTML: HyperText Markup Language | MDN</a>.</li>
	 * <li>See <a href="https://www.w3schools.com/tags/tag_body.asp">HTML body tag</a>.</li>
	 * </ul>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ body__(IOConsumerE<? super BODY__<__>, Ex> body) throws IOException, Ex {
		return body().__(body);
	}

	@Override
	default BODY_c<__> body_c() throws IOException {
		return body()._c();
	}
	// </editor-fold>
}
