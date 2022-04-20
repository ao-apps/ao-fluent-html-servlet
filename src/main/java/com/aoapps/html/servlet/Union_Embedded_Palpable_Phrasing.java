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

import com.aoapps.html.any.AnyUnion_Embedded_Palpable_Phrasing;

/**
 * Elements that are common to all three of {@link EmbeddedContent}, {@link PalpableContent}, and
 * {@link PhrasingContent}.
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface Union_Embedded_Palpable_Phrasing<
  __ extends Union_Embedded_Palpable_Phrasing<__>
> extends AnyUnion_Embedded_Palpable_Phrasing<DocumentEE, __>,
  //
  // Content models:
  //
  ContentEE<__>
{
  //
  // Factories:
  //
  // <editor-fold defaultstate="collapsed" desc="TODO: CANVAS">
  // </editor-fold>
  // <editor-fold defaultstate="collapsed" desc="TODO: MathML math">
  // See <a href="https://html.spec.whatwg.org/multipage/embedded-content-other.html#mathml">4.8.16 MathML</a>.
  // </editor-fold>
  // <editor-fold defaultstate="collapsed" desc="TODO: SVG svg">
  // See <a href="https://html.spec.whatwg.org/multipage/embedded-content-other.html#svg-0">4.8.17 SVG</a>.
  // </editor-fold>
}
