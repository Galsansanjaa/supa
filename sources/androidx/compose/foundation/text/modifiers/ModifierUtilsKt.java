package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m2063maxWidthForTextLayoutR2G3SPE(long j, boolean z, int i) {
        if ((z || TextOverflow.m7987equalsimpl0(i, TextOverflow.Companion.m7997getEllipsisgIe3tQ8())) && Constraints.m8010getHasBoundedWidthimpl(j)) {
            return Constraints.m8014getMaxWidthimpl(j);
        }
        return Integer.MAX_VALUE;
    }
}
