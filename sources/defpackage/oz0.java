package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class oz0 extends Binder implements pz0 {
    static final int TRANSACTION_getInterfaceVersion = 16777215;
    static final int TRANSACTION_onExtraCallback = 3;
    static final int TRANSACTION_onExtraCallbackWithResult = 4;
    static final int TRANSACTION_onNavigationEvent = 2;
    static final int TRANSACTION_onWarmupCompleted = 5;

    public oz0() {
        attachInterface(this, pz0.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [nz0, pz0, java.lang.Object] */
    public static pz0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(pz0.a);
        if (queryLocalInterface != null && (queryLocalInterface instanceof pz0)) {
            return (pz0) queryLocalInterface;
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
        String str = pz0.a;
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
            onNavigationEvent(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        } else if (i == 3) {
            onExtraCallback(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        } else if (i == 4) {
            Bundle onExtraCallbackWithResult = onExtraCallbackWithResult(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedObject(onExtraCallbackWithResult, 1);
        } else {
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onWarmupCompleted((Bundle) parcel.readTypedObject(Bundle.CREATOR));
        }
        return true;
    }
}
