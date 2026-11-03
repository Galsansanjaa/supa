package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class i82 implements Serializable {
    public final Object a;

    public /* synthetic */ i82(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof d82) {
            return ((d82) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i82) {
            return jh2.k(this.a, ((i82) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof d82) {
            return ((d82) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
