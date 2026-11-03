package androidx.compose.ui.text.input;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i2, os0 os0Var) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? ((Number) os0Var.invoke()).intValue() : i3;
    }

    public static final int subtractExactOrElse(int i, int i2, os0 os0Var) {
        int i3 = i - i2;
        return ((i ^ i3) & (i2 ^ i)) < 0 ? ((Number) os0Var.invoke()).intValue() : i3;
    }
}
