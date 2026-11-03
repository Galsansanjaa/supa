package androidx.datastore.core;

import defpackage.nm1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(nm1 nm1Var, Object obj, ps0 ps0Var) {
        nm1Var.getClass();
        ps0Var.getClass();
        boolean tryLock = nm1Var.tryLock(obj);
        try {
            return (R) ps0Var.invoke(Boolean.valueOf(tryLock));
        } finally {
            if (tryLock) {
                nm1Var.unlock(obj);
            }
        }
    }

    public static Object withTryLock$default(nm1 nm1Var, Object obj, ps0 ps0Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        nm1Var.getClass();
        ps0Var.getClass();
        boolean tryLock = nm1Var.tryLock(obj);
        try {
            return ps0Var.invoke(Boolean.valueOf(tryLock));
        } finally {
            if (tryLock) {
                nm1Var.unlock(obj);
            }
        }
    }
}
