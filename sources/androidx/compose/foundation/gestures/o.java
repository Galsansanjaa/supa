package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import defpackage.ps0;
import defpackage.y42;
import defpackage.z42;
import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransformScope b;
    public final /* synthetic */ long m;
    public final /* synthetic */ Serializable n;

    public /* synthetic */ o(Serializable serializable, TransformScope transformScope, long j, int i) {
        this.a = i;
        this.n = serializable;
        this.b = transformScope;
        this.m = j;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return TransformableStateKt$animateBy$4.d((z42) this.n, this.b, this.m, (AnimationScope) obj);
            default:
                return TransformableStateKt$animatePanBy$3.d((y42) this.n, this.b, this.m, (AnimationScope) obj);
        }
    }
}
