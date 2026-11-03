package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class l82 implements Parcelable {
    public static final Parcelable.Creator<l82> CREATOR = new sj1(17);
    public t01 a;

    public void a(int i, Bundle bundle) {
    }

    public final void b(int i, Bundle bundle) {
        t01 t01Var = this.a;
        if (t01Var != null) {
            try {
                t01Var.t(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                t01 t01Var = this.a;
                if (t01Var == null) {
                    t01Var = new k82(this);
                    this.a = t01Var;
                }
                parcel.writeStrongBinder(t01Var.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
