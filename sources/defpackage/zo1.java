package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class zo1 implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts0 b;
    public final /* synthetic */ ts0 m;
    public final /* synthetic */ ts0 n;
    public final /* synthetic */ ts0 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ os0 q;
    public final /* synthetic */ os0 r;
    public final /* synthetic */ int s;

    public /* synthetic */ zo1(ts0 ts0Var, ts0 ts0Var2, ts0 ts0Var3, ts0 ts0Var4, boolean z, os0 os0Var, os0 os0Var2, int i, int i2) {
        this.a = i2;
        this.b = ts0Var;
        this.m = ts0Var2;
        this.n = ts0Var3;
        this.o = ts0Var4;
        this.p = z;
        this.q = os0Var;
        this.r = os0Var2;
        this.s = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        vy2 NavigationBarItemLayout$lambda$23;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                NavigationBarItemLayout$lambda$23 = NavigationBarKt.NavigationBarItemLayout$lambda$23(this.b, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, intValue);
                return NavigationBarItemLayout$lambda$23;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return NavigationRailKt.i(this.b, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (Composer) obj, intValue2);
        }
    }
}
