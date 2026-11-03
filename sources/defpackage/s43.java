package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s43 {
    public final u33 a;
    public final ArrayList b;

    public s43(u33 u33Var, ArrayList arrayList) {
        this.a = u33Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s43) {
            s43 s43Var = (s43) obj;
            if (this.a == s43Var.a && this.b.equals(s43Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UserDevicesData(thisDevice=" + this.a + ", userDevices=" + this.b + ")";
    }
}
