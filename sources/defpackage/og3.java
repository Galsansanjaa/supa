package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class og3 {
    public final ArrayList a;

    public og3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3)) {
            return false;
        }
        og3 og3Var = (og3) obj;
        Object obj3 = Boolean.TRUE;
        return obj3.equals(obj3) && obj2.equals(obj2) && this.a.equals(og3Var.a);
    }

    public final int hashCode() {
        Integer num = 2;
        return this.a.hashCode() + ((num.hashCode() + (Boolean.TRUE.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EncodingOptions(isForVendors=" + Boolean.TRUE + ", version=" + ((Object) 2) + ", segments=" + this.a + ')';
    }
}
