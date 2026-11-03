package androidx.compose.foundation.text.modifiers;

import defpackage.bn2;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement;
    private static final String TwoLineTextReplacement;

    static {
        String f0 = bn2.f0(10, "H");
        EmptyTextReplacement = f0;
        TwoLineTextReplacement = wa2.s(f0, "\n", f0);
    }
}
