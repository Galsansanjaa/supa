package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu2 b;

    public /* synthetic */ vo(bu2 bu2Var, int i) {
        this.a = i;
        this.b = bu2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bu2 bu2Var = this.b;
        switch (i) {
            case 0:
                throw new IllegalStateException("Transformation " + bu2Var.key() + " returned input Bitmap but recycled it.");
            default:
                throw new IllegalStateException("Transformation " + bu2Var.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }
}
