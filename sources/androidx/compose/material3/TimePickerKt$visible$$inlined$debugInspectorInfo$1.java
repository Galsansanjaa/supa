package androidx.compose.material3;

import androidx.compose.ui.platform.InspectorInfo;
import defpackage.bb1;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TimePickerKt$visible$$inlined$debugInspectorInfo$1 extends bb1 implements ps0 {
    final /* synthetic */ boolean $visible$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$visible$$inlined$debugInspectorInfo$1(boolean z) {
        super(1);
        this.$visible$inlined = z;
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return vy2.a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("visible");
        inspectorInfo.getProperties().set("visible", Boolean.valueOf(this.$visible$inlined));
    }
}
