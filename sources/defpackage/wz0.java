package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class wz0 implements yz0 {
    public IBinder j;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.j;
    }

    @Override // defpackage.yz0
    public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(yz0.d);
            obtain.writeInt(i);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(3, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onGreatestScrollPercentageIncreased is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.yz0
    public final void onSessionEnded(boolean z, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(yz0.d);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(4, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onSessionEnded is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.yz0
    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(yz0.d);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(2, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onVerticalScrollEvent is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }
}
