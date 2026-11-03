package defpackage;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class hs1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float m;

    public /* synthetic */ hs1(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.m = f2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return OffsetKt.c(this.b, this.m, (InspectorInfo) obj);
            case 1:
                return OffsetKt.a(this.b, this.m, (InspectorInfo) obj);
            default:
                return PaddingKt.a(this.b, this.m, (InspectorInfo) obj);
        }
    }
}
