package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.ts0;
import defpackage.y42;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        Selection createSubSelections$lambda$1;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                createSubSelections$lambda$1 = MultiSelectionLayout.createSubSelections$lambda$1((Selection) obj3, (SelectableInfo) obj, ((Boolean) obj2).booleanValue());
                return createSubSelections$lambda$1;
            default:
                return SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.d((y42) obj3, (PointerInputChange) obj, (Offset) obj2);
        }
    }
}
