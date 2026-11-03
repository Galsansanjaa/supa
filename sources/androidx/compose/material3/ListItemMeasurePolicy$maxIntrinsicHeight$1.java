package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import defpackage.et0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public /* synthetic */ class ListItemMeasurePolicy$maxIntrinsicHeight$1 extends et0 implements ts0 {
    public static final ListItemMeasurePolicy$maxIntrinsicHeight$1 INSTANCE = new ListItemMeasurePolicy$maxIntrinsicHeight$1();

    public ListItemMeasurePolicy$maxIntrinsicHeight$1() {
        super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i) {
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // defpackage.ts0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
    }
}
