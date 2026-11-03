package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class pj0 extends w20 {
    public static final /* synthetic */ int n = 0;
    public long a;
    public boolean b;
    public rd m;

    @Override // defpackage.w20
    public final w20 limitedParallelism(int i, String str) {
        np3.j(i);
        return str != null ? new uo1(this, str) : this;
    }

    public abstract void shutdown();

    public final void v(boolean z) {
        long j = this.a - (z ? 4294967296L : 1L);
        this.a = j;
        if (j <= 0 && this.b) {
            shutdown();
        }
    }

    public final void w(ie0 ie0Var) {
        rd rdVar = this.m;
        if (rdVar == null) {
            rdVar = new rd();
            this.m = rdVar;
        }
        rdVar.addLast(ie0Var);
    }

    public final void x(boolean z) {
        this.a = (z ? 4294967296L : 1L) + this.a;
        if (z) {
            return;
        }
        this.b = true;
    }

    public abstract long y();

    public final boolean z() {
        rd rdVar = this.m;
        if (rdVar == null) {
            return false;
        }
        ie0 ie0Var = (ie0) (rdVar.isEmpty() ? null : rdVar.removeFirst());
        if (ie0Var == null) {
            return false;
        }
        ie0Var.run();
        return true;
    }
}
