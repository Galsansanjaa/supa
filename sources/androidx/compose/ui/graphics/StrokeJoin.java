package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class StrokeJoin {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Miter = m5709constructorimpl(0);
    private static final int Round = m5709constructorimpl(1);
    private static final int Bevel = m5709constructorimpl(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getBevel-LxFBmk8, reason: not valid java name */
        public final int m5715getBevelLxFBmk8() {
            return StrokeJoin.Bevel;
        }

        /* renamed from: getMiter-LxFBmk8, reason: not valid java name */
        public final int m5716getMiterLxFBmk8() {
            return StrokeJoin.Miter;
        }

        /* renamed from: getRound-LxFBmk8, reason: not valid java name */
        public final int m5717getRoundLxFBmk8() {
            return StrokeJoin.Round;
        }
    }

    private /* synthetic */ StrokeJoin(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeJoin m5708boximpl(int i) {
        return new StrokeJoin(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5709constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5710equalsimpl(int i, Object obj) {
        return (obj instanceof StrokeJoin) && i == ((StrokeJoin) obj).m5714unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5711equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5712hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5713toStringimpl(int i) {
        return m5711equalsimpl0(i, Miter) ? "Miter" : m5711equalsimpl0(i, Round) ? "Round" : m5711equalsimpl0(i, Bevel) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5710equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5712hashCodeimpl(this.value);
    }

    public String toString() {
        return m5713toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5714unboximpl() {
        return this.value;
    }
}
