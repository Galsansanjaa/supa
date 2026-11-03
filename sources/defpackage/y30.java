package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class y30 implements ct1 {
    public long a;
    public Object b;

    public y30(Context context, long j) {
        context.getClass();
        this.b = context;
        this.a = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.a10 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.x30
            if (r0 == 0) goto L13
            r0 = r6
            x30 r0 = (defpackage.x30) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            x30 r0 = new x30
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.ta3.H(r6)
            goto L44
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r2
        L2c:
            defpackage.ta3.H(r6)
            bc0 r6 = defpackage.oe0.a
            zb0 r6 = defpackage.zb0.a
            z8 r1 = new z8
            r4 = 7
            r1.<init>(r5, r2, r4)
            r0.m = r3
            java.lang.Object r6 = defpackage.od4.D(r6, r1, r0)
            e50 r5 = defpackage.e50.a
            if (r6 != r5) goto L44
            return r5
        L44:
            i82 r6 = (defpackage.i82) r6
            java.lang.Object r5 = r6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y30.a(a10):java.lang.Object");
    }

    public void b() {
        g24 g24Var = (g24) this.b;
        g24Var.r();
        ((t34) g24Var.a).u.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = g24Var.w().edit();
        edit.remove("health_monitor:count");
        edit.remove("health_monitor:value");
        edit.putLong("health_monitor:start", currentTimeMillis);
        edit.apply();
    }

    @Override // defpackage.ct1
    public /* synthetic */ void e(Exception exc) {
        oc3 oc3Var = (oc3) this.b;
        ((AtomicLong) oc3Var.n).set(this.a);
    }
}
