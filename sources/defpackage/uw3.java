package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uw3 extends lv3 implements cx3 {
    public final AtomicReference j;
    public boolean k;

    public uw3() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.j = new AtomicReference();
    }

    public static final Object d(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e);
            throw e;
        }
    }

    @Override // defpackage.cx3
    public final void E(Bundle bundle) {
        AtomicReference atomicReference = this.j;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.k = true;
                } finally {
                    this.j.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lv3
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) mv3.a(parcel, Bundle.CREATOR);
        mv3.d(parcel);
        E(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle b(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.j;
        synchronized (atomicReference) {
            if (!this.k) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.j.get();
        }
        return bundle;
    }
}
