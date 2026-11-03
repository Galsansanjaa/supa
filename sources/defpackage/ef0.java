package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ef0 implements g12 {
    public static final Object m = new Object();
    public volatile g12 a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [g12, java.lang.Object, ef0] */
    public static g12 a(g12 g12Var) {
        if (g12Var instanceof ef0) {
            return g12Var;
        }
        ?? obj = new Object();
        obj.b = m;
        obj.a = g12Var;
        return obj;
    }

    @Override // defpackage.h12
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = m;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
