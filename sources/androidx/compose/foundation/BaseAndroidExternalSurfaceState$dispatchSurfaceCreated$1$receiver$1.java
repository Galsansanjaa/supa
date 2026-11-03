package androidx.compose.foundation;

import android.view.Surface;
import defpackage.j20;
import defpackage.ps0;
import defpackage.us0;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements SurfaceCoroutineScope, SurfaceScope, y40 {
    private final /* synthetic */ BaseAndroidExternalSurfaceState $$delegate_0;
    private final /* synthetic */ y40 $$delegate_1;

    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, y40 y40Var) {
        this.$$delegate_0 = baseAndroidExternalSurfaceState;
        this.$$delegate_1 = y40Var;
    }

    @Override // androidx.compose.foundation.SurfaceCoroutineScope, defpackage.y40
    public j20 getCoroutineContext() {
        return this.$$delegate_1.getCoroutineContext();
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, us0 us0Var) {
        this.$$delegate_0.onChanged(surface, us0Var);
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, ps0 ps0Var) {
        this.$$delegate_0.onDestroyed(surface, ps0Var);
    }
}
