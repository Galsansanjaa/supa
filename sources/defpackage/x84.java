package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class x84 extends k94 {
    public volatile boolean o;
    public final boolean p;

    public x84(String str, we1 we1Var, boolean z) {
        super(str, we1Var);
        this.p = z;
    }

    @Override // defpackage.k94
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.k94
    public final /* synthetic */ Object c(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.k94
    public final /* synthetic */ Object d(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.k94
    public final /* synthetic */ Object e() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.k94
    public final /* synthetic */ void f(Object obj) {
        this.o = ((Boolean) obj).booleanValue();
    }
}
