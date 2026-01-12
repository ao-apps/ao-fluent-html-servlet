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
import com.aoapps.html.any.tests.AnyDATALIST_content_cTest;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import com.aoapps.html.servlet.ContentEE_c;
import com.aoapps.html.servlet.DATALIST_content_c;
import com.aoapps.html.servlet.EmbeddedContent_c;
import com.aoapps.html.servlet.PhrasingContent_c;
import com.aoapps.html.servlet.ScriptSupportingContent_c;
import com.aoapps.html.servlet.TextContent_c;
import com.aoapps.html.servlet.Union_COLGROUP_ScriptSupporting_c;
import com.aoapps.html.servlet.Union_DATALIST_OPTGROUP_c;
import com.aoapps.html.servlet.Union_Embedded_Interactive_c;
import com.aoapps.html.servlet.Union_Embedded_Palpable_Phrasing_c;
import com.aoapps.html.servlet.Union_Interactive_Phrasing_c;
import com.aoapps.html.servlet.Union_Metadata_Phrasing_c;
import com.aoapps.html.servlet.Union_Palpable_Phrasing_c;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  DATALIST_content_c
 *
 * @author  AO Industries, Inc.
 */
public class DATALIST_content_cTest extends AnyDATALIST_content_cTest {

  public DATALIST_content_cTest() {
    super(DATALIST_content_c.class);
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testUnions() {
    UnionContent_cTest.testUnions(
        DATALIST_content_c.class,
        //
        // Unions:
        //
        Union_COLGROUP_ScriptSupporting_c.class,
        Union_DATALIST_OPTGROUP_c.class,
        Union_Embedded_Interactive_c.class,
        Union_Embedded_Palpable_Phrasing_c.class,
        Union_Interactive_Phrasing_c.class,
        Union_Metadata_Phrasing_c.class,
        Union_Palpable_Phrasing_c.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testContentModels() {
    ContentModel_cTest.testContentModels(
        DATALIST_content_c.class,
        //
        // Content models:
        //
        ContentEE_c.class,
        EmbeddedContent_c.class,
        PhrasingContent_c.class,
        ScriptSupportingContent_c.class,
        TextContent_c.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testElementContentModels() {
    ElementContentModel_cTest.testElementContentModels(
        DATALIST_content_c.class
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
        "Must be included in " + ElementContentModel_cTest.class.getSimpleName() + ".getAllElementContentModels()",
        -1,
        AoArrays.indexOf(ElementContentModel_cTest.getAllElementContentModels(), DATALIST_content_c.class)
    );
    InheritanceTestHelper.testNoImplementInherited(ContentEE_c.class, DATALIST_content_c.class);
  }
}
