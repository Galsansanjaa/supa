package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import defpackage.bb1;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$sharedBounds$2$1$1 extends bb1 implements os0 {
    final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBounds$2$1$1(SharedTransitionScope.SharedContentState sharedContentState) {
        super(0);
        this.$sharedContentState = sharedContentState;
    }

    @Override // defpackage.os0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$sharedContentState.isMatchFound());
    }
}
