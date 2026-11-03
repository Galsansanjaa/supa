package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ e(Object obj, Executor executor, Object obj2, int i) {
        this.a = i;
        this.m = obj;
        this.b = executor;
        this.n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.n;
        Executor executor = this.b;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) obj2).lambda$onGnssMeasurementsReceived$0(executor, (GnssMeasurementsEvent) obj);
                return;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) obj2).lambda$onGpsStatusChanged$3(executor, (GnssStatusCompat) obj);
                return;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) obj2).lambda$onSatelliteStatusChanged$3(executor, (GnssStatus) obj);
                return;
        }
    }
}
