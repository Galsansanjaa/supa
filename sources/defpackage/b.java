package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class b {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(ru.a);
        bytes.getClass();
        a = bytes;
    }

    public static final String a(tq tqVar, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (tqVar.e(j2) == 13) {
                String v = tqVar.v(j2, ru.a);
                tqVar.skip(2L);
                return v;
            }
        }
        String v2 = tqVar.v(j, ru.a);
        tqVar.skip(1L);
        return v2;
    }
}
