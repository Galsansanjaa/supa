package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ek2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ RangeSliderState m;
    public final /* synthetic */ bw n;

    public /* synthetic */ ek2(boolean z, RangeSliderState rangeSliderState, bw bwVar, int i) {
        this.a = i;
        this.b = z;
        this.m = rangeSliderState;
        this.n = bwVar;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 rangeSliderEndThumbSemantics$lambda$58;
        vy2 rangeSliderStartThumbSemantics$lambda$55;
        int i = this.a;
        bw bwVar = this.n;
        RangeSliderState rangeSliderState = this.m;
        boolean z = this.b;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                rangeSliderEndThumbSemantics$lambda$58 = SliderKt.rangeSliderEndThumbSemantics$lambda$58(z, rangeSliderState, bwVar, semanticsPropertyReceiver);
                return rangeSliderEndThumbSemantics$lambda$58;
            default:
                rangeSliderStartThumbSemantics$lambda$55 = SliderKt.rangeSliderStartThumbSemantics$lambda$55(z, rangeSliderState, bwVar, semanticsPropertyReceiver);
                return rangeSliderStartThumbSemantics$lambda$55;
        }
    }
}
