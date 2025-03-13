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

import com.aoapps.html.any.AnyUnion_DIV_DL;
import com.aoapps.lang.io.function.IOConsumerE;
import java.io.IOException;

/**
 * Elements that are common to both {@link DIV_content} and {@link DL_content}.
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface Union_DIV_DL<
    __ extends Union_DIV_DL<__>
    > extends AnyUnion_DIV_DL<DocumentEE, __>,
    //
    // Content models:
    //
    ContentEE<__> {
  //
  // Factories:
  //
  // <editor-fold defaultstate="collapsed" desc="DD">
  @Override
  @SuppressWarnings("deprecation")
  default DD<__> dd() throws IOException {
    @SuppressWarnings("unchecked")
    __ pc = (__) this;
    DocumentEE document = getDocument();
    DD<__> e = new DD<>(document, pc);
    e.writeOpen(document.getRawUnsafe(null));
    return e;
  }

  /**
   * Creates a dd element with no attributes and the given body.
   * <ul>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-dd-element">4.4.11 The dd element</a>.</li>
   * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dd">&lt;dd&gt;: The Description Details element</a>.</li>
   * <li>See <a href="https://www.w3schools.com/tags/tag_dd.asp">HTML dd tag</a>.</li>
   * </ul>
   *
   * @param  <Ex>  An arbitrary exception type that may be thrown
   *
   * @return  This content model, which will be the parent content model of child elements
   */
  default <Ex extends Throwable> __ dd__(IOConsumerE<? super DD__<__>, Ex> dd) throws IOException, Ex {
    return dd().__(dd);
  }

  @Override
  default DD_c<__> dd_c() throws IOException {
    return dd()._c();
  }

  // </editor-fold>
  // <editor-fold defaultstate="collapsed" desc="DT">
  @Override
  @SuppressWarnings("deprecation")
  default DT<__> dt() throws IOException {
    @SuppressWarnings("unchecked")
    __ pc = (__) this;
    DocumentEE document = getDocument();
    DT<__> e = new DT<>(document, pc);
    e.writeOpen(document.getRawUnsafe(null));
    return e;
  }

  /**
   * Creates a dt element with no attributes and the given body.
   * <ul>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-dt-element">4.4.10 The dt element</a>.</li>
   * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/dt">&lt;dt&gt;: The Description Term element</a>.</li>
   * <li>See <a href="https://www.w3schools.com/tags/tag_dt.asp">HTML dt tag</a>.</li>
   * </ul>
   *
   * @param  <Ex>  An arbitrary exception type that may be thrown
   *
   * @return  This content model, which will be the parent content model of child elements
   */
  default <Ex extends Throwable> __ dt__(IOConsumerE<? super DT__<__>, Ex> dt) throws IOException, Ex {
    return dt().__(dt);
  }

  @Override
  default DT_c<__> dt_c() throws IOException {
    return dt()._c();
  }
  // </editor-fold>
}
