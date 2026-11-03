package androidx.collection;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LongIntMapKt {
    private static final MutableLongIntMap EmptyLongIntMap = new MutableLongIntMap(0);

    public static final LongIntMap buildLongIntMap(int i, ps0 ps0Var) {
        ps0Var.getClass();
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(i);
        ps0Var.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    public static final LongIntMap buildLongIntMap(ps0 ps0Var) {
        ps0Var.getClass();
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        ps0Var.invoke(mutableLongIntMap);
        return mutableLongIntMap;
    }

    public static final LongIntMap emptyLongIntMap() {
        return EmptyLongIntMap;
    }

    public static final LongIntMap longIntMapOf() {
        return EmptyLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j, int i) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j, int i, long j2, int i2) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j, int i, long j2, int i2, long j3, int i3) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        mutableLongIntMap.set(j4, i4);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4, long j5, int i5) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        mutableLongIntMap.set(j4, i4);
        mutableLongIntMap.set(j5, i5);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf() {
        return new MutableLongIntMap(0, 1, null);
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j, int i) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j, int i, long j2, int i2) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j, int i, long j2, int i2, long j3, int i3) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        mutableLongIntMap.set(j4, i4);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long j, int i, long j2, int i2, long j3, int i3, long j4, int i4, long j5, int i5) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j, i);
        mutableLongIntMap.set(j2, i2);
        mutableLongIntMap.set(j3, i3);
        mutableLongIntMap.set(j4, i4);
        mutableLongIntMap.set(j5, i5);
        return mutableLongIntMap;
    }
}
