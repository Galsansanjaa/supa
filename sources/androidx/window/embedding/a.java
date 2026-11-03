package androidx.window.embedding;

import androidx.core.util.Consumer;
import defpackage.tz1;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz1 b;

    public /* synthetic */ a(tz1 tz1Var, int i) {
        this.a = i;
        this.b = tz1Var;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        tz1 tz1Var = this.b;
        switch (i) {
            case 0:
                ActivityEmbeddingController$embeddedActivityWindowInfo$1.e(tz1Var, (EmbeddedActivityWindowInfo) obj);
                return;
            case 1:
                OverlayController$overlayInfo$1.d(tz1Var, (OverlayInfo) obj);
                return;
            default:
                SplitController$splitInfoList$1.e(tz1Var, (List) obj);
                return;
        }
    }
}
