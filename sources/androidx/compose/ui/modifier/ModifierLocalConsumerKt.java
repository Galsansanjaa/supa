package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ModifierLocalConsumerKt {
    public static final Modifier modifierLocalConsumer(Modifier modifier, final ps0 ps0Var) {
        return modifier.then(new ModifierLocalConsumerImpl(ps0Var, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ps0() { // from class: androidx.compose.ui.modifier.ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1
            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return vy2.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("modifierLocalConsumer");
                inspectorInfo.getProperties().set("consumer", ps0.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
