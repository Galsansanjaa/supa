package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import defpackage.jh2;
import defpackage.sb0;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m7592getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i;
    }

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, sb0 sb0Var) {
        this(str, fontWeight, i, settings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        return DeviceFontFamilyName.m7566equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && jh2.k(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m7599equalsimpl0(mo7553getStyle_LCdwA(), deviceFontFamilyNameFont.mo7553getStyle_LCdwA()) && jh2.k(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo7553getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return getVariationSettings().hashCode() + ((FontStyle.m7600hashCodeimpl(mo7553getStyle_LCdwA()) + ((getWeight().hashCode() + (DeviceFontFamilyName.m7567hashCodeimpl(this.familyName) * 31)) * 31)) * 31);
    }

    public final android.graphics.Typeface loadCached(Context context) {
        return PlatformTypefaces_androidKt.PlatformTypefaces().mo7627optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), mo7553getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        String m7568toStringimpl = DeviceFontFamilyName.m7568toStringimpl(this.familyName);
        FontWeight weight = getWeight();
        String m7601toStringimpl = FontStyle.m7601toStringimpl(mo7553getStyle_LCdwA());
        StringBuilder sb = new StringBuilder("Font(familyName=\"");
        sb.append(m7568toStringimpl);
        sb.append("\", weight=");
        sb.append(weight);
        sb.append(", style=");
        return wa2.v(sb, m7601toStringimpl, ")");
    }
}
