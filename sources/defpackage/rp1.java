package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.window.embedding.SplitAttributes;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class rp1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ rp1(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39;
        vy2 padding_3ABfNKs$lambda$0;
        boolean ratio$lambda$0;
        vy2 ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21;
        int i = this.a;
        float f = this.b;
        switch (i) {
            case 0:
                placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39 = NavigationItemKt.placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39(f, (GraphicsLayerScope) obj);
                return placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39;
            case 1:
                padding_3ABfNKs$lambda$0 = PaddingKt.padding_3ABfNKs$lambda$0(f, (InspectorInfo) obj);
                return padding_3ABfNKs$lambda$0;
            case 2:
                ratio$lambda$0 = SplitAttributes.SplitType.Companion.ratio$lambda$0(f, ((Float) obj).floatValue());
                return Boolean.valueOf(ratio$lambda$0);
            default:
                ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21 = WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21(f, 0.0f, (DraggableAnchorsConfig) obj);
                return ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21;
        }
    }
}
