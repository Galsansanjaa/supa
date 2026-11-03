package androidx.collection;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FloatFloatMapKt {
    private static final MutableFloatFloatMap EmptyFloatFloatMap = new MutableFloatFloatMap(0);

    public static final FloatFloatMap buildFloatFloatMap(int i, ps0 ps0Var) {
        ps0Var.getClass();
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(i);
        ps0Var.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap buildFloatFloatMap(ps0 ps0Var) {
        ps0Var.getClass();
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        ps0Var.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap emptyFloatFloatMap() {
        return EmptyFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf() {
        return EmptyFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        mutableFloatFloatMap.set(f9, f10);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new MutableFloatFloatMap(0, 1, null);
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        mutableFloatFloatMap.set(f9, f10);
        return mutableFloatFloatMap;
    }
}
