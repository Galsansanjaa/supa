package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class iz1 implements wt0 {
    public static final iz1 a;
    private static final tf2 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [iz1, wt0, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ux1 ux1Var = new ux1("com.google.firebase.sessions.ProcessData", obj, 2);
        ux1Var.j("pid", false);
        ux1Var.j("uuid", false);
        descriptor = ux1Var;
    }

    @Override // defpackage.wt0
    public final ta1[] childSerializers() {
        return new ta1[]{j61.a, sm2.a};
    }

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        int i;
        String str;
        int i2;
        ob0Var.getClass();
        tf2 tf2Var = descriptor;
        jz beginStructure = ob0Var.beginStructure(tf2Var);
        if (beginStructure.decodeSequentially()) {
            i = beginStructure.decodeIntElement(tf2Var, 0);
            str = beginStructure.decodeStringElement(tf2Var, 1);
            i2 = 3;
        } else {
            String str2 = null;
            boolean z = true;
            i = 0;
            int i3 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(tf2Var);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    i = beginStructure.decodeIntElement(tf2Var, 0);
                    i3 |= 1;
                } else {
                    if (decodeElementIndex != 1) {
                        throw new x81(decodeElementIndex);
                    }
                    str2 = beginStructure.decodeStringElement(tf2Var, 1);
                    i3 |= 2;
                }
            }
            str = str2;
            i2 = i3;
        }
        beginStructure.endStructure(tf2Var);
        return new kz1(i2, i, str);
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        kz1 kz1Var = (kz1) obj;
        kz1Var.getClass();
        tf2 tf2Var = descriptor;
        kz beginStructure = yi0Var.beginStructure(tf2Var);
        beginStructure.encodeIntElement(tf2Var, 0, kz1Var.a);
        beginStructure.encodeStringElement(tf2Var, 1, kz1Var.b);
        beginStructure.endStructure(tf2Var);
    }

    @Override // defpackage.wt0
    public final ta1[] typeParametersSerializers() {
        return np3.b;
    }
}
