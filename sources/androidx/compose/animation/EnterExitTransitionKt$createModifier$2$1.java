package androidx.compose.animation;

import defpackage.bb1;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$2$1 extends bb1 implements os0 {
    final /* synthetic */ SharedMutableTransformState $activeMutableState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$2$1(SharedMutableTransformState sharedMutableTransformState) {
        super(0);
        this.$activeMutableState = sharedMutableTransformState;
    }

    @Override // defpackage.os0
    public final SharedMutableTransformState invoke() {
        return this.$activeMutableState;
    }
}
