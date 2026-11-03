package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import defpackage.bb1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$shrinkHorizontally$2 extends bb1 implements ps0 {
    final /* synthetic */ ps0 $targetWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkHorizontally$2(ps0 ps0Var) {
        super(1);
        this.$targetWidth = ps0Var;
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m8208boximpl(m102invokemzRDjE0(((IntSize) obj).m8220unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0, reason: not valid java name */
    public final long m102invokemzRDjE0(long j) {
        return IntSize.m8211constructorimpl((((int) (j & 4294967295L)) & 4294967295L) | (((Number) this.$targetWidth.invoke(Integer.valueOf((int) (j >> 32)))).intValue() << 32));
    }
}
