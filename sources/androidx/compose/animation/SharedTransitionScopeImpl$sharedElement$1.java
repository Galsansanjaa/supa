package androidx.compose.animation;

import defpackage.bb1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$sharedElement$1 extends bb1 implements ps0 {
    public static final SharedTransitionScopeImpl$sharedElement$1 INSTANCE = new SharedTransitionScopeImpl$sharedElement$1();

    public SharedTransitionScopeImpl$sharedElement$1() {
        super(1);
    }

    @Override // defpackage.ps0
    public final Boolean invoke(EnterExitState enterExitState) {
        return Boolean.valueOf(enterExitState == EnterExitState.Visible);
    }
}
