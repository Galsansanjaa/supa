package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m5631constructorimpl(0);
    private static final int Intersect = m5631constructorimpl(1);
    private static final int Union = m5631constructorimpl(2);
    private static final int Xor = m5631constructorimpl(3);
    private static final int ReverseDifference = m5631constructorimpl(4);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m5637getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m5638getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m5639getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m5640getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m5641getXorb3I0S0c() {
            return PathOperation.Xor;
        }
    }

    private /* synthetic */ PathOperation(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m5630boximpl(int i) {
        return new PathOperation(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5631constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5632equalsimpl(int i, Object obj) {
        return (obj instanceof PathOperation) && i == ((PathOperation) obj).m5636unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5633equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5634hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5635toStringimpl(int i) {
        return m5633equalsimpl0(i, Difference) ? "Difference" : m5633equalsimpl0(i, Intersect) ? "Intersect" : m5633equalsimpl0(i, Union) ? "Union" : m5633equalsimpl0(i, Xor) ? "Xor" : m5633equalsimpl0(i, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5632equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5634hashCodeimpl(this.value);
    }

    public String toString() {
        return m5635toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5636unboximpl() {
        return this.value;
    }
}
