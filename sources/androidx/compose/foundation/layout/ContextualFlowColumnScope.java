package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@LayoutScopeMarker
@hd0
/* loaded from: classes.dex */
public interface ContextualFlowColumnScope extends ColumnScope {
    Modifier fillMaxColumnWidth(Modifier modifier, float f);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeightInLine-D9Ej5fM, reason: not valid java name */
    float mo799getMaxHeightInLineD9Ej5fM();

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    float mo800getMaxWidthD9Ej5fM();
}
