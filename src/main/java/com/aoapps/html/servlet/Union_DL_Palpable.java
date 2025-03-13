/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2021, 2022, 2025  AO Industries, Inc.
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

import com.aoapps.html.any.AnyUnion_DL_Palpable;
import com.aoapps.lang.io.function.IOConsumerE;
import java.io.IOException;

/**
 * Elements that are common to both {@link DL_content} and {@link PalpableContent}.
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface Union_DL_Palpable<
    __ extends Union_DL_Palpable<__>
    > extends AnyUnion_DL_Palpable<DocumentEE, __>,
    //
    // Content models:
    //
    ContentEE<__> {
  //
  // Factories:
  //
  // <editor-fold defaultstate="collapsed" desc="DIV">
  @Override
  @SuppressWarnings("deprecation")
  default DIV<__> div() throws IOException {
    @SuppressWarnings("unchecked")
    __ pc = (__) this;
    DocumentEE document = getDocument();
    DIV<__> e = new DIV<>(document, pc);
    e.writeOpen(document.getRawUnsafe(null));
    return e;
  }

  /**
   * Creates a div element with no attributes and the given body.
   * <ul>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-div-element">4.4.15 The div element</a>.</li>
   * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/div">&lt;div&gt;: The Content Division element</a>.</li>
   * <li>See <a href="https://www.w3schools.com/tags/tag_div.asp">HTML div tag</a>.</li>
   * </ul>
   *
   * @param  <Ex>  An arbitrary exception type that may be thrown
   *
   * @return  This content model, which will be the parent content model of child elements
   */
  default <Ex extends Throwable> __ div__(IOConsumerE<? super DIV__<__>, Ex> div) throws IOException, Ex {
    return div().__(div);
  }

  @Override
  default DIV_c<__> div_c() throws IOException {
    return div()._c();
  }
  // </editor-fold>
}
