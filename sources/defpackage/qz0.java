package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class qz0 implements sz0 {
    public IBinder j;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.j;
    }

    @Override // defpackage.sz0
    public final void extraCallback(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(3, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method extraCallback is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(7, obtain, obtain2, 0)) {
                throw new RemoteException("Method extraCallbackWithResult is unimplemented.");
            }
            obtain2.readException();
            return (Bundle) obtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            obtain.writeInt(i5);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(10, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onActivityLayout is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(8, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onActivityResized is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final void onMessageChannelReady(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(4, obtain, obtain2, 0)) {
                throw new RemoteException("Method onMessageChannelReady is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final void onMinimized(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(11, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onMinimized is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final void onNavigationEvent(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
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

    @Override // defpackage.sz0
    public final void onPostMessage(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(5, obtain, obtain2, 0)) {
                throw new RemoteException("Method onPostMessage is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeInt(i);
            obtain.writeTypedObject(uri, 0);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(6, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onRelationshipValidationResult is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final void onUnminimized(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(12, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onUnminimized is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.sz0
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(sz0.b);
            obtain.writeTypedObject(bundle, 0);
            if (this.j.transact(9, obtain, null, 1)) {
            } else {
                throw new RemoteException("Method onWarmupCompleted is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }
}
