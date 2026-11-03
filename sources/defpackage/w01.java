package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class w01 extends Binder implements x01 {
    static final int TRANSACTION_getInterfaceVersion = 16777215;
    static final int TRANSACTION_onExtraCallback = 2;

    /* JADX WARN: Type inference failed for: r0v2, types: [v01, x01, java.lang.Object] */
    public static x01 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(x01.h);
        if (queryLocalInterface != null && (queryLocalInterface instanceof x01)) {
            return (x01) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.j = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = x01.h;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(getInterfaceVersion());
            return true;
        }
        if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        onExtraCallback(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
