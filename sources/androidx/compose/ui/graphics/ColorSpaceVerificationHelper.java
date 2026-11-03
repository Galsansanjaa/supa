package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import defpackage.jh2;
import defpackage.ps0;
import defpackage.rw;
import defpackage.sw;
import j$.util.function.DoubleUnaryOperator$CC;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    public static final ColorSpace androidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace obtainAndroidColorSpace;
        ColorSpace obtainAndroidColorSpace2;
        ColorSpace.Named named2;
        ColorSpace.Named named3;
        ColorSpace.Named named4;
        ColorSpace.Named named5;
        ColorSpace.Named named6;
        ColorSpace.Named named7;
        ColorSpace.Named named8;
        ColorSpace.Named named9;
        ColorSpace.Named named10;
        ColorSpace.Named named11;
        ColorSpace.Named named12;
        ColorSpace.Named named13;
        ColorSpace.Named named14;
        ColorSpace.Named named15;
        ColorSpace.Named named16;
        ColorSpace.Named named17;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (jh2.k(colorSpace, colorSpaces.getSrgb())) {
            named17 = ColorSpace.Named.SRGB;
            ColorSpace colorSpace2 = ColorSpace.get(named17);
            sw.d(colorSpace2);
            return colorSpace2;
        }
        if (jh2.k(colorSpace, colorSpaces.getAces())) {
            named16 = ColorSpace.Named.ACES;
            ColorSpace colorSpace3 = ColorSpace.get(named16);
            sw.d(colorSpace3);
            return colorSpace3;
        }
        if (jh2.k(colorSpace, colorSpaces.getAcescg())) {
            named15 = ColorSpace.Named.ACESCG;
            ColorSpace colorSpace4 = ColorSpace.get(named15);
            sw.d(colorSpace4);
            return colorSpace4;
        }
        if (jh2.k(colorSpace, colorSpaces.getAdobeRgb())) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            ColorSpace colorSpace5 = ColorSpace.get(named14);
            sw.d(colorSpace5);
            return colorSpace5;
        }
        if (jh2.k(colorSpace, colorSpaces.getBt2020())) {
            named13 = ColorSpace.Named.BT2020;
            ColorSpace colorSpace6 = ColorSpace.get(named13);
            sw.d(colorSpace6);
            return colorSpace6;
        }
        if (jh2.k(colorSpace, colorSpaces.getBt709())) {
            named12 = ColorSpace.Named.BT709;
            ColorSpace colorSpace7 = ColorSpace.get(named12);
            sw.d(colorSpace7);
            return colorSpace7;
        }
        if (jh2.k(colorSpace, colorSpaces.getCieLab())) {
            named11 = ColorSpace.Named.CIE_LAB;
            ColorSpace colorSpace8 = ColorSpace.get(named11);
            sw.d(colorSpace8);
            return colorSpace8;
        }
        if (jh2.k(colorSpace, colorSpaces.getCieXyz())) {
            named10 = ColorSpace.Named.CIE_XYZ;
            ColorSpace colorSpace9 = ColorSpace.get(named10);
            sw.d(colorSpace9);
            return colorSpace9;
        }
        if (jh2.k(colorSpace, colorSpaces.getDciP3())) {
            named9 = ColorSpace.Named.DCI_P3;
            ColorSpace colorSpace10 = ColorSpace.get(named9);
            sw.d(colorSpace10);
            return colorSpace10;
        }
        if (jh2.k(colorSpace, colorSpaces.getDisplayP3())) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            ColorSpace colorSpace11 = ColorSpace.get(named8);
            sw.d(colorSpace11);
            return colorSpace11;
        }
        if (jh2.k(colorSpace, colorSpaces.getExtendedSrgb())) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            ColorSpace colorSpace12 = ColorSpace.get(named7);
            sw.d(colorSpace12);
            return colorSpace12;
        }
        if (jh2.k(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            ColorSpace colorSpace13 = ColorSpace.get(named6);
            sw.d(colorSpace13);
            return colorSpace13;
        }
        if (jh2.k(colorSpace, colorSpaces.getLinearSrgb())) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            ColorSpace colorSpace14 = ColorSpace.get(named5);
            sw.d(colorSpace14);
            return colorSpace14;
        }
        if (jh2.k(colorSpace, colorSpaces.getNtsc1953())) {
            named4 = ColorSpace.Named.NTSC_1953;
            ColorSpace colorSpace15 = ColorSpace.get(named4);
            sw.d(colorSpace15);
            return colorSpace15;
        }
        if (jh2.k(colorSpace, colorSpaces.getProPhotoRgb())) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            ColorSpace colorSpace16 = ColorSpace.get(named3);
            sw.d(colorSpace16);
            return colorSpace16;
        }
        if (jh2.k(colorSpace, colorSpaces.getSmpteC())) {
            named2 = ColorSpace.Named.SMPTE_C;
            ColorSpace colorSpace17 = ColorSpace.get(named2);
            sw.d(colorSpace17);
            return colorSpace17;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (obtainAndroidColorSpace2 = ColorSpaceVerificationHelperV34.obtainAndroidColorSpace(colorSpace)) != null) {
            sw.d(obtainAndroidColorSpace2);
            return obtainAndroidColorSpace2;
        }
        if (i >= 36 && (obtainAndroidColorSpace = ColorSpaceVerificationHelperV36.obtainAndroidColorSpace(colorSpace)) != null) {
            sw.d(obtainAndroidColorSpace);
            return obtainAndroidColorSpace;
        }
        if (!(colorSpace instanceof Rgb)) {
            named = ColorSpace.Named.SRGB;
            ColorSpace colorSpace18 = ColorSpace.get(named);
            sw.d(colorSpace18);
            return colorSpace18;
        }
        Rgb rgb = (Rgb) colorSpace;
        float[] xyz$ui_graphics = rgb.getWhitePoint().toXyz$ui_graphics();
        TransferParameters transferParameters = rgb.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        float[] transform$ui_graphics = rgb.getTransform$ui_graphics();
        final int i2 = 0;
        if (transferParameters2 != null) {
            rw.c();
            ColorSpace.Rgb rgb2 = new ColorSpace.Rgb(colorSpace.getName(), rgb.getPrimaries$ui_graphics(), xyz$ui_graphics, transferParameters2);
            if (Float.isNaN(transform$ui_graphics[0]) || Arrays.equals(rgb2.getTransform(), transform$ui_graphics)) {
                return sw.d(rgb2);
            }
            rw.c();
            return sw.d(new ColorSpace.Rgb(colorSpace.getName(), transform$ui_graphics, transferParameters2));
        }
        rw.c();
        String name = colorSpace.getName();
        float[] primaries$ui_graphics = rgb.getPrimaries$ui_graphics();
        final ps0 oetf = rgb.getOetf();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.a
            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                int i3 = i2;
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
            }

            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                double androidColorSpace$lambda$0;
                double androidColorSpace$lambda$1;
                int i3 = i2;
                ps0 ps0Var = oetf;
                switch (i3) {
                    case 0:
                        androidColorSpace$lambda$0 = ColorSpaceVerificationHelper.androidColorSpace$lambda$0(ps0Var, d);
                        return androidColorSpace$lambda$0;
                    default:
                        androidColorSpace$lambda$1 = ColorSpaceVerificationHelper.androidColorSpace$lambda$1(ps0Var, d);
                        return androidColorSpace$lambda$1;
                }
            }

            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                int i3 = i2;
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
            }
        };
        final ps0 eotf = rgb.getEotf();
        final int i3 = 1;
        return sw.d(new ColorSpace.Rgb(name, primaries$ui_graphics, xyz$ui_graphics, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.a
            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                int i32 = i3;
                return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
            }

            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                double androidColorSpace$lambda$0;
                double androidColorSpace$lambda$1;
                int i32 = i3;
                ps0 ps0Var = eotf;
                switch (i32) {
                    case 0:
                        androidColorSpace$lambda$0 = ColorSpaceVerificationHelper.androidColorSpace$lambda$0(ps0Var, d);
                        return androidColorSpace$lambda$0;
                    default:
                        androidColorSpace$lambda$1 = ColorSpaceVerificationHelper.androidColorSpace$lambda$1(ps0Var, d);
                        return androidColorSpace$lambda$1;
                }
            }

            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                int i32 = i3;
                return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
            }
        }, rgb.getMinValue(0), rgb.getMaxValue(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(ps0 ps0Var, double d) {
        return ((Number) ps0Var.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(ps0 ps0Var, double d) {
        return ((Number) ps0Var.invoke(Double.valueOf(d))).doubleValue();
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(final ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace.Named named2;
        ColorSpace.Named named3;
        ColorSpace.Named named4;
        ColorSpace.Named named5;
        ColorSpace.Named named6;
        ColorSpace.Named named7;
        ColorSpace.Named named8;
        ColorSpace.Named named9;
        ColorSpace.Named named10;
        ColorSpace.Named named11;
        ColorSpace.Named named12;
        ColorSpace.Named named13;
        ColorSpace.Named named14;
        ColorSpace.Named named15;
        ColorSpace.Named named16;
        int id = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        if (id == named.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        named2 = ColorSpace.Named.ACES;
        if (id == named2.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        named3 = ColorSpace.Named.ACESCG;
        if (id == named3.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        named4 = ColorSpace.Named.ADOBE_RGB;
        if (id == named4.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        named5 = ColorSpace.Named.BT2020;
        if (id == named5.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        named6 = ColorSpace.Named.BT709;
        if (id == named6.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        named7 = ColorSpace.Named.CIE_LAB;
        if (id == named7.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        named8 = ColorSpace.Named.CIE_XYZ;
        if (id == named8.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        named9 = ColorSpace.Named.DCI_P3;
        if (id == named9.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        named10 = ColorSpace.Named.DISPLAY_P3;
        if (id == named10.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        named11 = ColorSpace.Named.EXTENDED_SRGB;
        if (id == named11.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        if (id == named12.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        named13 = ColorSpace.Named.LINEAR_SRGB;
        if (id == named13.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        named14 = ColorSpace.Named.NTSC_1953;
        if (id == named14.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        named15 = ColorSpace.Named.PRO_PHOTO_RGB;
        if (id == named15.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        named16 = ColorSpace.Named.SMPTE_C;
        if (id == named16.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            androidx.compose.ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId = ColorSpaceVerificationHelperV34.obtainComposeColorSpaceFromId(colorSpace.getId());
            if (!jh2.k(obtainComposeColorSpaceFromId, ColorSpaces.INSTANCE.getUnspecified$ui_graphics())) {
                return obtainComposeColorSpaceFromId;
            }
        }
        if (i >= 36) {
            androidx.compose.ui.graphics.colorspace.ColorSpace obtainComposeColorSpaceFromId2 = ColorSpaceVerificationHelperV36.obtainComposeColorSpaceFromId(colorSpace.getId());
            if (!jh2.k(obtainComposeColorSpaceFromId2, ColorSpaces.INSTANCE.getUnspecified$ui_graphics())) {
                return obtainComposeColorSpaceFromId2;
            }
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Rgb c = sw.c(colorSpace);
        ColorSpace.Rgb.TransferParameters transferParameters = c.getTransferParameters();
        WhitePoint whitePoint = c.getWhitePoint().length == 3 ? new WhitePoint(c.getWhitePoint()[0], c.getWhitePoint()[1], c.getWhitePoint()[2]) : new WhitePoint(c.getWhitePoint()[0], c.getWhitePoint()[1]);
        TransferParameters transferParameters2 = transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        final int i2 = 0;
        final int i3 = 1;
        return new Rgb(c.getName(), c.getPrimaries(), whitePoint, c.getTransform(), new DoubleFunction() { // from class: androidx.compose.ui.graphics.b
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double composeColorSpace$lambda$0;
                double composeColorSpace$lambda$1;
                int i4 = i2;
                ColorSpace colorSpace2 = colorSpace;
                switch (i4) {
                    case 0:
                        composeColorSpace$lambda$0 = ColorSpaceVerificationHelper.composeColorSpace$lambda$0(colorSpace2, d);
                        return composeColorSpace$lambda$0;
                    default:
                        composeColorSpace$lambda$1 = ColorSpaceVerificationHelper.composeColorSpace$lambda$1(colorSpace2, d);
                        return composeColorSpace$lambda$1;
                }
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.b
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                double composeColorSpace$lambda$0;
                double composeColorSpace$lambda$1;
                int i4 = i3;
                ColorSpace colorSpace2 = colorSpace;
                switch (i4) {
                    case 0:
                        composeColorSpace$lambda$0 = ColorSpaceVerificationHelper.composeColorSpace$lambda$0(colorSpace2, d);
                        return composeColorSpace$lambda$0;
                    default:
                        composeColorSpace$lambda$1 = ColorSpaceVerificationHelper.composeColorSpace$lambda$1(colorSpace2, d);
                        return composeColorSpace$lambda$1;
                }
            }
        }, c.getMinValue(0), c.getMaxValue(0), transferParameters2, c.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$0(ColorSpace colorSpace, double d) {
        return sw.c(colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$1(ColorSpace colorSpace, double d) {
        return sw.c(colorSpace).getEotf().applyAsDouble(d);
    }
}
