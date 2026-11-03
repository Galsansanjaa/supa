package androidx.compose.foundation.gestures.snapping;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {174}, m = "tryApproach", v = 1)
/* loaded from: classes.dex */
public final class SnapFlingBehavior$tryApproach$1 extends c10 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$tryApproach$1(SnapFlingBehavior snapFlingBehavior, a10 a10Var) {
        super(a10Var);
        this.this$0 = snapFlingBehavior;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        Object tryApproach;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryApproach = this.this$0.tryApproach(null, 0.0f, 0.0f, null, this);
        return tryApproach;
    }
}
