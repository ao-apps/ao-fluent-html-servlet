/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2019, 2020, 2021, 2022, 2025  AO Industries, Inc.
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

import com.aoapps.html.any.AnySCRIPT;
import java.io.IOException;
import java.io.Writer;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/scripting.html#the-script-element">4.12.1 The script element</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/script">&lt;script&gt;: The Script element</a>.</li>
 * <li>See <a href="https://www.w3schools.com/tags/tag_script.asp">HTML script tag</a>.</li>
 * </ul>
 *
 * @param  <PC>  The parent content model this element is within
 *
 * @author  AO Industries, Inc.
 */
public final class SCRIPT<
    PC extends ScriptSupportingContent<PC>
    > extends AnySCRIPT<DocumentEE, PC, SCRIPT<PC>> {

  SCRIPT(DocumentEE document, PC pc) {
    super(document, pc);
  }

  SCRIPT(DocumentEE document, PC pc, String type) {
    super(document, pc, type);
  }

  SCRIPT(DocumentEE document, PC pc, Type type) {
    super(document, pc, type);
  }

  // Expose to this package, avoiding public to keep a clean API for optimal code assist
  @Override
  protected void writeOpen(Writer unsafe) throws IOException {
    super.writeOpen(unsafe);
  }
}
