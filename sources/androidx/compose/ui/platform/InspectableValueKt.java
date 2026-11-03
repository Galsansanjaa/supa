package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import defpackage.cr0;
import defpackage.hd0;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class InspectableValueKt {
    private static final ps0 NoInspectorInfo = new cr0(17);
    private static boolean isDebugInspectorInfoEnabled;

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 NoInspectorInfo$lambda$0(InspectorInfo inspectorInfo) {
        return vy2.a;
    }

    public static final ps0 debugInspectorInfo(final ps0 ps0Var) {
        return isDebugInspectorInfoEnabled() ? new ps0() { // from class: androidx.compose.ui.platform.InspectableValueKt$debugInspectorInfo$1
            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return vy2.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                ps0.this.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    public static final ps0 getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @hd0
    public static final Modifier inspectable(Modifier modifier, ps0 ps0Var, ps0 ps0Var2) {
        return inspectableWrapper(modifier, ps0Var, (Modifier) ps0Var2.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, ps0 ps0Var, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(ps0Var);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z) {
        isDebugInspectorInfoEnabled = z;
    }
}
