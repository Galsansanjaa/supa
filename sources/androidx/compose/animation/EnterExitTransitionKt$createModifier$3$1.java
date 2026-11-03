package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import defpackage.bb1;
import defpackage.os0;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$3$1 extends bb1 implements ps0 {
    final /* synthetic */ boolean $disableClip;
    final /* synthetic */ os0 $isEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$3$1(boolean z, os0 os0Var) {
        super(1);
        this.$disableClip = z;
        this.$isEnabled = os0Var;
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GraphicsLayerScope) obj);
        return vy2.a;
    }

    public final void invoke(GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setClip(!this.$disableClip && ((Boolean) this.$isEnabled.invoke()).booleanValue());
    }
}
