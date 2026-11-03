package androidx.compose.animation;

import defpackage.os0;
import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableTransform {
    public static final int $stable = 8;
    private ts0 block;
    private os0 offsetVelocityProvider;
    private boolean veilMatchParentSize;

    public MutableTransform() {
        this(false, null, null, 7, null);
    }

    public MutableTransform(boolean z, os0 os0Var, ts0 ts0Var) {
        this.veilMatchParentSize = z;
        this.offsetVelocityProvider = os0Var;
        this.block = ts0Var;
    }

    public /* synthetic */ MutableTransform(boolean z, os0 os0Var, ts0 ts0Var, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : os0Var, (i & 4) != 0 ? null : ts0Var);
    }

    public final void clear$animation() {
        this.block = null;
        this.veilMatchParentSize = false;
        this.offsetVelocityProvider = null;
    }

    public final ts0 getBlock$animation() {
        return this.block;
    }

    public final os0 getOffsetVelocityProvider$animation() {
        return this.offsetVelocityProvider;
    }

    public final boolean getVeilMatchParentSize$animation() {
        return this.veilMatchParentSize;
    }

    public final void setBlock$animation(ts0 ts0Var) {
        this.block = ts0Var;
    }

    public final void setOffsetVelocityProvider$animation(os0 os0Var) {
        this.offsetVelocityProvider = os0Var;
    }

    public final void setVeilMatchParentSize$animation(boolean z) {
        this.veilMatchParentSize = z;
    }

    public final void update(ts0 ts0Var) {
        this.block = ts0Var;
    }
}
