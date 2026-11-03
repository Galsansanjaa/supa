package defpackage;

import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class wv0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x42 b;
    public final /* synthetic */ x42 m;

    public /* synthetic */ wv0(x42 x42Var, x42 x42Var2, int i) {
        this.a = i;
        this.b = x42Var;
        this.m = x42Var2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        x42 x42Var = this.m;
        x42 x42Var2 = this.b;
        ki1 ki1Var = (ki1) obj;
        switch (i) {
            case 0:
                return HandwritingGestureApi34.a(x42Var2, x42Var, ki1Var);
            default:
                return HandwritingGestureApi34.b(x42Var2, x42Var, ki1Var);
        }
    }
}
