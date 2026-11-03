package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import defpackage.ew0;
import defpackage.i70;
import defpackage.jh2;
import defpackage.sb0;
import defpackage.wa2;
import defpackage.wd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FontVariation {
    public static final int $stable = 0;
    public static final FontVariation INSTANCE = new FontVariation();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public interface Setting {
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(Density density);
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class SettingFloat implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final float value;

        public SettingFloat(String str, float f) {
            this.axisName = str;
            this.value = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingFloat)) {
                return false;
            }
            SettingFloat settingFloat = (SettingFloat) obj;
            return jh2.k(getAxisName(), settingFloat.getAxisName()) && this.value == settingFloat.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.value) + (getAxisName().hashCode() * 31);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ")";
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class SettingInt implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final int value;

        public SettingInt(String str, int i) {
            this.axisName = str;
            this.value = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingInt)) {
                return false;
            }
            SettingInt settingInt = (SettingInt) obj;
            return jh2.k(getAxisName(), settingInt.getAxisName()) && this.value == settingInt.value;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ")";
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class SettingTextUnit implements Setting {
        private final String axisName;
        private final boolean needsDensity;
        private final long value;

        private SettingTextUnit(String str, long j) {
            this.axisName = str;
            this.value = j;
            this.needsDensity = true;
        }

        public /* synthetic */ SettingTextUnit(String str, long j, sb0 sb0Var) {
            this(str, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SettingTextUnit)) {
                return false;
            }
            SettingTextUnit settingTextUnit = (SettingTextUnit) obj;
            return jh2.k(getAxisName(), settingTextUnit.getAxisName()) && TextUnit.m8236equalsimpl0(this.value, settingTextUnit.value);
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public String getAxisName() {
            return this.axisName;
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        /* renamed from: getValue-XSAIIZE, reason: not valid java name */
        public final long m7624getValueXSAIIZE() {
            return this.value;
        }

        public int hashCode() {
            return TextUnit.m8240hashCodeimpl(this.value) + (getAxisName().hashCode() * 31);
        }

        public String toString() {
            return wa2.t("FontVariation.Setting(axisName='", getAxisName(), "', value=", TextUnit.m8246toStringimpl(this.value), ")");
        }

        @Override // androidx.compose.ui.text.font.FontVariation.Setting
        public float toVariationValue(Density density) {
            if (density != null) {
                return density.getFontScale() * TextUnit.m8239getValueimpl(this.value);
            }
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("density must not be null");
            i70.i();
            return 0.0f;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Settings {
        public static final int $stable = 0;
        private final boolean needsDensity;
        private final List<Setting> settings;

        public Settings(Setting... settingArr) {
            boolean z = false;
            for (Setting setting : settingArr) {
                String axisName = setting.getAxisName();
                int i = 0;
                for (Setting setting2 : settingArr) {
                    if (jh2.k(setting2.getAxisName(), axisName)) {
                        i++;
                    }
                }
                if (!(i == 1)) {
                    ArrayList arrayList = new ArrayList();
                    for (Setting setting3 : settingArr) {
                        if (jh2.k(setting3.getAxisName(), axisName)) {
                            arrayList.add(setting3);
                        }
                    }
                    InlineClassHelperKt.throwIllegalArgumentException("'" + axisName + "' must be unique. Actual [" + arrayList + "]");
                }
                z = z || setting.getNeedsDensity();
            }
            this.settings = wd.Q0(settingArr);
            this.needsDensity = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Settings) && jh2.k(this.settings, ((Settings) obj).settings);
        }

        public final boolean getNeedsDensity$ui_text() {
            return this.needsDensity;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }

        public String toString() {
            return "Settings(settings=" + this.settings + ")";
        }
    }

    private FontVariation() {
    }

    public final Setting Setting(String str, float f) {
        if (!(str.length() == 4)) {
            InlineClassHelperKt.throwIllegalArgumentException("Name must be exactly four characters. Actual: '" + str + "'");
        }
        return new SettingFloat(str, f);
    }

    /* renamed from: Settings-6EWAqTQ, reason: not valid java name */
    public final Settings m7622Settings6EWAqTQ(FontWeight fontWeight, int i, Setting... settingArr) {
        ew0 ew0Var = new ew0(3);
        ew0Var.a(weight(fontWeight.getWeight()));
        ew0Var.a(italic(i));
        ew0Var.d(settingArr);
        ArrayList arrayList = ew0Var.a;
        return new Settings((Setting[]) arrayList.toArray(new Setting[arrayList.size()]));
    }

    public final Setting grade(int i) {
        boolean z = false;
        if (-1000 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new SettingInt("GRAD", i);
    }

    public final Setting italic(float f) {
        boolean z = false;
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'ital' must be in 0.0f..1.0f. Actual: " + f);
        }
        return new SettingFloat("ital", f);
    }

    /* renamed from: opticalSizing--R2X_6o, reason: not valid java name */
    public final Setting m7623opticalSizingR2X_6o(long j) {
        if (!TextUnit.m8242isSpimpl(j)) {
            InlineClassHelperKt.throwIllegalArgumentException("'opsz' must be provided in sp units");
        }
        return new SettingTextUnit("opsz", j, null);
    }

    public final Setting slant(float f) {
        boolean z = false;
        if (-90.0f <= f && f <= 90.0f) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'slnt' must be in -90f..90f. Actual: " + f);
        }
        return new SettingFloat("slnt", f);
    }

    public final Setting weight(int i) {
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        return new SettingInt("wght", i);
    }

    public final Setting width(float f) {
        if (!(f > 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("'wdth' must be strictly > 0.0f. Actual: " + f);
        }
        return new SettingFloat("wdth", f);
    }
}
