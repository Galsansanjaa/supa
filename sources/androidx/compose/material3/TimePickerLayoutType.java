package androidx.compose.material3;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TimePickerLayoutType {
    public static final Companion Companion = new Companion(null);
    private static final int Horizontal = m3285constructorimpl(0);
    private static final int Vertical = m3285constructorimpl(1);
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getHorizontal-QJTpgSE, reason: not valid java name */
        public final int m3291getHorizontalQJTpgSE() {
            return TimePickerLayoutType.Horizontal;
        }

        /* renamed from: getVertical-QJTpgSE, reason: not valid java name */
        public final int m3292getVerticalQJTpgSE() {
            return TimePickerLayoutType.Vertical;
        }
    }

    private /* synthetic */ TimePickerLayoutType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerLayoutType m3284boximpl(int i) {
        return new TimePickerLayoutType(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3285constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3286equalsimpl(int i, Object obj) {
        return (obj instanceof TimePickerLayoutType) && i == ((TimePickerLayoutType) obj).m3290unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3287equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3288hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3289toStringimpl(int i) {
        return m3287equalsimpl0(i, Horizontal) ? "Horizontal" : m3287equalsimpl0(i, Vertical) ? "Vertical" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m3286equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3288hashCodeimpl(this.value);
    }

    public String toString() {
        return m3289toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3290unboximpl() {
        return this.value;
    }
}
