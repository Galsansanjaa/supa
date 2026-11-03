package androidx.compose.ui.internal;

import defpackage.i70;
import defpackage.os0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
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
        throw sg3.l("Required value was null.");
    }

    public static final <T> T checkPreconditionNotNull(T t, os0 os0Var) {
        if (t != null) {
            return t;
        }
        throw sg3.l((String) os0Var.invoke());
    }

    public static final void requirePrecondition(boolean z, os0 os0Var) {
        if (z) {
            return;
        }
        throwIllegalArgumentException((String) os0Var.invoke());
    }

    public static final <T> T requirePreconditionNotNull(T t, os0 os0Var) {
        if (t != null) {
            return t;
        }
        throwIllegalArgumentExceptionForNullCheck((String) os0Var.invoke());
        i70.i();
        return null;
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Void throwIllegalArgumentExceptionForNullCheck(String str) {
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

    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }
}
