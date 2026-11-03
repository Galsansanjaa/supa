package androidx.compose.foundation.layout;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class GridFlow {
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

        /* renamed from: getColumn-ITJdzs4$annotations, reason: not valid java name */
        public static /* synthetic */ void m973getColumnITJdzs4$annotations() {
        }

        /* renamed from: getRow-ITJdzs4$annotations, reason: not valid java name */
        public static /* synthetic */ void m974getRowITJdzs4$annotations() {
        }

        /* renamed from: getColumn-ITJdzs4, reason: not valid java name */
        public final int m975getColumnITJdzs4() {
            return GridFlow.m967constructorimpl(1);
        }

        /* renamed from: getRow-ITJdzs4, reason: not valid java name */
        public final int m976getRowITJdzs4() {
            return GridFlow.m967constructorimpl(0);
        }
    }

    private /* synthetic */ GridFlow(int i) {
        this.bits = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridFlow m966boximpl(int i) {
        return new GridFlow(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m967constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m968equalsimpl(int i, Object obj) {
        return (obj instanceof GridFlow) && i == ((GridFlow) obj).m972unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m969equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m970hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m971toStringimpl(int i) {
        return m969equalsimpl0(i, m967constructorimpl(0)) ? "Row" : m969equalsimpl0(i, m967constructorimpl(1)) ? "Column" : sg3.o(i, "GridFlow(", ")");
    }

    public boolean equals(Object obj) {
        return m968equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return m970hashCodeimpl(this.bits);
    }

    public String toString() {
        return m971toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m972unboximpl() {
        return this.bits;
    }
}
