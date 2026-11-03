package androidx.datastore.core.okio;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Synchronizer {
    public final <T> T withLock(os0 os0Var) {
        T t;
        os0Var.getClass();
        synchronized (this) {
            t = (T) os0Var.invoke();
        }
        return t;
    }
}
