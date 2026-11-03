package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class y01 implements a11 {
    public IBinder j;

    @Override // defpackage.a11
    public final Bundle areNotificationsEnabled(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(a11.i);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(6, obtain, obtain2, 0)) {
                throw new RemoteException("Method areNotificationsEnabled is unimplemented.");
            }
            obtain2.readException();
            return (Bundle) obtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.j;
    }

    @Override // defpackage.a11
    public final void cancelNotification(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(a11.i);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(3, obtain, obtain2, 0)) {
                throw new RemoteException("Method cancelNotification is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.a11
    public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(a11.i);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            obtain.writeStrongBinder(iBinder);
            if (!this.j.transact(9, obtain, obtain2, 0)) {
                throw new RemoteException("Method extraCommand is unimplemented.");
            }
            obtain2.readException();
            return (Bundle) obtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.a11
    public final Bundle getActiveNotifications() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(a11.i);
            if (!this.j.transact(5, obtain, obtain2, 0)) {
                throw new RemoteException("Method getActiveNotifications is unimplemented.");
            }
            obtain2.readException();
            return (Bundle) obtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.a11
    public final Bundle getSmallIconBitmap() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(a11.i);
            if (!this.j.transact(7, obtain, obtain2, 0)) {
                throw new RemoteException("Method getSmallIconBitmap is unimplemented.");
            }
            obtain2.readException();
            return (Bundle) obtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.a11
    public final int getSmallIconId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(a11.i);
            if (!this.j.transact(4, obtain, obtain2, 0)) {
                throw new RemoteException("Method getSmallIconId is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.a11
    public final Bundle notifyNotificationWithChannel(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(a11.i);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(2, obtain, obtain2, 0)) {
                throw new RemoteException("Method notifyNotificationWithChannel is unimplemented.");
            }
            obtain2.readException();
            return (Bundle) obtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
