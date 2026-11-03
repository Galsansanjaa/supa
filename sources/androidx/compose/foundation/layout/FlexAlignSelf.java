package androidx.compose.foundation.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlexAlignSelf {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAuto-_ov7Qcc, reason: not valid java name */
        public final int m836getAuto_ov7Qcc() {
            return FlexAlignSelf.m830constructorimpl(0);
        }

        /* renamed from: getBaseline-_ov7Qcc, reason: not valid java name */
        public final int m837getBaseline_ov7Qcc() {
            return FlexAlignSelf.m830constructorimpl(5);
        }

        /* renamed from: getCenter-_ov7Qcc, reason: not valid java name */
        public final int m838getCenter_ov7Qcc() {
            return FlexAlignSelf.m830constructorimpl(3);
        }

        /* renamed from: getEnd-_ov7Qcc, reason: not valid java name */
        public final int m839getEnd_ov7Qcc() {
            return FlexAlignSelf.m830constructorimpl(2);
        }

        /* renamed from: getStart-_ov7Qcc, reason: not valid java name */
        public final int m840getStart_ov7Qcc() {
            return FlexAlignSelf.m830constructorimpl(1);
        }

        /* renamed from: getStretch-_ov7Qcc, reason: not valid java name */
        public final int m841getStretch_ov7Qcc() {
            return FlexAlignSelf.m830constructorimpl(4);
        }
    }

    private /* synthetic */ FlexAlignSelf(int i) {
        this.bits = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexAlignSelf m829boximpl(int i) {
        return new FlexAlignSelf(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m830constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m831equalsimpl(int i, Object obj) {
        return (obj instanceof FlexAlignSelf) && i == ((FlexAlignSelf) obj).m835unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m832equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m833hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m834toStringimpl(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "INVALID" : "Baseline" : "Stretch" : "Center" : "End" : "Start" : "Auto";
    }

    public boolean equals(Object obj) {
        return m831equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return m833hashCodeimpl(this.bits);
    }

    public String toString() {
        return m834toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m835unboximpl() {
        return this.bits;
    }
}
