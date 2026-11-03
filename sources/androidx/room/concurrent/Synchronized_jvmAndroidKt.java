package androidx.room.concurrent;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Synchronized_jvmAndroidKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m8361synchronized(Object obj, os0 os0Var) {
        T t;
        obj.getClass();
        os0Var.getClass();
        synchronized (obj) {
            t = (T) os0Var.invoke();
        }
        return t;
    }
}
