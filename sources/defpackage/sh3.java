package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sh3 {
    public final Locale a;
    public final mc3 b;
    public final rb3 c;
    public final mh3 d;
    public final a01 e;

    public sh3(Locale locale, mc3 mc3Var, rb3 rb3Var, mh3 mh3Var, a01 a01Var) {
        mc3Var.getClass();
        rb3Var.getClass();
        mh3Var.getClass();
        this.a = locale;
        this.b = mc3Var;
        this.c = rb3Var;
        this.d = mh3Var;
        this.e = a01Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(4:(2:3|(9:5|6|7|(1:(2:10|11)(2:24|25))(3:26|27|(3:29|30|(1:32))(7:33|(1:35)(1:37)|36|13|14|15|17))|12|13|14|15|17))|14|15|17)|39|6|7|(0)(0)|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        r7 = r6.c.j(41);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.c10 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.nh3
            if (r0 == 0) goto L13
            r0 = r7
            nh3 r0 = (defpackage.nh3) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            nh3 r0 = new nh3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.n
            r2 = 1
            r3 = 41
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            sh3 r6 = r0.a
            defpackage.ta3.H(r7)     // Catch: defpackage.zb3 -> L82
            goto L6a
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r6)
            r6 = 0
            return r6
        L30:
            defpackage.ta3.H(r7)
            mc3 r7 = r6.b     // Catch: defpackage.zb3 -> L82
            boolean r7 = r7.a()     // Catch: defpackage.zb3 -> L82
            if (r7 == 0) goto L6d
            mh3 r7 = r6.d     // Catch: defpackage.zb3 -> L82
            java.lang.String r1 = defpackage.ta3.j()     // Catch: defpackage.zb3 -> L82
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: defpackage.zb3 -> L82
            java.lang.String r5 = "https://cmp.inmobi.com/google-basic-consent/v1/purposes-"
            r4.<init>(r5)     // Catch: defpackage.zb3 -> L82
            java.util.Locale r5 = r6.a     // Catch: defpackage.zb3 -> L82
            java.lang.String r1 = r1.toLowerCase(r5)     // Catch: defpackage.zb3 -> L82
            r1.getClass()     // Catch: defpackage.zb3 -> L82
            r4.append(r1)     // Catch: defpackage.zb3 -> L82
            java.lang.String r1 = ".json"
            r4.append(r1)     // Catch: defpackage.zb3 -> L82
            java.lang.String r1 = r4.toString()     // Catch: defpackage.zb3 -> L82
            r0.a = r6     // Catch: defpackage.zb3 -> L82
            r0.n = r2     // Catch: defpackage.zb3 -> L82
            java.lang.Object r7 = r7.a(r1, r0)     // Catch: defpackage.zb3 -> L82
            e50 r0 = defpackage.e50.a
            if (r7 != r0) goto L6a
            return r0
        L6a:
            java.lang.String r7 = (java.lang.String) r7     // Catch: defpackage.zb3 -> L82
            goto L88
        L6d:
            com.inmobi.cmp.ChoiceCmp r7 = com.inmobi.cmp.ChoiceCmp.INSTANCE     // Catch: defpackage.zb3 -> L82
            com.inmobi.cmp.ChoiceCmpCallback r7 = r7.getCallback()     // Catch: defpackage.zb3 -> L82
            if (r7 != 0) goto L76
            goto L7b
        L76:
            com.inmobi.cmp.model.ChoiceError r0 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: defpackage.zb3 -> L82
            r7.onCmpError(r0)     // Catch: defpackage.zb3 -> L82
        L7b:
            rb3 r7 = r6.c     // Catch: defpackage.zb3 -> L82
            java.lang.String r7 = r7.j(r3)     // Catch: defpackage.zb3 -> L82
            goto L88
        L82:
            rb3 r7 = r6.c
            java.lang.String r7 = r7.j(r3)
        L88:
            rb3 r0 = r6.c
            r0.f(r3, r7)
            a01 r6 = r6.e
            r6.getClass()
            r7.getClass()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb0
            r0.<init>(r7)     // Catch: org.json.JSONException -> Lb0
            r6.b = r0     // Catch: org.json.JSONException -> Lb0
            id3 r7 = new id3     // Catch: org.json.JSONException -> Lb0
            java.lang.String r1 = "language"
            java.lang.String r0 = r0.optString(r1)     // Catch: org.json.JSONException -> Lb0
            gb3 r1 = r6.a()     // Catch: org.json.JSONException -> Lb0
            java.util.ArrayList r6 = r6.b()     // Catch: org.json.JSONException -> Lb0
            r7.<init>(r0, r1, r6)     // Catch: org.json.JSONException -> Lb0
            goto Lc3
        Lb0:
            com.inmobi.cmp.ChoiceCmp r6 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            com.inmobi.cmp.ChoiceCmpCallback r6 = r6.getCallback()
            if (r6 != 0) goto Lb9
            goto Lbe
        Lb9:
            com.inmobi.cmp.model.ChoiceError r7 = com.inmobi.cmp.model.ChoiceError.INVALID_JSON_FORMAT
            r6.onCmpError(r7)
        Lbe:
            id3 r7 = new id3
            r7.<init>()
        Lc3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh3.a(c10):java.lang.Object");
    }
}
