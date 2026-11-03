package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class u33 implements Parcelable {
    public static Parcelable.Creator<u33> CREATOR = new sj1(25);
    public long a;
    public String b;
    public String m;
    public String n;
    public String o;
    public int p;
    public String q;
    public long r;
    public int s;
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();

    public u33() {
    }

    public u33(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readInt();
        this.q = parcel.readString();
        this.r = parcel.readLong();
        this.s = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeLong(this.r);
        parcel.writeInt(this.s);
    }
}
