package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import androidx.core.util.Consumer;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.m = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.m;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Consumer) obj2).accept((Location) obj);
                return;
            case 1:
                ((LocationManagerCompat.LocationListenerTransport) obj2).lambda$onLocationChanged$1((List) obj);
                return;
            default:
                ((LocationManagerCompat.LocationListenerTransport) obj2).lambda$onLocationChanged$0((Location) obj);
                return;
        }
    }
}
