/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2021, 2022, 2026  AO Industries, Inc.
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
import com.aoapps.html.any.tests.AnyPhrasingContentTest;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import com.aoapps.html.servlet.ContentEE;
import com.aoapps.html.servlet.EmbeddedContent;
import com.aoapps.html.servlet.PhrasingContent;
import com.aoapps.html.servlet.ScriptSupportingContent;
import com.aoapps.html.servlet.TextContent;
import com.aoapps.html.servlet.Union_COLGROUP_ScriptSupporting;
import com.aoapps.html.servlet.Union_Embedded_Interactive;
import com.aoapps.html.servlet.Union_Embedded_Palpable_Phrasing;
import com.aoapps.html.servlet.Union_Interactive_Phrasing;
import com.aoapps.html.servlet.Union_Metadata_Phrasing;
import com.aoapps.html.servlet.Union_Palpable_Phrasing;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  PhrasingContent
 *
 * @author  AO Industries, Inc.
 */
public class PhrasingContentTest extends AnyPhrasingContentTest {

  public PhrasingContentTest() {
    super(PhrasingContent.class);
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testUnions() {
    UnionContentTest.testUnions(
        PhrasingContent.class,
        //
        // Unions:
        //
        Union_COLGROUP_ScriptSupporting.class,
        Union_Embedded_Interactive.class,
        Union_Embedded_Palpable_Phrasing.class,
        Union_Interactive_Phrasing.class,
        Union_Metadata_Phrasing.class,
        Union_Palpable_Phrasing.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testContentModels() {
    ContentModelTest.testContentModels(
        PhrasingContent.class,
        //
        // Content models:
        //
        ContentEE.class,
        EmbeddedContent.class,
        ScriptSupportingContent.class,
        TextContent.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testElementContentModels() {
    ElementContentModelTest.testElementContentModels(
        PhrasingContent.class
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
        AoArrays.indexOf(ContentModelTest.getAllContentModels(), PhrasingContent.class)
    );
    InheritanceTestHelper.testNoImplementInherited(ContentEE.class, PhrasingContent.class);
  }
}
