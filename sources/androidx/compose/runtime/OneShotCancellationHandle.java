package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicBoolean;
import androidx.compose.runtime.internal.AtomicInt;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class OneShotCancellationHandle implements CancellationHandle {
    public static final int $stable = 8;
    private final os0 action;
    private final AtomicInt didFireCancellation = AtomicBoolean.m4737constructorimpl(false);

    public OneShotCancellationHandle(os0 os0Var) {
        this.action = os0Var;
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        if (AtomicBoolean.m4742getAndSetimpl(this.didFireCancellation, true)) {
            return;
        }
        this.action.invoke();
    }
}
