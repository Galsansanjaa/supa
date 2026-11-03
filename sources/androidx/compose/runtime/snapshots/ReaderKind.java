package androidx.compose.runtime.snapshots;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m4786getComposition6f8NoZ8() {
            return ReaderKind.m4777constructorimpl(1);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m4787getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m4777constructorimpl(2);
        }
    }

    private /* synthetic */ ReaderKind(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m4776boximpl(int i) {
        return new ReaderKind(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4777constructorimpl(int i) {
        return i;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m4778constructorimpl$default(int i, int i2, sb0 sb0Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m4777constructorimpl(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4779equalsimpl(int i, Object obj) {
        return (obj instanceof ReaderKind) && i == ((ReaderKind) obj).m4785unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4780equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4781hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m4782isReadInh_f27i8(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4783toStringimpl(int i) {
        return sg3.o(i, "ReaderKind(mask=", ")");
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m4784withReadIn3QSx2Dw(int i, int i2) {
        return m4777constructorimpl(i | i2);
    }

    public boolean equals(Object obj) {
        return m4779equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m4781hashCodeimpl(this.mask);
    }

    public String toString() {
        return m4783toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4785unboximpl() {
        return this.mask;
    }
}
