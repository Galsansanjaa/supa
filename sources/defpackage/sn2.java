package defpackage;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class sn2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimationState b;

    public /* synthetic */ sn2(int i, AnimationState animationState) {
        this.a = i;
        this.b = animationState;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        AnimationState animationState = this.b;
        switch (i) {
            case 0:
                return SuspendAnimationKt.d(animationState);
            default:
                return SuspendAnimationKt.j(animationState);
        }
    }
}
