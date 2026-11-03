package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s01 implements t01 {
    public IBinder j;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.j;
    }

    @Override // defpackage.t01
    public final void t(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(t01.g);
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.j.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
