package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class e94 extends k94 {
    public volatile long o;
    public final long p;

    public e94(String str, we1 we1Var, long j) {
        super(str, we1Var);
        this.p = j;
    }

    @Override // defpackage.k94
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.p);
    }

    @Override // defpackage.k94
    public final /* synthetic */ Object c(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.k94
    public final /* synthetic */ Object d(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.k94
    public final /* synthetic */ Object e() {
        return Long.valueOf(this.o);
    }

    @Override // defpackage.k94
    public final /* synthetic */ void f(Object obj) {
        this.o = ((Long) obj).longValue();
    }
}
