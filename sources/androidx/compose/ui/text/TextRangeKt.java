package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i) {
        return TextRange(i, i);
    }

    public static final long TextRange(int i, int i2) {
        return TextRange.m7475constructorimpl(packWithCheck(i, i2));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m7492coerceIn8ffj60Q(long j, int i, int i2) {
        int m7486getStartimpl = TextRange.m7486getStartimpl(j);
        if (m7486getStartimpl < i) {
            m7486getStartimpl = i;
        }
        if (m7486getStartimpl > i2) {
            m7486getStartimpl = i2;
        }
        int m7481getEndimpl = TextRange.m7481getEndimpl(j);
        if (m7481getEndimpl >= i) {
            i = m7481getEndimpl;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (m7486getStartimpl == TextRange.m7486getStartimpl(j) && i2 == TextRange.m7481getEndimpl(j)) ? j : TextRange(m7486getStartimpl, i2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m7493substringFDrldGo(CharSequence charSequence, long j) {
        return charSequence.subSequence(TextRange.m7484getMinimpl(j), TextRange.m7483getMaximpl(j)).toString();
    }
}
