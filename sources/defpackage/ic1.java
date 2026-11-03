package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.lazy.LazyListCacheWindowScope;
import androidx.compose.foundation.lazy.LazyListPrefetchResultScope;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.platform.RenderNodeLayer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ic1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts0 b;

    public /* synthetic */ ic1(int i, ts0 ts0Var) {
        this.a = i;
        this.b = ts0Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 animateDecay$lambda$0;
        int i = this.a;
        ts0 ts0Var = this.b;
        switch (i) {
            case 0:
                return LazyListCacheWindowScope.a(ts0Var, (LazyListPrefetchResultScope) obj);
            case 1:
                return RenderNodeLayer.b(ts0Var, (Canvas) obj);
            default:
                animateDecay$lambda$0 = SuspendAnimationKt.animateDecay$lambda$0(ts0Var, (AnimationScope) obj);
                return animateDecay$lambda$0;
        }
    }
}
