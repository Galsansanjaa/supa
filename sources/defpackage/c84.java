package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class c84 extends us3 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c84(String str, int i) {
        super(str);
        this.m = i;
    }

    @Override // defpackage.us3
    public final du3 a(hg2 hg2Var, List list) {
        int i = this.m;
        ju3 ju3Var = du3.e;
        switch (i) {
            case 0:
                return ju3Var;
            case 1:
            case 2:
                return this;
            case 3:
                return new zr3(Double.valueOf(0.0d));
            default:
                return ju3Var;
        }
    }
}
