package androidx.compose.foundation.text.input.internal;

import defpackage.jh2;
import defpackage.k93;
import defpackage.us0;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class OpArray {
    private final int[] values;

    private /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m1911boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m1912constructorimpl(int i) {
        return m1913constructorimpl(new int[i * 3]);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int[] m1913constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m1914copyOfpSmdads(int[] iArr, int i) {
        return m1913constructorimpl(Arrays.copyOf(iArr, i * 3));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1915equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && jh2.k(iArr, ((OpArray) obj).m1923unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1916equalsimpl0(int[] iArr, int[] iArr2) {
        return jh2.k(iArr, iArr2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m1917forEachimpl(int[] iArr, int i, boolean z, us0 us0Var) {
        if (i < 0) {
            return;
        }
        if (!z) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 3;
                us0Var.invoke(Integer.valueOf(iArr[i3]), Integer.valueOf(iArr[i3 + 1]), Integer.valueOf(iArr[i3 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i4 = i * 3;
            us0Var.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1918forEachimpl$default(int[] iArr, int i, boolean z, us0 us0Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (i < 0) {
            return;
        }
        if (!z) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * 3;
                us0Var.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i5 = i * 3;
            us0Var.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr[i5 + 1]), Integer.valueOf(iArr[i5 + 2]));
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m1919getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1920hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m1921setimpl(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i * 3;
        iArr[i5] = i2;
        iArr[i5 + 1] = i3;
        iArr[i5 + 2] = i4;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1922toStringimpl(int[] iArr) {
        return k93.m("OpArray(values=", Arrays.toString(iArr), ")");
    }

    public boolean equals(Object obj) {
        return m1915equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m1920hashCodeimpl(this.values);
    }

    public String toString() {
        return m1922toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m1923unboximpl() {
        return this.values;
    }
}
