package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class xl1 implements us0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ xl1(MovableContent movableContent, int i) {
        this.a = i;
        this.b = movableContent;
    }

    @Override // defpackage.us0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vy2 movableContentOf$lambda$1;
        vy2 movableContentWithReceiverOf$lambda$1;
        int i = this.a;
        MovableContent movableContent = this.b;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                movableContentOf$lambda$1 = MovableContentKt.movableContentOf$lambda$1(movableContent, obj, composer, intValue);
                return movableContentOf$lambda$1;
            default:
                movableContentWithReceiverOf$lambda$1 = MovableContentKt.movableContentWithReceiverOf$lambda$1(movableContent, obj, composer, intValue);
                return movableContentWithReceiverOf$lambda$1;
        }
    }
}
