package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m7648updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m7482getLengthimpl;
        int m7484getMinimpl = TextRange.m7484getMinimpl(j);
        int m7483getMaximpl = TextRange.m7483getMaximpl(j);
        if (TextRange.m7488intersects5zctL8(j2, j)) {
            if (TextRange.m7476contains5zctL8(j2, j)) {
                m7484getMinimpl = TextRange.m7484getMinimpl(j2);
                m7483getMaximpl = m7484getMinimpl;
            } else {
                if (TextRange.m7476contains5zctL8(j, j2)) {
                    m7482getLengthimpl = TextRange.m7482getLengthimpl(j2);
                } else if (TextRange.m7477containsimpl(j2, m7484getMinimpl)) {
                    m7484getMinimpl = TextRange.m7484getMinimpl(j2);
                    m7482getLengthimpl = TextRange.m7482getLengthimpl(j2);
                } else {
                    m7483getMaximpl = TextRange.m7484getMinimpl(j2);
                }
                m7483getMaximpl -= m7482getLengthimpl;
            }
        } else if (m7483getMaximpl > TextRange.m7484getMinimpl(j2)) {
            m7484getMinimpl -= TextRange.m7482getLengthimpl(j2);
            m7482getLengthimpl = TextRange.m7482getLengthimpl(j2);
            m7483getMaximpl -= m7482getLengthimpl;
        }
        return TextRangeKt.TextRange(m7484getMinimpl, m7483getMaximpl);
    }
}
