package defpackage;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class w22 implements ts0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ w22(long j, ts0 ts0Var, int i) {
        this.b = j;
        this.n = ts0Var;
        this.m = i;
    }

    public /* synthetic */ w22(FloatProducer floatProducer, long j, int i) {
        this.n = floatProducer;
        this.b = j;
        this.m = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 CircularArrowProgressIndicator_RPmYEkk$lambda$14;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CircularArrowProgressIndicator_RPmYEkk$lambda$14 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$14((FloatProducer) this.n, this.b, this.m, (Composer) obj, intValue);
                return CircularArrowProgressIndicator_RPmYEkk$lambda$14;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return TextFieldImplKt.d(this.b, (ts0) this.n, this.m, (Composer) obj, intValue2);
        }
    }
}
