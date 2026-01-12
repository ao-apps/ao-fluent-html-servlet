/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2026  AO Industries, Inc.
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

import com.aoapps.html.any.AnyUnion_Palpable_Phrasing_c;
import com.aoapps.html.any.Closeable;

/**
 * Elements that are common to both {@link PalpableContent} and {@link PhrasingContent}.
 *
 * @param  <PC>  The parent content model this element is within
 * @param  <_c>  This content model as {@link Closeable}, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface Union_Palpable_Phrasing_c<
    PC extends ContentEE<PC>,
    _c extends Union_Palpable_Phrasing_c<PC, _c>
    >
    extends AnyUnion_Palpable_Phrasing_c<DocumentEE, PC, _c>,
    Union_Palpable_Phrasing<_c>,
    //
    // Unions:
    //
    // Inherited: Embedded_Interactive_c<PC, _c>
    Union_Embedded_Palpable_Phrasing_c<PC, _c>,
    Union_Interactive_Phrasing_c<PC, _c>,

    //
    // Content models:
    //
    // Inherited: ContentEE_c<PC, _c>
    // that is not inter-element whitespace
    TextContent_c<PC, _c> {

}
