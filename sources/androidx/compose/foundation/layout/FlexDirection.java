package androidx.compose.foundation.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlexDirection {
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

        /* renamed from: getColumn-T4wFHC8, reason: not valid java name */
        public final int m885getColumnT4wFHC8() {
            return FlexDirection.m879constructorimpl(1);
        }

        /* renamed from: getColumnReverse-T4wFHC8, reason: not valid java name */
        public final int m886getColumnReverseT4wFHC8() {
            return FlexDirection.m879constructorimpl(3);
        }

        /* renamed from: getRow-T4wFHC8, reason: not valid java name */
        public final int m887getRowT4wFHC8() {
            return FlexDirection.m879constructorimpl(0);
        }

        /* renamed from: getRowReverse-T4wFHC8, reason: not valid java name */
        public final int m888getRowReverseT4wFHC8() {
            return FlexDirection.m879constructorimpl(2);
        }
    }

    private /* synthetic */ FlexDirection(int i) {
        this.bits = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexDirection m878boximpl(int i) {
        return new FlexDirection(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m879constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m880equalsimpl(int i, Object obj) {
        return (obj instanceof FlexDirection) && i == ((FlexDirection) obj).m884unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m881equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m882hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m883toStringimpl(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "INVALID" : "ColumnReverse" : "RowReverse" : "Column" : "Row";
    }

    public boolean equals(Object obj) {
        return m880equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return m882hashCodeimpl(this.bits);
    }

    public String toString() {
        return m883toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m884unboximpl() {
        return this.bits;
    }
}
