/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
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

import com.aoapps.html.any.AnyListContent;
import com.aoapps.lang.io.function.IOConsumerE;
import java.io.IOException;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-li-element">4.4.8 The li element</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/li">&lt;li&gt;: The List Item element</a>.</li>
 * <li>See <a href="https://www.w3schools.com/tags/tag_li.asp">HTML li tag</a>.</li>
 * </ul>
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface ListContent<
  __ extends ListContent<__>
> extends AnyListContent<DocumentEE, __>,
  //
  // Unions:
  //
  // Inherited: Union_COLGROUP_ScriptSupporting<__>

  //
  // Content models:
  //
  // Inherited: ContentEE<__>
  ScriptSupportingContent<__>
{
  //
  // Factories:
  //
  // <editor-fold defaultstate="collapsed" desc="LI">
  @Override
  @SuppressWarnings("deprecation")
  default LI<__> li() throws IOException {
    @SuppressWarnings("unchecked")
    __ pc = (__)this;
    DocumentEE document = getDocument();
    return new LI<>(document, pc).writeOpen(document.getRawUnsafe(null));
  }

  /**
   * Creates a li element with no attributes and the given body.
   * <ul>
   * <li>See <a href="https://html.spec.whatwg.org/multipage/grouping-content.html#the-li-element">4.4.8 The li element</a>.</li>
   * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/li">&lt;li&gt;: The List Item element</a>.</li>
   * <li>See <a href="https://www.w3schools.com/tags/tag_li.asp">HTML li tag</a>.</li>
   * </ul>
   *
   * @param  <Ex>  An arbitrary exception type that may be thrown
   *
   * @return  This content model, which will be the parent content model of child elements
   */
  default <Ex extends Throwable> __ li__(IOConsumerE<? super LI__<__>, Ex> li) throws IOException, Ex {
    return li().__(li);
  }

  @Override
  default LI_c<__> li_c() throws IOException {
    return li()._c();
  }
  // </editor-fold>
  // Inherited: SCRIPT
  // Inherited: TEMPLATE
}
