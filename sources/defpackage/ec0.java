package defpackage;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Scrollable2DStateKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ec0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ State b;

    public /* synthetic */ ec0(State state, int i) {
        this.a = i;
        this.b = state;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 SingleRowTopAppBar$lambda$7$lambda$6;
        int i = this.a;
        State state = this.b;
        switch (i) {
            case 0:
                SingleRowTopAppBar$lambda$7$lambda$6 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$7$lambda$6(state, (DrawScope) obj);
                return SingleRowTopAppBar$lambda$7$lambda$6;
            case 1:
                return Draggable2DKt.b(state, (Offset) obj);
            case 2:
                return DraggableKt.b(state, ((Float) obj).floatValue());
            case 3:
                return Scrollable2DStateKt.a(state, (Offset) obj);
            default:
                return Float.valueOf(ScrollableStateKt.a(state, ((Float) obj).floatValue()));
        }
    }
}
