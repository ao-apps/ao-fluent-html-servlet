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
 * along with ao-fluent-html-servlet.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.aoapps.html.servlet;

import com.aoapps.html.any.tests.InheritanceTests;
import com.aoapps.html.servlet.any.AnyDocumentEETest;
import org.junit.Test;

/**
 * @see  DocumentEE
 *
 * @author  AO Industries, Inc.
 */
public class DocumentEETest extends AnyDocumentEETest {

	public DocumentEETest() {
		super(DocumentEE.class);
	}

	@Test
	@Override
	public void testUnions() {
		UnionContentTest.testUnions(
			DocumentEE.class,
			//
			// Unions:
			//
			UnionContentTest.getAllUnions()
		);
	}

	@Test
	@Override
	public void testContentModels() {
		ContentModelTest.testContentModels(
			DocumentEE.class,
			//
			// Content models:
			//
			ContentModelTest.getAllContentModels()
		);
	}

	@Test
	@Override
	public void testElementContentModels() {
		ElementContentModelTest.testElementContentModels(
			DocumentEE.class,
			//
			// Per-element content models:
			//
			ElementContentModelTest.getAllElementContentModels()
		);
	}

	@Test
	@Override
	public void testNoImplementInherited() {
		InheritanceTests.testNoImplementInherited(ContentEE.class, DocumentEE.class);
	}
}
