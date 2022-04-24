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
import com.aoapps.html.any.tests.AnyDATALIST_contentTest;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import org.junit.Assert;
import org.junit.Test;

/**
 * @see  DATALIST_content
 *
 * @author  AO Industries, Inc.
 */
public class DATALIST_contentTest extends AnyDATALIST_contentTest {

  public DATALIST_contentTest() {
    super(DATALIST_content.class);
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testUnions() {
    UnionContentTest.testUnions(
        DATALIST_content.class,
        //
        // Unions:
        //
        Union_COLGROUP_ScriptSupporting.class,
        Union_DATALIST_OPTGROUP.class,
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
        DATALIST_content.class,
        //
        // Content models:
        //
        ContentEE.class,
        EmbeddedContent.class,
        PhrasingContent.class,
        ScriptSupportingContent.class,
        TextContent.class
    );
  }

  @Test
  @SuppressWarnings("unchecked")
  @Override
  public void testElementContentModels() {
    ElementContentModelTest.testElementContentModels(
        DATALIST_content.class
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
        "Must be included in " + ElementContentModelTest.class.getSimpleName() + ".getAllElementContentModels()",
        -1,
        AoArrays.indexOf(ElementContentModelTest.getAllElementContentModels(), DATALIST_content.class)
    );
    InheritanceTestHelper.testNoImplementInherited(ContentEE.class, DATALIST_content.class);
  }
}
