package androidx.compose.ui.graphics.colorspace;

import androidx.exifinterface.media.ExifInterface;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class RenderIntent {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Perceptual = m5784constructorimpl(0);
    private static final int Relative = m5784constructorimpl(1);
    private static final int Saturation = m5784constructorimpl(2);
    private static final int Absolute = m5784constructorimpl(3);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getAbsolute-uksYyKA, reason: not valid java name */
        public final int m5790getAbsoluteuksYyKA() {
            return RenderIntent.Absolute;
        }

        /* renamed from: getPerceptual-uksYyKA, reason: not valid java name */
        public final int m5791getPerceptualuksYyKA() {
            return RenderIntent.Perceptual;
        }

        /* renamed from: getRelative-uksYyKA, reason: not valid java name */
        public final int m5792getRelativeuksYyKA() {
            return RenderIntent.Relative;
        }

        /* renamed from: getSaturation-uksYyKA, reason: not valid java name */
        public final int m5793getSaturationuksYyKA() {
            return RenderIntent.Saturation;
        }
    }

    private /* synthetic */ RenderIntent(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RenderIntent m5783boximpl(int i) {
        return new RenderIntent(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5784constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5785equalsimpl(int i, Object obj) {
        return (obj instanceof RenderIntent) && i == ((RenderIntent) obj).m5789unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5786equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5787hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5788toStringimpl(int i) {
        return m5786equalsimpl0(i, Perceptual) ? "Perceptual" : m5786equalsimpl0(i, Relative) ? "Relative" : m5786equalsimpl0(i, Saturation) ? ExifInterface.TAG_SATURATION : m5786equalsimpl0(i, Absolute) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5785equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5787hashCodeimpl(this.value);
    }

    public String toString() {
        return m5788toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5789unboximpl() {
        return this.value;
    }
}
