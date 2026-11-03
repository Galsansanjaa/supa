package defpackage;

import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class tq0 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ us0 b;

    public /* synthetic */ tq0(us0 us0Var, int i) {
        this.a = i;
        this.b = us0Var;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        us0 us0Var = this.b;
        switch (i) {
            case 0:
                return FlowLayoutKt.b(us0Var, composer, intValue);
            default:
                return FlowLayoutKt.a(us0Var, composer, intValue);
        }
    }
}
