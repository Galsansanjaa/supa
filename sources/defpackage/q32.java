package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderState;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class q32 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ os0 b;
    public final /* synthetic */ cw m;

    public /* synthetic */ q32(os0 os0Var, cw cwVar, int i) {
        this.a = i;
        this.b = os0Var;
        this.m = cwVar;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        RangeSliderState Saver$lambda$1;
        switch (this.a) {
            case 0:
                Saver$lambda$1 = RangeSliderState.Companion.Saver$lambda$1(this.b, this.m, (List) obj);
                return Saver$lambda$1;
            default:
                return SliderState.Companion.a(this.b, this.m, (List) obj);
        }
    }
}
