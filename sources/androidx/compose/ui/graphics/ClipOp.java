package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ClipOp {
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m5314constructorimpl(0);
    private static final int Intersect = m5314constructorimpl(1);
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m5320getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m5321getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }
    }

    private /* synthetic */ ClipOp(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m5313boximpl(int i) {
        return new ClipOp(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5314constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5315equalsimpl(int i, Object obj) {
        return (obj instanceof ClipOp) && i == ((ClipOp) obj).m5319unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5316equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5317hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5318toStringimpl(int i) {
        return m5316equalsimpl0(i, Difference) ? "Difference" : m5316equalsimpl0(i, Intersect) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5315equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5317hashCodeimpl(this.value);
    }

    public String toString() {
        return m5318toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5319unboximpl() {
        return this.value;
    }
}
