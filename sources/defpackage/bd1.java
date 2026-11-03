package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LifecycleOwner b;
    public final /* synthetic */ ps0 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ bd1(LifecycleOwner lifecycleOwner, ps0 ps0Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = lifecycleOwner;
        this.m = ps0Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 LifecycleStartEffect$lambda$8;
        vy2 LifecycleResumeEffect$lambda$8;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LifecycleStartEffect$lambda$8 = LifecycleEffectKt.LifecycleStartEffect$lambda$8(this.b, this.m, this.n, this.o, (Composer) obj, intValue);
                return LifecycleStartEffect$lambda$8;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LifecycleResumeEffect$lambda$8 = LifecycleEffectKt.LifecycleResumeEffect$lambda$8(this.b, this.m, this.n, this.o, (Composer) obj, intValue2);
                return LifecycleResumeEffect$lambda$8;
        }
    }
}
