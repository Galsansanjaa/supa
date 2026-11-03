package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bd4 extends tc4 {
    public static final bv0 p = new bv0(8);

    /* JADX WARN: Type inference failed for: r1v6, types: [bd4, tc4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.function.Consumer, java.lang.Object] */
    public static bd4 g(jd4 jd4Var) {
        xc4 xc4Var = xc4.c;
        long a = xc4Var.a() & (-61441);
        long a2 = xc4Var.a() >>> 2;
        UUID uuid = xc4Var.a;
        UUID uuid2 = new UUID(a ^ uuid.getMostSignificantBits(), a2 ^ uuid.getLeastSignificantBits());
        String a3 = tc4.a(uuid2);
        k21 k21Var = (k21) wc4.a.get();
        if (!k21Var.isEmpty()) {
            Iterable$EL.forEach(k21Var, new Object());
        }
        return new tc4("<missing root>", uuid2, a3, jd4Var);
    }

    @Override // defpackage.tc4
    public final fd4 d() {
        return ed4.e;
    }
}
