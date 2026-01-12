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

package com.aoapps.html.servlet.tests;

import com.aoapps.collections.AoArrays;
import com.aoapps.html.any.tests.AnyUnion_DL_Palpable_cTest;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import com.aoapps.html.servlet.ContentEE_c;
import com.aoapps.html.servlet.Union_DL_Palpable_c;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  Union_DL_Palpable_c
 *
 * @author  AO Industries, Inc.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class Union_DL_Palpable_cTest extends AnyUnion_DL_Palpable_cTest {

  public Union_DL_Palpable_cTest() {
    super(Union_DL_Palpable_c.class);
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testUnions() {
    UnionContent_cTest.testUnions(
        Union_DL_Palpable_c.class
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
        Union_DL_Palpable_c.class,
        //
        // Content models:
        //
        ContentEE_c.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testElementContentModels() {
    ElementContentModel_cTest.testElementContentModels(
        Union_DL_Palpable_c.class
    //
    // Per-element content models:
    //
    // None
    );
  }

  @Test
  @Override
  public void testNoImplementInherited() {
    Assert.assertNotEquals("Must be included in " + UnionContent_cTest.class.getSimpleName() + ".getAllUnions()",
        -1,
        AoArrays.indexOf(UnionContent_cTest.getAllUnions(), Union_DL_Palpable_c.class)
    );
    InheritanceTestHelper.testNoImplementInherited(ContentEE_c.class, Union_DL_Palpable_c.class);
  }
}
