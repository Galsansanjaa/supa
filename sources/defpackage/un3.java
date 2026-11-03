package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class un3 {
    public static final xd1 b = new xd1(18);
    public static final un3 c;
    public final tn3 a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new un3(new tn3());
    }

    public un3(tn3 tn3Var) {
        this.a = tn3Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof un3) && ((un3) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
