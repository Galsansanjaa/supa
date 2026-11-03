package defpackage;

import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class kp1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FloatProducer b;
    public final /* synthetic */ float m;
    public final /* synthetic */ boolean n;

    public /* synthetic */ kp1(FloatProducer floatProducer, float f, boolean z, int i) {
        this.a = i;
        this.b = floatProducer;
        this.m = f;
        this.n = z;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 horizontalScaleUp$lambda$54;
        vy2 horizontalScaleDown$lambda$55;
        switch (this.a) {
            case 0:
                horizontalScaleUp$lambda$54 = NavigationDrawerKt.horizontalScaleUp$lambda$54(this.b, this.m, this.n, (GraphicsLayerScope) obj);
                return horizontalScaleUp$lambda$54;
            default:
                horizontalScaleDown$lambda$55 = NavigationDrawerKt.horizontalScaleDown$lambda$55(this.b, this.m, this.n, (GraphicsLayerScope) obj);
                return horizontalScaleDown$lambda$55;
        }
    }
}
