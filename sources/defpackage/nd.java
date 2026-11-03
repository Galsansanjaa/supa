package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements Arrangement.SpacingAlignmentCalculator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Alignment.Horizontal b;

    public /* synthetic */ nd(Alignment.Horizontal horizontal, int i) {
        this.a = i;
        this.b = horizontal;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
    public final int align(int i, LayoutDirection layoutDirection) {
        int align;
        int align2;
        int align3;
        int align4;
        int i2 = this.a;
        Alignment.Horizontal horizontal = this.b;
        switch (i2) {
            case 0:
                align = horizontal.align(0, i, layoutDirection);
                return align;
            case 1:
                align2 = horizontal.align(0, i, layoutDirection);
                return align2;
            case 2:
                align3 = horizontal.align(0, i, layoutDirection);
                return align3;
            default:
                align4 = horizontal.align(0, i, layoutDirection);
                return align4;
        }
    }
}
