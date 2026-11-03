package androidx.compose.runtime;

import defpackage.hd0;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final /* synthetic */ class ActualJvm_jvmKt__OldSynchronization_jvmKt {
    @hd0
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m4457synchronized(Object obj, os0 os0Var) {
        R r;
        synchronized (obj) {
            r = (R) os0Var.invoke();
        }
        return r;
    }
}
