package androidx.compose.animation;

import defpackage.bb1;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 extends bb1 implements ts0 {
    public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1();

    public AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1() {
        super(2);
    }

    @Override // defpackage.ts0
    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
        return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
    }
}
