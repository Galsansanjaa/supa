package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.m = obj2;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.m;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return BackgroundNode.a((BackgroundNode) obj2, (ContentDrawScope) obj);
            default:
                return Integer.valueOf(MarqueeModifierNode.c((MarqueeSpacing) obj2, (MarqueeModifierNode) obj));
        }
    }
}
