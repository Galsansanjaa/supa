package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qy3 extends lv3 implements lx3 {
    public final e54 j;

    public qy3(e54 e54Var) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.j = e54Var;
    }

    @Override // defpackage.lv3
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.j);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) mv3.a(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        mv3.d(parcel);
        g(readString, readString2, bundle, readLong);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.lx3
    public final int c() {
        return System.identityHashCode(this.j);
    }

    @Override // defpackage.lx3
    public final void g(String str, String str2, Bundle bundle, long j) {
        this.j.a(str, str2, bundle, j);
    }
}
