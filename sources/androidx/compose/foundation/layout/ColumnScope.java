package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import defpackage.f31;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface ColumnScope {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Modifier weight$default(ColumnScope columnScope, Modifier modifier, float f, boolean z, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: weight");
                return null;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return columnScope.weight(modifier, f, z);
        }
    }

    Modifier align(Modifier modifier, Alignment.Horizontal horizontal);

    Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine);

    Modifier alignBy(Modifier modifier, ps0 ps0Var);

    Modifier weight(Modifier modifier, float f, boolean z);
}
