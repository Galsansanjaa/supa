package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class z01 extends Binder implements a11 {
    static final int TRANSACTION_areNotificationsEnabled = 6;
    static final int TRANSACTION_cancelNotification = 3;
    static final int TRANSACTION_extraCommand = 9;
    static final int TRANSACTION_getActiveNotifications = 5;
    static final int TRANSACTION_getInterfaceVersion = 16777215;
    static final int TRANSACTION_getSmallIconBitmap = 7;
    static final int TRANSACTION_getSmallIconId = 4;
    static final int TRANSACTION_notifyNotificationWithChannel = 2;

    /* JADX WARN: Type inference failed for: r0v2, types: [a11, java.lang.Object, y01] */
    public static a11 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(a11.i);
        if (queryLocalInterface != null && (queryLocalInterface instanceof a11)) {
            return (a11) queryLocalInterface;
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
        String str = a11.i;
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
        switch (i) {
            case 2:
                Bundle notifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedObject(notifyNotificationWithChannel, 1);
                return true;
            case 3:
                cancelNotification((Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                int smallIconId = getSmallIconId();
                parcel2.writeNoException();
                parcel2.writeInt(smallIconId);
                return true;
            case 5:
                Bundle activeNotifications = getActiveNotifications();
                parcel2.writeNoException();
                parcel2.writeTypedObject(activeNotifications, 1);
                return true;
            case 6:
                Bundle areNotificationsEnabled = areNotificationsEnabled((Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedObject(areNotificationsEnabled, 1);
                return true;
            case 7:
                Bundle smallIconBitmap = getSmallIconBitmap();
                parcel2.writeNoException();
                parcel2.writeTypedObject(smallIconBitmap, 1);
                return true;
            case 8:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 9:
                Bundle extraCommand = extraCommand(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR), parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeTypedObject(extraCommand, 1);
                return true;
        }
    }
}
