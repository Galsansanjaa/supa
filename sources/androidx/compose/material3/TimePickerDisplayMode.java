package androidx.compose.material3;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TimePickerDisplayMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Picker = m3262constructorimpl(0);
    private static final int Input = m3262constructorimpl(1);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getInput--ONbchU, reason: not valid java name */
        public final int m3268getInputONbchU() {
            return TimePickerDisplayMode.Input;
        }

        /* renamed from: getPicker--ONbchU, reason: not valid java name */
        public final int m3269getPickerONbchU() {
            return TimePickerDisplayMode.Picker;
        }
    }

    private /* synthetic */ TimePickerDisplayMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimePickerDisplayMode m3261boximpl(int i) {
        return new TimePickerDisplayMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3262constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3263equalsimpl(int i, Object obj) {
        return (obj instanceof TimePickerDisplayMode) && i == ((TimePickerDisplayMode) obj).m3267unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3264equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3265hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3266toStringimpl(int i) {
        return m3264equalsimpl0(i, Picker) ? "Picker" : m3264equalsimpl0(i, Input) ? "Input" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m3263equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3265hashCodeimpl(this.value);
    }

    public String toString() {
        return m3266toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3267unboximpl() {
        return this.value;
    }
}
