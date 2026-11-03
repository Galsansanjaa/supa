package defpackage;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ui1 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDynamicColors b;

    public /* synthetic */ ui1(MaterialDynamicColors materialDynamicColors, int i) {
        this.a = i;
        this.b = materialDynamicColors;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$onSecondary$72;
        ToneDeltaPair lambda$secondary$69;
        DynamicColor lambda$onSecondaryFixed$125;
        DynamicColor lambda$onSecondaryFixed$126;
        DynamicColor lambda$inverseOnSurface$41;
        Double lambda$onTertiaryContainer$89;
        DynamicColor lambda$onTertiaryContainer$90;
        Double lambda$onSecondaryContainer$77;
        DynamicColor lambda$onSecondaryContainer$78;
        DynamicColor lambda$onPrimaryFixed$111;
        DynamicColor lambda$onPrimaryFixed$112;
        ToneDeltaPair lambda$error$93;
        DynamicColor lambda$onErrorContainer$102;
        ToneDeltaPair lambda$errorContainer$99;
        ToneDeltaPair lambda$tertiaryFixed$133;
        ToneDeltaPair lambda$primary$54;
        DynamicColor lambda$onSecondaryFixedVariant$129;
        DynamicColor lambda$onSecondaryFixedVariant$130;
        ToneDeltaPair lambda$tertiary$81;
        DynamicColor lambda$onTertiaryFixedVariant$143;
        DynamicColor lambda$onTertiaryFixedVariant$144;
        Double lambda$secondaryContainer$74;
        ToneDeltaPair lambda$secondaryContainer$75;
        DynamicColor lambda$onTertiaryFixed$139;
        DynamicColor lambda$onTertiaryFixed$140;
        Double lambda$primaryContainer$59;
        ToneDeltaPair lambda$primaryContainer$60;
        DynamicColor lambda$onBackground$14;
        DynamicColor lambda$onPrimary$57;
        DynamicColor lambda$inversePrimary$66;
        int i = this.a;
        MaterialDynamicColors materialDynamicColors = this.b;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (i) {
            case 0:
                lambda$onSecondary$72 = materialDynamicColors.lambda$onSecondary$72(dynamicScheme);
                return lambda$onSecondary$72;
            case 1:
                lambda$secondary$69 = materialDynamicColors.lambda$secondary$69(dynamicScheme);
                return lambda$secondary$69;
            case 2:
                lambda$onSecondaryFixed$125 = materialDynamicColors.lambda$onSecondaryFixed$125(dynamicScheme);
                return lambda$onSecondaryFixed$125;
            case 3:
                lambda$onSecondaryFixed$126 = materialDynamicColors.lambda$onSecondaryFixed$126(dynamicScheme);
                return lambda$onSecondaryFixed$126;
            case 4:
                lambda$inverseOnSurface$41 = materialDynamicColors.lambda$inverseOnSurface$41(dynamicScheme);
                return lambda$inverseOnSurface$41;
            case 5:
                lambda$onTertiaryContainer$89 = materialDynamicColors.lambda$onTertiaryContainer$89(dynamicScheme);
                return lambda$onTertiaryContainer$89;
            case 6:
                lambda$onTertiaryContainer$90 = materialDynamicColors.lambda$onTertiaryContainer$90(dynamicScheme);
                return lambda$onTertiaryContainer$90;
            case 7:
                lambda$onSecondaryContainer$77 = materialDynamicColors.lambda$onSecondaryContainer$77(dynamicScheme);
                return lambda$onSecondaryContainer$77;
            case 8:
                lambda$onSecondaryContainer$78 = materialDynamicColors.lambda$onSecondaryContainer$78(dynamicScheme);
                return lambda$onSecondaryContainer$78;
            case 9:
                lambda$onPrimaryFixed$111 = materialDynamicColors.lambda$onPrimaryFixed$111(dynamicScheme);
                return lambda$onPrimaryFixed$111;
            case 10:
                lambda$onPrimaryFixed$112 = materialDynamicColors.lambda$onPrimaryFixed$112(dynamicScheme);
                return lambda$onPrimaryFixed$112;
            case 11:
                lambda$error$93 = materialDynamicColors.lambda$error$93(dynamicScheme);
                return lambda$error$93;
            case 12:
                lambda$onErrorContainer$102 = materialDynamicColors.lambda$onErrorContainer$102(dynamicScheme);
                return lambda$onErrorContainer$102;
            case 13:
                lambda$errorContainer$99 = materialDynamicColors.lambda$errorContainer$99(dynamicScheme);
                return lambda$errorContainer$99;
            case 14:
                lambda$tertiaryFixed$133 = materialDynamicColors.lambda$tertiaryFixed$133(dynamicScheme);
                return lambda$tertiaryFixed$133;
            case 15:
                lambda$primary$54 = materialDynamicColors.lambda$primary$54(dynamicScheme);
                return lambda$primary$54;
            case 16:
                lambda$onSecondaryFixedVariant$129 = materialDynamicColors.lambda$onSecondaryFixedVariant$129(dynamicScheme);
                return lambda$onSecondaryFixedVariant$129;
            case 17:
                lambda$onSecondaryFixedVariant$130 = materialDynamicColors.lambda$onSecondaryFixedVariant$130(dynamicScheme);
                return lambda$onSecondaryFixedVariant$130;
            case 18:
                lambda$tertiary$81 = materialDynamicColors.lambda$tertiary$81(dynamicScheme);
                return lambda$tertiary$81;
            case 19:
                lambda$onTertiaryFixedVariant$143 = materialDynamicColors.lambda$onTertiaryFixedVariant$143(dynamicScheme);
                return lambda$onTertiaryFixedVariant$143;
            case 20:
                lambda$onTertiaryFixedVariant$144 = materialDynamicColors.lambda$onTertiaryFixedVariant$144(dynamicScheme);
                return lambda$onTertiaryFixedVariant$144;
            case 21:
                lambda$secondaryContainer$74 = materialDynamicColors.lambda$secondaryContainer$74(dynamicScheme);
                return lambda$secondaryContainer$74;
            case 22:
                lambda$secondaryContainer$75 = materialDynamicColors.lambda$secondaryContainer$75(dynamicScheme);
                return lambda$secondaryContainer$75;
            case 23:
                lambda$onTertiaryFixed$139 = materialDynamicColors.lambda$onTertiaryFixed$139(dynamicScheme);
                return lambda$onTertiaryFixed$139;
            case 24:
                lambda$onTertiaryFixed$140 = materialDynamicColors.lambda$onTertiaryFixed$140(dynamicScheme);
                return lambda$onTertiaryFixed$140;
            case 25:
                lambda$primaryContainer$59 = materialDynamicColors.lambda$primaryContainer$59(dynamicScheme);
                return lambda$primaryContainer$59;
            case 26:
                lambda$primaryContainer$60 = materialDynamicColors.lambda$primaryContainer$60(dynamicScheme);
                return lambda$primaryContainer$60;
            case 27:
                lambda$onBackground$14 = materialDynamicColors.lambda$onBackground$14(dynamicScheme);
                return lambda$onBackground$14;
            case 28:
                lambda$onPrimary$57 = materialDynamicColors.lambda$onPrimary$57(dynamicScheme);
                return lambda$onPrimary$57;
            default:
                lambda$inversePrimary$66 = materialDynamicColors.lambda$inversePrimary$66(dynamicScheme);
                return lambda$inversePrimary$66;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
