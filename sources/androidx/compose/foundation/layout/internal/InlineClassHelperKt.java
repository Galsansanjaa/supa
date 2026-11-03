package androidx.compose.foundation.layout.internal;

import defpackage.i70;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
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

    public static final <T> T checkPreconditionNotNull(T t) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        i70.i();
        return null;
    }

    public static final <T> T checkPreconditionNotNull(T t, os0 os0Var) {
        if (t != null) {
            return t;
        }
        throwIllegalStateExceptionForNullCheck((String) os0Var.invoke());
        i70.i();
        return null;
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

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        throw new IndexOutOfBoundsException(str);
    }
}
