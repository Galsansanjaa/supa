package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class zl1 implements ws0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ zl1(MovableContent movableContent, int i) {
        this.a = i;
        this.b = movableContent;
    }

    @Override // defpackage.ws0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vy2 movableContentOf$lambda$5;
        vy2 movableContentWithReceiverOf$lambda$5;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj5).intValue();
                movableContentOf$lambda$5 = MovableContentKt.movableContentOf$lambda$5(this.b, obj, obj2, obj3, (Composer) obj4, intValue);
                return movableContentOf$lambda$5;
            default:
                int intValue2 = ((Integer) obj5).intValue();
                movableContentWithReceiverOf$lambda$5 = MovableContentKt.movableContentWithReceiverOf$lambda$5(this.b, obj, obj2, obj3, (Composer) obj4, intValue2);
                return movableContentWithReceiverOf$lambda$5;
        }
    }
}
