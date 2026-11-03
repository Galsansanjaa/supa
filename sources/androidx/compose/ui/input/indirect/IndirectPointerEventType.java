package androidx.compose.ui.input.indirect;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IndirectPointerEventType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unknown = m6103constructorimpl(0);
    private static final int Press = m6103constructorimpl(1);
    private static final int Release = m6103constructorimpl(2);
    private static final int Move = m6103constructorimpl(3);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getMove-4ZHQPSE, reason: not valid java name */
        public final int m6109getMove4ZHQPSE() {
            return IndirectPointerEventType.Move;
        }

        /* renamed from: getPress-4ZHQPSE, reason: not valid java name */
        public final int m6110getPress4ZHQPSE() {
            return IndirectPointerEventType.Press;
        }

        /* renamed from: getRelease-4ZHQPSE, reason: not valid java name */
        public final int m6111getRelease4ZHQPSE() {
            return IndirectPointerEventType.Release;
        }

        /* renamed from: getUnknown-4ZHQPSE, reason: not valid java name */
        public final int m6112getUnknown4ZHQPSE() {
            return IndirectPointerEventType.Unknown;
        }
    }

    private /* synthetic */ IndirectPointerEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectPointerEventType m6102boximpl(int i) {
        return new IndirectPointerEventType(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m6103constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6104equalsimpl(int i, Object obj) {
        return (obj instanceof IndirectPointerEventType) && i == ((IndirectPointerEventType) obj).m6108unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6105equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6106hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6107toStringimpl(int i) {
        return m6105equalsimpl0(i, Press) ? "Press" : m6105equalsimpl0(i, Release) ? "Release" : m6105equalsimpl0(i, Move) ? "Move" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m6104equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6106hashCodeimpl(this.value);
    }

    public String toString() {
        return m6107toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6108unboximpl() {
        return this.value;
    }
}
