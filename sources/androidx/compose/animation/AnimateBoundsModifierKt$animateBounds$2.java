package androidx.compose.animation;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import defpackage.bb1;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AnimateBoundsModifierKt$animateBounds$2 extends bb1 implements ts0 {
    public static final AnimateBoundsModifierKt$animateBounds$2 INSTANCE = new AnimateBoundsModifierKt$animateBounds$2();

    public AnimateBoundsModifierKt$animateBounds$2() {
        super(2);
    }

    @Override // defpackage.ts0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Constraints.m8001boximpl(m40invoke2pbfIzA(((IntSize) obj).m8220unboximpl(), ((Constraints) obj2).m8020unboximpl()));
    }

    /* renamed from: invoke-2pbfIzA, reason: not valid java name */
    public final long m40invoke2pbfIzA(long j, long j2) {
        return Constraints.Companion.m8024fixedJhjzzOo((int) (j >> 32), (int) (j & 4294967295L));
    }
}
