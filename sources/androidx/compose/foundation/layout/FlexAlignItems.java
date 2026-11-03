package androidx.compose.foundation.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlexAlignItems {
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

        /* renamed from: getBaseline-20X20zU, reason: not valid java name */
        public final int m824getBaseline20X20zU() {
            return FlexAlignItems.m818constructorimpl(4);
        }

        /* renamed from: getCenter-20X20zU, reason: not valid java name */
        public final int m825getCenter20X20zU() {
            return FlexAlignItems.m818constructorimpl(2);
        }

        /* renamed from: getEnd-20X20zU, reason: not valid java name */
        public final int m826getEnd20X20zU() {
            return FlexAlignItems.m818constructorimpl(1);
        }

        /* renamed from: getStart-20X20zU, reason: not valid java name */
        public final int m827getStart20X20zU() {
            return FlexAlignItems.m818constructorimpl(0);
        }

        /* renamed from: getStretch-20X20zU, reason: not valid java name */
        public final int m828getStretch20X20zU() {
            return FlexAlignItems.m818constructorimpl(3);
        }
    }

    private /* synthetic */ FlexAlignItems(int i) {
        this.bits = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexAlignItems m817boximpl(int i) {
        return new FlexAlignItems(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m818constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m819equalsimpl(int i, Object obj) {
        return (obj instanceof FlexAlignItems) && i == ((FlexAlignItems) obj).m823unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m820equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m821hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m822toStringimpl(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "INVALID" : "Baseline" : "Stretch" : "Center" : "End" : "Start";
    }

    public boolean equals(Object obj) {
        return m819equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return m821hashCodeimpl(this.bits);
    }

    public String toString() {
        return m822toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m823unboximpl() {
        return this.bits;
    }
}
