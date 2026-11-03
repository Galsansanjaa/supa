package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;
    public final /* synthetic */ LifecycleOwner n;
    public final /* synthetic */ ps0 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    public /* synthetic */ dd1(Object obj, Object obj2, LifecycleOwner lifecycleOwner, ps0 ps0Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.m = obj2;
        this.n = lifecycleOwner;
        this.o = ps0Var;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 LifecycleStartEffect$lambda$3;
        vy2 LifecycleResumeEffect$lambda$3;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LifecycleStartEffect$lambda$3 = LifecycleEffectKt.LifecycleStartEffect$lambda$3(this.b, this.m, this.n, this.o, this.p, this.q, (Composer) obj, intValue);
                return LifecycleStartEffect$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LifecycleResumeEffect$lambda$3 = LifecycleEffectKt.LifecycleResumeEffect$lambda$3(this.b, this.m, this.n, this.o, this.p, this.q, (Composer) obj, intValue2);
                return LifecycleResumeEffect$lambda$3;
        }
    }
}
