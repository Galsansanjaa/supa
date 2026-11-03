package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vc3 implements Parcelable {
    public static final eb3 CREATOR = new Object();
    public final String A;
    public final String a;
    public final String b;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final int w;
    public final int x;
    public final String y;
    public final String z;

    public vc3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, String str13, String str14, String str15) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        if (i2 == 0) {
            throw null;
        }
        str13.getClass();
        str14.getClass();
        str15.getClass();
        this.a = str;
        this.b = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = str8;
        this.s = str9;
        this.t = str10;
        this.u = str11;
        this.v = str12;
        this.w = i;
        this.x = i2;
        this.y = str13;
        this.z = str14;
        this.A = str15;
    }

    public /* synthetic */ vc3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, String str13, String str14, String str15, int i3) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? "" : str8, (i3 & 256) != 0 ? "" : str9, (i3 & 512) != 0 ? "" : str10, (i3 & 1024) != 0 ? "" : str11, (i3 & 2048) != 0 ? "" : str12, (i3 & 4096) != 0 ? 0 : i, (i3 & 8192) != 0 ? 1 : i2, (i3 & 16384) != 0 ? "" : str13, (i3 & 32768) != 0 ? "" : str14, (i3 & 65536) != 0 ? "" : str15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc3)) {
            return false;
        }
        vc3 vc3Var = (vc3) obj;
        return jh2.k(this.a, vc3Var.a) && jh2.k(this.b, vc3Var.b) && jh2.k(this.m, vc3Var.m) && jh2.k(this.n, vc3Var.n) && jh2.k(this.o, vc3Var.o) && jh2.k(this.p, vc3Var.p) && jh2.k(this.q, vc3Var.q) && jh2.k(this.r, vc3Var.r) && jh2.k(this.s, vc3Var.s) && jh2.k(this.t, vc3Var.t) && jh2.k(this.u, vc3Var.u) && jh2.k(this.v, vc3Var.v) && this.w == vc3Var.w && this.x == vc3Var.x && jh2.k(this.y, vc3Var.y) && jh2.k(this.z, vc3Var.z) && jh2.k(this.A, vc3Var.A);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.A.hashCode() + dn3.b(dn3.b((sg3.E(this.x) + ((this.w + dn3.b(dn3.b(dn3.b(dn3.b(dn3.b(dn3.b(dn3.b(dn3.b(dn3.b(dn3.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.m), this.n), this.o), this.p), this.q), this.r), this.s), this.t), this.u), this.v)) * 31)) * 31, this.y), this.z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnersDetailDialogArgs(name=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append((Object) this.b);
        sb.append(", purposes=");
        sb.append(this.m);
        sb.append(", legitimateInterests=");
        sb.append(this.n);
        sb.append(", specialPurposes=");
        sb.append(this.o);
        sb.append(", features=");
        sb.append(this.p);
        sb.append(", specialFeatures=");
        sb.append(this.q);
        sb.append(", dataDeclarations=");
        sb.append(this.r);
        sb.append(", privacyPolicy=");
        sb.append(this.s);
        sb.append(", cookieMaxAge=");
        sb.append(this.t);
        sb.append(", usesNonCookieAccess=");
        sb.append(this.u);
        sb.append(", dataRetention=");
        sb.append(this.v);
        sb.append(", vendorId=");
        sb.append(this.w);
        sb.append(", switchItemType=");
        sb.append(k93.q(this.x));
        sb.append(", disclosuresUrl=");
        sb.append(this.y);
        sb.append(", disclosuresErrorLabel=");
        sb.append(this.z);
        sb.append(", legInterestPrivacyLink=");
        return lt.z(sb, this.A, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        switch (this.x) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 8;
                break;
            case 9:
                i2 = 9;
                break;
            case 10:
                i2 = 10;
                break;
            case 11:
                i2 = 11;
                break;
            case 12:
                i2 = 12;
                break;
            default:
                throw null;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
    }
}
