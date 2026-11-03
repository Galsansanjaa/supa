package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class xz0 extends Binder implements yz0 {
    static final int TRANSACTION_getInterfaceVersion = 16777215;
    static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
    static final int TRANSACTION_onSessionEnded = 4;
    static final int TRANSACTION_onVerticalScrollEvent = 2;

    public xz0() {
        attachInterface(this, yz0.d);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wz0, yz0] */
    public static yz0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(yz0.d);
        if (queryLocalInterface != null && (queryLocalInterface instanceof yz0)) {
            return (yz0) queryLocalInterface;
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
        String str = yz0.d;
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
        if (i == 2) {
            onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        } else if (i == 3) {
            onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        } else {
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onSessionEnded(parcel.readInt() != 0, (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        }
        return true;
    }
}
