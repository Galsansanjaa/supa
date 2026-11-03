package androidx.lifecycle.viewmodel.internal;

import defpackage.j20;
import defpackage.nb0;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CloseableCoroutineScope implements AutoCloseable, y40 {
    private final j20 coroutineContext;

    public CloseableCoroutineScope(j20 j20Var) {
        j20Var.getClass();
        this.coroutineContext = j20Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(y40 y40Var) {
        this(y40Var.getCoroutineContext());
        y40Var.getClass();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        nb0.l(getCoroutineContext(), null);
    }

    @Override // defpackage.y40
    public j20 getCoroutineContext() {
        return this.coroutineContext;
    }
}
