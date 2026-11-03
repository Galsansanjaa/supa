package androidx.compose.runtime.retain.impl;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PreconditionsKt {
    public static final void checkPrecondition(boolean z) {
        if (z) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    public static final void checkPrecondition(boolean z, os0 os0Var) {
        if (z) {
            return;
        }
        throwIllegalStateException((String) os0Var.invoke());
    }

    public static final void requirePrecondition(boolean z, os0 os0Var) {
        if (z) {
            return;
        }
        throwIllegalArgumentException((String) os0Var.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }
}
