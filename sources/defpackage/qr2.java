package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qr2 extends wb2 implements Runnable {
    public final long o;

    public qr2(long j, a10 a10Var) {
        super(a10Var, a10Var.getContext());
        this.o = j;
    }

    @Override // defpackage.a81
    public final String R() {
        return super.R() + "(timeMillis=" + this.o + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        j20 j20Var = this.m;
        ux2.F(j20Var);
        String str = ((g40) j20Var.get(g40.a)) != null ? "Room Invalidation Tracker Refresh" : null;
        String B = vg1.B(this.o, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder w = sg3.w("Coroutine \"", str, "\" ");
            if (B.length() > 0) {
                B = Character.toLowerCase(B.charAt(0)) + B.substring(1);
            }
            w.append(B);
            B = w.toString();
        }
        v(new pr2(B, this));
    }
}
