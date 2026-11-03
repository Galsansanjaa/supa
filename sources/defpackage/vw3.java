package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vw3 extends yy2 {
    public static final Object m = new Object();
    public Object b;

    public vw3(Object obj) {
        super(2);
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = m;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        f31.b();
        return null;
    }
}
