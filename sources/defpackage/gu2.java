package defpackage;

import androidx.compose.animation.core.Transition;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class gu2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Transition b;

    public /* synthetic */ gu2(Transition transition, int i) {
        this.a = i;
        this.b = transition;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        Transition transition = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(Transition.c(transition));
            default:
                return Long.valueOf(Transition.d(transition));
        }
    }
}
