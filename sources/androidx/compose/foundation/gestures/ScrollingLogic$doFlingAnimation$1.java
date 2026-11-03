package androidx.compose.foundation.gestures;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {766}, m = "doFlingAnimation-QWom1Mo", v = 1)
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$1 extends c10 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, a10 a10Var) {
        super(a10Var);
        this.this$0 = scrollingLogic;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo620doFlingAnimationQWom1Mo(0L, this);
    }
}
