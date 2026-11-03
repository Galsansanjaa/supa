package defpackage;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.runtime.saveable.SaverScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class re1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts0 b;

    public /* synthetic */ re1(int i, ts0 ts0Var) {
        this.a = i;
        this.b = ts0Var;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ts0 ts0Var = this.b;
        SaverScope saverScope = (SaverScope) obj;
        switch (i) {
            case 0:
                return ListSaverKt.a(ts0Var, saverScope, obj2);
            default:
                return MapSaverKt.b(ts0Var, saverScope, obj2);
        }
    }
}
