package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class m01 implements o01 {
    public IBinder j;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.j;
    }

    @Override // defpackage.o01
    public final void onMessageChannelReady(sz0 sz0Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(o01.f);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(2, obtain, obtain2, 0)) {
                throw new RemoteException("Method onMessageChannelReady is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.o01
    public final void onPostMessage(sz0 sz0Var, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(o01.f);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(3, obtain, obtain2, 0)) {
                throw new RemoteException("Method onPostMessage is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
