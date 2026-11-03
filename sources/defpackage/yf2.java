package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yf2 extends eg2 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;

    public yf2(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = map5;
    }

    @Override // defpackage.eg2
    public final void a(fg2 fg2Var) {
        for (Map.Entry entry : this.a.entrySet()) {
            ca1 ca1Var = (ca1) entry.getKey();
            z00 z00Var = (z00) entry.getValue();
            if (z00Var instanceof x00) {
                ca1Var.getClass();
                ta1 ta1Var = ((x00) z00Var).a;
                ta1Var.getClass();
                fg2Var.q(ca1Var, ta1Var);
            } else {
                if (!(z00Var instanceof y00)) {
                    hu2.e();
                    return;
                }
                fg2Var.z(ca1Var, ((y00) z00Var).a);
            }
        }
        for (Map.Entry entry2 : this.b.entrySet()) {
            ca1 ca1Var2 = (ca1) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                ca1 ca1Var3 = (ca1) entry3.getKey();
                ta1 ta1Var2 = (ta1) entry3.getValue();
                ca1Var2.getClass();
                ca1Var3.getClass();
                ta1Var2.getClass();
                fg2Var.g(ca1Var2, ca1Var3, ta1Var2);
            }
        }
        for (Map.Entry entry4 : this.c.entrySet()) {
            ca1 ca1Var4 = (ca1) entry4.getKey();
            ps0 ps0Var = (ps0) entry4.getValue();
            ca1Var4.getClass();
            ps0Var.getClass();
            ux2.m(1, ps0Var);
            fg2Var.p(ca1Var4, ps0Var);
        }
        for (Map.Entry entry5 : this.e.entrySet()) {
            ca1 ca1Var5 = (ca1) entry5.getKey();
            ps0 ps0Var2 = (ps0) entry5.getValue();
            ca1Var5.getClass();
            ps0Var2.getClass();
            ux2.m(1, ps0Var2);
            fg2Var.o(ca1Var5, ps0Var2);
        }
    }
}
