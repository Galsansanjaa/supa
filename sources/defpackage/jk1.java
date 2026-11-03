package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jk1 extends c1 {
    public static final Parcelable.Creator<jk1> CREATOR = new kk3(6);
    public final int a;
    public final int b;
    public final int m;
    public final long n;
    public final long o;
    public final String p;
    public final String q;
    public final int r;
    public final int s;

    public jk1(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.m = i3;
        this.n = j;
        this.o = j2;
        this.p = str;
        this.q = str2;
        this.r = i4;
        this.s = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = xu3.U(parcel, 20293);
        xu3.S(parcel, 1, 4);
        parcel.writeInt(this.a);
        xu3.S(parcel, 2, 4);
        parcel.writeInt(this.b);
        xu3.S(parcel, 3, 4);
        parcel.writeInt(this.m);
        xu3.S(parcel, 4, 8);
        parcel.writeLong(this.n);
        xu3.S(parcel, 5, 8);
        parcel.writeLong(this.o);
        xu3.K(parcel, 6, this.p);
        xu3.K(parcel, 7, this.q);
        xu3.S(parcel, 8, 4);
        parcel.writeInt(this.r);
        xu3.S(parcel, 9, 4);
        parcel.writeInt(this.s);
        xu3.Y(parcel, U);
    }
}
