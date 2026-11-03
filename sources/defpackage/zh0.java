package defpackage;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class zh0 implements Easing {
    public final /* synthetic */ int a;

    public /* synthetic */ zh0(int i) {
        this.a = i;
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        switch (this.a) {
            case 0:
                return EasingFunctionsKt.a(f);
            case 1:
                return EasingFunctionsKt.e(f);
            case 2:
                return EasingFunctionsKt.f(f);
            case 3:
                return EasingFunctionsKt.b(f);
            case 4:
                return EasingFunctionsKt.d(f);
            case 5:
                return EasingFunctionsKt.c(f);
            default:
                return EasingKt.a(f);
        }
    }
}
