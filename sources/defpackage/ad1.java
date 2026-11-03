package defpackage;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ad1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ LifecycleOwner m;
    public final /* synthetic */ ps0 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ ad1(Object obj, LifecycleOwner lifecycleOwner, ps0 ps0Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = obj;
        this.m = lifecycleOwner;
        this.n = ps0Var;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.n(this.b, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.s(this.b, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
        }
    }
}
