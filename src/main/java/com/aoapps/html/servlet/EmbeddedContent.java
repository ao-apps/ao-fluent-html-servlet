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

import com.aoapps.html.any.AnyEmbeddedContent;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#embedded-content-2">3.2.5.2.6 Embedded content</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/Content_categories#embedded_content">Embedded content</a>.</li>
 * </ul>
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface EmbeddedContent<
    __ extends EmbeddedContent<__>
> extends AnyEmbeddedContent<DocumentEE, __>,
    //
    // Unions:
    //
    Union_Embedded_Interactive<__>,
    Union_Embedded_Palpable_Phrasing<__>

//
// Content models:
//
// Inherited: ContentEE<__>
{
  //
  // Factories:
  //
  // Inherited: AUDIO
  // Inherited: CANVAS
  // Inherited: EMBED
  // Inherited: IFRAME
  // Inherited: IMG
  // Inherited: MathML math
  // Inherited: OBJECT
  // <editor-fold defaultstate="collapsed" desc="TODO: PICTURE">
  // </editor-fold>
  // Inherited: SVG svg
  // Inherited: VIDEO
}
