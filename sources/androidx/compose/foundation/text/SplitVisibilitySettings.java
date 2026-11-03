package androidx.compose.foundation.text;

import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SplitVisibilitySettings {
    private final int value;

    private /* synthetic */ SplitVisibilitySettings(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SplitVisibilitySettings m1629boximpl(int i) {
        return new SplitVisibilitySettings(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1630constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1631constructorimpl(boolean z, boolean z2) {
        return m1630constructorimpl((z ? 1 : 0) | (z2 ? 2 : 0));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1632equalsimpl(int i, Object obj) {
        return (obj instanceof SplitVisibilitySettings) && i == ((SplitVisibilitySettings) obj).m1638unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1633equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getPhysical-impl, reason: not valid java name */
    public static final boolean m1634getPhysicalimpl(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: getTouch-impl, reason: not valid java name */
    public static final boolean m1635getTouchimpl(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1636hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1637toStringimpl(int i) {
        return sg3.o(i, "SplitVisibilitySettings(value=", ")");
    }

    public boolean equals(Object obj) {
        return m1632equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m1636hashCodeimpl(this.value);
    }

    public String toString() {
        return m1637toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1638unboximpl() {
        return this.value;
    }
}
