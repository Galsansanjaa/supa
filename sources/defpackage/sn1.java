package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sn1 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    public sn1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = arrayList5;
        this.f = arrayList6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn1)) {
            return false;
        }
        sn1 sn1Var = (sn1) obj;
        return this.a.equals(sn1Var.a) && this.b.equals(sn1Var.b) && this.c.equals(sn1Var.c) && this.d.equals(sn1Var.d) && this.e.equals(sn1Var.e) && this.f.equals(sn1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MyAppsData(tmpAppUpdateData=" + this.a + ", tmpUserApps=" + this.b + ", tmpSystemApps=" + this.c + ", tmpDisabledApps=" + this.d + ", tmpSystemServices=" + this.e + ", tmpPositiveApps=" + this.f + ")";
    }
}
