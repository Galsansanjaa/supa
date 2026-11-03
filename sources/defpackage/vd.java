package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class vd {
    public static final int a;

    static {
        Object d82Var;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            d82Var = property != null ? bn2.j0(10, property) : null;
        } catch (Throwable th) {
            d82Var = new d82(th);
        }
        Integer num = (Integer) (d82Var instanceof d82 ? null : d82Var);
        a = num != null ? num.intValue() : 2097152;
    }
}
