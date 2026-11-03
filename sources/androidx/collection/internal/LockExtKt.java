package androidx.collection.internal;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m37synchronized(Lock lock, os0 os0Var) {
        T t;
        lock.getClass();
        os0Var.getClass();
        synchronized (lock) {
            t = (T) os0Var.invoke();
        }
        return t;
    }
}
