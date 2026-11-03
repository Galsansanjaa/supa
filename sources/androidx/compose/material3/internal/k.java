package androidx.compose.material3.internal;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ State b;

    public /* synthetic */ k(State state, int i) {
        this.a = i;
        this.b = state;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        State state = this.b;
        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
        switch (i) {
            case 0:
                return TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1.a(state, graphicsLayerScope);
            case 1:
                return TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1.a(state, graphicsLayerScope);
            default:
                return TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1.a(state, graphicsLayerScope);
        }
    }
}
