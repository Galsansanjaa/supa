package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.hd0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface TooltipScope {
    @hd0
    /* synthetic */ Modifier drawCaret(Modifier modifier, ts0 ts0Var);

    LayoutCoordinates obtainAnchorBounds(MeasureScope measureScope);

    PopupPositionProvider obtainPositionProvider();
}
