package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class uz0 extends Binder implements vz0 {
    static final int TRANSACTION_extraCommand = 5;
    static final int TRANSACTION_getInterfaceVersion = 16777215;
    static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
    static final int TRANSACTION_mayLaunchUrl = 4;
    static final int TRANSACTION_newAuthTabSession = 18;
    static final int TRANSACTION_newSession = 3;
    static final int TRANSACTION_newSessionWithExtras = 10;
    static final int TRANSACTION_postMessage = 8;
    static final int TRANSACTION_prefetch = 15;
    static final int TRANSACTION_prefetchWithMultipleUrls = 16;
    static final int TRANSACTION_receiveFile = 12;
    static final int TRANSACTION_requestPostMessageChannel = 7;
    static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
    static final int TRANSACTION_setEngagementSignalsCallback = 14;
    static final int TRANSACTION_updateVisuals = 6;
    static final int TRANSACTION_validateRelationship = 9;
    static final int TRANSACTION_warmup = 2;

    public uz0() {
        attachInterface(this, vz0.c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tz0, vz0] */
    public static vz0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(vz0.c);
        if (queryLocalInterface != null && (queryLocalInterface instanceof vz0)) {
            return (vz0) queryLocalInterface;
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
        String str = vz0.c;
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
                boolean warmup = warmup(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(warmup ? 1 : 0);
                return true;
            case 3:
                boolean newSession = newSession(rz0.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(newSession ? 1 : 0);
                return true;
            case 4:
                sz0 asInterface = rz0.asInterface(parcel.readStrongBinder());
                Uri uri = (Uri) parcel.readTypedObject(Uri.CREATOR);
                Parcelable.Creator creator = Bundle.CREATOR;
                boolean mayLaunchUrl = mayLaunchUrl(asInterface, uri, (Bundle) parcel.readTypedObject(creator), parcel.createTypedArrayList(creator));
                parcel2.writeNoException();
                parcel2.writeInt(mayLaunchUrl ? 1 : 0);
                return true;
            case 5:
                Bundle extraCommand = extraCommand(parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedObject(extraCommand, 1);
                return true;
            case 6:
                boolean updateVisuals = updateVisuals(rz0.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(updateVisuals ? 1 : 0);
                return true;
            case 7:
                boolean requestPostMessageChannel = requestPostMessageChannel(rz0.asInterface(parcel.readStrongBinder()), (Uri) parcel.readTypedObject(Uri.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(requestPostMessageChannel ? 1 : 0);
                return true;
            case 8:
                int postMessage = postMessage(rz0.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(postMessage);
                return true;
            case 9:
                boolean validateRelationship = validateRelationship(rz0.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) parcel.readTypedObject(Uri.CREATOR), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(validateRelationship ? 1 : 0);
                return true;
            case 10:
                boolean newSessionWithExtras = newSessionWithExtras(rz0.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(newSessionWithExtras ? 1 : 0);
                return true;
            case 11:
                boolean requestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(rz0.asInterface(parcel.readStrongBinder()), (Uri) parcel.readTypedObject(Uri.CREATOR), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(requestPostMessageChannelWithExtras ? 1 : 0);
                return true;
            case 12:
                boolean receiveFile = receiveFile(rz0.asInterface(parcel.readStrongBinder()), (Uri) parcel.readTypedObject(Uri.CREATOR), parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(receiveFile ? 1 : 0);
                return true;
            case 13:
                boolean isEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(rz0.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(isEngagementSignalsApiAvailable ? 1 : 0);
                return true;
            case 14:
                boolean engagementSignalsCallback = setEngagementSignalsCallback(rz0.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                return true;
            case 15:
                prefetch(rz0.asInterface(parcel.readStrongBinder()), (Uri) parcel.readTypedObject(Uri.CREATOR), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                prefetchWithMultipleUrls(rz0.asInterface(parcel.readStrongBinder()), parcel.createTypedArrayList(Uri.CREATOR), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 18:
                boolean newAuthTabSession = newAuthTabSession(oz0.asInterface(parcel.readStrongBinder()), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(newAuthTabSession ? 1 : 0);
                return true;
        }
    }
}
