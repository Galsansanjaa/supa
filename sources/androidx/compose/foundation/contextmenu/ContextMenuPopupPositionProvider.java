package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import defpackage.os0;
import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final os0 anchorPositionBlock;
    private final ts0 onPositionCalculated;

    private ContextMenuPopupPositionProvider(final long j, ts0 ts0Var) {
        this(new os0() { // from class: p00
            @Override // defpackage.os0
            public final Object invoke() {
                IntOffset m8164boximpl;
                m8164boximpl = IntOffset.m8164boximpl(j);
                return m8164boximpl;
            }
        }, ts0Var);
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(long j, ts0 ts0Var, int i, sb0 sb0Var) {
        this(j, (i & 2) != 0 ? null : ts0Var, null);
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(long j, ts0 ts0Var, sb0 sb0Var) {
        this(j, ts0Var);
    }

    public ContextMenuPopupPositionProvider(os0 os0Var, ts0 ts0Var) {
        this.anchorPositionBlock = os0Var;
        this.onPositionCalculated = ts0Var;
    }

    public /* synthetic */ ContextMenuPopupPositionProvider(os0 os0Var, ts0 ts0Var, int i, sb0 sb0Var) {
        this(os0Var, (i & 2) != 0 ? null : ts0Var);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo442calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        long m8182unboximpl = ((IntOffset) this.anchorPositionBlock.invoke()).m8182unboximpl();
        long m8167constructorimpl = IntOffset.m8167constructorimpl((ContextMenuPopupPositionProviderKt.alignPopupAxis(IntOffset.m8173getXimpl(m8182unboximpl) + intRect.getLeft(), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr) << 32) | (4294967295L & ContextMenuPopupPositionProviderKt.alignPopupAxis$default(IntOffset.m8174getYimpl(m8182unboximpl) + intRect.getTop(), (int) (j2 & 4294967295L), (int) (j & 4294967295L), false, 8, null)));
        ts0 ts0Var = this.onPositionCalculated;
        if (ts0Var != null) {
            ts0Var.invoke(IntOffset.m8164boximpl(m8182unboximpl), IntRectKt.m8206IntRectVbeCjmY(m8167constructorimpl, j2));
        }
        return m8167constructorimpl;
    }
}
