package defpackage;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class kc0 {
    public final String a;
    public final mu0 b;

    public kc0(Set set, mu0 mu0Var) {
        this.a = b(set);
        this.b = mu0Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ij ijVar = (ij) it.next();
            sb.append(ijVar.a);
            sb.append('/');
            sb.append(ijVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        mu0 mu0Var = this.b;
        synchronized (((HashSet) mu0Var.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) mu0Var.b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(mu0Var.q());
    }
}
