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

import com.aoapps.html.any.AnyFlowContent;
import java.io.IOException;

/**
 * <ul>
 * <li>See <a href="https://html.spec.whatwg.org/multipage/dom.html#flow-content">3.2.5.2.2 Flow content</a>.</li>
 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/Content_categories#flow_content">Flow content</a>.</li>
 * </ul>
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface FlowContent<
	__ extends FlowContent<__>
> extends AnyFlowContent<DocumentEE, __>,
	//
	// Unions:
	//
	// Inherited: Union_COLGROUP_ScriptSupporting<__>
	// Inherited: Union_DL_Palpable<__>
	// Inherited: Union_Embedded_Interactive<__>
	// Inherited: Union_Embedded_Palpable_Phrasing<__>
	// Inherited: Union_Interactive_Phrasing<__>
	// Inherited: Union_Metadata_Phrasing<__>
	// Inherited: Union_Palpable_Phrasing<__>

	//
	// Content models:
	//
	// Inherited: ContentEE<__>
	// Inherited: EmbeddedContent<__>
	// Inherited: HeadingContent<__>
	// Inherited: InteractiveContent<__>
	PalpableContent<__>,
	PhrasingContent<__>
	// Inherited: ScriptSupportingContent<__>
	// Inherited: SectioningContent<__>
	// Inherited: TextContent<__>
{
	//
	// Factories:
	//
	// Inherited: A
	// Inherited: ABBR
	// Inherited: ADDRESS
	// Inherited: AREA - if a descendent of map
	// Inherited: ARTICLE
	// Inherited: ASIDE
	// Inherited: AUDIO
	// Inherited: B
	// Inherited: BDI
	// Inherited: BDO
	// Inherited: BLOCKQUOTE
	// Inherited: BR
	// Inherited: BUTTON
	// Inherited: CANVAS
	// Inherited: CITE
	// Inherited: CODE
	// Inherited: DATA
	// Inherited: DATALIST
	// Inherited: DEL
	// Inherited: DETAILS
	// Inherited: DFN
	// <editor-fold defaultstate="collapsed" desc="TODO: DIALOG">
	// </editor-fold>
	// Inherited: DIV
	// Inherited: DL
	// Inherited: EM
	// Inherited: EMBED
	// Inherited: FIELDSET
	// Inherited: FIGURE
	// Inherited: FOOTER
	// Inherited: FORM
	// Inherited: H1
	// Inherited: H2
	// Inherited: H3
	// Inherited: H4
	// Inherited: H5
	// Inherited: H6
	// Inherited: HEADER
	// Inherited: HGROUP
	// <editor-fold defaultstate="collapsed" desc="HR">
	@Override
	@SuppressWarnings("deprecation")
	default HR<__> hr() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new HR<>(document, pc).writeOpen(document.getRawUnsafe(null));
	}
	// </editor-fold>
	// Inherited: I
	// Inherited: IFRAME
	// Inherited: IMG
	// Inherited: INPUT
	// Inherited: INS
	// Inherited: KBD
	// Inherited: LABEL
	// Inherited: LINK - if it is allowed in body
	// Inherited: MAIN - if it is a hierarchically correct main element
	// Inherited: MAP
	// Inherited: MARK
	// Inherited: MathML math
	// Inherited: MENU
	// Inherited: META - if the itemprop attribute is present
	// Inherited: METER
	// Inherited: NAV
	// Inherited: NOSCRIPT
	// Inherited: OBJECT
	// Inherited: OL
	// Inherited: OUTPUT
	// Inherited: P
	// Inherited: PICTURE
	// Inherited: PRE
	// Inherited: PROGRESS
	// Inherited: Q
	// Inherited: RUBY
	// Inherited: S
	// Inherited: SAMP
	// Inherited: SCRIPT
	// Inherited: SECTION
	// Inherited: SELECT
	// Inherited: SLOT
	// Inherited: SMALL
	// Inherited: SPAN
	// Inherited: STRONG
	// Inherited: SUB
	// Inherited: SUP
	// Inherited: SVG svg
	// Inherited: TABLE
	// Inherited: TEMPLATE
	// Inherited: TEXTAREA
	// Inherited: TIME
	// Inherited: U
	// Inherited: UL
	// Inherited: VAR
	// Inherited: VIDEO
	// Inherited: WBR
	// Inherited: autonomous custom elements
}
