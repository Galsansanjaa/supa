package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class by3 extends c1 {
    public static final Parcelable.Creator<by3> CREATOR = new ux3(1);
    public final long a;
    public final long b;
    public final boolean m;
    public final Bundle n;
    public final String o;

    public by3(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.m = z;
        this.n = bundle;
        this.o = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        xu3.S(parcel, 1, 8);
        parcel.writeLong(this.a);
        xu3.S(parcel, 2, 8);
        parcel.writeLong(this.b);
        xu3.S(parcel, 3, 4);
        parcel.writeInt(this.m ? 1 : 0);
        xu3.D(parcel, 7, this.n);
        xu3.K(parcel, 8, this.o);
        xu3.Y(parcel, U);
    }
}
