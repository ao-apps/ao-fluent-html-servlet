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

import com.aoapps.html.any.Closeable;
import com.aoapps.html.any.tests.InheritanceTestHelper;
import com.aoapps.html.servlet.AnyContentEE_c;
import com.aoapps.html.servlet.ContentEE_c;
import com.aoapps.html.servlet.EmbeddedContent_c;
import com.aoapps.html.servlet.FlowContent_c;
import com.aoapps.html.servlet.HeadingContent_c;
import com.aoapps.html.servlet.InteractiveContent_c;
import com.aoapps.html.servlet.ListContent_c;
import com.aoapps.html.servlet.MetadataContent_c;
import com.aoapps.html.servlet.PalpableContent_c;
import com.aoapps.html.servlet.PhrasingContent_c;
import com.aoapps.html.servlet.ScriptSupportingContent_c;
import com.aoapps.html.servlet.SectioningContent_c;
import com.aoapps.html.servlet.TextContent_c;
import org.junit.Test;

/**
 * Tests <code>*Content_c</code> and <code>*ContentEE_c</code> {@link Closeable} content model interfaces,
 * which confirm a class implements the expected set of interfaces.
 *
 * @author  AO Industries, Inc.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class ContentModel_cTest {

  /**
   * Gets the set of all <code>*Content_c</code> and <code>*ContentEE_c</code> {@link Closeable} content model interfaces.
   */
  static Class<? extends ContentEE_c>[] getAllContentModels() {
    return new Class[]{
        AnyContentEE_c.class,
        ContentEE_c.class,
        EmbeddedContent_c.class,
        FlowContent_c.class,
        HeadingContent_c.class,
        InteractiveContent_c.class,
        ListContent_c.class,
        MetadataContent_c.class,
        PalpableContent_c.class,
        PhrasingContent_c.class,
        ScriptSupportingContent_c.class,
        SectioningContent_c.class,
        TextContent_c.class
    };
  }

  static void testContentModels(Class<? extends ContentEE_c> clazz, Class<? extends ContentEE_c>... expected) {
    InheritanceTestHelper.testInterfaces(
        ContentEE_c.class,
        iface -> {
          String simpleName = iface.getSimpleName();
          return simpleName.endsWith("Content_c") || simpleName.endsWith("ContentEE_c");
        },
        getAllContentModels(),
        clazz,
        expected
    );
  }

  @Test
  public void testNoImplementInherited() {
    for (Class<? extends ContentEE_c> iface : getAllContentModels()) {
      InheritanceTestHelper.testNoImplementInherited(ContentEE_c.class, iface);
    }
  }
}
