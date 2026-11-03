package androidx.compose.ui.platform;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.input.NullableInputConnectionWrapper;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 rulerLambda$lambda$0;
        vy2 measure_3p2s80s$lambda$0;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                rulerLambda$lambda$0 = AndroidComposeView.RootModifierNode.rulerLambda$lambda$0((AndroidComposeView.RootModifierNode) obj2, (RulerScope) obj);
                return rulerLambda$lambda$0;
            case 1:
                measure_3p2s80s$lambda$0 = AndroidComposeView.RootModifierNode.measure_3p2s80s$lambda$0((Placeable) obj2, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            default:
                return InputMethodSession.a((InputMethodSession) obj2, (NullableInputConnectionWrapper) obj);
        }
    }
}
