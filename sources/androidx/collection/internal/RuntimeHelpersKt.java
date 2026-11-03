package androidx.collection.internal;

import defpackage.os0;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RuntimeHelpersKt {
    public static final void checkPrecondition(boolean z, os0 os0Var) {
        os0Var.getClass();
        if (z) {
            return;
        }
        throwIllegalStateException((String) os0Var.invoke());
    }

    public static final void requirePrecondition(boolean z, os0 os0Var) {
        os0Var.getClass();
        if (z) {
            return;
        }
        throwIllegalArgumentException((String) os0Var.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        str.getClass();
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        str.getClass();
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        str.getClass();
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwNoSuchElementException(String str) {
        str.getClass();
        throw new NoSuchElementException(str);
    }

    public static final Void throwNoSuchElementExceptionForInline(String str) {
        str.getClass();
        throw new NoSuchElementException(str);
    }
}
