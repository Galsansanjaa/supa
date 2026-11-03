package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qr1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr1 b;
    public final /* synthetic */ String m;

    public /* synthetic */ qr1(rr1 rr1Var, String str, int i) {
        this.a = i;
        this.b = rr1Var;
        this.m = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.m;
        rr1 rr1Var = this.b;
        switch (i) {
            case 0:
                rr1Var.G();
                rr1Var.l(str);
                return;
            default:
                rr1Var.G();
                rr1Var.l(str);
                return;
        }
    }
}
