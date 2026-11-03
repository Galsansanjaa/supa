package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class z51 implements g12 {
    public final Object a;

    public /* synthetic */ z51(Object obj) {
        this.a = obj;
    }

    public static z51 a(Object obj) {
        if (obj != null) {
            return new z51(obj);
        }
        hu2.q("instance cannot be null");
        return null;
    }

    public Object b() {
        if (dn3.e == null) {
            dn3.e = new bv0(5);
        }
        synchronized (dn3.d) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // defpackage.h12
    public Object get() {
        return this.a;
    }
}
