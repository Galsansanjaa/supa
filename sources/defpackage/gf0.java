package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gf0 implements ta1 {
    public static final gf0 a = new Object();
    public static final ez1 b = new ez1("kotlin.Double", dz1.o);

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        return Double.valueOf(ob0Var.decodeDouble());
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return b;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        yi0Var.encodeDouble(((Number) obj).doubleValue());
    }
}
