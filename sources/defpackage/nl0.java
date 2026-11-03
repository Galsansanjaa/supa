package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nl0 implements Parcelable {
    public static Parcelable.Creator<nl0> CREATOR = new sm3(23);
    public String A;
    public long B;
    public long C;
    public String D;
    public String E;
    public String F;
    public String G;
    public int H;
    public long a;
    public String b;
    public long m;
    public String n;
    public int o;
    public String p;
    public int q;
    public String r;
    public String s;
    public String t;
    public long u;
    public String v;
    public int w;
    public String x;
    public long y;
    public String z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeLong(this.u);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeLong(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H);
    }
}
