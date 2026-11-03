package defpackage;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xi1 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ xi1(int i) {
        this.a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$onPrimary$56;
        TonalPalette tonalPalette;
        Double lambda$inversePrimary$65;
        Double lambda$onTertiary$83;
        TonalPalette tonalPalette2;
        Double lambda$secondaryFixed$118;
        TonalPalette tonalPalette3;
        Double lambda$onPrimaryFixedVariant$114;
        TonalPalette tonalPalette4;
        Double lambda$tertiaryFixedDim$135;
        TonalPalette tonalPalette5;
        Double lambda$onError$95;
        TonalPalette tonalPalette6;
        Double lambda$textPrimaryInverseDisableOnly$157;
        TonalPalette tonalPalette7;
        TonalPalette tonalPalette8;
        Double lambda$secondaryFixedDim$121;
        TonalPalette tonalPalette9;
        TonalPalette tonalPalette10;
        Double lambda$surfaceVariant$34;
        TonalPalette tonalPalette11;
        Double lambda$neutralVariantPaletteKeyColor$9;
        TonalPalette tonalPalette12;
        Double lambda$textHintInverse$161;
        TonalPalette tonalPalette13;
        Double lambda$shadow$47;
        TonalPalette tonalPalette14;
        Double lambda$onSurface$32;
        Double lambda$surfaceContainerHighest$30;
        TonalPalette tonalPalette15;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.a) {
            case 0:
                lambda$onPrimary$56 = MaterialDynamicColors.lambda$onPrimary$56(dynamicScheme);
                return lambda$onPrimary$56;
            case 1:
                tonalPalette = dynamicScheme.primaryPalette;
                return tonalPalette;
            case 2:
                lambda$inversePrimary$65 = MaterialDynamicColors.lambda$inversePrimary$65(dynamicScheme);
                return lambda$inversePrimary$65;
            case 3:
                lambda$onTertiary$83 = MaterialDynamicColors.lambda$onTertiary$83(dynamicScheme);
                return lambda$onTertiary$83;
            case 4:
                tonalPalette2 = dynamicScheme.secondaryPalette;
                return tonalPalette2;
            case 5:
                lambda$secondaryFixed$118 = MaterialDynamicColors.lambda$secondaryFixed$118(dynamicScheme);
                return lambda$secondaryFixed$118;
            case 6:
                tonalPalette3 = dynamicScheme.primaryPalette;
                return tonalPalette3;
            case 7:
                lambda$onPrimaryFixedVariant$114 = MaterialDynamicColors.lambda$onPrimaryFixedVariant$114(dynamicScheme);
                return lambda$onPrimaryFixedVariant$114;
            case 8:
                tonalPalette4 = dynamicScheme.tertiaryPalette;
                return tonalPalette4;
            case 9:
                lambda$tertiaryFixedDim$135 = MaterialDynamicColors.lambda$tertiaryFixedDim$135(dynamicScheme);
                return lambda$tertiaryFixedDim$135;
            case 10:
                tonalPalette5 = dynamicScheme.errorPalette;
                return tonalPalette5;
            case 11:
                lambda$onError$95 = MaterialDynamicColors.lambda$onError$95(dynamicScheme);
                return lambda$onError$95;
            case 12:
                tonalPalette6 = dynamicScheme.neutralPalette;
                return tonalPalette6;
            case 13:
                lambda$textPrimaryInverseDisableOnly$157 = MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157(dynamicScheme);
                return lambda$textPrimaryInverseDisableOnly$157;
            case 14:
                tonalPalette7 = dynamicScheme.primaryPalette;
                return tonalPalette7;
            case 15:
                tonalPalette8 = dynamicScheme.secondaryPalette;
                return tonalPalette8;
            case 16:
                lambda$secondaryFixedDim$121 = MaterialDynamicColors.lambda$secondaryFixedDim$121(dynamicScheme);
                return lambda$secondaryFixedDim$121;
            case 17:
                tonalPalette9 = dynamicScheme.neutralPalette;
                return tonalPalette9;
            case 18:
                tonalPalette10 = dynamicScheme.neutralVariantPalette;
                return tonalPalette10;
            case 19:
                lambda$surfaceVariant$34 = MaterialDynamicColors.lambda$surfaceVariant$34(dynamicScheme);
                return lambda$surfaceVariant$34;
            case 20:
                tonalPalette11 = dynamicScheme.neutralVariantPalette;
                return tonalPalette11;
            case 21:
                lambda$neutralVariantPaletteKeyColor$9 = MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9(dynamicScheme);
                return lambda$neutralVariantPaletteKeyColor$9;
            case 22:
                tonalPalette12 = dynamicScheme.neutralPalette;
                return tonalPalette12;
            case 23:
                lambda$textHintInverse$161 = MaterialDynamicColors.lambda$textHintInverse$161(dynamicScheme);
                return lambda$textHintInverse$161;
            case 24:
                tonalPalette13 = dynamicScheme.neutralPalette;
                return tonalPalette13;
            case 25:
                lambda$shadow$47 = MaterialDynamicColors.lambda$shadow$47(dynamicScheme);
                return lambda$shadow$47;
            case 26:
                tonalPalette14 = dynamicScheme.neutralPalette;
                return tonalPalette14;
            case 27:
                lambda$onSurface$32 = MaterialDynamicColors.lambda$onSurface$32(dynamicScheme);
                return lambda$onSurface$32;
            case 28:
                lambda$surfaceContainerHighest$30 = MaterialDynamicColors.lambda$surfaceContainerHighest$30(dynamicScheme);
                return lambda$surfaceContainerHighest$30;
            default:
                tonalPalette15 = dynamicScheme.primaryPalette;
                return tonalPalette15;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
