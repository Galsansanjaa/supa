package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class yl1 implements vs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ yl1(MovableContent movableContent, int i) {
        this.a = i;
        this.b = movableContent;
    }

    @Override // defpackage.vs0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        vy2 movableContentOf$lambda$3;
        vy2 movableContentWithReceiverOf$lambda$3;
        int i = this.a;
        MovableContent movableContent = this.b;
        Composer composer = (Composer) obj3;
        int intValue = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                movableContentOf$lambda$3 = MovableContentKt.movableContentOf$lambda$3(movableContent, obj, obj2, composer, intValue);
                return movableContentOf$lambda$3;
            default:
                movableContentWithReceiverOf$lambda$3 = MovableContentKt.movableContentWithReceiverOf$lambda$3(movableContent, obj, obj2, composer, intValue);
                return movableContentWithReceiverOf$lambda$3;
        }
    }
}
