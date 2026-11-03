package androidx.compose.foundation;

import android.view.Surface;
import defpackage.g50;
import defpackage.od4;
import defpackage.ps0;
import defpackage.r71;
import defpackage.us0;
import defpackage.ws0;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {
    private r71 job;
    private ws0 onSurface;
    private us0 onSurfaceChanged;
    private ps0 onSurfaceDestroyed;
    private final y40 scope;

    public BaseAndroidExternalSurfaceState(y40 y40Var) {
        this.scope = y40Var;
    }

    public final void dispatchSurfaceChanged(Surface surface, int i, int i2) {
        us0 us0Var = this.onSurfaceChanged;
        if (us0Var != null) {
            us0Var.invoke(surface, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void dispatchSurfaceCreated(Surface surface, int i, int i2) {
        if (this.onSurface != null) {
            this.job = od4.s(this.scope, null, g50.n, new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this, surface, i, i2, null), 1);
        }
    }

    public final void dispatchSurfaceDestroyed(Surface surface) {
        ps0 ps0Var = this.onSurfaceDestroyed;
        if (ps0Var != null) {
            ps0Var.invoke(surface);
        }
        r71 r71Var = this.job;
        if (r71Var != null) {
            r71Var.cancel(null);
        }
    }

    public final y40 getScope() {
        return this.scope;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onChanged(Surface surface, us0 us0Var) {
        this.onSurfaceChanged = us0Var;
    }

    @Override // androidx.compose.foundation.SurfaceScope
    public void onDestroyed(Surface surface, ps0 ps0Var) {
        this.onSurfaceDestroyed = ps0Var;
    }

    @Override // androidx.compose.foundation.AndroidExternalSurfaceScope
    public void onSurface(ws0 ws0Var) {
        this.onSurface = ws0Var;
    }
}
