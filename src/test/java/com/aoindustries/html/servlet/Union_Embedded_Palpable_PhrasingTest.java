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
import com.aoindustries.html.any.AnyUnion_Embedded_Palpable_PhrasingTest;
import com.aoindustries.html.any.InheritanceTests;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  Union_Embedded_Palpable_Phrasing
 *
 * @author  AO Industries, Inc.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class Union_Embedded_Palpable_PhrasingTest extends AnyUnion_Embedded_Palpable_PhrasingTest {

	public Union_Embedded_Palpable_PhrasingTest() {
		super(Union_Embedded_Palpable_Phrasing.class);
	}

	@Test
	@SuppressWarnings("unchecked")
	@Override
	public void testUnions() {
		UnionContentTest.testUnions(
			Union_Embedded_Palpable_Phrasing.class
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
			Union_Embedded_Palpable_Phrasing.class,
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
			Union_Embedded_Palpable_Phrasing.class
			//
			// Per-element content models:
			//
			// None
		);
	}

	@Test
	@Override
	public void testNoImplementInherited() {
		Assert.assertNotEquals("Must be included in " + UnionContentTest.class.getSimpleName() + ".getAllUnions()",
			-1,
			AoArrays.indexOf(UnionContentTest.getAllUnions(), Union_Embedded_Palpable_Phrasing.class)
		);
		InheritanceTests.testNoImplementInherited(ContentEE.class, Union_Embedded_Palpable_Phrasing.class);
	}
}