package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object[] b;
    public final /* synthetic */ LifecycleOwner m;
    public final /* synthetic */ ps0 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ cd1(Object[] objArr, LifecycleOwner lifecycleOwner, ps0 ps0Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = objArr;
        this.m = lifecycleOwner;
        this.n = ps0Var;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 LifecycleResumeEffect$lambda$7;
        vy2 LifecycleStartEffect$lambda$7;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                LifecycleResumeEffect$lambda$7 = LifecycleEffectKt.LifecycleResumeEffect$lambda$7(this.b, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return LifecycleResumeEffect$lambda$7;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LifecycleStartEffect$lambda$7 = LifecycleEffectKt.LifecycleStartEffect$lambda$7(this.b, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return LifecycleStartEffect$lambda$7;
        }
    }
}
