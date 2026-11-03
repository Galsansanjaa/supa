package defpackage;

import androidx.compose.foundation.style.StyleOuterNode;
import androidx.compose.material3.ProgressIndicatorKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d02 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ d02(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        float o;
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                o = ProgressIndicatorKt.o(f);
                break;
            case 1:
                o = ProgressIndicatorKt.E(f);
                break;
            default:
                o = StyleOuterNode.f(f);
                break;
        }
        return Float.valueOf(o);
    }
}
