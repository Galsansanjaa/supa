package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface FlexBoxScope {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier flex(FlexBoxScope flexBoxScope, Modifier modifier, ps0 ps0Var) {
            return flexBoxScope.flex(modifier, new FlexBoxKt$sam$androidx_compose_foundation_layout_FlexConfig$0(ps0Var));
        }
    }

    Modifier flex(Modifier modifier, FlexConfig flexConfig);

    Modifier flex(Modifier modifier, ps0 ps0Var);
}
