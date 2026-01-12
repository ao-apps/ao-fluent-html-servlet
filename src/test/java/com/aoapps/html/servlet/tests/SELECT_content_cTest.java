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
import com.aoapps.html.any.tests.AnySELECT_content_cTest;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import com.aoapps.html.servlet.ContentEE_c;
import com.aoapps.html.servlet.OPTGROUP_content_c;
import com.aoapps.html.servlet.SELECT_content_c;
import com.aoapps.html.servlet.ScriptSupportingContent_c;
import com.aoapps.html.servlet.Union_COLGROUP_ScriptSupporting_c;
import com.aoapps.html.servlet.Union_DATALIST_OPTGROUP_c;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  SELECT_content_c
 *
 * @author  AO Industries, Inc.
 */
public class SELECT_content_cTest extends AnySELECT_content_cTest {

  public SELECT_content_cTest() {
    super(SELECT_content_c.class);
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testUnions() {
    UnionContent_cTest.testUnions(
        SELECT_content_c.class,
        //
        // Unions:
        //
        Union_COLGROUP_ScriptSupporting_c.class,
        Union_DATALIST_OPTGROUP_c.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testContentModels() {
    ContentModel_cTest.testContentModels(
        SELECT_content_c.class,
        //
        // Content models:
        //
        ContentEE_c.class,
        ScriptSupportingContent_c.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testElementContentModels() {
    ElementContentModel_cTest.testElementContentModels(
        SELECT_content_c.class,
        //
        // Per-element content models:
        //
        OPTGROUP_content_c.class
    );
  }

  @Test
  @Override
  public void testNoImplementInherited() {
    Assert.assertNotEquals(
        "Must be included in " + ElementContentModel_cTest.class.getSimpleName() + ".getAllElementContentModels()",
        -1,
        AoArrays.indexOf(ElementContentModel_cTest.getAllElementContentModels(), SELECT_content_c.class)
    );
    InheritanceTestHelper.testNoImplementInherited(ContentEE_c.class, SELECT_content_c.class);
  }
}
