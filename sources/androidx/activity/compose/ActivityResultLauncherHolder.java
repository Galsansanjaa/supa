package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import defpackage.hu2;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 8;
    private ActivityResultLauncher<I> launcher;

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(I i, ActivityOptionsCompat activityOptionsCompat) {
        vy2 vy2Var;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(i, activityOptionsCompat);
            vy2Var = vy2.a;
        } else {
            vy2Var = null;
        }
        if (vy2Var != null) {
            return;
        }
        hu2.h("Launcher has not been initialized");
    }

    public final void setLauncher(ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        vy2 vy2Var;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            vy2Var = vy2.a;
        } else {
            vy2Var = null;
        }
        if (vy2Var != null) {
            return;
        }
        hu2.h("Launcher has not been initialized");
    }
}
