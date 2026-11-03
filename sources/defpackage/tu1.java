package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class tu1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ float o;

    public /* synthetic */ tu1(float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.b = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 padding_qDBjuR0$lambda$0;
        vy2 absolutePadding_qDBjuR0$lambda$0;
        switch (this.a) {
            case 0:
                padding_qDBjuR0$lambda$0 = PaddingKt.padding_qDBjuR0$lambda$0(this.b, this.m, this.n, this.o, (InspectorInfo) obj);
                return padding_qDBjuR0$lambda$0;
            default:
                absolutePadding_qDBjuR0$lambda$0 = PaddingKt.absolutePadding_qDBjuR0$lambda$0(this.b, this.m, this.n, this.o, (InspectorInfo) obj);
                return absolutePadding_qDBjuR0$lambda$0;
        }
    }
}
