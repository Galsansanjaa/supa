package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class lg2 implements wt0 {
    public static final lg2 a;
    private static final tf2 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wt0, lg2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        ux1 ux1Var = new ux1("com.google.firebase.sessions.SessionData", obj, 3);
        ux1Var.j("sessionDetails", false);
        ux1Var.j("backgroundTime", true);
        ux1Var.j("processDataMap", true);
        descriptor = ux1Var;
    }

    @Override // defpackage.wt0
    public final ta1[] childSerializers() {
        return new ta1[]{pg2.a, m60.n(uq2.a), m60.n((ta1) ng2.d[2].getValue())};
    }

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        int i;
        rg2 rg2Var;
        wq2 wq2Var;
        Map map;
        ob0Var.getClass();
        tf2 tf2Var = descriptor;
        jz beginStructure = ob0Var.beginStructure(tf2Var);
        nb1[] nb1VarArr = ng2.d;
        rg2 rg2Var2 = null;
        if (beginStructure.decodeSequentially()) {
            rg2Var = (rg2) beginStructure.decodeSerializableElement(tf2Var, 0, pg2.a, null);
            wq2Var = (wq2) beginStructure.decodeNullableSerializableElement(tf2Var, 1, uq2.a, null);
            map = (Map) beginStructure.decodeNullableSerializableElement(tf2Var, 2, (nd0) nb1VarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            wq2 wq2Var2 = null;
            Map map2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(tf2Var);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    rg2Var2 = (rg2) beginStructure.decodeSerializableElement(tf2Var, 0, pg2.a, rg2Var2);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    wq2Var2 = (wq2) beginStructure.decodeNullableSerializableElement(tf2Var, 1, uq2.a, wq2Var2);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new x81(decodeElementIndex);
                    }
                    map2 = (Map) beginStructure.decodeNullableSerializableElement(tf2Var, 2, (nd0) nb1VarArr[2].getValue(), map2);
                    i2 |= 4;
                }
            }
            i = i2;
            rg2Var = rg2Var2;
            wq2Var = wq2Var2;
            map = map2;
        }
        beginStructure.endStructure(tf2Var);
        return new ng2(i, rg2Var, wq2Var, map);
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        ng2 ng2Var = (ng2) obj;
        ng2Var.getClass();
        tf2 tf2Var = descriptor;
        kz beginStructure = yi0Var.beginStructure(tf2Var);
        nb1[] nb1VarArr = ng2.d;
        pg2 pg2Var = pg2.a;
        rg2 rg2Var = ng2Var.a;
        Map map = ng2Var.c;
        wq2 wq2Var = ng2Var.b;
        beginStructure.encodeSerializableElement(tf2Var, 0, pg2Var, rg2Var);
        if (beginStructure.shouldEncodeElementDefault(tf2Var, 1) || wq2Var != null) {
            beginStructure.encodeNullableSerializableElement(tf2Var, 1, uq2.a, wq2Var);
        }
        if (beginStructure.shouldEncodeElementDefault(tf2Var, 2) || map != null) {
            beginStructure.encodeNullableSerializableElement(tf2Var, 2, (bg2) nb1VarArr[2].getValue(), map);
        }
        beginStructure.endStructure(tf2Var);
    }

    @Override // defpackage.wt0
    public final ta1[] typeParametersSerializers() {
        return np3.b;
    }
}
