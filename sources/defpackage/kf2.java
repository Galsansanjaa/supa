package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class kf2 extends je2 {
    public final /* synthetic */ AtomicReferenceArray g;

    public kf2(long j, kf2 kf2Var, int i) {
        super(j, kf2Var, i);
        this.g = new AtomicReferenceArray(jf2.f);
    }

    @Override // defpackage.je2
    public final int g() {
        return jf2.f;
    }

    @Override // defpackage.je2
    public final void h(int i, j20 j20Var) {
        this.g.set(i, jf2.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
