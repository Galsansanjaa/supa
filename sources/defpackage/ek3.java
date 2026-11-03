package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class ek3 implements IInterface {
    public final /* synthetic */ int j;
    public final IBinder k;
    public final String l;

    public /* synthetic */ ek3(IBinder iBinder, String str, int i) {
        this.j = i;
        this.k = iBinder;
        this.l = str;
    }

    public Parcel G(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.k.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel H() {
        int i = this.j;
        String str = this.l;
        switch (i) {
            case 2:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(str);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(str);
                return obtain2;
        }
    }

    public void I(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.k.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void J(Parcel parcel) {
        try {
            this.k.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.l);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.j) {
            case 0:
                return this.k;
            case 1:
                return this.k;
            case 2:
                return this.k;
            default:
                return this.k;
        }
    }

    public void b(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.k.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel d(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.k.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
