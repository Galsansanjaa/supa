package defpackage;

import androidx.compose.foundation.AbstractClickableNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractClickableNode b;

    public /* synthetic */ l(AbstractClickableNode abstractClickableNode, int i) {
        this.a = i;
        this.b = abstractClickableNode;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        AbstractClickableNode abstractClickableNode = this.b;
        switch (i) {
            case 0:
                return AbstractClickableNode.a(abstractClickableNode);
            default:
                return Boolean.valueOf(AbstractClickableNode.b(abstractClickableNode));
        }
    }
}
