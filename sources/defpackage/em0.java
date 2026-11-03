package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class em0 {
    public final String a;
    public final Map b;

    public em0(Map map, String str) {
        this.a = str;
        this.b = map;
    }

    public static em0 a(String str) {
        return new em0(Collections.EMPTY_MAP, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em0)) {
            return false;
        }
        em0 em0Var = (em0) obj;
        return this.a.equals(em0Var.a) && this.b.equals(em0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
