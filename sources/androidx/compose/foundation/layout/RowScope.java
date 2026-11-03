package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@LayoutScopeMarker
/* loaded from: classes.dex */
public interface RowScope {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    Modifier align(Modifier modifier, Alignment.Vertical vertical);

    Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine);

    Modifier alignBy(Modifier modifier, ps0 ps0Var);

    Modifier alignByBaseline(Modifier modifier);

    Modifier weight(Modifier modifier, float f, boolean z);
}
