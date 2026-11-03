package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class j72 implements Parcelable {
    public static final i72 CREATOR = new Object();
    public String a;
    public String b;
    public int m;
    public int n;
    public long o;
    public ArrayList p;
    public ArrayList q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeLong(this.o);
        parcel.writeList(this.p);
        parcel.writeList(this.q);
        parcel.writeString(this.b);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.v);
        parcel.writeString(this.u);
    }
}
