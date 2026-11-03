package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gz2 implements Parcelable {
    public static Parcelable.Creator<gz2> CREATOR = new sj1(22);
    public long a;
    public final String b;
    public long m;
    public String n;
    public int o;
    public int p;
    public int q;
    public String r;
    public int s;
    public hf0 t;
    public ArrayList u;

    public gz2(Parcel parcel) {
        this.a = -1L;
        this.m = -1L;
        this.a = parcel.readLong();
        String readString = parcel.readString();
        readString.getClass();
        this.b = readString;
        this.m = parcel.readLong();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readInt();
        if (Build.VERSION.SDK_INT >= 34) {
            this.t = (hf0) parcel.readParcelable(hf0.class.getClassLoader(), hf0.class);
        } else {
            this.t = (hf0) parcel.readParcelable(hf0.class.getClassLoader());
        }
    }

    public gz2(String str) {
        this.a = -1L;
        this.m = -1L;
        this.b = str;
    }

    public final hf0 a(Context context) {
        context.getClass();
        z90 r = z90.E.r(context);
        r.a();
        hf0 hf0Var = this.t;
        if (hf0Var == null || hf0Var.a < 0) {
            this.t = r.K(this.m, this.b);
        } else {
            hf0Var.getClass();
            this.t = r.I(hf0Var.a);
        }
        r.d();
        return this.t;
    }

    public final boolean b(gz2 gz2Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z = this.m == gz2Var.m;
        hf0 hf0Var = this.t;
        Integer num = null;
        Integer valueOf = (hf0Var == null || (arrayList2 = hf0Var.G) == null) ? null : Integer.valueOf(arrayList2.size());
        hf0 hf0Var2 = gz2Var.t;
        if (hf0Var2 != null && (arrayList = hf0Var2.G) != null) {
            num = Integer.valueOf(arrayList.size());
        }
        boolean k = jh2.k(valueOf, num);
        boolean d0 = bn2.d0(this.n, gz2Var.n, true);
        if (z && k && d0) {
            if (this.t != null && gz2Var.t != null) {
                ArrayList arrayList3 = new ArrayList();
                hf0 hf0Var3 = this.t;
                hf0Var3.getClass();
                arrayList3.addAll(hf0Var3.G);
                ArrayList arrayList4 = new ArrayList();
                hf0 hf0Var4 = gz2Var.t;
                hf0Var4.getClass();
                arrayList4.addAll(hf0Var4.G);
                hf0 hf0Var5 = this.t;
                hf0Var5.getClass();
                Iterator it = hf0Var5.G.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    gg0 gg0Var = (gg0) next;
                    hf0 hf0Var6 = gz2Var.t;
                    hf0Var6.getClass();
                    Iterator it2 = hf0Var6.G.iterator();
                    it2.getClass();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            gg0 gg0Var2 = (gg0) next2;
                            if (gg0Var2.m == gg0Var.m) {
                                arrayList3.remove(gg0Var);
                                arrayList4.remove(gg0Var2);
                                break;
                            }
                        }
                    }
                }
                if (!arrayList3.isEmpty() || !arrayList4.isEmpty()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i = this.p;
        return i == 1 || i == 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.m;
        String str = this.n;
        int i = this.o;
        int i2 = this.p;
        int i3 = this.q;
        String str2 = this.r;
        int i4 = this.s;
        hf0 hf0Var = this.t;
        String hf0Var2 = hf0Var != null ? hf0Var.toString() : null;
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(j);
        sb.append(", packagename='");
        sb.append(this.b);
        sb.append("', versionCode=");
        sb.append(j2);
        sb.append(", versionName='");
        sb.append(str);
        sb.append("', notified=");
        sb.append(i);
        sb.append(", ignoreVersion=");
        sb.append(i2);
        sb.append(", isPartialUpdate=");
        sb.append(i3);
        sb.append(", newFeatures='");
        sb.append(str2);
        sb.append("', installationAttempts=");
        sb.append(i4);
        sb.append(", download=");
        return wa2.v(sb, hf0Var2, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeParcelable(this.t, i);
    }
}
