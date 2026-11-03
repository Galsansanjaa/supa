package androidx.compose.ui.layout;

import androidx.core.graphics.Insets;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ValueInsets_androidKt {
    private static final long ZeroValueInsets = ValueInsets.m6825constructorimpl(0);
    private static final long UnsetValueInsets = ValueInsets.m6825constructorimpl(-1);

    public static final long ValueInsets(int i, int i2, int i3, int i4) {
        return ValueInsets.m6825constructorimpl((i2 << 32) | (i << 48) | (i3 << 16) | i4);
    }

    public static final long ValueInsets(Insets insets) {
        return ValueInsets.m6825constructorimpl((insets.left << 48) | (insets.top << 32) | (insets.right << 16) | insets.bottom);
    }

    public static final long getUnsetValueInsets() {
        return UnsetValueInsets;
    }

    public static final long getZeroValueInsets() {
        return ZeroValueInsets;
    }
}
