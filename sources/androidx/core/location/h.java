package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport b;
    public final /* synthetic */ String m;

    public /* synthetic */ h(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i) {
        this.a = i;
        this.b = locationListenerTransport;
        this.m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.m;
        LocationManagerCompat.LocationListenerTransport locationListenerTransport = this.b;
        switch (i) {
            case 0:
                locationListenerTransport.lambda$onProviderEnabled$4(str);
                return;
            default:
                locationListenerTransport.lambda$onProviderDisabled$5(str);
                return;
        }
    }
}
