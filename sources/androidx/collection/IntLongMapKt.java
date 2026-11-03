package androidx.collection;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IntLongMapKt {
    private static final MutableIntLongMap EmptyIntLongMap = new MutableIntLongMap(0);

    public static final IntLongMap buildIntLongMap(int i, ps0 ps0Var) {
        ps0Var.getClass();
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(i);
        ps0Var.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    public static final IntLongMap buildIntLongMap(ps0 ps0Var) {
        ps0Var.getClass();
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        ps0Var.invoke(mutableIntLongMap);
        return mutableIntLongMap;
    }

    public static final IntLongMap emptyIntLongMap() {
        return EmptyIntLongMap;
    }

    public static final IntLongMap intLongMapOf() {
        return EmptyIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j, int i2, long j2) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4, int i5, long j5) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        mutableIntLongMap.set(i5, j5);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf() {
        return new MutableIntLongMap(0, 1, null);
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int i, long j, int i2, long j2, int i3, long j3, int i4, long j4, int i5, long j5) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i, j);
        mutableIntLongMap.set(i2, j2);
        mutableIntLongMap.set(i3, j3);
        mutableIntLongMap.set(i4, j4);
        mutableIntLongMap.set(i5, j5);
        return mutableIntLongMap;
    }
}
