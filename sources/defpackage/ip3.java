package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ip3 {
    public static volatile ip3 b;
    public static final ip3 c = new ip3();
    public final Map a = Collections.EMPTY_MAP;

    public static ip3 a() {
        ip3 ip3Var = b;
        if (ip3Var != null) {
            return ip3Var;
        }
        synchronized (ip3.class) {
            try {
                ip3 ip3Var2 = b;
                if (ip3Var2 != null) {
                    return ip3Var2;
                }
                int i = oo3.a;
                ip3 U = np3.U();
                b = U;
                return U;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
