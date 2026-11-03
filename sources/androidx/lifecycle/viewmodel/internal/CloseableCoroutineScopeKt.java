package androidx.lifecycle.viewmodel.internal;

import defpackage.bc0;
import defpackage.j20;
import defpackage.kx;
import defpackage.mi0;
import defpackage.oe0;
import defpackage.wh1;
import defpackage.wq1;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CloseableCoroutineScopeKt {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope asCloseable(y40 y40Var) {
        y40Var.getClass();
        return new CloseableCoroutineScope(y40Var);
    }

    public static final CloseableCoroutineScope createViewModelScope() {
        j20 j20Var = mi0.a;
        try {
            bc0 bc0Var = oe0.a;
            j20Var = wh1.a.n;
        } catch (IllegalStateException | wq1 unused) {
        }
        return new CloseableCoroutineScope(j20Var.plus(kx.b()));
    }
}
