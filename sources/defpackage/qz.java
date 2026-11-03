package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class qz {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ int c = 0;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = zd.a;
        a = unsafe.objectFieldOffset(qz.class.getDeclaredField("_next$volatile"));
        b = unsafe.objectFieldOffset(qz.class.getDeclaredField("_prev$volatile"));
    }

    public qz(je2 je2Var) {
        this._prev$volatile = je2Var;
    }

    public final void b() {
        zd.a.putObjectVolatile(this, b, (Object) null);
    }

    public final qz c() {
        Object objectVolatile = zd.a.getObjectVolatile(this, a);
        if (objectVolatile == t61.a) {
            return null;
        }
        return (qz) objectVolatile;
    }

    public abstract boolean d();

    public final void e() {
        qz qzVar;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            Unsafe unsafe2 = zd.a;
            long j = b;
            qz qzVar2 = (qz) unsafe2.getObjectVolatile(this, j);
            while (qzVar2 != null && qzVar2.d()) {
                qzVar2 = (qz) zd.a.getObjectVolatile(qzVar2, j);
            }
            qz c2 = c();
            c2.getClass();
            do {
                qzVar = c2;
                if (!qzVar.d()) {
                    break;
                } else {
                    c2 = qzVar.c();
                }
            } while (c2 != null);
            while (true) {
                Object objectVolatile = zd.a.getObjectVolatile(qzVar, j);
                qz qzVar3 = ((qz) objectVolatile) == null ? null : qzVar2;
                do {
                    unsafe = zd.a;
                    if (unsafe.compareAndSwapObject(qzVar, b, objectVolatile, qzVar3)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(qzVar, j) == objectVolatile);
            }
            if (qzVar2 != null) {
                unsafe.putObjectVolatile(qzVar2, a, qzVar);
            }
            if (!qzVar.d() || qzVar.c() == null) {
                if (qzVar2 == null || !qzVar2.d()) {
                    return;
                }
            }
        }
    }
}
