package defpackage;

import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x63 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y63 b;
    public final /* synthetic */ cc m;

    public /* synthetic */ x63(y63 y63Var, cc ccVar, int i, int i2) {
        this.a = i2;
        this.b = y63Var;
        this.m = ccVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        cc ccVar = this.m;
        y63 y63Var = this.b;
        switch (i) {
            case 0:
                y63Var.m.s(ccVar);
                return true;
            default:
                y63Var.m.s(ccVar);
                return true;
        }
    }
}
