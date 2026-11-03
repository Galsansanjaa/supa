package defpackage;

import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.LookaheadScopeKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class lc1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ us0 b;
    public final /* synthetic */ int m;

    public /* synthetic */ lc1(int i, int i2, us0 us0Var) {
        this.a = i2;
        this.b = us0Var;
        this.m = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 LookaheadScope$lambda$4;
        int i = this.a;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return LazySaveableStateHolderKt.c(this.b, this.m, composer, intValue);
            default:
                LookaheadScope$lambda$4 = LookaheadScopeKt.LookaheadScope$lambda$4(this.b, this.m, composer, intValue);
                return LookaheadScope$lambda$4;
        }
    }
}
