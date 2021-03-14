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
package com.aoindustries.html.servlet;

import com.aoindustries.html.any.AnyUnion_Palpable_Phrasing;
import com.aoindustries.html.any.Suppliers;
import com.aoindustries.html.any.attributes.Enum.Dir;
import com.aoindustries.io.function.IOConsumerE;
import com.aoindustries.io.function.IOSupplierE;
import java.io.IOException;

/**
 * Elements that are common to both {@link PalpableContent} and {@link PhrasingContent}.
 *
 * @param  <__>  This content model, which will be the parent content model of child elements
 *
 * @author  AO Industries, Inc.
 */
public interface Union_Palpable_Phrasing<
	__ extends Union_Palpable_Phrasing<__>
> extends AnyUnion_Palpable_Phrasing<DocumentEE, __>,
	//
	// Unions:
	//
	// Inherited: Embedded_Interactive<__>
	Union_Embedded_Palpable_Phrasing<__>,
	Union_Interactive_Phrasing<__>,

	//
	// Content models:
	//
	// Inherited: ContentEE<__>
	TextContent<__> // that is not inter-element whitespace
{
	//
	// Factories:
	//
	// Inherited: A
	// <editor-fold defaultstate="collapsed" desc="ABBR">
	@Override
	default ABBR<__> abbr() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new ABBR<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates an abbr element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-abbr-element">4.5.9 The abbr element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ abbr__(IOConsumerE<? super ABBR__<__>, Ex> abbr) throws IOException, Ex {
		return abbr().__(abbr);
	}

	@Override
	default ABBR_c<__> abbr_c() throws IOException {
		return abbr()._c();
	}
	// </editor-fold>
	// Inherited: AUDIO
	// <editor-fold defaultstate="collapsed" desc="B">
	@Override
	default B<__> b() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new B<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a b element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-b-element">4.5.21 The b element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ b__(IOConsumerE<? super B__<__>, Ex> b) throws IOException, Ex {
		return b().__(b);
	}

	@Override
	default B_c<__> b_c() throws IOException {
		return b()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="BDI">
	@Override
	default BDI<__> bdi() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new BDI<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a bdi element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-bdi-element">4.5.24 The bdi element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ bdi__(IOConsumerE<? super BDI__<__>, Ex> bdi) throws IOException, Ex {
		return bdi().__(bdi);
	}

	@Override
	default BDI_c<__> bdi_c() throws IOException {
		return bdi()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="BDO">
	@Override
	default BDO<__> bdo() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new BDO<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	@Override
	default BDO<__> bdo(String dir) throws IOException {
		return bdo().dir(dir);
	}

	/**
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 */
	@Override
	default <Ex extends Throwable> BDO<__> bdo(Suppliers.String<Ex> dir) throws IOException, Ex {
		return bdo().dir(dir);
	}

	@Override
	default BDO<__> bdo(Dir.Value dir) throws IOException {
		return bdo().dir(dir);
	}

	/**
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 */
	@Override
	default <Ex extends Throwable> BDO<__> bdo(IOSupplierE<? extends Dir.Value, Ex> dir) throws IOException, Ex {
		return bdo().dir(dir);
	}

	/**
	 * Creates a bdo element with the given dir attribute and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-bdo-element">4.5.25 The bdo element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 * @param  dir  <em>The <code>auto</code> value must not be specified.</em>
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ bdo__(Dir.Value dir, IOConsumerE<? super BDO__<__>, Ex> bdo) throws IOException, Ex {
		return bdo(dir).__(bdo);
	}

	@Override
	default BDO_c<__> bdo_c(Dir.Value dir) throws IOException {
		return bdo(dir)._c();
	}
	// </editor-fold>
	// Inherited: BUTTON
	// Inherited: CANVAS
	// <editor-fold defaultstate="collapsed" desc="CITE">
	@Override
	default CITE<__> cite() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new CITE<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a cite element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-cite-element">4.5.6 The cite element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ cite__(IOConsumerE<? super CITE__<__>, Ex> cite) throws IOException, Ex {
		return cite().__(cite);
	}

	@Override
	default CITE_c<__> cite_c() throws IOException {
		return cite()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="CODE">
	@Override
	default CODE<__> code() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new CODE<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a code element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-code-element">4.5.15 The code element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ code__(IOConsumerE<? super CODE__<__>, Ex> code) throws IOException, Ex {
		return code().__(code);
	}

	@Override
	default CODE_c<__> code_c() throws IOException {
		return code()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="DATA">
	@Override
	default DATA<__> data() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new DATA<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	@Override
	default DATA<__> data(Object value) throws IOException {
		return data().value(value);
	}

	/**
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 */
	@Override
	default <Ex extends Throwable> DATA<__> data(IOSupplierE<?, Ex> value) throws IOException, Ex {
		return data().value(value);
	}

	/**
	 * Creates a data element with the given value and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-data-element">4.5.13 The data element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ data__(Object value, IOConsumerE<? super DATA__<__>, Ex> data) throws IOException, Ex {
		return data(value).__(data);
	}

	@Override
	default DATA_c<__> data_c(Object value) throws IOException {
		return data(value)._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="DFN">
	@Override
	default DFN<__> dfn() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new DFN<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a dfn element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-dfn-element">4.5.8 The dfn element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ dfn__(IOConsumerE<? super DFN__<__>, Ex> dfn) throws IOException, Ex {
		return dfn().__(dfn);
	}

	@Override
	default DFN_c<__> dfn_c() throws IOException {
		return dfn()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="EM">
	@Override
	default EM<__> em() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new EM<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates an em element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-em-element">4.5.2 The em element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ em__(IOConsumerE<? super EM__<__>, Ex> em) throws IOException, Ex {
		return em().__(em);
	}

	@Override
	default EM_c<__> em_c() throws IOException {
		return em()._c();
	}
	// </editor-fold>
	// Inherited: EMBED
	// <editor-fold defaultstate="collapsed" desc="I">
	@Override
	default I<__> i() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new I<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates an i element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-i-element">4.5.20 The i element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ i__(IOConsumerE<? super I__<__>, Ex> i) throws IOException, Ex {
		return i().__(i);
	}

	@Override
	default I_c<__> i_c() throws IOException {
		return i()._c();
	}
	// </editor-fold>
	// Inherited: IFRAME
	// Inherited: IMG
	// Inherited: INPUT
	// <editor-fold defaultstate="collapsed" desc="INS">
	@Override
	default INS<__> ins() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new INS<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	@Override
	default INS_c<__> ins_c() throws IOException {
		return ins()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="KBD">
	@Override
	default KBD<__> kbd() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new KBD<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a kbd element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-kbd-element">4.5.18 The kbd element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ kbd__(IOConsumerE<? super KBD__<__>, Ex> kbd) throws IOException, Ex {
		return kbd().__(kbd);
	}

	@Override
	default KBD_c<__> kbd_c() throws IOException {
		return kbd()._c();
	}
	// </editor-fold>
	// Inherited: LABEL
	// <editor-fold defaultstate="collapsed" desc="MAP">
	@Override
	default MAP<__> map() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new MAP<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	@Override
	default MAP<__> map(String name) throws IOException {
		return map().name(name);
	}

	/**
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 */
	@Override
	default <Ex extends Throwable> MAP<__> map(IOSupplierE<? extends String, Ex> name) throws IOException, Ex {
		return map().name(name);
	}

	@Override
	default MAP_c<__> map_c(String name) throws IOException {
		return map(name)._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="MARK">
	@Override
	default MARK<__> mark() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new MARK<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a mark element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-mark-element">4.5.23 The mark element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ mark__(IOConsumerE<? super MARK__<__>, Ex> mark) throws IOException, Ex {
		return mark().__(mark);
	}

	@Override
	default MARK_c<__> mark_c() throws IOException {
		return mark()._c();
	}
	// </editor-fold>
	// Inherited: MathML math
	// <editor-fold defaultstate="collapsed" desc="METER">
	@Override
	default METER<__> meter() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new METER<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a meter element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-meter-element">4.10.14 The meter element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ meter__(IOConsumerE<? super METER__<__>, Ex> meter) throws IOException, Ex {
		return meter().__(meter);
	}

	@Override
	default METER_c<__> meter_c() throws IOException {
		return meter()._c();
	}
	// </editor-fold>
	// Inherited: OBJECT
	// <editor-fold defaultstate="collapsed" desc="OUTPUT">
	@Override
	default OUTPUT<__> output() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new OUTPUT<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates an output element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-output-element">4.10.12 The output element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ output__(IOConsumerE<? super OUTPUT__<__>, Ex> output) throws IOException, Ex {
		return output().__(output);
	}

	@Override
	default OUTPUT_c<__> output_c() throws IOException {
		return output()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="PROGRESS">
	@Override
	default PROGRESS<__> progress() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new PROGRESS<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a progress element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/form-elements.html#the-progress-element">4.10.13 The progress element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ progress__(IOConsumerE<? super PROGRESS__<__>, Ex> progress) throws IOException, Ex {
		return progress().__(progress);
	}

	@Override
	default PROGRESS_c<__> progress_c() throws IOException {
		return progress()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="Q">
	@Override
	default Q<__> q() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new Q<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a q element with no attributes and the given body.
	 * <ul>
	 * <li>See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-q-element">4.5.7 The q element</a>.</li>
	 * <li>See <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/q">&lt;q&gt;: The Inline Quotation element</a>.</li>
	 * </ul>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ q__(IOConsumerE<? super Q__<__>, Ex> q) throws IOException, Ex {
		return q().__(q);
	}

	@Override
	default Q_c<__> q_c() throws IOException {
		return q()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="TODO: RUBY">
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="S">
	@Override
	default S<__> s() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new S<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a s element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-s-element">4.5.5 The s element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ s__(IOConsumerE<? super S__<__>, Ex> s) throws IOException, Ex {
		return s().__(s);
	}

	@Override
	default S_c<__> s_c() throws IOException {
		return s()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="SAMP">
	@Override
	default SAMP<__> samp() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new SAMP<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a samp element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-samp-element">4.5.17 The samp element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ samp__(IOConsumerE<? super SAMP__<__>, Ex> samp) throws IOException, Ex {
		return samp().__(samp);
	}

	@Override
	default SAMP_c<__> samp_c() throws IOException {
		return samp()._c();
	}
	// </editor-fold>
	// Inherited: SELECT
	// <editor-fold defaultstate="collapsed" desc="SMALL">
	@Override
	default SMALL<__> small() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new SMALL<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a small element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-small-element">4.5.4 The small element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ small__(IOConsumerE<? super SMALL__<__>, Ex> small) throws IOException, Ex {
		return small().__(small);
	}

	@Override
	default SMALL_c<__> small_c() throws IOException {
		return small()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="SPAN">
	@Override
	default SPAN<__> span() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new SPAN<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a span element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-span-element">4.5.26 The span element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ span__(IOConsumerE<? super SPAN__<__>, Ex> span) throws IOException, Ex {
		return span().__(span);
	}

	@Override
	default SPAN_c<__> span_c() throws IOException {
		return span()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="STRONG">
	@Override
	default STRONG<__> strong() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new STRONG<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a strong element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-strong-element">4.5.3 The strong element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ strong__(IOConsumerE<? super STRONG__<__>, Ex> strong) throws IOException, Ex {
		return strong().__(strong);
	}

	@Override
	default STRONG_c<__> strong_c() throws IOException {
		return strong()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="SUB">
	@Override
	default SUB<__> sub() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new SUB<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a sub element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-sub-and-sup-elements">4.5.19 The sub and sup elements</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ sub__(IOConsumerE<? super SUB__<__>, Ex> sub) throws IOException, Ex {
		return sub().__(sub);
	}

	@Override
	default SUB_c<__> sub_c() throws IOException {
		return sub()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="SUP">
	@Override
	default SUP<__> sup() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new SUP<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a sup element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-sub-and-sup-elements">4.5.19 The sub and sup elements</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ sup__(IOConsumerE<? super SUP__<__>, Ex> sup) throws IOException, Ex {
		return sup().__(sup);
	}

	@Override
	default SUP_c<__> sup_c() throws IOException {
		return sup()._c();
	}
	// </editor-fold>
	// Inherited: SVG svg
	// Inherited: TEXTAREA
	// <editor-fold defaultstate="collapsed" desc="TODO: TIME">
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="U">
	@Override
	default U<__> u() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new U<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a u element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-u-element">4.5.22 The u element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ u__(IOConsumerE<? super U__<__>, Ex> u) throws IOException, Ex {
		return u().__(u);
	}

	@Override
	default U_c<__> u_c() throws IOException {
		return u()._c();
	}
	// </editor-fold>
	// <editor-fold defaultstate="collapsed" desc="VAR">
	@Override
	default VAR<__> var() throws IOException {
		@SuppressWarnings("unchecked")
		__ pc = (__)this;
		DocumentEE document = getDocument();
		return new VAR<>(document, pc).writeOpen(document.getUnsafe(null));
	}

	/**
	 * Creates a var element with no attributes and the given body.
	 * <p>
	 * See <a href="https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-var-element">4.5.16 The var element</a>.
	 * </p>
	 *
	 * @param  <Ex>  An arbitrary exception type that may be thrown
	 *
	 * @return  This content model, which will be the parent content model of child elements
	 */
	default <Ex extends Throwable> __ var__(IOConsumerE<? super VAR__<__>, Ex> var) throws IOException, Ex {
		return var().__(var);
	}

	@Override
	default VAR_c<__> var_c() throws IOException {
		return var()._c();
	}
	// </editor-fold>
	// Inherited: VIDEO
	// <editor-fold defaultstate="collapsed" desc="TODO: autonomous custom elements">
	// 4.13 Custom elements: https://html.spec.whatwg.org/multipage/custom-elements.html#custom-elements
	// </editor-fold>
}
