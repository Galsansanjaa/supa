package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ks0 {
    public final ArrayList a;

    public ks0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks0) && this.a.equals(((ks0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FreeUpSpaceData(tmpUserApps=" + this.a + ")";
    }
}
