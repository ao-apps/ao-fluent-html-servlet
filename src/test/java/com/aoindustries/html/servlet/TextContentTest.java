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
 * along with ao-fluent-html-servlet.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoindustries.html.servlet;

import com.aoindustries.collections.AoArrays;
import com.aoindustries.html.any.AnyTextContentTest;
import com.aoindustries.html.any.InheritanceTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  TextContent
 *
 * @author  AO Industries, Inc.
 */
public class TextContentTest extends AnyTextContentTest {

	public TextContentTest() {
		super(TextContent.class);
	}

	@Test
	@SuppressWarnings("unchecked")
	@Override
	public void testUnions() {
		UnionContentTest.testUnions(
			TextContent.class
			//
			// Unions:
			//
			// None
		);
	}

	@Test
	@SuppressWarnings("unchecked")
	@Override
	public void testContentModels() {
		ContentModelTest.testContentModels(
			TextContent.class,
			//
			// Content models:
			//
			ContentEE.class
		);
	}

	@Test
	@SuppressWarnings("unchecked")
	@Override
	public void testElementContentModels() {
		ElementContentModelTest.testElementContentModels(
			TextContent.class
			//
			// Per-element content models:
			//
			// None
		);
	}

	@Test
	@Override
	public void testNoImplementInherited() {
		Assert.assertNotEquals(
			"Must be included in " + ContentModelTest.class.getSimpleName() + ".getAllContentModels()",
			-1,
			AoArrays.indexOf(ContentModelTest.getAllContentModels(), TextContent.class)
		);
		InheritanceTests.testNoImplementInherited(ContentEE.class, TextContent.class);
	}
}
