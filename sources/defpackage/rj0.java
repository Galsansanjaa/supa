package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rj0 extends sj0 {
    public final Runnable m;

    public rj0(long j, Runnable runnable) {
        super(j);
        this.m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.m.run();
    }

    @Override // defpackage.sj0
    public final String toString() {
        return super.toString() + this.m;
    }
}
