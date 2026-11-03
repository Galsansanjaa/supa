package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class StrokeCap {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Butt = m5699constructorimpl(0);
    private static final int Round = m5699constructorimpl(1);
    private static final int Square = m5699constructorimpl(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getButt-KaPHkGw, reason: not valid java name */
        public final int m5705getButtKaPHkGw() {
            return StrokeCap.Butt;
        }

        /* renamed from: getRound-KaPHkGw, reason: not valid java name */
        public final int m5706getRoundKaPHkGw() {
            return StrokeCap.Round;
        }

        /* renamed from: getSquare-KaPHkGw, reason: not valid java name */
        public final int m5707getSquareKaPHkGw() {
            return StrokeCap.Square;
        }
    }

    private /* synthetic */ StrokeCap(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StrokeCap m5698boximpl(int i) {
        return new StrokeCap(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5699constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5700equalsimpl(int i, Object obj) {
        return (obj instanceof StrokeCap) && i == ((StrokeCap) obj).m5704unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5701equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5702hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5703toStringimpl(int i) {
        return m5701equalsimpl0(i, Butt) ? "Butt" : m5701equalsimpl0(i, Round) ? "Round" : m5701equalsimpl0(i, Square) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5700equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5702hashCodeimpl(this.value);
    }

    public String toString() {
        return m5703toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5704unboximpl() {
        return this.value;
    }
}
