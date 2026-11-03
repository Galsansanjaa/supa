package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import defpackage.dv1;
import java.util.Comparator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class TopBottomBoundsComparator implements Comparator<dv1> {
    public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

    private TopBottomBoundsComparator() {
    }

    @Override // java.util.Comparator
    public int compare(dv1 dv1Var, dv1 dv1Var2) {
        int compare = Float.compare(((Rect) dv1Var.a).getTop(), ((Rect) dv1Var2.a).getTop());
        return compare != 0 ? compare : Float.compare(((Rect) dv1Var.a).getBottom(), ((Rect) dv1Var2.a).getBottom());
    }
}
