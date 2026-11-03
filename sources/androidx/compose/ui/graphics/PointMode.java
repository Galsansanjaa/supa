package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = m5644constructorimpl(0);
    private static final int Lines = m5644constructorimpl(1);
    private static final int Polygon = m5644constructorimpl(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m5650getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m5651getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m5652getPolygonr_lszbg() {
            return PointMode.Polygon;
        }
    }

    private /* synthetic */ PointMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m5643boximpl(int i) {
        return new PointMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5644constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5645equalsimpl(int i, Object obj) {
        return (obj instanceof PointMode) && i == ((PointMode) obj).m5649unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5646equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5647hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5648toStringimpl(int i) {
        return m5646equalsimpl0(i, Points) ? "Points" : m5646equalsimpl0(i, Lines) ? "Lines" : m5646equalsimpl0(i, Polygon) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5645equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5647hashCodeimpl(this.value);
    }

    public String toString() {
        return m5648toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5649unboximpl() {
        return this.value;
    }
}
