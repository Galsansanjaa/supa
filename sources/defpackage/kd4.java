package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class kd4 extends wd4 {
    public final c64 e;

    public /* synthetic */ kd4(c64 c64Var) {
        super(false, null, null);
        this.e = c64Var;
    }

    @Override // defpackage.wd4
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            sn0.q(e);
            return null;
        }
    }
}
