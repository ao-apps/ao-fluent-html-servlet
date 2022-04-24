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

import com.aoapps.html.any.AnyOBJECT_content;
import java.io.IOException;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/iframe-embed-object.html#the-object-element">4.8.7 The object element</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/object">&lt;object&gt;: The External Object element</a>.</li>
 * <li>See <a href="https://www.w3schools.com/tags/tag_object.asp">HTML object tag</a>.</li>
 * </ul>
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface OBJECT_content<
    __ extends OBJECT_content<__>
> extends AnyOBJECT_content<DocumentEE, __>,
    //
    // Unions:
    //
    Union_Embedded_Interactive<__>

//
// Content models:
//
// Inherited: Content<__>
{
  //
  // Factories:
  //
  // Inherited: AUDIO
  // Inherited: EMBED
  // Inherited: IFRAME
  // Inherited: IMG
  // Inherited: OBJECT
  // <editor-fold defaultstate="collapsed" desc="PARAM">
  @Override
  @SuppressWarnings("deprecation")
  default PARAM<__> param() throws IOException {
    @SuppressWarnings("unchecked")
    __ pc = (__) this;
    DocumentEE document = getDocument();
    return new PARAM<>(document, pc).writeOpen(document.getRawUnsafe(null));
  }
  // </editor-fold>
  // Inherited: VIDEO
}
