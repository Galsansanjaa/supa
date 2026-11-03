package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yq1 implements ta1 {
    public static final yq1 a = new Object();
    public static final xq1 b = xq1.a;

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        throw new IllegalArgumentException("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return b;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        ((Void) obj).getClass();
        throw new IllegalArgumentException("'kotlin.Nothing' cannot be serialized");
    }
}
