package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class vl1 implements us0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs0 b;

    public /* synthetic */ vl1(xs0 xs0Var, int i) {
        this.a = i;
        this.b = xs0Var;
    }

    @Override // defpackage.us0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object[] objArr = (Object[]) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        xs0 xs0Var = this.b;
        switch (i) {
            case 0:
                return MovableContentKt.d(xs0Var, objArr, composer, intValue);
            default:
                return MovableContentKt.n(xs0Var, objArr, composer, intValue);
        }
    }
}
