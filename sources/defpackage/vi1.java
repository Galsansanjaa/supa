package defpackage;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class vi1 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ vi1(int i) {
        this.a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$textPrimaryInverse$153;
        TonalPalette tonalPalette;
        Double lambda$surfaceContainer$26;
        TonalPalette tonalPalette2;
        Double lambda$onSurfaceVariant$36;
        TonalPalette tonalPalette3;
        Double lambda$inverseSurface$38;
        Double lambda$surfaceDim$18;
        TonalPalette tonalPalette4;
        Double lambda$onErrorContainer$101;
        TonalPalette tonalPalette5;
        Double lambda$textSecondaryAndTertiaryInverse$155;
        TonalPalette tonalPalette6;
        Double lambda$errorContainer$98;
        TonalPalette tonalPalette7;
        Double lambda$tertiaryFixed$132;
        TonalPalette tonalPalette8;
        TonalPalette tonalPalette9;
        Double lambda$primary$53;
        TonalPalette tonalPalette10;
        Double lambda$scrim$49;
        TonalPalette tonalPalette11;
        Double lambda$onSecondaryFixedVariant$128;
        Double lambda$controlNormal$148;
        TonalPalette tonalPalette12;
        Double lambda$tertiary$80;
        TonalPalette tonalPalette13;
        Double lambda$controlActivated$146;
        TonalPalette tonalPalette14;
        Double lambda$primaryPaletteKeyColor$1;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.a) {
            case 0:
                lambda$textPrimaryInverse$153 = MaterialDynamicColors.lambda$textPrimaryInverse$153(dynamicScheme);
                return lambda$textPrimaryInverse$153;
            case 1:
                tonalPalette = dynamicScheme.neutralPalette;
                return tonalPalette;
            case 2:
                lambda$surfaceContainer$26 = MaterialDynamicColors.lambda$surfaceContainer$26(dynamicScheme);
                return lambda$surfaceContainer$26;
            case 3:
                tonalPalette2 = dynamicScheme.neutralVariantPalette;
                return tonalPalette2;
            case 4:
                lambda$onSurfaceVariant$36 = MaterialDynamicColors.lambda$onSurfaceVariant$36(dynamicScheme);
                return lambda$onSurfaceVariant$36;
            case 5:
                tonalPalette3 = dynamicScheme.neutralPalette;
                return tonalPalette3;
            case 6:
                lambda$inverseSurface$38 = MaterialDynamicColors.lambda$inverseSurface$38(dynamicScheme);
                return lambda$inverseSurface$38;
            case 7:
                lambda$surfaceDim$18 = MaterialDynamicColors.lambda$surfaceDim$18(dynamicScheme);
                return lambda$surfaceDim$18;
            case 8:
                tonalPalette4 = dynamicScheme.errorPalette;
                return tonalPalette4;
            case 9:
                lambda$onErrorContainer$101 = MaterialDynamicColors.lambda$onErrorContainer$101(dynamicScheme);
                return lambda$onErrorContainer$101;
            case 10:
                tonalPalette5 = dynamicScheme.neutralVariantPalette;
                return tonalPalette5;
            case 11:
                lambda$textSecondaryAndTertiaryInverse$155 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155(dynamicScheme);
                return lambda$textSecondaryAndTertiaryInverse$155;
            case 12:
                tonalPalette6 = dynamicScheme.errorPalette;
                return tonalPalette6;
            case 13:
                lambda$errorContainer$98 = MaterialDynamicColors.lambda$errorContainer$98(dynamicScheme);
                return lambda$errorContainer$98;
            case 14:
                tonalPalette7 = dynamicScheme.tertiaryPalette;
                return tonalPalette7;
            case 15:
                lambda$tertiaryFixed$132 = MaterialDynamicColors.lambda$tertiaryFixed$132(dynamicScheme);
                return lambda$tertiaryFixed$132;
            case 16:
                tonalPalette8 = dynamicScheme.neutralVariantPalette;
                return tonalPalette8;
            case 17:
                tonalPalette9 = dynamicScheme.primaryPalette;
                return tonalPalette9;
            case 18:
                lambda$primary$53 = MaterialDynamicColors.lambda$primary$53(dynamicScheme);
                return lambda$primary$53;
            case 19:
                tonalPalette10 = dynamicScheme.neutralPalette;
                return tonalPalette10;
            case 20:
                lambda$scrim$49 = MaterialDynamicColors.lambda$scrim$49(dynamicScheme);
                return lambda$scrim$49;
            case 21:
                tonalPalette11 = dynamicScheme.secondaryPalette;
                return tonalPalette11;
            case 22:
                lambda$onSecondaryFixedVariant$128 = MaterialDynamicColors.lambda$onSecondaryFixedVariant$128(dynamicScheme);
                return lambda$onSecondaryFixedVariant$128;
            case 23:
                lambda$controlNormal$148 = MaterialDynamicColors.lambda$controlNormal$148(dynamicScheme);
                return lambda$controlNormal$148;
            case 24:
                tonalPalette12 = dynamicScheme.tertiaryPalette;
                return tonalPalette12;
            case 25:
                lambda$tertiary$80 = MaterialDynamicColors.lambda$tertiary$80(dynamicScheme);
                return lambda$tertiary$80;
            case 26:
                tonalPalette13 = dynamicScheme.primaryPalette;
                return tonalPalette13;
            case 27:
                lambda$controlActivated$146 = MaterialDynamicColors.lambda$controlActivated$146(dynamicScheme);
                return lambda$controlActivated$146;
            case 28:
                tonalPalette14 = dynamicScheme.primaryPalette;
                return tonalPalette14;
            default:
                lambda$primaryPaletteKeyColor$1 = MaterialDynamicColors.lambda$primaryPaletteKeyColor$1(dynamicScheme);
                return lambda$primaryPaletteKeyColor$1;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
