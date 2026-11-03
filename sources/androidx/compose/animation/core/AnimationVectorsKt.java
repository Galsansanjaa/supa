package androidx.compose.animation.core;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    public static final AnimationVector2D AnimationVector(float f, float f2) {
        return new AnimationVector2D(f, f2);
    }

    public static final AnimationVector3D AnimationVector(float f, float f2, float f3) {
        return new AnimationVector3D(f, f2, f3);
    }

    public static final AnimationVector4D AnimationVector(float f, float f2, float f3, float f4) {
        return new AnimationVector4D(f, f2, f3, f4);
    }

    public static final <T extends AnimationVector> T copy(T t) {
        T t2 = (T) newInstance(t);
        int size$animation_core = t2.getSize$animation_core();
        for (int i = 0; i < size$animation_core; i++) {
            t2.set$animation_core(i, t.get$animation_core(i));
        }
        return t2;
    }

    public static final <T extends AnimationVector> void copyFrom(T t, T t2) {
        int size$animation_core = t.getSize$animation_core();
        for (int i = 0; i < size$animation_core; i++) {
            t.set$animation_core(i, t2.get$animation_core(i));
        }
    }

    public static final <T extends AnimationVector> T newInstance(T t) {
        T t2 = (T) t.newVector$animation_core();
        t2.getClass();
        return t2;
    }
}
