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
package com.aoapps.html.servlet;

import com.aoapps.html.any.AnySectioningContent;
import com.aoapps.lang.io.function.IOConsumerE;
import java.io.IOException;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#sectioning-content">3.2.5.2.3 Sectioning content</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/Content_categories#sectioning_content">Sectioning content</a>.</li>
 * </ul>
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface SectioningContent<
	__ extends SectioningContent<__>
> extends AnySectioningContent<DocumentEE, __>,
	//
	// Content models:
	//
	ContentEE<__>
{
	//
	// Factories:
	//
	// <editor-fold defaultstate="collapsed" desc="ARTICLE">
	@Override
	default ARTICLE<__> article() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new ARTICLE<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates an article element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/sections.html#the-article-element">4.3.2 The article element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ article__(IOConsumerE<? super ARTICLE__<__>, Ex> article) throws IOException, Ex {
		return article().__(article);
	}

	@Override
	default ARTICLE_c<__> article_c() throws IOException {
		return article()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="ASIDE">
	@Override
	default ASIDE<__> aside() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new ASIDE<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates an aside element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/sections.html#the-aside-element">4.3.5 The aside element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ aside__(IOConsumerE<? super ASIDE__<__>, Ex> aside) throws IOException, Ex {
		return aside().__(aside);
	}

	@Override
	default ASIDE_c<__> aside_c() throws IOException {
		return aside()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="NAV">
	@Override
	default NAV<__> nav() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new NAV<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a nav element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/sections.html#the-nav-element">4.3.4 The nav element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ nav__(IOConsumerE<? super NAV__<__>, Ex> nav) throws IOException, Ex {
		return nav().__(nav);
	}

	@Override
	default NAV_c<__> nav_c() throws IOException {
		return nav()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="SECTION">
	@Override
	default SECTION<__> section() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new SECTION<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a section element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/sections.html#the-section-element">4.3.3 The section element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ section__(IOConsumerE<? super SECTION__<__>, Ex> section) throws IOException, Ex {
		return section().__(section);
	}

	@Override
	default SECTION_c<__> section_c() throws IOException {
		return section()._c();
	}
	// </editor-fold>
}
