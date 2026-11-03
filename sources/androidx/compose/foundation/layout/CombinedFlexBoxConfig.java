package androidx.compose.foundation.layout;

import defpackage.ew0;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CombinedFlexBoxConfig implements FlexBoxConfig {
    public static final int $stable = 0;
    private final FlexBoxConfig[] configs;

    public CombinedFlexBoxConfig(FlexBoxConfig... flexBoxConfigArr) {
        this.configs = flexBoxConfigArr;
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfig
    public void configure(FlexBoxConfigScope flexBoxConfigScope) {
        for (FlexBoxConfig flexBoxConfig : this.configs) {
            flexBoxConfig.configure(flexBoxConfigScope);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedFlexBoxConfig) {
            return Arrays.equals(this.configs, ((CombinedFlexBoxConfig) obj).configs);
        }
        return false;
    }

    public final FlexBoxConfig[] getConfigs() {
        return this.configs;
    }

    public int hashCode() {
        return Arrays.hashCode(this.configs);
    }

    @Override // androidx.compose.foundation.layout.FlexBoxConfig
    public final FlexBoxConfig then(FlexBoxConfig flexBoxConfig) {
        if (flexBoxConfig == FlexBoxConfig.Companion) {
            return this;
        }
        if (!(flexBoxConfig instanceof CombinedFlexBoxConfig)) {
            return new CombinedFlexBoxConfig(this, flexBoxConfig);
        }
        ew0 ew0Var = new ew0(2);
        ew0Var.a(this);
        ew0Var.d(((CombinedFlexBoxConfig) flexBoxConfig).getConfigs());
        ArrayList arrayList = ew0Var.a;
        return new CombinedFlexBoxConfig((FlexBoxConfig[]) arrayList.toArray(new FlexBoxConfig[arrayList.size()]));
    }
}
