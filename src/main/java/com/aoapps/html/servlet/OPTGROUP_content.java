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

import com.aoapps.html.any.AnyOPTGROUP_content;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-optgroup-element">4.10.9 The optgroup element</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/optgroup">&lt;optgroup&gt;: The Option Group element</a>.</li>
 * <li>See <a href="https://www.w3schools.com/tags/tag_optgroup.asp">HTML optgroup tag</a>.</li>
 * </ul>
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface OPTGROUP_content<
    __ extends OPTGROUP_content<__>
    > extends AnyOPTGROUP_content<DocumentEE, __>,
    //
    // Unions:
    //
    // Inherited: Union_COLGROUP_ScriptSupporting<__>
    Union_DATALIST_OPTGROUP<__>,

    //
    // Content models:
    //
    // Inherited: ContentEE<__>
    ScriptSupportingContent<__> {
  //
  // Factories:
  //
  // Inherited: OPTION
  // Inherited: SCRIPT
  // Inherited: TEMPLATE
}
