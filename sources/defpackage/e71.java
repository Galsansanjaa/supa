package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class e71 extends yy2 {
    public boolean b;
    public final /* synthetic */ Object m;

    public e71(Object obj) {
        super(0);
        this.m = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            f31.b();
            return null;
        }
        this.b = true;
        return this.m;
    }
}
