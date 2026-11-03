package androidx.compose.foundation.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlexWrap {
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

        /* renamed from: getNoWrap-7ziDAWk, reason: not valid java name */
        public final int m909getNoWrap7ziDAWk() {
            return FlexWrap.m903constructorimpl(0);
        }

        /* renamed from: getWrap-7ziDAWk, reason: not valid java name */
        public final int m910getWrap7ziDAWk() {
            return FlexWrap.m903constructorimpl(1);
        }

        /* renamed from: getWrapReverse-7ziDAWk, reason: not valid java name */
        public final int m911getWrapReverse7ziDAWk() {
            return FlexWrap.m903constructorimpl(2);
        }
    }

    private /* synthetic */ FlexWrap(int i) {
        this.bits = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexWrap m902boximpl(int i) {
        return new FlexWrap(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m903constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m904equalsimpl(int i, Object obj) {
        return (obj instanceof FlexWrap) && i == ((FlexWrap) obj).m908unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m905equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m906hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m907toStringimpl(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "INVALID" : "WrapReverse" : "Wrap" : "NoWrap";
    }

    public boolean equals(Object obj) {
        return m904equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return m906hashCodeimpl(this.bits);
    }

    public String toString() {
        return m907toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m908unboximpl() {
        return this.bits;
    }
}
