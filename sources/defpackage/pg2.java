package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pg2 implements wt0 {
    public static final pg2 a;
    private static final tf2 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wt0, java.lang.Object, pg2] */
    static {
        ?? obj = new Object();
        a = obj;
        ux1 ux1Var = new ux1("com.google.firebase.sessions.SessionDetails", obj, 4);
        ux1Var.j("sessionId", false);
        ux1Var.j("firstSessionId", false);
        ux1Var.j("sessionIndex", false);
        ux1Var.j("sessionStartTimestampUs", false);
        descriptor = ux1Var;
    }

    @Override // defpackage.wt0
    public final ta1[] childSerializers() {
        sm2 sm2Var = sm2.a;
        return new ta1[]{sm2Var, sm2Var, j61.a, ug1.a};
    }

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        String str;
        int i;
        int i2;
        String str2;
        long j;
        ob0Var.getClass();
        tf2 tf2Var = descriptor;
        jz beginStructure = ob0Var.beginStructure(tf2Var);
        if (beginStructure.decodeSequentially()) {
            str = beginStructure.decodeStringElement(tf2Var, 0);
            String decodeStringElement = beginStructure.decodeStringElement(tf2Var, 1);
            i = 15;
            i2 = beginStructure.decodeIntElement(tf2Var, 2);
            str2 = decodeStringElement;
            j = beginStructure.decodeLongElement(tf2Var, 3);
        } else {
            str = null;
            String str3 = null;
            boolean z = true;
            long j2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(tf2Var);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str = beginStructure.decodeStringElement(tf2Var, 0);
                    i3 |= 1;
                } else if (decodeElementIndex == 1) {
                    str3 = beginStructure.decodeStringElement(tf2Var, 1);
                    i3 |= 2;
                } else if (decodeElementIndex == 2) {
                    i4 = beginStructure.decodeIntElement(tf2Var, 2);
                    i3 |= 4;
                } else {
                    if (decodeElementIndex != 3) {
                        throw new x81(decodeElementIndex);
                    }
                    j2 = beginStructure.decodeLongElement(tf2Var, 3);
                    i3 |= 8;
                }
            }
            i = i3;
            i2 = i4;
            str2 = str3;
            j = j2;
        }
        String str4 = str;
        beginStructure.endStructure(tf2Var);
        return new rg2(i, i2, j, str4, str2);
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        rg2 rg2Var = (rg2) obj;
        rg2Var.getClass();
        tf2 tf2Var = descriptor;
        kz beginStructure = yi0Var.beginStructure(tf2Var);
        beginStructure.encodeStringElement(tf2Var, 0, rg2Var.a);
        beginStructure.encodeStringElement(tf2Var, 1, rg2Var.b);
        beginStructure.encodeIntElement(tf2Var, 2, rg2Var.c);
        beginStructure.encodeLongElement(tf2Var, 3, rg2Var.d);
        beginStructure.endStructure(tf2Var);
    }

    @Override // defpackage.wt0
    public final ta1[] typeParametersSerializers() {
        return np3.b;
    }
}
