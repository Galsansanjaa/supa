package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ok3 {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final tu0 a;

    public ok3(tu0 tu0Var) {
        this.a = tu0Var;
    }

    public final gm3 a(gm3 gm3Var) {
        boolean z = true;
        if (!gm3Var.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        gm3Var.i = z;
        tu0 tu0Var = this.a;
        yu0 yu0Var = tu0Var.k;
        yu0Var.getClass();
        tk3 tk3Var = new tk3(new al3(gm3Var), yu0Var.s.get(), tu0Var);
        cx1 cx1Var = yu0Var.w;
        cx1Var.sendMessage(cx1Var.obtainMessage(4, tk3Var));
        return gm3Var;
    }
}
