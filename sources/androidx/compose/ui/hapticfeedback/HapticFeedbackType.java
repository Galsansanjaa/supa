package androidx.compose.ui.hapticfeedback;

import defpackage.nb0;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m6048getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6061getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m6049getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6062getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m6050getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6063getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m6051getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6064getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
        public final int m6052getKeyboardTap5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6065getKeyboardTap5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m6053getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6066getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m6054getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6067getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m6055getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6068getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m6056getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6069getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m6057getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6070getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m6058getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6071getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m6059getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6072getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m6060getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m6073getVirtualKey5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return nb0.D(HapticFeedbackType.m6041boximpl(m6048getConfirm5zf0vsI()), HapticFeedbackType.m6041boximpl(m6049getContextClick5zf0vsI()), HapticFeedbackType.m6041boximpl(m6050getGestureEnd5zf0vsI()), HapticFeedbackType.m6041boximpl(m6051getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m6041boximpl(m6052getKeyboardTap5zf0vsI()), HapticFeedbackType.m6041boximpl(m6053getLongPress5zf0vsI()), HapticFeedbackType.m6041boximpl(m6054getReject5zf0vsI()), HapticFeedbackType.m6041boximpl(m6055getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m6041boximpl(m6056getSegmentTick5zf0vsI()), HapticFeedbackType.m6041boximpl(m6057getTextHandleMove5zf0vsI()), HapticFeedbackType.m6041boximpl(m6058getToggleOff5zf0vsI()), HapticFeedbackType.m6041boximpl(m6059getToggleOn5zf0vsI()), HapticFeedbackType.m6041boximpl(m6060getVirtualKey5zf0vsI()));
        }
    }

    private /* synthetic */ HapticFeedbackType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m6041boximpl(int i) {
        return new HapticFeedbackType(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6042constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6043equalsimpl(int i, Object obj) {
        return (obj instanceof HapticFeedbackType) && i == ((HapticFeedbackType) obj).m6047unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6044equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6045hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6046toStringimpl(int i) {
        Companion companion = Companion;
        return m6044equalsimpl0(i, companion.m6048getConfirm5zf0vsI()) ? "Confirm" : m6044equalsimpl0(i, companion.m6049getContextClick5zf0vsI()) ? "ContextClick" : m6044equalsimpl0(i, companion.m6050getGestureEnd5zf0vsI()) ? "GestureEnd" : m6044equalsimpl0(i, companion.m6051getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m6044equalsimpl0(i, companion.m6052getKeyboardTap5zf0vsI()) ? "KeyboardTap" : m6044equalsimpl0(i, companion.m6053getLongPress5zf0vsI()) ? "LongPress" : m6044equalsimpl0(i, companion.m6054getReject5zf0vsI()) ? "Reject" : m6044equalsimpl0(i, companion.m6055getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m6044equalsimpl0(i, companion.m6056getSegmentTick5zf0vsI()) ? "SegmentTick" : m6044equalsimpl0(i, companion.m6057getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m6044equalsimpl0(i, companion.m6058getToggleOff5zf0vsI()) ? "ToggleOff" : m6044equalsimpl0(i, companion.m6059getToggleOn5zf0vsI()) ? "ToggleOn" : m6044equalsimpl0(i, companion.m6060getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6043equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6045hashCodeimpl(this.value);
    }

    public String toString() {
        return m6046toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6047unboximpl() {
        return this.value;
    }
}
