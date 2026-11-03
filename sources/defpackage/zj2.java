package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class zj2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cw b;
    public final /* synthetic */ RangeSliderState m;

    public /* synthetic */ zj2(cw cwVar, RangeSliderState rangeSliderState, int i) {
        this.a = i;
        this.b = cwVar;
        this.m = rangeSliderState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        boolean rangeSliderEndThumbSemantics$lambda$58$lambda$57;
        int i = this.a;
        RangeSliderState rangeSliderState = this.m;
        cw cwVar = this.b;
        float floatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                rangeSliderEndThumbSemantics$lambda$58$lambda$57 = SliderKt.rangeSliderEndThumbSemantics$lambda$58$lambda$57(cwVar, rangeSliderState, floatValue);
                break;
            default:
                rangeSliderEndThumbSemantics$lambda$58$lambda$57 = SliderKt.rangeSliderStartThumbSemantics$lambda$55$lambda$54(cwVar, rangeSliderState, floatValue);
                break;
        }
        return Boolean.valueOf(rangeSliderEndThumbSemantics$lambda$58$lambda$57);
    }
}
