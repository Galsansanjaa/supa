package androidx.compose.foundation.lazy.layout;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LazyLayoutSemanticsModifierNode b;

    public /* synthetic */ f(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i) {
        this.a = i;
        this.b = lazyLayoutSemanticsModifierNode;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(LazyLayoutSemanticsModifierNode.e(lazyLayoutSemanticsModifierNode, obj));
            default:
                return Boolean.valueOf(LazyLayoutSemanticsModifierNode.a(lazyLayoutSemanticsModifierNode, ((Integer) obj).intValue()));
        }
    }
}
