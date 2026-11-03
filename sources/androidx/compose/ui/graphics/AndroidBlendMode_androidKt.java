package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import android.os.Build;
import androidx.compose.ui.graphics.BlendMode;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.hu2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidBlendMode_androidKt {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            android.graphics.BlendMode blendMode;
            android.graphics.BlendMode blendMode2;
            android.graphics.BlendMode blendMode3;
            android.graphics.BlendMode blendMode4;
            android.graphics.BlendMode blendMode5;
            android.graphics.BlendMode blendMode6;
            android.graphics.BlendMode blendMode7;
            android.graphics.BlendMode blendMode8;
            android.graphics.BlendMode blendMode9;
            android.graphics.BlendMode blendMode10;
            android.graphics.BlendMode blendMode11;
            android.graphics.BlendMode blendMode12;
            android.graphics.BlendMode blendMode13;
            android.graphics.BlendMode blendMode14;
            android.graphics.BlendMode blendMode15;
            android.graphics.BlendMode blendMode16;
            android.graphics.BlendMode blendMode17;
            android.graphics.BlendMode blendMode18;
            android.graphics.BlendMode blendMode19;
            android.graphics.BlendMode blendMode20;
            android.graphics.BlendMode blendMode21;
            android.graphics.BlendMode blendMode22;
            android.graphics.BlendMode blendMode23;
            android.graphics.BlendMode blendMode24;
            android.graphics.BlendMode blendMode25;
            android.graphics.BlendMode blendMode26;
            android.graphics.BlendMode blendMode27;
            android.graphics.BlendMode blendMode28;
            android.graphics.BlendMode blendMode29;
            int[] iArr = new int[android.graphics.BlendMode.values().length];
            try {
                blendMode29 = android.graphics.BlendMode.CLEAR;
                iArr[blendMode29.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                blendMode28 = android.graphics.BlendMode.SRC;
                iArr[blendMode28.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                blendMode27 = android.graphics.BlendMode.DST;
                iArr[blendMode27.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                blendMode26 = android.graphics.BlendMode.SRC_OVER;
                iArr[blendMode26.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                blendMode25 = android.graphics.BlendMode.DST_OVER;
                iArr[blendMode25.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                blendMode24 = android.graphics.BlendMode.SRC_IN;
                iArr[blendMode24.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                blendMode23 = android.graphics.BlendMode.DST_IN;
                iArr[blendMode23.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                blendMode22 = android.graphics.BlendMode.SRC_OUT;
                iArr[blendMode22.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                blendMode21 = android.graphics.BlendMode.DST_OUT;
                iArr[blendMode21.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                blendMode20 = android.graphics.BlendMode.SRC_ATOP;
                iArr[blendMode20.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                blendMode19 = android.graphics.BlendMode.DST_ATOP;
                iArr[blendMode19.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                blendMode18 = android.graphics.BlendMode.XOR;
                iArr[blendMode18.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                blendMode17 = android.graphics.BlendMode.PLUS;
                iArr[blendMode17.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                blendMode16 = android.graphics.BlendMode.MODULATE;
                iArr[blendMode16.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                blendMode15 = android.graphics.BlendMode.SCREEN;
                iArr[blendMode15.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                blendMode14 = android.graphics.BlendMode.OVERLAY;
                iArr[blendMode14.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                blendMode13 = android.graphics.BlendMode.DARKEN;
                iArr[blendMode13.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                blendMode12 = android.graphics.BlendMode.LIGHTEN;
                iArr[blendMode12.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                blendMode11 = android.graphics.BlendMode.COLOR_DODGE;
                iArr[blendMode11.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                blendMode10 = android.graphics.BlendMode.COLOR_BURN;
                iArr[blendMode10.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                blendMode9 = android.graphics.BlendMode.HARD_LIGHT;
                iArr[blendMode9.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                blendMode8 = android.graphics.BlendMode.SOFT_LIGHT;
                iArr[blendMode8.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                blendMode7 = android.graphics.BlendMode.DIFFERENCE;
                iArr[blendMode7.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                blendMode6 = android.graphics.BlendMode.EXCLUSION;
                iArr[blendMode6.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                blendMode5 = android.graphics.BlendMode.MULTIPLY;
                iArr[blendMode5.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                blendMode4 = android.graphics.BlendMode.HUE;
                iArr[blendMode4.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                blendMode3 = android.graphics.BlendMode.SATURATION;
                iArr[blendMode3.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                blendMode2 = android.graphics.BlendMode.COLOR;
                iArr[blendMode2.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                blendMode = android.graphics.BlendMode.LUMINOSITY;
                iArr[blendMode.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m5181isSupporteds9anfk8(int i) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m5247equalsimpl0(i, BlendMode.Companion.m5278getSrcOver0nO6VwU()) || m5183toPorterDuffModes9anfk8(i) != PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m5182toAndroidBlendModes9anfk8(int i) {
        android.graphics.BlendMode blendMode;
        android.graphics.BlendMode blendMode2;
        android.graphics.BlendMode blendMode3;
        android.graphics.BlendMode blendMode4;
        android.graphics.BlendMode blendMode5;
        android.graphics.BlendMode blendMode6;
        android.graphics.BlendMode blendMode7;
        android.graphics.BlendMode blendMode8;
        android.graphics.BlendMode blendMode9;
        android.graphics.BlendMode blendMode10;
        android.graphics.BlendMode blendMode11;
        android.graphics.BlendMode blendMode12;
        android.graphics.BlendMode blendMode13;
        android.graphics.BlendMode blendMode14;
        android.graphics.BlendMode blendMode15;
        android.graphics.BlendMode blendMode16;
        android.graphics.BlendMode blendMode17;
        android.graphics.BlendMode blendMode18;
        android.graphics.BlendMode blendMode19;
        android.graphics.BlendMode blendMode20;
        android.graphics.BlendMode blendMode21;
        android.graphics.BlendMode blendMode22;
        android.graphics.BlendMode blendMode23;
        android.graphics.BlendMode blendMode24;
        android.graphics.BlendMode blendMode25;
        android.graphics.BlendMode blendMode26;
        android.graphics.BlendMode blendMode27;
        android.graphics.BlendMode blendMode28;
        android.graphics.BlendMode blendMode29;
        android.graphics.BlendMode blendMode30;
        BlendMode.Companion companion = BlendMode.Companion;
        if (BlendMode.m5247equalsimpl0(i, companion.m5251getClear0nO6VwU())) {
            blendMode30 = android.graphics.BlendMode.CLEAR;
            return blendMode30;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5274getSrc0nO6VwU())) {
            blendMode29 = android.graphics.BlendMode.SRC;
            return blendMode29;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5257getDst0nO6VwU())) {
            blendMode28 = android.graphics.BlendMode.DST;
            return blendMode28;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5278getSrcOver0nO6VwU())) {
            blendMode27 = android.graphics.BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5261getDstOver0nO6VwU())) {
            blendMode26 = android.graphics.BlendMode.DST_OVER;
            return blendMode26;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5276getSrcIn0nO6VwU())) {
            blendMode25 = android.graphics.BlendMode.SRC_IN;
            return blendMode25;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5259getDstIn0nO6VwU())) {
            blendMode24 = android.graphics.BlendMode.DST_IN;
            return blendMode24;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5277getSrcOut0nO6VwU())) {
            blendMode23 = android.graphics.BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5260getDstOut0nO6VwU())) {
            blendMode22 = android.graphics.BlendMode.DST_OUT;
            return blendMode22;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5275getSrcAtop0nO6VwU())) {
            blendMode21 = android.graphics.BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5258getDstAtop0nO6VwU())) {
            blendMode20 = android.graphics.BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5279getXor0nO6VwU())) {
            blendMode19 = android.graphics.BlendMode.XOR;
            return blendMode19;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5270getPlus0nO6VwU())) {
            blendMode18 = android.graphics.BlendMode.PLUS;
            return blendMode18;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5267getModulate0nO6VwU())) {
            blendMode17 = android.graphics.BlendMode.MODULATE;
            return blendMode17;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5272getScreen0nO6VwU())) {
            blendMode16 = android.graphics.BlendMode.SCREEN;
            return blendMode16;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5269getOverlay0nO6VwU())) {
            blendMode15 = android.graphics.BlendMode.OVERLAY;
            return blendMode15;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5255getDarken0nO6VwU())) {
            blendMode14 = android.graphics.BlendMode.DARKEN;
            return blendMode14;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5265getLighten0nO6VwU())) {
            blendMode13 = android.graphics.BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5254getColorDodge0nO6VwU())) {
            blendMode12 = android.graphics.BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5253getColorBurn0nO6VwU())) {
            blendMode11 = android.graphics.BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5263getHardlight0nO6VwU())) {
            blendMode10 = android.graphics.BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5273getSoftlight0nO6VwU())) {
            blendMode9 = android.graphics.BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5256getDifference0nO6VwU())) {
            blendMode8 = android.graphics.BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5262getExclusion0nO6VwU())) {
            blendMode7 = android.graphics.BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5268getMultiply0nO6VwU())) {
            blendMode6 = android.graphics.BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5264getHue0nO6VwU())) {
            blendMode5 = android.graphics.BlendMode.HUE;
            return blendMode5;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5271getSaturation0nO6VwU())) {
            blendMode4 = android.graphics.BlendMode.SATURATION;
            return blendMode4;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5252getColor0nO6VwU())) {
            blendMode3 = android.graphics.BlendMode.COLOR;
            return blendMode3;
        }
        if (BlendMode.m5247equalsimpl0(i, companion.m5266getLuminosity0nO6VwU())) {
            blendMode2 = android.graphics.BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = android.graphics.BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final int toComposeBlendMode(android.graphics.BlendMode blendMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return BlendMode.Companion.m5251getClear0nO6VwU();
            case 2:
                return BlendMode.Companion.m5274getSrc0nO6VwU();
            case 3:
                return BlendMode.Companion.m5257getDst0nO6VwU();
            case 4:
                return BlendMode.Companion.m5278getSrcOver0nO6VwU();
            case 5:
                return BlendMode.Companion.m5261getDstOver0nO6VwU();
            case 6:
                return BlendMode.Companion.m5276getSrcIn0nO6VwU();
            case 7:
                return BlendMode.Companion.m5259getDstIn0nO6VwU();
            case 8:
                return BlendMode.Companion.m5277getSrcOut0nO6VwU();
            case 9:
                return BlendMode.Companion.m5260getDstOut0nO6VwU();
            case 10:
                return BlendMode.Companion.m5275getSrcAtop0nO6VwU();
            case 11:
                return BlendMode.Companion.m5258getDstAtop0nO6VwU();
            case 12:
                return BlendMode.Companion.m5279getXor0nO6VwU();
            case 13:
                return BlendMode.Companion.m5270getPlus0nO6VwU();
            case 14:
                return BlendMode.Companion.m5267getModulate0nO6VwU();
            case 15:
                return BlendMode.Companion.m5272getScreen0nO6VwU();
            case 16:
                return BlendMode.Companion.m5269getOverlay0nO6VwU();
            case 17:
                return BlendMode.Companion.m5255getDarken0nO6VwU();
            case 18:
                return BlendMode.Companion.m5265getLighten0nO6VwU();
            case 19:
                return BlendMode.Companion.m5254getColorDodge0nO6VwU();
            case 20:
                return BlendMode.Companion.m5253getColorBurn0nO6VwU();
            case 21:
                return BlendMode.Companion.m5263getHardlight0nO6VwU();
            case 22:
                return BlendMode.Companion.m5273getSoftlight0nO6VwU();
            case 23:
                return BlendMode.Companion.m5256getDifference0nO6VwU();
            case 24:
                return BlendMode.Companion.m5262getExclusion0nO6VwU();
            case 25:
                return BlendMode.Companion.m5268getMultiply0nO6VwU();
            case 26:
                return BlendMode.Companion.m5264getHue0nO6VwU();
            case 27:
                return BlendMode.Companion.m5271getSaturation0nO6VwU();
            case 28:
                return BlendMode.Companion.m5252getColor0nO6VwU();
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                return BlendMode.Companion.m5266getLuminosity0nO6VwU();
            default:
                hu2.e();
                return 0;
        }
    }

    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m5183toPorterDuffModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m5247equalsimpl0(i, companion.m5251getClear0nO6VwU()) ? PorterDuff.Mode.CLEAR : BlendMode.m5247equalsimpl0(i, companion.m5274getSrc0nO6VwU()) ? PorterDuff.Mode.SRC : BlendMode.m5247equalsimpl0(i, companion.m5257getDst0nO6VwU()) ? PorterDuff.Mode.DST : BlendMode.m5247equalsimpl0(i, companion.m5278getSrcOver0nO6VwU()) ? PorterDuff.Mode.SRC_OVER : BlendMode.m5247equalsimpl0(i, companion.m5261getDstOver0nO6VwU()) ? PorterDuff.Mode.DST_OVER : BlendMode.m5247equalsimpl0(i, companion.m5276getSrcIn0nO6VwU()) ? PorterDuff.Mode.SRC_IN : BlendMode.m5247equalsimpl0(i, companion.m5259getDstIn0nO6VwU()) ? PorterDuff.Mode.DST_IN : BlendMode.m5247equalsimpl0(i, companion.m5277getSrcOut0nO6VwU()) ? PorterDuff.Mode.SRC_OUT : BlendMode.m5247equalsimpl0(i, companion.m5260getDstOut0nO6VwU()) ? PorterDuff.Mode.DST_OUT : BlendMode.m5247equalsimpl0(i, companion.m5275getSrcAtop0nO6VwU()) ? PorterDuff.Mode.SRC_ATOP : BlendMode.m5247equalsimpl0(i, companion.m5258getDstAtop0nO6VwU()) ? PorterDuff.Mode.DST_ATOP : BlendMode.m5247equalsimpl0(i, companion.m5279getXor0nO6VwU()) ? PorterDuff.Mode.XOR : BlendMode.m5247equalsimpl0(i, companion.m5270getPlus0nO6VwU()) ? PorterDuff.Mode.ADD : BlendMode.m5247equalsimpl0(i, companion.m5272getScreen0nO6VwU()) ? PorterDuff.Mode.SCREEN : BlendMode.m5247equalsimpl0(i, companion.m5269getOverlay0nO6VwU()) ? PorterDuff.Mode.OVERLAY : BlendMode.m5247equalsimpl0(i, companion.m5255getDarken0nO6VwU()) ? PorterDuff.Mode.DARKEN : BlendMode.m5247equalsimpl0(i, companion.m5265getLighten0nO6VwU()) ? PorterDuff.Mode.LIGHTEN : BlendMode.m5247equalsimpl0(i, companion.m5267getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
