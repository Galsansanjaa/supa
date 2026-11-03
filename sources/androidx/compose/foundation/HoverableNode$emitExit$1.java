package androidx.compose.foundation;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {114}, m = "emitExit", v = 1)
/* loaded from: classes.dex */
public final class HoverableNode$emitExit$1 extends c10 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HoverableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitExit$1(HoverableNode hoverableNode, a10 a10Var) {
        super(a10Var);
        this.this$0 = hoverableNode;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        Object emitExit;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        emitExit = this.this$0.emitExit(this);
        return emitExit;
    }
}
