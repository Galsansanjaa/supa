package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pc3 implements Parcelable {
    public static final tb3 CREATOR = new Object();
    public final String a;
    public final String b;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final Boolean s;

    public pc3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = str8;
        this.s = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc3)) {
            return false;
        }
        pc3 pc3Var = (pc3) obj;
        return this.a.equals(pc3Var.a) && this.b.equals(pc3Var.b) && jh2.k(this.m, pc3Var.m) && this.n.equals(pc3Var.n) && this.o.equals(pc3Var.o) && this.p.equals(pc3Var.p) && this.q.equals(pc3Var.q) && this.r.equals(pc3Var.r) && jh2.k(this.s, pc3Var.s);
    }

    public final int hashCode() {
        int j = k93.j(k93.j(k93.j(k93.j(k93.j(dn3.b(k93.j(this.a.hashCode() * 31, 31, this.b), this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        Boolean bool = this.s;
        return j + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "DisclosureInfo(name=" + this.a + ", type=" + this.b + ", maxAge=" + this.m + ", domain=" + this.n + ", purposes=" + this.o + ", specialPurposes=" + this.p + ", features=" + this.q + ", specialFeatures=" + this.r + ", optOut=" + this.s + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        Boolean bool = this.s;
        parcel.writeString(bool == null ? null : bool.toString());
    }
}
