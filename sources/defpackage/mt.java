package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mt {
    public final nt a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public mt(nt ntVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = ntVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mt) {
            mt mtVar = (mt) obj;
            if (this.a == mtVar.a && this.b.equals(mtVar.b) && this.c.equals(mtVar.c) && this.d.equals(mtVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CategoryPanelData(category=" + this.a + ", childrenCategories=" + this.b + ", sections=" + this.c + ", relatedCategories=" + this.d + ")";
    }
}
