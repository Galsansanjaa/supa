package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class l40 {
    public final ArrayList a;
    public final boolean b;
    public final int c;

    public l40(ArrayList arrayList, int i, boolean z) {
        this.a = arrayList;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l40)) {
            return false;
        }
        l40 l40Var = (l40) obj;
        return this.a.equals(l40Var.a) && this.b == l40Var.b && this.c == l40Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedAppsData(recommendedApps=");
        sb.append(this.a);
        sb.append(", isPrivate=");
        sb.append(this.b);
        sb.append(", countApps=");
        return lt.A(sb, ")", this.c);
    }
}
