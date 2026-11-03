package defpackage;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class os2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ps2 b;
    public final /* synthetic */ cc m;

    public /* synthetic */ os2(ps2 ps2Var, cc ccVar, int i, int i2) {
        this.a = i2;
        this.b = ps2Var;
        this.m = ccVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        cc ccVar = this.m;
        ps2 ps2Var = this.b;
        switch (i) {
            case 0:
                ps2Var.m.G(ccVar);
                return;
            case 1:
                ps2Var.n.h(ccVar);
                return;
            case 2:
                ps2Var.m.G(ccVar);
                ps2Var.h();
                return;
            default:
                ps2Var.m.G(ccVar);
                return;
        }
    }
}
