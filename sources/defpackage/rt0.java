package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.MovableContent;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class rt0 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovableContent b;
    public final /* synthetic */ Object m;

    public /* synthetic */ rt0(MovableContent movableContent, Object obj, int i) {
        this.a = i;
        this.b = movableContent;
        this.m = obj;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 invokeMovableContentLambda$lambda$0;
        vy2 invokeMovableContentLambda$lambda$0$0;
        int i = this.a;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                invokeMovableContentLambda$lambda$0 = GapComposer.invokeMovableContentLambda$lambda$0(this.b, this.m, composer, intValue);
                return invokeMovableContentLambda$lambda$0;
            default:
                invokeMovableContentLambda$lambda$0$0 = LinkComposer.invokeMovableContentLambda$lambda$0$0(this.b, this.m, composer, intValue);
                return invokeMovableContentLambda$lambda$0$0;
        }
    }
}
