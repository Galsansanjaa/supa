package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.layout.TestModifierUpdaterKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;
    public final /* synthetic */ int m;

    public /* synthetic */ u2(int i, int i2, ps0 ps0Var) {
        this.a = i2;
        this.b = ps0Var;
        this.m = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.m;
        ps0 ps0Var = this.b;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                r3.b(ps0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return vy2.a;
            default:
                return TestModifierUpdaterKt.a(ps0Var, i2, composer, num.intValue());
        }
    }
}
