package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.ListUtilsKt;
import defpackage.ea0;
import defpackage.jh2;
import defpackage.kx1;
import defpackage.rw;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PlatformFontVariationSettings_androidKt {
    private static final float coerceInWeight(float f) {
        return ea0.n(f, 1.0f, 1000.0f);
    }

    public static final int getFontWeightAdjustment(Context context) {
        int i;
        int i2;
        if (context == null || Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i = context.getResources().getConfiguration().fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        i2 = context.getResources().getConfiguration().fontWeightAdjustment;
        return i2;
    }

    public static final FontVariationAxis[] toAndroidArray(FontVariation.Settings settings, Density density, int i) {
        int size;
        FontVariationAxis b;
        int i2 = 0;
        if (i == 0) {
            int size2 = settings.getSettings().size();
            FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[size2];
            while (i2 < size2) {
                rw.d();
                fontVariationAxisArr[i2] = rw.b(settings.getSettings().get(i2).getAxisName(), settings.getSettings().get(i2).toVariationValue(density));
                i2++;
            }
            return fontVariationAxisArr;
        }
        int size3 = settings.getSettings().size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                size = settings.getSettings().size() + 1;
                break;
            }
            if (jh2.k(settings.getSettings().get(i3).getAxisName(), "wght")) {
                size = settings.getSettings().size();
                break;
            }
            i3++;
        }
        FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[size];
        while (i2 < size) {
            if (i2 == settings.getSettings().size()) {
                rw.d();
                b = rw.a(coerceInWeight(i + 400.0f));
            } else if (jh2.k(settings.getSettings().get(i2).getAxisName(), "wght")) {
                rw.d();
                b = rw.a(coerceInWeight(settings.getSettings().get(i2).toVariationValue(density) + i));
            } else {
                rw.d();
                b = rw.b(settings.getSettings().get(i2).getAxisName(), settings.getSettings().get(i2).toVariationValue(density));
            }
            fontVariationAxisArr2[i2] = b;
            i2++;
        }
        return fontVariationAxisArr2;
    }

    public static final String toAndroidString(FontVariation.Settings settings, Context context) {
        return toAndroidString(settings, AndroidDensity_androidKt.Density(context), getFontWeightAdjustment(context));
    }

    public static final String toAndroidString(FontVariation.Settings settings, Density density, int i) {
        boolean z;
        float variationValue;
        int i2 = 0;
        if (i == 0) {
            return ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new kx1(density, 0), 31, null);
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        int size = settings2.size();
        String str = "";
        boolean z2 = false;
        while (i2 < size) {
            FontVariation.Setting setting = settings2.get(i2);
            if (jh2.k(setting.getAxisName(), "wght")) {
                variationValue = coerceInWeight(setting.toVariationValue(density) + i);
                z = true;
            } else {
                z = z2;
                variationValue = setting.toVariationValue(density);
            }
            if (i2 != 0) {
                str = ((Object) str) + ",";
            }
            str = ((Object) str) + "'" + setting.getAxisName() + "' " + variationValue;
            i2++;
            z2 = z;
        }
        if (z2) {
            return str;
        }
        float coerceInWeight = coerceInWeight(i + 400.0f);
        if (!settings.getSettings().isEmpty()) {
            str = ((Object) str) + ",";
        }
        return ((Object) str) + "'wght' " + coerceInWeight;
    }

    public static final CharSequence toAndroidString$lambda$0(Density density, FontVariation.Setting setting) {
        return "'" + setting.getAxisName() + "' " + setting.toVariationValue(density);
    }
}
