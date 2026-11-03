package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class uq2 implements wt0 {
    public static final uq2 a;
    private static final tf2 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wt0, uq2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ux1 ux1Var = new ux1("com.google.firebase.sessions.Time", obj, 3);
        ux1Var.j("ms", false);
        ux1Var.j("us", true);
        ux1Var.j("seconds", true);
        descriptor = ux1Var;
    }

    @Override // defpackage.wt0
    public final ta1[] childSerializers() {
        ug1 ug1Var = ug1.a;
        return new ta1[]{ug1Var, ug1Var, ug1Var};
    }

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        int i;
        long j;
        long j2;
        long j3;
        ob0Var.getClass();
        tf2 tf2Var = descriptor;
        jz beginStructure = ob0Var.beginStructure(tf2Var);
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(tf2Var, 0);
            long decodeLongElement2 = beginStructure.decodeLongElement(tf2Var, 1);
            j = beginStructure.decodeLongElement(tf2Var, 2);
            i = 7;
            j2 = decodeLongElement;
            j3 = decodeLongElement2;
        } else {
            long j4 = 0;
            boolean z = true;
            int i2 = 0;
            long j5 = 0;
            long j6 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(tf2Var);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    j5 = beginStructure.decodeLongElement(tf2Var, 0);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    j6 = beginStructure.decodeLongElement(tf2Var, 1);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new x81(decodeElementIndex);
                    }
                    j4 = beginStructure.decodeLongElement(tf2Var, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            j = j4;
            j2 = j5;
            j3 = j6;
        }
        beginStructure.endStructure(tf2Var);
        return new wq2(i, j2, j3, j);
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        wq2 wq2Var = (wq2) obj;
        wq2Var.getClass();
        tf2 tf2Var = descriptor;
        kz beginStructure = yi0Var.beginStructure(tf2Var);
        long j = wq2Var.a;
        long j2 = wq2Var.c;
        long j3 = wq2Var.b;
        beginStructure.encodeLongElement(tf2Var, 0, j);
        if (beginStructure.shouldEncodeElementDefault(tf2Var, 1) || j3 != j * 1000) {
            beginStructure.encodeLongElement(tf2Var, 1, j3);
        }
        if (beginStructure.shouldEncodeElementDefault(tf2Var, 2) || j2 != j / 1000) {
            beginStructure.encodeLongElement(tf2Var, 2, j2);
        }
        beginStructure.endStructure(tf2Var);
    }

    @Override // defpackage.wt0
    public final ta1[] typeParametersSerializers() {
        return np3.b;
    }
}
