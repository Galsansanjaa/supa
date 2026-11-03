package defpackage;

import androidx.compose.foundation.MagnifierNode;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class yg1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MagnifierNode b;

    public /* synthetic */ yg1(MagnifierNode magnifierNode, int i) {
        this.a = i;
        this.b = magnifierNode;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        MagnifierNode magnifierNode = this.b;
        switch (i) {
            case 0:
                return MagnifierNode.a(magnifierNode);
            case 1:
                return MagnifierNode.b(magnifierNode);
            default:
                return MagnifierNode.c(magnifierNode);
        }
    }
}
