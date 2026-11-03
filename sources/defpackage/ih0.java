package defpackage;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.DraggableGestureConnection;
import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.StrategyKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ih0 implements ps0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object m;

    public /* synthetic */ ih0(float f, v42 v42Var) {
        this.b = f;
        this.m = v42Var;
    }

    public /* synthetic */ ih0(KeylineList keylineList, float f) {
        this.m = keylineList;
        this.b = f;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 createShiftedKeylineListForContentPadding$lambda$2;
        int i = this.a;
        float f = this.b;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return Boolean.valueOf(DragGestureNode.a(f, (v42) obj2, (DraggableGestureConnection) obj));
            default:
                createShiftedKeylineListForContentPadding$lambda$2 = StrategyKt.createShiftedKeylineListForContentPadding$lambda$2((KeylineList) obj2, f, (KeylineListScope) obj);
                return createShiftedKeylineListForContentPadding$lambda$2;
        }
    }
}
