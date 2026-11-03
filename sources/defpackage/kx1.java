package defpackage;

import androidx.compose.material3.SwipeToDismissBoxDefaults;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kx1 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Density b;

    public /* synthetic */ kx1(Density density, int i) {
        this.a = i;
        this.b = density;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Density density = this.b;
        switch (i) {
            case 0:
                return PlatformFontVariationSettings_androidKt.a(density, (FontVariation.Setting) obj);
            default:
                return Float.valueOf(SwipeToDismissBoxDefaults.a(density, ((Float) obj).floatValue()));
        }
    }
}
