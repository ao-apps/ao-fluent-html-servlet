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

import com.aoapps.collections.AoArrays;
import com.aoapps.html.any.tests.AnyEmbeddedContentTest;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  EmbeddedContent
 *
 * @author  AO Industries, Inc.
 */
public class EmbeddedContentTest extends AnyEmbeddedContentTest {

  public EmbeddedContentTest() {
    super(EmbeddedContent.class);
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testUnions() {
    UnionContentTest.testUnions(
      EmbeddedContent.class,
      //
      // Unions:
      //
      Union_Embedded_Interactive.class,
      Union_Embedded_Palpable_Phrasing.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testContentModels() {
    ContentModelTest.testContentModels(
      EmbeddedContent.class,
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
      EmbeddedContent.class
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
      AoArrays.indexOf(ContentModelTest.getAllContentModels(), EmbeddedContent.class)
    );
    InheritanceTestHelper.testNoImplementInherited(ContentEE.class, EmbeddedContent.class);
  }
}
