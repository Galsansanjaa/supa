package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ig2 implements wt0 {
    public static final ig2 a;
    private static final tf2 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wt0, ig2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ux1 ux1Var = new ux1("com.google.firebase.sessions.settings.SessionConfigs", obj, 5);
        ux1Var.j("sessionsEnabled", false);
        ux1Var.j("sessionSamplingRate", false);
        ux1Var.j("sessionTimeoutSeconds", false);
        ux1Var.j("cacheDurationSeconds", false);
        ux1Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = ux1Var;
    }

    @Override // defpackage.wt0
    public final ta1[] childSerializers() {
        ta1 n = m60.n(tp.a);
        ta1 n2 = m60.n(gf0.a);
        j61 j61Var = j61.a;
        return new ta1[]{n, n2, m60.n(j61Var), m60.n(j61Var), m60.n(ug1.a)};
    }

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        int i;
        Boolean bool;
        Double d;
        Integer num;
        Integer num2;
        Long l;
        ob0Var.getClass();
        tf2 tf2Var = descriptor;
        jz beginStructure = ob0Var.beginStructure(tf2Var);
        Boolean bool2 = null;
        if (beginStructure.decodeSequentially()) {
            Boolean bool3 = (Boolean) beginStructure.decodeNullableSerializableElement(tf2Var, 0, tp.a, null);
            Double d2 = (Double) beginStructure.decodeNullableSerializableElement(tf2Var, 1, gf0.a, null);
            j61 j61Var = j61.a;
            Integer num3 = (Integer) beginStructure.decodeNullableSerializableElement(tf2Var, 2, j61Var, null);
            bool = bool3;
            num2 = (Integer) beginStructure.decodeNullableSerializableElement(tf2Var, 3, j61Var, null);
            l = (Long) beginStructure.decodeNullableSerializableElement(tf2Var, 4, ug1.a, null);
            num = num3;
            d = d2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            Double d3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Long l2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(tf2Var);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(tf2Var, 0, tp.a, bool2);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    d3 = (Double) beginStructure.decodeNullableSerializableElement(tf2Var, 1, gf0.a, d3);
                    i2 |= 2;
                } else if (decodeElementIndex == 2) {
                    num4 = (Integer) beginStructure.decodeNullableSerializableElement(tf2Var, 2, j61.a, num4);
                    i2 |= 4;
                } else if (decodeElementIndex == 3) {
                    num5 = (Integer) beginStructure.decodeNullableSerializableElement(tf2Var, 3, j61.a, num5);
                    i2 |= 8;
                } else {
                    if (decodeElementIndex != 4) {
                        throw new x81(decodeElementIndex);
                    }
                    l2 = (Long) beginStructure.decodeNullableSerializableElement(tf2Var, 4, ug1.a, l2);
                    i2 |= 16;
                }
            }
            i = i2;
            bool = bool2;
            d = d3;
            num = num4;
            num2 = num5;
            l = l2;
        }
        beginStructure.endStructure(tf2Var);
        return new kg2(i, bool, d, num, num2, l);
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        kg2 kg2Var = (kg2) obj;
        kg2Var.getClass();
        tf2 tf2Var = descriptor;
        kz beginStructure = yi0Var.beginStructure(tf2Var);
        beginStructure.encodeNullableSerializableElement(tf2Var, 0, tp.a, kg2Var.a);
        beginStructure.encodeNullableSerializableElement(tf2Var, 1, gf0.a, kg2Var.b);
        j61 j61Var = j61.a;
        beginStructure.encodeNullableSerializableElement(tf2Var, 2, j61Var, kg2Var.c);
        beginStructure.encodeNullableSerializableElement(tf2Var, 3, j61Var, kg2Var.d);
        beginStructure.encodeNullableSerializableElement(tf2Var, 4, ug1.a, kg2Var.e);
        beginStructure.endStructure(tf2Var);
    }

    @Override // defpackage.wt0
    public final ta1[] typeParametersSerializers() {
        return np3.b;
    }
}
