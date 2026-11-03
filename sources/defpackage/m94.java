package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class m94 extends c1 {
    public static final Parcelable.Creator<m94> CREATOR = new ux3(22);
    public final String a;
    public final long b;
    public final int m;

    public m94(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.m = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        xu3.K(parcel, 1, this.a);
        xu3.S(parcel, 2, 8);
        parcel.writeLong(this.b);
        xu3.S(parcel, 3, 4);
        parcel.writeInt(this.m);
        xu3.Y(parcel, U);
    }
}
