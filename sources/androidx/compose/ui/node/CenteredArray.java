package androidx.compose.ui.node;

import defpackage.jh2;
import defpackage.k93;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class CenteredArray {
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m6846boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m6847constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6848equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && jh2.k(iArr, ((CenteredArray) obj).m6855unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6849equalsimpl0(int[] iArr, int[] iArr2) {
        return jh2.k(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m6850getimpl(int[] iArr, int i) {
        return iArr[i + m6851getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m6851getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6852hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m6853setimpl(int[] iArr, int i, int i2) {
        iArr[i + m6851getMidimpl(iArr)] = i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6854toStringimpl(int[] iArr) {
        return k93.m("CenteredArray(data=", Arrays.toString(iArr), ")");
    }

    public boolean equals(Object obj) {
        return m6848equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m6852hashCodeimpl(this.data);
    }

    public String toString() {
        return m6854toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m6855unboximpl() {
        return this.data;
    }
}
