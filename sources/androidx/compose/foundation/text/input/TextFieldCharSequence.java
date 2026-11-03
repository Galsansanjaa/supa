package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.bn2;
import defpackage.dv1;
import defpackage.jh2;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private final TextRange composition;
    private final dv1 highlight;
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> outputAnnotations;
    private final long selection;
    private final CharSequence text;
    private final TextFieldTextStylesImpl textFieldTextStyles;

    private TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, dv1 dv1Var, List<AnnotatedString.Range<AnnotatedString.Annotation>> list, List<AnnotatedString.Range<AnnotatedString.Annotation>> list2, TextFieldTextStylesImpl textFieldTextStylesImpl) {
        this.composingAnnotations = list;
        this.outputAnnotations = list2;
        this.textFieldTextStyles = textFieldTextStylesImpl;
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.m7492coerceIn8ffj60Q(j, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.m7474boximpl(TextRangeKt.m7492coerceIn8ffj60Q(textRange.m7490unboximpl(), 0, charSequence.length())) : null;
        this.highlight = dv1Var != null ? new dv1(dv1Var.a, TextRange.m7474boximpl(TextRangeKt.m7492coerceIn8ffj60Q(((TextRange) dv1Var.b).m7490unboximpl(), 0, charSequence.length()))) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TextFieldCharSequence(java.lang.CharSequence r10, long r11, androidx.compose.ui.text.TextRange r13, defpackage.dv1 r14, java.util.List r15, java.util.List r16, androidx.compose.foundation.text.input.TextFieldTextStylesImpl r17, int r18, defpackage.sb0 r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            if (r0 == 0) goto L7
            java.lang.String r0 = ""
            goto L8
        L7:
            r0 = r10
        L8:
            r1 = r18 & 2
            if (r1 == 0) goto L13
            androidx.compose.ui.text.TextRange$Companion r1 = androidx.compose.ui.text.TextRange.Companion
            long r1 = r1.m7491getZerod9O1mEE()
            goto L14
        L13:
            r1 = r11
        L14:
            r3 = r18 & 4
            r4 = 0
            if (r3 == 0) goto L1b
            r3 = r4
            goto L1c
        L1b:
            r3 = r13
        L1c:
            r5 = r18 & 8
            if (r5 == 0) goto L22
            r5 = r4
            goto L23
        L22:
            r5 = r14
        L23:
            r6 = r18 & 16
            if (r6 == 0) goto L29
            r6 = r4
            goto L2a
        L29:
            r6 = r15
        L2a:
            r7 = r18 & 32
            if (r7 == 0) goto L30
            r7 = r4
            goto L32
        L30:
            r7 = r16
        L32:
            r8 = r18 & 64
            if (r8 == 0) goto L37
            goto L39
        L37:
            r4 = r17
        L39:
            r8 = 0
            r10 = r9
            r11 = r0
            r12 = r1
            r14 = r3
            r18 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r19 = r8
            r10.<init>(r11, r12, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.TextFieldCharSequence.<init>(java.lang.CharSequence, long, androidx.compose.ui.text.TextRange, dv1, java.util.List, java.util.List, androidx.compose.foundation.text.input.TextFieldTextStylesImpl, int, sb0):void");
    }

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, dv1 dv1Var, List list, List list2, TextFieldTextStylesImpl textFieldTextStylesImpl, sb0 sb0Var) {
        this(charSequence, j, textRange, dv1Var, list, list2, textFieldTextStylesImpl);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public final boolean contentEquals(CharSequence charSequence) {
        return bn2.Z(this.text, charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.m7479equalsimpl0(this.selection, textFieldCharSequence.selection) && jh2.k(this.composition, textFieldCharSequence.composition) && jh2.k(this.highlight, textFieldCharSequence.highlight) && jh2.k(this.composingAnnotations, textFieldCharSequence.composingAnnotations) && contentEquals(textFieldCharSequence.text) && jh2.k(this.textFieldTextStyles, textFieldCharSequence.textFieldTextStyles);
    }

    public char get(int i) {
        return this.text.charAt(i);
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
        return this.composingAnnotations;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1744getCompositionMzsxiRA() {
        return this.composition;
    }

    public final dv1 getHighlight() {
        return this.highlight;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getOutputAnnotations() {
        return this.outputAnnotations;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1745getSelectiond9O1mEE() {
        return this.selection;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextFieldTextStylesImpl getTextFieldTextStyles() {
        return this.textFieldTextStyles;
    }

    public int hashCode() {
        int m7487hashCodeimpl = (TextRange.m7487hashCodeimpl(this.selection) + (this.text.hashCode() * 31)) * 31;
        TextRange textRange = this.composition;
        int m7487hashCodeimpl2 = (m7487hashCodeimpl + (textRange != null ? TextRange.m7487hashCodeimpl(textRange.m7490unboximpl()) : 0)) * 31;
        dv1 dv1Var = this.highlight;
        int hashCode = (m7487hashCodeimpl2 + (dv1Var != null ? dv1Var.hashCode() : 0)) * 31;
        List<AnnotatedString.Range<AnnotatedString.Annotation>> list = this.composingAnnotations;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        TextFieldTextStylesImpl textFieldTextStylesImpl = this.textFieldTextStyles;
        return hashCode2 + (textFieldTextStylesImpl != null ? textFieldTextStylesImpl.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final boolean shouldShowSelection() {
        return this.highlight == null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.text.subSequence(i, i2);
    }

    public final void toCharArray(char[] cArr, int i, int i2, int i3) {
        ToCharArray_androidKt.toCharArray(this.text, cArr, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text.toString();
    }
}
