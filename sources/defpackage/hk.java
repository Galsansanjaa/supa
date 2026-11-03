package defpackage;

import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class hk implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ rs0 o;

    public /* synthetic */ hk(boolean z, rs0 rs0Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.o = rs0Var;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return BackHandler_androidKt.b(this.b, (os0) this.o, this.m, this.n, (Composer) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return BackHandler_androidKt.a(this.b, (ts0) this.o, this.m, this.n, (Composer) obj, intValue2);
        }
    }
}
