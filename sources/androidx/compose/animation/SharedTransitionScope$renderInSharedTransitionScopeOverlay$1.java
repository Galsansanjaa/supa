package androidx.compose.animation;

import defpackage.bb1;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class SharedTransitionScope$renderInSharedTransitionScopeOverlay$1 extends bb1 implements os0 {
    final /* synthetic */ SharedTransitionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScope$renderInSharedTransitionScopeOverlay$1(SharedTransitionScope sharedTransitionScope) {
        super(0);
        this.this$0 = sharedTransitionScope;
    }

    @Override // defpackage.os0
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.isTransitionActive());
    }
}
