package androidx.collection;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IntSetKt {
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);
    private static final int[] EmptyIntArray = new int[0];

    public static final IntSet buildIntSet(int i, ps0 ps0Var) {
        ps0Var.getClass();
        MutableIntSet mutableIntSet = new MutableIntSet(i);
        ps0Var.invoke(mutableIntSet);
        return mutableIntSet;
    }

    public static final IntSet buildIntSet(ps0 ps0Var) {
        ps0Var.getClass();
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        ps0Var.invoke(mutableIntSet);
        return mutableIntSet;
    }

    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final int hash(int i) {
        int i2 = i * ScatterMapKt.MurmurHashC1;
        return i2 ^ (i2 << 16);
    }

    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    public static final IntSet intSetOf(int i) {
        return mutableIntSetOf(i);
    }

    public static final IntSet intSetOf(int i, int i2) {
        return mutableIntSetOf(i, i2);
    }

    public static final IntSet intSetOf(int i, int i2, int i3) {
        return mutableIntSetOf(i, i2, i3);
    }

    public static final IntSet intSetOf(int... iArr) {
        iArr.getClass();
        MutableIntSet mutableIntSet = new MutableIntSet(iArr.length);
        mutableIntSet.plusAssign(iArr);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    public static final MutableIntSet mutableIntSetOf(int i) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i, int i2) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i2);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i, int i2, int i3) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i2);
        mutableIntSet.plusAssign(i3);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int... iArr) {
        iArr.getClass();
        MutableIntSet mutableIntSet = new MutableIntSet(iArr.length);
        mutableIntSet.plusAssign(iArr);
        return mutableIntSet;
    }
}
