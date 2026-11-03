package androidx.compose.animation;

import defpackage.bb1;
import defpackage.os0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$trackActiveMutableState$1$1 extends bb1 implements os0 {
    final /* synthetic */ SharedMutableTransformState $shared;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$trackActiveMutableState$1$1(SharedMutableTransformState sharedMutableTransformState) {
        super(0);
        this.$shared = sharedMutableTransformState;
    }

    @Override // defpackage.os0
    public /* bridge */ /* synthetic */ Object invoke() {
        m111invoke();
        return vy2.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m111invoke() {
        this.$shared.clear();
    }
}
