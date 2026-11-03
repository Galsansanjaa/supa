package androidx.core.os;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ os0 $action;

    public HandlerKt$postDelayed$runnable$1(os0 os0Var) {
        this.$action = os0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
