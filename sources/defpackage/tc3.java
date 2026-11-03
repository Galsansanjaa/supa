package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tc3 implements Parcelable {
    public static final db3 CREATOR = new Object();
    public final List a;
    public final List b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tc3(android.os.Parcel r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Class<pc3> r2 = defpackage.pc3.class
            r3 = 33
            if (r1 < r3) goto L15
            java.lang.ClassLoader r4 = r2.getClassLoader()
            r6.readList(r0, r4, r2)
            goto L1c
        L15:
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r6.readList(r0, r2)
        L1c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Class<of3> r4 = defpackage.of3.class
            if (r1 < r3) goto L2d
            java.lang.ClassLoader r1 = r4.getClassLoader()
            r6.readList(r2, r1, r4)
            goto L34
        L2d:
            java.lang.ClassLoader r1 = r4.getClassLoader()
            r6.readList(r2, r1)
        L34:
            r5.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc3.<init>(android.os.Parcel):void");
    }

    public tc3(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.a = arrayList;
        this.b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc3)) {
            return false;
        }
        tc3 tc3Var = (tc3) obj;
        return jh2.k(this.a, tc3Var.a) && jh2.k(this.b, tc3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PartnersDisclosureArgs(disclosures=" + this.a + ", sdksInfo=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeList(this.a);
        parcel.writeList(this.b);
    }
}
