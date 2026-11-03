package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import defpackage.ps0;
import defpackage.w42;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w42 b;
    public final /* synthetic */ TransformScope m;
    public final /* synthetic */ long n;

    public /* synthetic */ p(w42 w42Var, TransformScope transformScope, long j, int i) {
        this.a = i;
        this.b = w42Var;
        this.m = transformScope;
        this.n = j;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return TransformableStateKt$animateRotateBy$3.d(this.b, this.m, this.n, (AnimationScope) obj);
            default:
                return TransformableStateKt$animateZoomBy$4.d(this.b, this.m, this.n, (AnimationScope) obj);
        }
    }
}
