package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hn2 extends zh2 implements xl2 {
    @Override // defpackage.xl2
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.r;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.s + ((int) ((o() + this.u) - this.s))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.r;
            objArr.getClass();
            a(Integer.valueOf(((Number) objArr[((int) ((this.s + ((int) ((o() + this.u) - this.s))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
