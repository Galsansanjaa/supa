package defpackage;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zi1 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ zi1(int i) {
        this.a = i;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$primaryFixed$104;
        TonalPalette tonalPalette;
        Double lambda$primaryFixedDim$107;
        TonalPalette tonalPalette2;
        switch (this.a) {
            case 0:
                lambda$primaryFixed$104 = MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
                return lambda$primaryFixed$104;
            case 1:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            case 2:
                lambda$primaryFixedDim$107 = MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
                return lambda$primaryFixedDim$107;
            case 3:
                tonalPalette2 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette2;
            default:
                return (String) wd2.b.get((Integer) obj);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
