package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class lk2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ w42 m;
    public final /* synthetic */ ScrollScope n;
    public final /* synthetic */ ps0 o;

    public /* synthetic */ lk2(float f, w42 w42Var, ScrollScope scrollScope, ps0 ps0Var, int i) {
        this.a = i;
        this.b = f;
        this.m = w42Var;
        this.n = scrollScope;
        this.o = ps0Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        ps0 ps0Var = this.o;
        ScrollScope scrollScope = this.n;
        w42 w42Var = this.m;
        float f = this.b;
        AnimationScope animationScope = (AnimationScope) obj;
        switch (i) {
            case 0:
                return SnapFlingBehaviorKt.b(f, w42Var, scrollScope, ps0Var, animationScope);
            default:
                return SnapFlingBehaviorKt.a(f, w42Var, scrollScope, ps0Var, animationScope);
        }
    }
}
