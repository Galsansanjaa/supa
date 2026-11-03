package androidx.compose.animation.core;

import defpackage.dv1;
import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {
    public static final int $stable = 8;
    private Easing easing;
    private final T value;

    private KeyframeBaseEntity(T t, Easing easing) {
        this.value = t;
        this.easing = easing;
    }

    public /* synthetic */ KeyframeBaseEntity(Object obj, Easing easing, sb0 sb0Var) {
        this(obj, easing);
    }

    public final Easing getEasing$animation_core() {
        return this.easing;
    }

    public final T getValue$animation_core() {
        return this.value;
    }

    public final void setEasing$animation_core(Easing easing) {
        this.easing = easing;
    }

    public final <V extends AnimationVector> dv1 toPair$animation_core(ps0 ps0Var) {
        return new dv1(ps0Var.invoke(this.value), this.easing);
    }
}
