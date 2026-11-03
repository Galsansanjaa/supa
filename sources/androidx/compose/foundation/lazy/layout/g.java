package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        float updateCachedSemanticsValues$lambda$0;
        float updateCachedSemanticsValues$lambda$1;
        Float applySemantics$lambda$1;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                updateCachedSemanticsValues$lambda$0 = LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$0((LazyLayoutSemanticsModifierNode) obj);
                return Float.valueOf(updateCachedSemanticsValues$lambda$0);
            case 1:
                updateCachedSemanticsValues$lambda$1 = LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$1((LazyLayoutSemanticsModifierNode) obj);
                return Float.valueOf(updateCachedSemanticsValues$lambda$1);
            case 2:
                applySemantics$lambda$1 = LazyLayoutSemanticsModifierNode.applySemantics$lambda$1((LazyLayoutSemanticsModifierNode) obj);
                return applySemantics$lambda$1;
            default:
                return LazyLayoutItemAnimator.ItemInfo.a((LazyLayoutItemAnimator) obj);
        }
    }
}
