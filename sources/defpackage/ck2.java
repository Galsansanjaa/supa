package defpackage;

import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ck2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SliderState b;

    public /* synthetic */ ck2(SliderState sliderState, int i) {
        this.a = i;
        this.b = sliderState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 SliderImpl$lambda$29$lambda$26$lambda$25;
        boolean sliderSemantics$lambda$52$lambda$51;
        int i = this.a;
        SliderState sliderState = this.b;
        switch (i) {
            case 0:
                SliderImpl$lambda$29$lambda$26$lambda$25 = SliderKt.SliderImpl$lambda$29$lambda$26$lambda$25(sliderState, (IntSize) obj);
                return SliderImpl$lambda$29$lambda$26$lambda$25;
            default:
                sliderSemantics$lambda$52$lambda$51 = SliderKt.sliderSemantics$lambda$52$lambda$51(sliderState, ((Float) obj).floatValue());
                return Boolean.valueOf(sliderSemantics$lambda$52$lambda$51);
        }
    }
}
