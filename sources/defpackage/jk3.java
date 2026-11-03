package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class jk3 extends Binder implements IInterface {
    public final /* synthetic */ int j;

    public jk3(String str, int i) {
        this.j = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                return;
            case 2:
                attachInterface(this, str);
                return;
            case 3:
            default:
                attachInterface(this, str);
                return;
            case 4:
                attachInterface(this, str);
                return;
        }
    }

    public static void H(Parcel parcel) {
        int i = wv3.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(wa2.u(new StringBuilder(String.valueOf(dataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }

    public static void I(Parcel parcel) {
        int i = dw3.a;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(lt.w(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public abstract boolean G(Parcel parcel, int i);

    public abstract boolean J(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean K(int i, Parcel parcel, Parcel parcel2);

    public boolean L(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.j;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean z2 = false;
        switch (this.j) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return J(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return K(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return L(i, parcel, parcel2);
            case 3:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                p61 p61Var = (p61) this;
                uo2 uo2Var = p61Var.l;
                int i3 = p61Var.k;
                switch (i) {
                    case 1:
                        Status status = (Status) wv3.a(parcel, Status.CREATOR);
                        uv1 uv1Var = (uv1) wv3.a(parcel, uv1.CREATOR);
                        H(parcel);
                        status.getClass();
                        switch (i3) {
                            case 2:
                                t61.F(status, uv1Var, uo2Var);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        Status status2 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status2.getClass();
                        z72.f();
                        break;
                    case 3:
                        Status status3 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status3.getClass();
                        z72.f();
                        break;
                    case 4:
                        Status status4 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status4.getClass();
                        z72.f();
                        break;
                    case 5:
                        Status status5 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status5.getClass();
                        z72.f();
                        break;
                    case 6:
                        Status status6 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status6.getClass();
                        z72.f();
                        break;
                    case 7:
                        Status status7 = (Status) wv3.a(parcel, Status.CREATOR);
                        q70 q70Var = (q70) wv3.a(parcel, q70.CREATOR);
                        H(parcel);
                        status7.getClass();
                        switch (i3) {
                            case 1:
                                t61.F(status7, q70Var, uo2Var);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        Status status8 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status8.getClass();
                        z72.f();
                        break;
                    case 9:
                        Status status9 = (Status) wv3.a(parcel, Status.CREATOR);
                        qv qvVar = (qv) wv3.a(parcel, qv.CREATOR);
                        H(parcel);
                        status9.getClass();
                        switch (i3) {
                            case 0:
                                t61.F(status9, qvVar, uo2Var);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 10:
                        Status status10 = (Status) wv3.a(parcel, Status.CREATOR);
                        lj2 lj2Var = (lj2) wv3.a(parcel, lj2.CREATOR);
                        H(parcel);
                        status10.getClass();
                        switch (i3) {
                            case 3:
                                t61.F(status10, lj2Var, uo2Var);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 11:
                        Status status11 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status11.getClass();
                        z72.f();
                        break;
                    case 12:
                        Status status12 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status12.getClass();
                        z72.f();
                        break;
                    case 13:
                        Status status13 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status13.getClass();
                        z72.f();
                        break;
                    case 14:
                        Status status14 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status14.getClass();
                        z72.f();
                        break;
                    case 15:
                        Status status15 = (Status) wv3.a(parcel, Status.CREATOR);
                        H(parcel);
                        status15.getClass();
                        z72.f();
                        break;
                }
                return false;
            default:
                if (i > 16777215) {
                    z2 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (z2) {
                    return true;
                }
                return G(parcel, i);
        }
    }
}
