package androidx.compose.ui.graphics;

import androidx.exifinterface.media.ExifInterface;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class BlendMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clear = m5245constructorimpl(0);
    private static final int Src = m5245constructorimpl(1);
    private static final int Dst = m5245constructorimpl(2);
    private static final int SrcOver = m5245constructorimpl(3);
    private static final int DstOver = m5245constructorimpl(4);
    private static final int SrcIn = m5245constructorimpl(5);
    private static final int DstIn = m5245constructorimpl(6);
    private static final int SrcOut = m5245constructorimpl(7);
    private static final int DstOut = m5245constructorimpl(8);
    private static final int SrcAtop = m5245constructorimpl(9);
    private static final int DstAtop = m5245constructorimpl(10);
    private static final int Xor = m5245constructorimpl(11);
    private static final int Plus = m5245constructorimpl(12);
    private static final int Modulate = m5245constructorimpl(13);
    private static final int Screen = m5245constructorimpl(14);
    private static final int Overlay = m5245constructorimpl(15);
    private static final int Darken = m5245constructorimpl(16);
    private static final int Lighten = m5245constructorimpl(17);
    private static final int ColorDodge = m5245constructorimpl(18);
    private static final int ColorBurn = m5245constructorimpl(19);
    private static final int Hardlight = m5245constructorimpl(20);
    private static final int Softlight = m5245constructorimpl(21);
    private static final int Difference = m5245constructorimpl(22);
    private static final int Exclusion = m5245constructorimpl(23);
    private static final int Multiply = m5245constructorimpl(24);
    private static final int Hue = m5245constructorimpl(25);
    private static final int Saturation = m5245constructorimpl(26);
    private static final int Color = m5245constructorimpl(27);
    private static final int Luminosity = m5245constructorimpl(28);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m5251getClear0nO6VwU() {
            return BlendMode.Clear;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m5252getColor0nO6VwU() {
            return BlendMode.Color;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m5253getColorBurn0nO6VwU() {
            return BlendMode.ColorBurn;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m5254getColorDodge0nO6VwU() {
            return BlendMode.ColorDodge;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m5255getDarken0nO6VwU() {
            return BlendMode.Darken;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m5256getDifference0nO6VwU() {
            return BlendMode.Difference;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m5257getDst0nO6VwU() {
            return BlendMode.Dst;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m5258getDstAtop0nO6VwU() {
            return BlendMode.DstAtop;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m5259getDstIn0nO6VwU() {
            return BlendMode.DstIn;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m5260getDstOut0nO6VwU() {
            return BlendMode.DstOut;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m5261getDstOver0nO6VwU() {
            return BlendMode.DstOver;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m5262getExclusion0nO6VwU() {
            return BlendMode.Exclusion;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m5263getHardlight0nO6VwU() {
            return BlendMode.Hardlight;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m5264getHue0nO6VwU() {
            return BlendMode.Hue;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m5265getLighten0nO6VwU() {
            return BlendMode.Lighten;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m5266getLuminosity0nO6VwU() {
            return BlendMode.Luminosity;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m5267getModulate0nO6VwU() {
            return BlendMode.Modulate;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m5268getMultiply0nO6VwU() {
            return BlendMode.Multiply;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m5269getOverlay0nO6VwU() {
            return BlendMode.Overlay;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m5270getPlus0nO6VwU() {
            return BlendMode.Plus;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m5271getSaturation0nO6VwU() {
            return BlendMode.Saturation;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m5272getScreen0nO6VwU() {
            return BlendMode.Screen;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m5273getSoftlight0nO6VwU() {
            return BlendMode.Softlight;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m5274getSrc0nO6VwU() {
            return BlendMode.Src;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m5275getSrcAtop0nO6VwU() {
            return BlendMode.SrcAtop;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m5276getSrcIn0nO6VwU() {
            return BlendMode.SrcIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m5277getSrcOut0nO6VwU() {
            return BlendMode.SrcOut;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m5278getSrcOver0nO6VwU() {
            return BlendMode.SrcOver;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m5279getXor0nO6VwU() {
            return BlendMode.Xor;
        }
    }

    private /* synthetic */ BlendMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m5244boximpl(int i) {
        return new BlendMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5245constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5246equalsimpl(int i, Object obj) {
        return (obj instanceof BlendMode) && i == ((BlendMode) obj).m5250unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5247equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5248hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5249toStringimpl(int i) {
        return m5247equalsimpl0(i, Clear) ? "Clear" : m5247equalsimpl0(i, Src) ? "Src" : m5247equalsimpl0(i, Dst) ? "Dst" : m5247equalsimpl0(i, SrcOver) ? "SrcOver" : m5247equalsimpl0(i, DstOver) ? "DstOver" : m5247equalsimpl0(i, SrcIn) ? "SrcIn" : m5247equalsimpl0(i, DstIn) ? "DstIn" : m5247equalsimpl0(i, SrcOut) ? "SrcOut" : m5247equalsimpl0(i, DstOut) ? "DstOut" : m5247equalsimpl0(i, SrcAtop) ? "SrcAtop" : m5247equalsimpl0(i, DstAtop) ? "DstAtop" : m5247equalsimpl0(i, Xor) ? "Xor" : m5247equalsimpl0(i, Plus) ? "Plus" : m5247equalsimpl0(i, Modulate) ? "Modulate" : m5247equalsimpl0(i, Screen) ? "Screen" : m5247equalsimpl0(i, Overlay) ? "Overlay" : m5247equalsimpl0(i, Darken) ? "Darken" : m5247equalsimpl0(i, Lighten) ? "Lighten" : m5247equalsimpl0(i, ColorDodge) ? "ColorDodge" : m5247equalsimpl0(i, ColorBurn) ? "ColorBurn" : m5247equalsimpl0(i, Hardlight) ? "HardLight" : m5247equalsimpl0(i, Softlight) ? "Softlight" : m5247equalsimpl0(i, Difference) ? "Difference" : m5247equalsimpl0(i, Exclusion) ? "Exclusion" : m5247equalsimpl0(i, Multiply) ? "Multiply" : m5247equalsimpl0(i, Hue) ? "Hue" : m5247equalsimpl0(i, Saturation) ? ExifInterface.TAG_SATURATION : m5247equalsimpl0(i, Color) ? "Color" : m5247equalsimpl0(i, Luminosity) ? "Luminosity" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5246equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5248hashCodeimpl(this.value);
    }

    public String toString() {
        return m5249toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5250unboximpl() {
        return this.value;
    }
}
