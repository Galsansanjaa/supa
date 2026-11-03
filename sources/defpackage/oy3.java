package defpackage;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class oy3 implements Callable {
    public static final /* synthetic */ oy3 b = new oy3(0);
    public static final /* synthetic */ oy3 c = new oy3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ oy3(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                c84 c84Var = new c84("internal.platform", 4);
                c84Var.b.put("getVersion", new c84("getVersion", 3));
                return c84Var;
            default:
                return null;
        }
    }
}
