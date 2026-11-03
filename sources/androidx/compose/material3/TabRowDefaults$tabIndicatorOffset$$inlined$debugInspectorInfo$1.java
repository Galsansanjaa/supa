package androidx.compose.material3;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bb1;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1 extends bb1 implements ps0 {
    final /* synthetic */ TabPosition $currentTabPosition$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(TabPosition tabPosition) {
        super(1);
        this.$currentTabPosition$inlined = tabPosition;
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return vy2.a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("tabIndicatorOffset");
        inspectorInfo.setValue(this.$currentTabPosition$inlined);
    }
}
