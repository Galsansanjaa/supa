package androidx.compose.animation;

import defpackage.bb1;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContentImpl$8$1$4$1 extends bb1 implements ts0 {
    final /* synthetic */ ExitTransition $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContentImpl$8$1$4$1(ExitTransition exitTransition) {
        super(2);
        this.$exit = exitTransition;
    }

    @Override // defpackage.ts0
    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
        EnterExitState enterExitState3 = EnterExitState.PostExit;
        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !this.$exit.getData$animation().getHold());
    }
}
