package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import defpackage.bb1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideOutHorizontally$2 extends bb1 implements ps0 {
    final /* synthetic */ ps0 $targetOffsetX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideOutHorizontally$2(ps0 ps0Var) {
        super(1);
        this.$targetOffsetX = ps0Var;
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m8164boximpl(m107invokemHKZG7I(((IntSize) obj).m8220unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m107invokemHKZG7I(long j) {
        return IntOffset.m8167constructorimpl(((Number) this.$targetOffsetX.invoke(Integer.valueOf((int) (j >> 32)))).intValue() << 32);
    }
}
