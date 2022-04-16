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

package com.aoapps.html.servlet.any;

import java.io.IOException;

/**
 * This interface extends all content interfaces and supports all element types.
 *
 * @param  <D>   This document type
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface AnyContentEE<
	D  extends AnyDocumentEE<D>,
	__ extends AnyContentEE<D, __>
> extends com.aoapps.html.any.AnyContent<D, __>,
	//
	// Content models:
	//
	ContentEE<D, __>
{
	//
	// Factories:
	//
	// <editor-fold defaultstate="collapsed" desc="HTML">
	@Override
	AnyHTMLEE<D, __, ?, ?, ?> html() throws IOException;

	@Override
	AnyHTMLEE_c<D, __, ?> html_c() throws IOException;
	// </editor-fold>
}
