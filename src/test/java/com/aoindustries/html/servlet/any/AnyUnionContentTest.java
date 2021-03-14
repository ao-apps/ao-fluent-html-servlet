/*
 * ao-fluent-html-servlet - Fluent Java DSL for high-performance HTML generation in a Servlet environment.
 * Copyright (C) 2021  AO Industries, Inc.
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
 * along with ao-fluent-html-servlet.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoindustries.html.servlet.any;

import com.aoindustries.html.any.InheritanceTests;
import org.junit.Test;

/**
 * Tests <code>Union_*</code> interfaces,
 * which confirm a class implements the expected set of interfaces.
 *
 * @author  AO Industries, Inc.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class AnyUnionContentTest {

	/**
	 * Gets the set of all <code>Union_*</code> interfaces.
	 */
	static Class<? extends ContentEE>[] getAllUnions() {
		return new Class[] {
			// None
		};
	}

	static void testUnions(Class<? extends ContentEE> clazz, Class<? extends ContentEE> ... expected) {
		InheritanceTests.testInterfaces(
			ContentEE.class,
			iface -> iface.getSimpleName().startsWith("AnyUnion_"),
			getAllUnions(),
			clazz,
			expected
		);
	}

	@Test
	public void testNoImplementInherited() {
		for(Class<? extends ContentEE> iface : getAllUnions()) {
			InheritanceTests.testNoImplementInherited(ContentEE.class, iface);
		}
	}
}
