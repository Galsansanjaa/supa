package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class oy0 extends vo1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ long m;
    public final /* synthetic */ xy0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(xy0 xy0Var, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.n = xy0Var;
        this.b = i;
        this.m = j;
    }

    @Override // defpackage.vo1
    public final void a() {
        xy0 xy0Var = this.n;
        try {
            xy0Var.B.v(this.b, this.m);
        } catch (IOException unused) {
            try {
                xy0Var.a(2, 2);
            } catch (IOException unused2) {
            }
        }
    }
}
