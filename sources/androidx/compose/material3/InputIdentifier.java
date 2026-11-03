package androidx.compose.material3;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class InputIdentifier {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int SingleDateInput = m2702constructorimpl(0);
    private static final int StartDateInput = m2702constructorimpl(1);
    private static final int EndDateInput = m2702constructorimpl(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getEndDateInput-J2x2o4M, reason: not valid java name */
        public final int m2708getEndDateInputJ2x2o4M() {
            return InputIdentifier.EndDateInput;
        }

        /* renamed from: getSingleDateInput-J2x2o4M, reason: not valid java name */
        public final int m2709getSingleDateInputJ2x2o4M() {
            return InputIdentifier.SingleDateInput;
        }

        /* renamed from: getStartDateInput-J2x2o4M, reason: not valid java name */
        public final int m2710getStartDateInputJ2x2o4M() {
            return InputIdentifier.StartDateInput;
        }
    }

    private /* synthetic */ InputIdentifier(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InputIdentifier m2701boximpl(int i) {
        return new InputIdentifier(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2702constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2703equalsimpl(int i, Object obj) {
        return (obj instanceof InputIdentifier) && i == ((InputIdentifier) obj).m2707unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2704equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2705hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2706toStringimpl(int i) {
        return m2704equalsimpl0(i, SingleDateInput) ? "SingleDateInput" : m2704equalsimpl0(i, StartDateInput) ? "StartDateInput" : m2704equalsimpl0(i, EndDateInput) ? "EndDateInput" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m2703equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2705hashCodeimpl(this.value);
    }

    public String toString() {
        return m2706toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2707unboximpl() {
        return this.value;
    }
}
