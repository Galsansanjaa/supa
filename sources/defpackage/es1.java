package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class es1 implements ta1 {
    public final nb1 a = ta3.w(uc1.a, new xp1(this));

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        int decodeElementIndex;
        ob0Var.getClass();
        tf2 descriptor = getDescriptor();
        jz beginStructure = ob0Var.beginStructure(descriptor);
        if (!beginStructure.decodeSequentially() && (decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor())) != -1) {
            throw new IllegalArgumentException(lt.w(decodeElementIndex, "Unexpected index "));
        }
        beginStructure.endStructure(descriptor);
        return vy2.a;
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return (tf2) this.a.getValue();
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        obj.getClass();
        yi0Var.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }
}
