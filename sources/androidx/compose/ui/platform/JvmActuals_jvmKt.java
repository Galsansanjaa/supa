package androidx.compose.ui.platform;

import defpackage.hd0;
import defpackage.k93;
import defpackage.os0;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class JvmActuals_jvmKt {
    public static final Object nativeClass(Object obj) {
        return obj.getClass();
    }

    public static final String simpleIdentityToString(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        return k93.m(str, "@", String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
    }

    @hd0
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m7192synchronized(Object obj, os0 os0Var) {
        R r;
        synchronized (obj) {
            r = (R) os0Var.invoke();
        }
        return r;
    }
}
