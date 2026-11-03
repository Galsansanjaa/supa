package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class kd1 {
    public static final Set a;
    public static final Set b;

    static {
        Set synchronizedSet = DesugarCollections.synchronizedSet(new LinkedHashSet());
        synchronizedSet.getClass();
        a = synchronizedSet;
        Set synchronizedSet2 = DesugarCollections.synchronizedSet(new LinkedHashSet());
        synchronizedSet2.getClass();
        b = synchronizedSet2;
    }

    public static boolean a(long j) {
        return a.contains(Long.valueOf(j));
    }
}
