package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bb1;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1 extends bb1 implements ps0 {
    final /* synthetic */ EnterTransition $enter$inlined;
    final /* synthetic */ ExitTransition $exit$inlined;
    final /* synthetic */ String $label$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1(EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        super(1);
        this.$enter$inlined = enterTransition;
        this.$exit$inlined = exitTransition;
        this.$label$inlined = str;
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return vy2.a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateEnterExit");
        inspectorInfo.getProperties().set("enter", this.$enter$inlined);
        inspectorInfo.getProperties().set("exit", this.$exit$inlined);
        inspectorInfo.getProperties().set("label", this.$label$inlined);
    }
}
