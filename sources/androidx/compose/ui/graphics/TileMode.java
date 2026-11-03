package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = m5720constructorimpl(0);
    private static final int Repeated = m5720constructorimpl(1);
    private static final int Mirror = m5720constructorimpl(2);
    private static final int Decal = m5720constructorimpl(3);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m5726getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m5727getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m5728getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m5729getRepeated3opZhB0() {
            return TileMode.Repeated;
        }
    }

    private /* synthetic */ TileMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m5719boximpl(int i) {
        return new TileMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5720constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5721equalsimpl(int i, Object obj) {
        return (obj instanceof TileMode) && i == ((TileMode) obj).m5725unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5722equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5723hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5724toStringimpl(int i) {
        return m5722equalsimpl0(i, Clamp) ? "Clamp" : m5722equalsimpl0(i, Repeated) ? "Repeated" : m5722equalsimpl0(i, Mirror) ? "Mirror" : m5722equalsimpl0(i, Decal) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5721equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5723hashCodeimpl(this.value);
    }

    public String toString() {
        return m5724toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5725unboximpl() {
        return this.value;
    }
}
