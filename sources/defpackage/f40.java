package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class f40 {
    public final Context a;

    public f40(Context context) {
        context.getClass();
        this.a = context;
    }

    public void a(long j, String str) {
        try {
            SharedPreferences.Editor edit = this.a.getSharedPreferences("sp_uptodown_services", 0).edit();
            edit.putLong("versioncode_registered", j);
            edit.putString("device_registered", str == null ? null : ea0.d(str));
            edit.remove("versioncode_rejected");
            edit.remove("sdk_versioncode_rejected");
            edit.remove("device_rejected");
            edit.remove("rejected_http_status");
            edit.remove("rejected_error_code");
            edit.remove("rejected_message");
            edit.apply();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r10, defpackage.c10 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.i50
            if (r0 == 0) goto L13
            r0 = r12
            i50 r0 = (defpackage.i50) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            i50 r0 = new i50
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.ta3.H(r12)
            goto L47
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.ta3.H(r12)
            bc0 r12 = defpackage.oe0.a
            zb0 r12 = defpackage.zb0.a
            j50 r3 = new j50
            r7 = 0
            r8 = 0
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r7, r8)
            r0.m = r2
            java.lang.Object r12 = defpackage.od4.D(r12, r3, r0)
            e50 r9 = defpackage.e50.a
            if (r12 != r9) goto L47
            return r9
        L47:
            i82 r12 = (defpackage.i82) r12
            java.lang.Object r9 = r12.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f40.b(long, c10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r10, defpackage.c10 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.k50
            if (r0 == 0) goto L13
            r0 = r12
            k50 r0 = (defpackage.k50) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            k50 r0 = new k50
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.ta3.H(r12)
            goto L47
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.ta3.H(r12)
            bc0 r12 = defpackage.oe0.a
            zb0 r12 = defpackage.zb0.a
            j50 r3 = new j50
            r7 = 0
            r8 = 1
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r7, r8)
            r0.m = r2
            java.lang.Object r12 = defpackage.od4.D(r12, r3, r0)
            e50 r9 = defpackage.e50.a
            if (r12 != r9) goto L47
            return r9
        L47:
            i82 r12 = (defpackage.i82) r12
            java.lang.Object r9 = r12.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f40.c(long, c10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.c10 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.l50
            if (r0 == 0) goto L13
            r0 = r6
            l50 r0 = (defpackage.l50) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            l50 r0 = new l50
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.ta3.H(r6)
            goto L45
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r2
        L2c:
            defpackage.ta3.H(r6)
            bc0 r6 = defpackage.oe0.a
            zb0 r6 = defpackage.zb0.a
            z8 r1 = new z8
            r4 = 11
            r1.<init>(r5, r2, r4)
            r0.m = r3
            java.lang.Object r6 = defpackage.od4.D(r6, r1, r0)
            e50 r5 = defpackage.e50.a
            if (r6 != r5) goto L45
            return r5
        L45:
            i82 r6 = (defpackage.i82) r6
            java.lang.Object r5 = r6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f40.d(c10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(int r10, int r11, defpackage.c10 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.m50
            if (r0 == 0) goto L13
            r0 = r12
            m50 r0 = (defpackage.m50) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            m50 r0 = new m50
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.ta3.H(r12)
            goto L48
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.ta3.H(r12)
            bc0 r12 = defpackage.oe0.a
            zb0 r12 = defpackage.zb0.a
            q40 r3 = new q40
            r7 = 0
            r8 = 1
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.m = r2
            java.lang.Object r12 = defpackage.od4.D(r12, r3, r0)
            e50 r9 = defpackage.e50.a
            if (r12 != r9) goto L48
            return r9
        L48:
            i82 r12 = (defpackage.i82) r12
            java.lang.Object r9 = r12.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f40.e(int, int, c10):java.lang.Object");
    }
}
