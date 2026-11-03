package androidx.compose.animation;

import defpackage.os0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableContentTransform {
    public static final int $stable = 8;
    private final MutableTransform initialTransform;
    private final MutableTransform targetTransform;

    public MutableContentTransform(boolean z, boolean z2, os0 os0Var, os0 os0Var2) {
        this.targetTransform = new MutableTransform(z2, os0Var2, null, 4, null);
        this.initialTransform = new MutableTransform(z, os0Var, null, 4, null);
    }

    public final MutableTransform getInitialTransform$animation() {
        return this.initialTransform;
    }

    public final MutableTransform getTargetTransform$animation() {
        return this.targetTransform;
    }

    public final void initialContentTransform(ts0 ts0Var) {
        this.initialTransform.update(ts0Var);
    }

    public final void targetContentTransform(ts0 ts0Var) {
        this.targetTransform.update(ts0Var);
    }
}
