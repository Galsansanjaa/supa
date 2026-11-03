package defpackage;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vy0 extends vo1 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object m;
    public final Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(vy0 vy0Var, Object[] objArr, dz0 dz0Var) {
        super("OkHttp %s stream %d", objArr);
        this.m = vy0Var;
        this.n = dz0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(vy0 vy0Var, Object[] objArr, zo zoVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.m = vy0Var;
        this.n = zoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy0(xy0 xy0Var, zy0 zy0Var) {
        super("OkHttp %s", xy0Var.n);
        this.m = xy0Var;
        this.n = zy0Var;
    }

    @Override // defpackage.vo1
    public final void a() {
        int i = this.b;
        Object obj = this.n;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                dz0 dz0Var = (dz0) obj;
                xy0 xy0Var = (xy0) ((vy0) obj2).m;
                try {
                    xy0Var.b.b(dz0Var);
                    return;
                } catch (IOException e) {
                    hx1.a.k(4, "Http2Connection.Listener failure for " + xy0Var.n, e);
                    try {
                        dz0Var.c(2);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 1:
                xy0 xy0Var2 = (xy0) ((vy0) obj2).m;
                try {
                    xy0Var2.B.a((zo) obj);
                    return;
                } catch (IOException unused2) {
                    ThreadPoolExecutor threadPoolExecutor = xy0.E;
                    try {
                        xy0Var2.a(2, 2);
                        return;
                    } catch (IOException unused3) {
                        return;
                    }
                }
            default:
                xy0 xy0Var3 = (xy0) obj2;
                zy0 zy0Var = (zy0) obj;
                try {
                    try {
                        zy0Var.e(this);
                        do {
                        } while (zy0Var.d(false, this));
                        xy0Var3.a(1, 6);
                    } catch (IOException unused4) {
                    }
                } catch (IOException unused5) {
                    xy0Var3.a(2, 2);
                } catch (Throwable th) {
                    try {
                        xy0Var3.a(3, 3);
                    } catch (IOException unused6) {
                    }
                    f63.c(zy0Var);
                    throw th;
                }
                f63.c(zy0Var);
                return;
        }
    }
}
