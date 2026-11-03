package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class b0 {
    public static final b0 d = new b0();
    public final Runnable a;
    public final Executor b;
    public b0 c;

    public b0() {
        this.a = null;
        this.b = null;
    }

    public b0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
