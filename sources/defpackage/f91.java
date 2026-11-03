package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class f91 implements ta1 {
    public static final f91 a = new Object();
    public static final vf2 b = ea0.h("kotlinx.serialization.json.JsonNull", xf2.l, new tf2[0]);

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        t61.e(ob0Var);
        if (ob0Var.decodeNotNullMark()) {
            throw new IllegalArgumentException("Expected 'null' literal");
        }
        ob0Var.decodeNull();
        return d91.INSTANCE;
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return b;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        ((d91) obj).getClass();
        t61.f(yi0Var);
        yi0Var.encodeNull();
    }
}
