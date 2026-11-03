package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sd2 {
    public final ArrayList a;
    public final boolean b;

    public sd2(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd2)) {
            return false;
        }
        sd2 sd2Var = (sd2) obj;
        return this.a.equals(sd2Var.a) && this.b == sd2Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SearchAppsData(searchResults=" + this.a + ", firstRequest=" + this.b + ")";
    }
}
