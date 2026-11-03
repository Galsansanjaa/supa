package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sv3 implements Serializable {
    public final Object a;

    public sv3(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sv3) {
            return ej1.X(this.a, ((sv3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return k93.m("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
