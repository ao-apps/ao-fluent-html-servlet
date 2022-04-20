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

import com.aoapps.html.any.tests.AnyDocumentTest;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import org.junit.Test;

/**
 * @see  AnyDocumentEE
 *
 * @author  AO Industries, Inc.
 */
@SuppressWarnings("rawtypes")
public class AnyDocumentEETest extends AnyDocumentTest {

  protected AnyDocumentEETest(Class<? extends AnyDocumentEE> testingClass) {
    super(testingClass);
  }

  public AnyDocumentEETest() {
    this(AnyDocumentEE.class);
  }

  @Test
  @Override
  public void testUnions() {
    AnyUnionContentTest.testUnions(
      AnyDocumentEE.class,
      //
      // Unions:
      //
      AnyUnionContentTest.getAllUnions()
    );
  }

  @Test
  @Override
  public void testContentModels() {
    ContentModelTest.testContentModels(
      AnyDocumentEE.class,
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
      AnyDocumentEE.class,
      //
      // Per-element content models:
      //
      ElementContentModelTest.getAllElementContentModels()
    );
  }

  @Test
  @Override
  public void testNoImplementInherited() {
    InheritanceTestHelper.testNoImplementInherited(ContentEE.class, AnyDocumentEE.class);
  }
}
