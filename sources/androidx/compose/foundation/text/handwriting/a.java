package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Modifier.Node b;

    public /* synthetic */ a(int i, Modifier.Node node) {
        this.a = i;
        this.b = node;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        Modifier.Node node = this.b;
        switch (i) {
            case 0:
                return HandwritingDetectorNode.a((HandwritingDetectorNode) node);
            case 1:
                return HandwritingDetectorNode.b((HandwritingDetectorNode) node);
            default:
                return HandwritingHandlerNode.a((HandwritingHandlerNode) node);
        }
    }
}
