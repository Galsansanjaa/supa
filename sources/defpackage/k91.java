package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class k91 implements ta1 {
    public static final k91 a = new Object();
    public static final j91 b = j91.b;

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        t61.e(ob0Var);
        return new h91((Map) new wd1(sm2.a, v81.a).deserialize(ob0Var));
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return b;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        h91 h91Var = (h91) obj;
        h91Var.getClass();
        t61.f(yi0Var);
        new wd1(sm2.a, v81.a).serialize(yi0Var, h91Var);
    }
}
