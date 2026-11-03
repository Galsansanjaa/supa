package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ff0 implements h12 {
    public static final Object m = new Object();
    public volatile h12 a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [ff0, h12, java.lang.Object] */
    public static h12 a(h12 h12Var) {
        if (h12Var instanceof ff0) {
            return h12Var;
        }
        ?? obj = new Object();
        obj.b = m;
        obj.a = h12Var;
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
            try {
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
