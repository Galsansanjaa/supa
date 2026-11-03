package androidx.compose.animation.core;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class AnimationVector {
    public static final int $stable = 0;

    private AnimationVector() {
    }

    public /* synthetic */ AnimationVector(sb0 sb0Var) {
        this();
    }

    public abstract float get$animation_core(int i);

    public abstract int getSize$animation_core();

    public abstract AnimationVector newVector$animation_core();

    public abstract void reset$animation_core();

    public abstract void set$animation_core(int i, float f);
}
