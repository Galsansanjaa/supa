package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class tz0 implements vz0 {
    public IBinder j;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.j;
    }

    @Override // defpackage.vz0
    public final Bundle extraCommand(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(5, obtain, obtain2, 0)) {
                throw new RemoteException("Method extraCommand is unimplemented.");
            }
            obtain2.readException();
            return (Bundle) obtain2.readTypedObject(Bundle.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean isEngagementSignalsApiAvailable(sz0 sz0Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(13, obtain, obtain2, 0)) {
                throw new RemoteException("Method isEngagementSignalsApiAvailable is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean mayLaunchUrl(sz0 sz0Var, Uri uri, Bundle bundle, List list) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(uri, 0);
            obtain.writeTypedObject(bundle, 0);
            t61.I(obtain, list);
            if (!this.j.transact(4, obtain, obtain2, 0)) {
                throw new RemoteException("Method mayLaunchUrl is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean newAuthTabSession(pz0 pz0Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(pz0Var);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(18, obtain, obtain2, 0)) {
                throw new RemoteException("Method newAuthTabSession is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean newSession(sz0 sz0Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            if (!this.j.transact(3, obtain, obtain2, 0)) {
                throw new RemoteException("Method newSession is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean newSessionWithExtras(sz0 sz0Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(10, obtain, obtain2, 0)) {
                throw new RemoteException("Method newSessionWithExtras is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final int postMessage(sz0 sz0Var, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeString(str);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(8, obtain, obtain2, 0)) {
                throw new RemoteException("Method postMessage is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final void prefetch(sz0 sz0Var, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(uri, 0);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(15, obtain, obtain2, 0)) {
                throw new RemoteException("Method prefetch is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final void prefetchWithMultipleUrls(sz0 sz0Var, List list, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            t61.I(obtain, list);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(16, obtain, obtain2, 0)) {
                throw new RemoteException("Method prefetchWithMultipleUrls is unimplemented.");
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean receiveFile(sz0 sz0Var, Uri uri, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(uri, 0);
            obtain.writeInt(i);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(12, obtain, obtain2, 0)) {
                throw new RemoteException("Method receiveFile is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean requestPostMessageChannel(sz0 sz0Var, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(uri, 0);
            if (!this.j.transact(7, obtain, obtain2, 0)) {
                throw new RemoteException("Method requestPostMessageChannel is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean requestPostMessageChannelWithExtras(sz0 sz0Var, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(uri, 0);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(11, obtain, obtain2, 0)) {
                throw new RemoteException("Method requestPostMessageChannelWithExtras is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean setEngagementSignalsCallback(sz0 sz0Var, IBinder iBinder, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeStrongBinder(iBinder);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(14, obtain, obtain2, 0)) {
                throw new RemoteException("Method setEngagementSignalsCallback is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean updateVisuals(sz0 sz0Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(6, obtain, obtain2, 0)) {
                throw new RemoteException("Method updateVisuals is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean validateRelationship(sz0 sz0Var, int i, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeStrongInterface(sz0Var);
            obtain.writeInt(i);
            obtain.writeTypedObject(uri, 0);
            obtain.writeTypedObject(bundle, 0);
            if (!this.j.transact(9, obtain, obtain2, 0)) {
                throw new RemoteException("Method validateRelationship is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.vz0
    public final boolean warmup(long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vz0.c);
            obtain.writeLong(j);
            if (!this.j.transact(2, obtain, obtain2, 0)) {
                throw new RemoteException("Method warmup is unimplemented.");
            }
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
