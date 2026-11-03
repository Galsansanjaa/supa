package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tp implements ta1 {
    public static final tp a = new Object();
    public static final ez1 b = new ez1("kotlin.Boolean", dz1.l);

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        return Boolean.valueOf(ob0Var.decodeBoolean());
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return b;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        yi0Var.encodeBoolean(((Boolean) obj).booleanValue());
    }
}
