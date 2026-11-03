package androidx.compose.animation;

import defpackage.bb1;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1 extends bb1 implements ps0 {
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1(boolean z) {
        super(1);
        this.$visible = z;
    }

    @Override // defpackage.ps0
    public final Boolean invoke(vy2 vy2Var) {
        return Boolean.valueOf(this.$visible);
    }
}
