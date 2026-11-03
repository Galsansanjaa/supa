package androidx.compose.foundation.gestures;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "AbstractScrollableNode.kt", l = {226}, m = "onPostFling-RZ2iAVY", v = 1)
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection$onPostFling$1 extends c10 {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollableNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, a10 a10Var) {
        super(a10Var);
        this.this$0 = scrollableNestedScrollConnection;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo632onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
