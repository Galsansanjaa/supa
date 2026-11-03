package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements Arrangement.SpacingAlignmentCalculator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Alignment.Vertical b;

    public /* synthetic */ od(Alignment.Vertical vertical, int i) {
        this.a = i;
        this.b = vertical;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
    public final int align(int i, LayoutDirection layoutDirection) {
        int align;
        int align2;
        int align3;
        int i2 = this.a;
        Alignment.Vertical vertical = this.b;
        switch (i2) {
            case 0:
                align = vertical.align(0, i);
                return align;
            case 1:
                align2 = vertical.align(0, i);
                return align2;
            default:
                align3 = vertical.align(0, i);
                return align3;
        }
    }
}
