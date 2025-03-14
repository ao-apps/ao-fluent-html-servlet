/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2021, 2022, 2025  AO Industries, Inc.
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
import com.aoapps.html.any.AnyScriptSupportingContent;
import com.aoapps.html.any.Suppliers;
import com.aoapps.lang.io.function.IOSupplierE;
import java.io.IOException;

/**
 * See <a href="https://html.spec.whatwg.org/multipage/dom.html#script-supporting-elements">3.2.5.2.9 Script-supporting elements</a>.
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface ScriptSupportingContent<
    __ extends ScriptSupportingContent<__>
    > extends AnyScriptSupportingContent<DocumentEE, __>,
    //
    // Unions:
    //
    Union_COLGROUP_ScriptSupporting<__> {

  //
  // Content models:
  //
  // Inherited: ContentEE<__>

  //
  // Factories:
  //
  // <editor-fold defaultstate="collapsed" desc="SCRIPT">
  @Override
  @SuppressWarnings("deprecation")
  default SCRIPT<__> script() throws IOException {
    @SuppressWarnings("unchecked")
    __ pc = (__) this;
    DocumentEE document = getDocument();
    SCRIPT<__> e = new SCRIPT<>(document, pc);
    e.writeOpen(document.getRawUnsafe(null));
    return e;
  }

  @Override
  @SuppressWarnings("deprecation")
  default SCRIPT<__> script(String type) throws IOException {
    @SuppressWarnings("unchecked")
    __ pc = (__) this;
    DocumentEE document = getDocument();
    SCRIPT<__> e = new SCRIPT<>(document, pc, type);
    e.writeOpen(document.getRawUnsafe(null));
    return e;
  }

  /**
   * {@inheritDoc}
   *
   * @param  <Ex>  An arbitrary exception type that may be thrown
   */
  @Override
  default <Ex extends Throwable> SCRIPT<__> script(Suppliers.String<Ex> type) throws IOException, Ex {
    return script((type == null) ? null : type.get());
  }

  @Override
  @SuppressWarnings("deprecation")
  default SCRIPT<__> script(AnySCRIPT.Type type) throws IOException {
    @SuppressWarnings("unchecked")
    __ pc = (__) this;
    DocumentEE document = getDocument();
    SCRIPT<__> e = new SCRIPT<>(document, pc, type);
    e.writeOpen(document.getRawUnsafe(null));
    return e;
  }

  /**
   * {@inheritDoc}
   *
   * @param  <Ex>  An arbitrary exception type that may be thrown
   */
  @Override
  default <Ex extends Throwable> SCRIPT<__> script(IOSupplierE<AnySCRIPT.Type, Ex> type) throws IOException, Ex {
    return script((type == null) ? null : type.get());
  }
  // </editor-fold>
  // Inherited: TEMPLATE
}
