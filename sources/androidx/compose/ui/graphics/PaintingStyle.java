package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m5608constructorimpl(0);
    private static final int Stroke = m5608constructorimpl(1);
    private final int value;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m5614getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m5615getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }
    }

    private /* synthetic */ PaintingStyle(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m5607boximpl(int i) {
        return new PaintingStyle(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5608constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5609equalsimpl(int i, Object obj) {
        return (obj instanceof PaintingStyle) && i == ((PaintingStyle) obj).m5613unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5610equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5611hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5612toStringimpl(int i) {
        return m5610equalsimpl0(i, Fill) ? "Fill" : m5610equalsimpl0(i, Stroke) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5609equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5611hashCodeimpl(this.value);
    }

    public String toString() {
        return m5612toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5613unboximpl() {
        return this.value;
    }
}
