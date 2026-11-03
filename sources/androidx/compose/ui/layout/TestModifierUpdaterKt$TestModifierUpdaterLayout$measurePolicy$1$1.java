package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.vg1;
import defpackage.vy2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$1 implements MeasurePolicy {
    public static final TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$1 INSTANCE = new TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return vy2.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return vg1.g(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return vg1.i(this, intrinsicMeasureScope, list, i);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ps0] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo42measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        return vg1.q(measureScope, Constraints.m8014getMaxWidthimpl(j), Constraints.m8013getMaxHeightimpl(j), null, new Object(), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return vg1.k(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return vg1.m(this, intrinsicMeasureScope, list, i);
    }
}
