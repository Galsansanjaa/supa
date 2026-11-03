package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yd0 implements Executor {
    public static final yd0 b = new yd0(0);
    public static final /* synthetic */ yd0 m = new yd0(1);
    public static final /* synthetic */ yd0 n = new yd0(2);
    public static final /* synthetic */ yd0 o = new yd0(3);
    public final /* synthetic */ int a;

    public /* synthetic */ yd0(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
