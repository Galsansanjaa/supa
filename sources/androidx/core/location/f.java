package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ f(Object obj, Executor executor, int i, int i2) {
        this.a = i2;
        this.n = obj;
        this.b = executor;
        this.m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.m;
        Executor executor = this.b;
        Object obj = this.n;
        switch (i) {
            case 0:
                LocationManagerCompat.GnssMeasurementsTransport.b((LocationManagerCompat.GnssMeasurementsTransport) obj, executor, i2);
                return;
            case 1:
                LocationManagerCompat.GpsStatusTransport.c((LocationManagerCompat.GpsStatusTransport) obj, executor, i2);
                return;
            default:
                LocationManagerCompat.PreRGnssStatusTransport.b((LocationManagerCompat.PreRGnssStatusTransport) obj, executor, i2);
                return;
        }
    }
}
