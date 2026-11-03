package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class t82 implements Parcelable {
    public long a;
    public String b;
    public String m;
    public String n;
    public long o;
    public String p;
    public int q;
    public int r;
    public String s;
    public int t;
    public int u;
    public String v;
    public int w;
    public String x;
    public int y;
    public static final r82 z = new r82(0);
    public static Parcelable.Creator<t82> CREATOR = new sj1(18);

    public final Spanned a() {
        String str = this.p;
        if (str == null) {
            return null;
        }
        Locale locale = cx.a;
        return cx.g(bn2.g0(str, "\n", "<br />", false));
    }

    public final boolean b() {
        return this.w == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeLong(this.o);
        parcel.writeString(this.m);
        parcel.writeString(this.b);
        parcel.writeString(this.n);
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
    }
}
