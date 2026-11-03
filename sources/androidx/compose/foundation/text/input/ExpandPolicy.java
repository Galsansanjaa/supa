package androidx.compose.foundation.text.input;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ExpandPolicy {
    private static final int FLAG_EXPAND_END = 2;
    private static final int FLAG_EXPAND_START = 1;
    private final int flag;
    public static final Companion Companion = new Companion(null);
    private static final int InsideOnly = m1709constructorimpl(0);
    private static final int AtStart = m1709constructorimpl(1);
    private static final int AtEnd = m1709constructorimpl(2);
    private static final int AtBoth = m1709constructorimpl(3);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAtBoth-RfBwNNI, reason: not valid java name */
        public final int m1718getAtBothRfBwNNI() {
            return ExpandPolicy.AtBoth;
        }

        /* renamed from: getAtEnd-RfBwNNI, reason: not valid java name */
        public final int m1719getAtEndRfBwNNI() {
            return ExpandPolicy.AtEnd;
        }

        /* renamed from: getAtStart-RfBwNNI, reason: not valid java name */
        public final int m1720getAtStartRfBwNNI() {
            return ExpandPolicy.AtStart;
        }

        /* renamed from: getInsideOnly-RfBwNNI, reason: not valid java name */
        public final int m1721getInsideOnlyRfBwNNI() {
            return ExpandPolicy.InsideOnly;
        }
    }

    private /* synthetic */ ExpandPolicy(int i) {
        this.flag = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ExpandPolicy m1708boximpl(int i) {
        return new ExpandPolicy(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1709constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m1710constructorimpl(boolean z, boolean z2) {
        return m1709constructorimpl((z ? 1 : 0) | (z2 ? 2 : 0));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1711equalsimpl(int i, Object obj) {
        return (obj instanceof ExpandPolicy) && i == ((ExpandPolicy) obj).m1717unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1712equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getEndExpands-impl$foundation, reason: not valid java name */
    public static final boolean m1713getEndExpandsimpl$foundation(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: getStartExpands-impl$foundation, reason: not valid java name */
    public static final boolean m1714getStartExpandsimpl$foundation(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1715hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1716toStringimpl(int i) {
        return sg3.o(i, "ExpandPolicy(flag=", ")");
    }

    public boolean equals(Object obj) {
        return m1711equalsimpl(this.flag, obj);
    }

    public int hashCode() {
        return m1715hashCodeimpl(this.flag);
    }

    public String toString() {
        return m1716toStringimpl(this.flag);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1717unboximpl() {
        return this.flag;
    }
}
