package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContent;
import androidx.compose.runtime.MovableContentKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class wl1 implements xs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;

    public /* synthetic */ wl1(MovableContent movableContent, int i) {
        this.a = i;
        this.b = movableContent;
    }

    @Override // defpackage.xs0
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        vy2 movableContentWithReceiverOf$lambda$7;
        vy2 movableContentOf$lambda$7;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj6).intValue();
                movableContentWithReceiverOf$lambda$7 = MovableContentKt.movableContentWithReceiverOf$lambda$7(this.b, obj, obj2, obj3, obj4, (Composer) obj5, intValue);
                return movableContentWithReceiverOf$lambda$7;
            default:
                int intValue2 = ((Integer) obj6).intValue();
                movableContentOf$lambda$7 = MovableContentKt.movableContentOf$lambda$7(this.b, obj, obj2, obj3, obj4, (Composer) obj5, intValue2);
                return movableContentOf$lambda$7;
        }
    }
}
