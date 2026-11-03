package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fw1 implements Parcelable {
    public static final ew1 CREATOR = new Object();
    public int a;
    public ArrayList b;
    public ArrayList m;
    public ArrayList n;

    public fw1(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = i;
        this.b = arrayList;
        this.m = arrayList2;
        this.n = arrayList3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw1)) {
            return false;
        }
        fw1 fw1Var = (fw1) obj;
        return this.a == fw1Var.a && jh2.k(this.b, fw1Var.b) && jh2.k(this.m, fw1Var.m) && jh2.k(this.n, fw1Var.n);
    }

    public final int hashCode() {
        int i = this.a * 31;
        ArrayList arrayList = this.b;
        int hashCode = (i + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.m;
        int hashCode2 = (hashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList arrayList3 = this.n;
        return hashCode2 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    public final String toString() {
        return "PermissionsData(declared=" + this.a + ", dangerousPermissions=" + this.b + ", normalPermissions=" + this.m + ", othersPermissions=" + this.n + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeTypedList(this.m);
        parcel.writeTypedList(this.n);
    }
}
