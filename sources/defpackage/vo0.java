package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vo0 extends vr0 {
    public final long b;
    public final boolean m;
    public long n;

    public vo0(uk2 uk2Var, long j, boolean z) {
        super(uk2Var);
        this.b = j;
        this.m = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, tq] */
    @Override // defpackage.vr0, defpackage.uk2
    public final long r(tq tqVar, long j) {
        tqVar.getClass();
        long j2 = this.n;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.m) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long r = this.a.r(tqVar, j);
        if (r != -1) {
            this.n += r;
        }
        long j5 = this.n;
        if ((j5 >= j3 || r != -1) && j5 <= j3) {
            return r;
        }
        if (r > 0 && j5 > j3) {
            long j6 = tqVar.b - (j5 - j3);
            ?? obj = new Object();
            obj.z(tqVar);
            tqVar.o(obj, j6);
            obj.skip(obj.b);
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.n);
    }
}
