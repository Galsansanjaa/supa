package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class p32 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RangeSliderState b;

    public /* synthetic */ p32(RangeSliderState rangeSliderState, int i) {
        this.a = i;
        this.b = rangeSliderState;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        RangeSliderState rangeSliderState = this.b;
        switch (i) {
            case 0:
                return RangeSliderState.a(rangeSliderState, ((Boolean) obj).booleanValue());
            case 1:
                return SliderKt.o(rangeSliderState, (IntSize) obj);
            default:
                return SliderKt.v(rangeSliderState, (IntSize) obj);
        }
    }
}
