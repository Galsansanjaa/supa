package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uv0 implements Executor {
    public final /* synthetic */ int a;
    public final Object b;

    public uv0() {
        this.a = 4;
        cx1 cx1Var = new cx1(Looper.getMainLooper(), 3, false);
        Looper.getMainLooper();
        this.b = cx1Var;
    }

    public uv0(Looper looper) {
        this.a = 0;
        this.b = new cx1(looper, 5);
    }

    public /* synthetic */ uv0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((cx1) obj).post(runnable);
                return;
            case 1:
                ((Executor) obj).execute(new db2(runnable, 0));
                return;
            case 2:
                ((Handler) obj).post(runnable);
                return;
            case 3:
                n34 n34Var = ((t34) ((m64) obj).a).q;
                t34.m(n34Var);
                n34Var.B(runnable);
                return;
            default:
                ((cx1) obj).post(runnable);
                return;
        }
    }
}
