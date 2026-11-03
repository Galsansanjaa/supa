package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ LifecycleOwner o;
    public final /* synthetic */ ps0 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    public /* synthetic */ ed1(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, ps0 ps0Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = lifecycleOwner;
        this.p = ps0Var;
        this.q = i;
        this.r = i2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 LifecycleResumeEffect$lambda$5;
        vy2 LifecycleStartEffect$lambda$5;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LifecycleResumeEffect$lambda$5 = LifecycleEffectKt.LifecycleResumeEffect$lambda$5(this.b, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue);
                return LifecycleResumeEffect$lambda$5;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LifecycleStartEffect$lambda$5 = LifecycleEffectKt.LifecycleStartEffect$lambda$5(this.b, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue2);
                return LifecycleStartEffect$lambda$5;
        }
    }
}
