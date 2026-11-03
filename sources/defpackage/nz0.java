package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class nz0 implements pz0 {
    public IBinder j;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.j;
    }

    @Override // defpackage.pz0
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(pz0.a);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(3, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onExtraCallback is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.pz0
    public final Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(pz0.a);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(4, obtain, obtain2, 0)) {
                throw new RemoteException("Method onExtraCallbackWithResult is unimplemented.");
            }
            obtain2.readException();
            return (Bundle) obtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.pz0
    public final void onNavigationEvent(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(pz0.a);
            obtain.writeInt(i);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(2, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onNavigationEvent is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.pz0
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(pz0.a);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(5, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onWarmupCompleted is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }
}
