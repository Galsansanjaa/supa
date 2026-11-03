package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mi3 {
    public final mc3 a;
    public final rb3 b;
    public final mh3 c;
    public final mu0 d;

    public mi3(mc3 mc3Var, rb3 rb3Var, mh3 mh3Var, mu0 mu0Var) {
        mc3Var.getClass();
        rb3Var.getClass();
        mh3Var.getClass();
        this.a = mc3Var;
        this.b = rb3Var;
        this.c = mh3Var;
        this.d = mu0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:24|25))(11:26|27|28|(2:30|(3:32|33|(1:35)))|36|(1:38)(1:40)|39|13|14|15|17)|12|13|14|15|17))|45|6|7|(0)(0)|12|13|14|15|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        r14 = r13.b;
        r14.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (((java.lang.System.currentTimeMillis() - r14.a.getLong("googleVendorLastUpdate", 0)) / androidx.compose.material3.internal.CalendarModelKt.MillisecondsIn24Hours) >= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        r14 = r13.b.j(29);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v11, types: [eg3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.c10 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.fi3
            if (r0 == 0) goto L13
            r0 = r14
            fi3 r0 = (defpackage.fi3) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            fi3 r0 = new fi3
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.b
            int r1 = r0.n
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r4 = "googleVendorLastUpdate"
            r5 = 1
            r6 = 29
            r7 = 0
            if (r1 == 0) goto L37
            if (r1 != r5) goto L30
            mi3 r13 = r0.a
            defpackage.ta3.H(r14)     // Catch: defpackage.zb3 -> L8d
            goto L77
        L30:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r13)
            r13 = 0
            return r13
        L37:
            defpackage.ta3.H(r14)
            mc3 r14 = r13.a     // Catch: defpackage.zb3 -> L8d
            boolean r14 = r14.a()     // Catch: defpackage.zb3 -> L8d
            rb3 r1 = r13.b
            if (r14 == 0) goto L7a
            r1.getClass()     // Catch: defpackage.zb3 -> L8d
            android.content.SharedPreferences r14 = r1.a     // Catch: defpackage.zb3 -> L8d
            long r9 = r14.getLong(r4, r7)     // Catch: defpackage.zb3 -> L8d
            long r11 = java.lang.System.currentTimeMillis()     // Catch: defpackage.zb3 -> L8d
            long r11 = r11 - r9
            long r11 = r11 / r2
            int r14 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r14 < 0) goto L7a
            long r9 = java.lang.System.currentTimeMillis()     // Catch: defpackage.zb3 -> L8d
            r14 = 30
            r1.d(r14, r9)     // Catch: defpackage.zb3 -> L8d
            mh3 r14 = r13.c     // Catch: defpackage.zb3 -> L8d
            java.lang.String r1 = "https://cmp.inmobi.com/"
            java.lang.String r9 = "tcfv2/google-atp-list.json"
            java.lang.String r1 = defpackage.jh2.Y(r9, r1)     // Catch: defpackage.zb3 -> L8d
            r0.a = r13     // Catch: defpackage.zb3 -> L8d
            r0.n = r5     // Catch: defpackage.zb3 -> L8d
            java.lang.Object r14 = r14.a(r1, r0)     // Catch: defpackage.zb3 -> L8d
            e50 r0 = defpackage.e50.a
            if (r14 != r0) goto L77
            return r0
        L77:
            java.lang.String r14 = (java.lang.String) r14     // Catch: defpackage.zb3 -> L8d
            goto Lab
        L7a:
            com.inmobi.cmp.ChoiceCmp r14 = com.inmobi.cmp.ChoiceCmp.INSTANCE     // Catch: defpackage.zb3 -> L8d
            com.inmobi.cmp.ChoiceCmpCallback r14 = r14.getCallback()     // Catch: defpackage.zb3 -> L8d
            if (r14 != 0) goto L83
            goto L88
        L83:
            com.inmobi.cmp.model.ChoiceError r0 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: defpackage.zb3 -> L8d
            r14.onCmpError(r0)     // Catch: defpackage.zb3 -> L8d
        L88:
            java.lang.String r14 = r1.j(r6)     // Catch: defpackage.zb3 -> L8d
            goto Lab
        L8d:
            rb3 r14 = r13.b
            r14.getClass()
            android.content.SharedPreferences r14 = r14.a
            long r0 = r14.getLong(r4, r7)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r0
            long r4 = r4 / r2
            int r14 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r14 < 0) goto La5
            java.lang.String r14 = ""
            goto Lab
        La5:
            rb3 r14 = r13.b
            java.lang.String r14 = r14.j(r6)
        Lab:
            rb3 r0 = r13.b
            r0.f(r6, r14)
            mu0 r13 = r13.d
            r13.getClass()
            r14.getClass()
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lcb
            r0.<init>(r14)     // Catch: org.json.JSONException -> Lcb
            r13.b = r0     // Catch: org.json.JSONException -> Lcb
            eg3 r14 = new eg3     // Catch: org.json.JSONException -> Lcb
            java.util.LinkedHashMap r13 = r13.p()     // Catch: org.json.JSONException -> Lcb
            r14.<init>()     // Catch: org.json.JSONException -> Lcb
            r14.a = r13     // Catch: org.json.JSONException -> Lcb
            goto Lde
        Lcb:
            com.inmobi.cmp.ChoiceCmp r13 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            com.inmobi.cmp.ChoiceCmpCallback r13 = r13.getCallback()
            if (r13 != 0) goto Ld4
            goto Ld9
        Ld4:
            com.inmobi.cmp.model.ChoiceError r14 = com.inmobi.cmp.model.ChoiceError.INVALID_JSON_FORMAT
            r13.onCmpError(r14)
        Ld9:
            eg3 r14 = new eg3
            r14.<init>()
        Lde:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi3.a(c10):java.lang.Object");
    }
}
