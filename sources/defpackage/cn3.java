package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class cn3 implements v44 {
    public final Object a;

    public cn3() {
        this.a = new ConcurrentHashMap();
    }

    public cn3(t34 t34Var) {
        dn3.o(t34Var);
        this.a = t34Var;
    }

    @Override // defpackage.v44
    public r82 a() {
        throw null;
    }

    @Override // defpackage.v44
    public f14 b() {
        throw null;
    }

    @Override // defpackage.v44
    public n34 c() {
        throw null;
    }

    @Override // defpackage.v44
    public Context d() {
        throw null;
    }

    @Override // defpackage.v44
    public jw0 e() {
        throw null;
    }

    public abstract Object g();

    public abstract void h(Object obj, long j, byte b);

    public Object i(ce4 ce4Var, xu3 xu3Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        Object obj = concurrentHashMap.get(ce4Var);
        if (obj != null) {
            return obj;
        }
        Object g = g();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(ce4Var, g);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        int O = xu3Var.O();
        for (int i = 0; i < O; i++) {
            if (ud4.f.equals(xu3Var.W(i))) {
                xu3Var.X(i);
            }
        }
        return g;
    }

    public abstract boolean j(Object obj, long j);

    public abstract boolean k(Level level);

    public abstract void l(Object obj, long j, boolean z);

    public abstract void m(rd4 rd4Var);

    public abstract float n(Object obj, long j);

    public void o(RuntimeException runtimeException, rd4 rd4Var) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void p(Object obj, long j, float f);

    public abstract double q(Object obj, long j);

    public void r() {
        n34 n34Var = ((t34) this.a).q;
        t34.m(n34Var);
        n34Var.r();
    }

    public abstract void s(Object obj, long j, double d);
}
