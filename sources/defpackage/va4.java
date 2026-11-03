package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class va4 extends ek3 {
    public final l01 K(fs1 fs1Var, String str, int i, fs1 fs1Var2) {
        Parcel H = H();
        fw3.b(H, fs1Var);
        H.writeString(str);
        H.writeInt(i);
        fw3.b(H, fs1Var2);
        Parcel d = d(H, 2);
        l01 M = fs1.M(d.readStrongBinder());
        d.recycle();
        return M;
    }

    public final l01 L(fs1 fs1Var, String str, int i, fs1 fs1Var2) {
        Parcel H = H();
        fw3.b(H, fs1Var);
        H.writeString(str);
        H.writeInt(i);
        fw3.b(H, fs1Var2);
        Parcel d = d(H, 3);
        l01 M = fs1.M(d.readStrongBinder());
        d.recycle();
        return M;
    }
}
