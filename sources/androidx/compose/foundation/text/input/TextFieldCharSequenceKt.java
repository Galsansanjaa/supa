package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextFieldCharSequenceKt {
    public static final CharSequence getSelectedText(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m7484getMinimpl(textFieldCharSequence.m1745getSelectiond9O1mEE()), TextRange.m7483getMaximpl(textFieldCharSequence.m1745getSelectiond9O1mEE()));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence textFieldCharSequence, int i) {
        int m7483getMaximpl = TextRange.m7483getMaximpl(textFieldCharSequence.m1745getSelectiond9O1mEE());
        int m7483getMaximpl2 = TextRange.m7483getMaximpl(textFieldCharSequence.m1745getSelectiond9O1mEE());
        int i2 = m7483getMaximpl2 + i;
        if (((i ^ i2) & (m7483getMaximpl2 ^ i2)) < 0) {
            i2 = textFieldCharSequence.length();
        }
        return textFieldCharSequence.subSequence(m7483getMaximpl, Math.min(i2, textFieldCharSequence.length()));
    }

    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence textFieldCharSequence, int i) {
        int m7484getMinimpl = TextRange.m7484getMinimpl(textFieldCharSequence.m1745getSelectiond9O1mEE());
        int i2 = m7484getMinimpl - i;
        if (((i ^ m7484getMinimpl) & (m7484getMinimpl ^ i2)) < 0) {
            i2 = 0;
        }
        return textFieldCharSequence.subSequence(Math.max(0, i2), TextRange.m7484getMinimpl(textFieldCharSequence.m1745getSelectiond9O1mEE()));
    }
}
