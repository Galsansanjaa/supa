package defpackage;

import androidx.compose.material3.CheckboxKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps0 b;
    public final /* synthetic */ boolean m;

    public /* synthetic */ e3(int i, boolean z, ps0 ps0Var) {
        this.a = i;
        this.b = ps0Var;
        this.m = z;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        boolean z = this.m;
        ps0 ps0Var = this.b;
        switch (i) {
            case 0:
                ps0Var.invoke(Boolean.valueOf(!z));
                return vy2.a;
            case 1:
                return CheckboxKt.e(ps0Var, z);
            default:
                return CheckboxKt.a(ps0Var, z);
        }
    }
}
