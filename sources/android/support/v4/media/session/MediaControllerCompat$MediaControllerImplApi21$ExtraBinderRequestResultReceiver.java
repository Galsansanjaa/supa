package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import androidx.core.app.BundleCompat;
import defpackage.g01;
import defpackage.h01;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference a;

    /* JADX WARN: Type inference failed for: r2v3, types: [f01, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        h01 h01Var;
        b bVar = (b) this.a.get();
        if (bVar == null || bundle == null) {
            return;
        }
        synchronized (bVar.b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = bVar.e;
            IBinder binder = BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER");
            int i2 = g01.j;
            if (binder == null) {
                h01Var = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof h01)) {
                    ?? obj = new Object();
                    obj.j = binder;
                    h01Var = obj;
                } else {
                    h01Var = (h01) queryLocalInterface;
                }
            }
            mediaSessionCompat$Token.b = h01Var;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = bVar.e;
            bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
            mediaSessionCompat$Token2.getClass();
            bVar.a();
        }
    }
}
