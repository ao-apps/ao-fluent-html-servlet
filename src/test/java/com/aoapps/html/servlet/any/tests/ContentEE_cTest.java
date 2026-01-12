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

package com.aoapps.html.servlet.any.tests;

import com.aoapps.collections.AoArrays;
import com.aoapps.html.any.tests.Content_cTest;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import com.aoapps.html.servlet.any.ContentEE_c;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  ContentEE_c
 *
 * @author  AO Industries, Inc.
 */
@SuppressWarnings("rawtypes")
public class ContentEE_cTest extends Content_cTest {

  protected ContentEE_cTest(Class<? extends ContentEE_c> testingClass) {
    super(testingClass);
  }

  public ContentEE_cTest() {
    this(ContentEE_c.class);
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testUnions() {
    AnyUnionContent_cTest.testUnions(
        ContentEE_c.class
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
    ContentModel_cTest.testContentModels(
        ContentEE_c.class
    //
    // Content models:
    //
    // None
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testElementContentModels() {
    ElementContentModel_cTest.testElementContentModels(
        ContentEE_c.class
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
        "Must be included in " + ContentModel_cTest.class.getSimpleName() + ".getAllContentModels()",
        -1,
        AoArrays.indexOf(ContentModel_cTest.getAllContentModels(), ContentEE_c.class)
    );
    InheritanceTestHelper.testNoImplementInherited(ContentEE_c.class, ContentEE_c.class);
  }
}
