package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ul1 implements us0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws0 b;

    public /* synthetic */ ul1(int i, ws0 ws0Var) {
        this.a = i;
        this.b = ws0Var;
    }

    @Override // defpackage.us0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vy2 movableContentOf$lambda$4;
        vy2 movableContentWithReceiverOf$lambda$4;
        int i = this.a;
        wu2 wu2Var = (wu2) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ws0 ws0Var = this.b;
        switch (i) {
            case 0:
                movableContentOf$lambda$4 = MovableContentKt.movableContentOf$lambda$4(ws0Var, wu2Var, composer, intValue);
                return movableContentOf$lambda$4;
            default:
                movableContentWithReceiverOf$lambda$4 = MovableContentKt.movableContentWithReceiverOf$lambda$4(ws0Var, wu2Var, composer, intValue);
                return movableContentWithReceiverOf$lambda$4;
        }
    }
}
