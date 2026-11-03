package androidx.compose.ui.input.nestedscroll;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {116, 121}, m = "onPostFling-RZ2iAVY", v = 1)
/* loaded from: classes3.dex */
public final class NestedScrollNode$onPostFling$1 extends c10 {
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, a10 a10Var) {
        super(a10Var);
        this.this$0 = nestedScrollNode;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo632onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
