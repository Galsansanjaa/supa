package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mh3 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, defpackage.c10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.rd3
            if (r0 == 0) goto L13
            r0 = r6
            rd3 r0 = (defpackage.rd3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            rd3 r0 = new rd3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.m
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L2c
            if (r6 != r2) goto L26
            defpackage.ta3.H(r4)     // Catch: java.lang.Exception -> L4c
            goto L49
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r1
        L2c:
            defpackage.ta3.H(r4)
            java.lang.String r4 = "Calling api"
            defpackage.ej1.f(r4, r5)     // Catch: java.lang.Exception -> L4c
            bc0 r4 = defpackage.oe0.a     // Catch: java.lang.Exception -> L4c
            zb0 r4 = defpackage.zb0.a     // Catch: java.lang.Exception -> L4c
            me3 r6 = new me3     // Catch: java.lang.Exception -> L4c
            r3 = 0
            r6.<init>(r5, r1, r3)     // Catch: java.lang.Exception -> L4c
            r0.m = r2     // Catch: java.lang.Exception -> L4c
            java.lang.Object r4 = defpackage.od4.D(r4, r6, r0)     // Catch: java.lang.Exception -> L4c
            e50 r5 = defpackage.e50.a
            if (r4 != r5) goto L49
            return r5
        L49:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L4c
            return r4
        L4c:
            r4 = move-exception
            boolean r5 = r4 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L52
            goto L65
        L52:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L57
            goto L65
        L57:
            boolean r5 = r4 instanceof java.net.SocketException
            if (r5 == 0) goto L5c
            goto L65
        L5c:
            boolean r5 = r4 instanceof java.net.MalformedURLException
            if (r5 == 0) goto L61
            goto L65
        L61:
            boolean r5 = r4 instanceof java.lang.NullPointerException
            if (r5 == 0) goto L68
        L65:
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_CALL_FAILED
            goto L71
        L68:
            boolean r4 = r4 instanceof java.io.FileNotFoundException
            if (r4 == 0) goto L6f
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR
            goto L71
        L6f:
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_UNEXPECTED_ERROR
        L71:
            com.inmobi.cmp.ChoiceCmp r5 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            com.inmobi.cmp.ChoiceCmpCallback r5 = r5.getCallback()
            if (r5 != 0) goto L7a
            goto L7d
        L7a:
            r5.onCmpError(r4)
        L7d:
            zb3 r5 = new zb3
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh3.a(java.lang.String, c10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, defpackage.c10 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.vg3
            if (r0 == 0) goto L13
            r0 = r7
            vg3 r0 = (defpackage.vg3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            vg3 r0 = new vg3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            int r7 = r0.m
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L2c
            if (r7 != r2) goto L26
            defpackage.ta3.H(r4)     // Catch: java.lang.Exception -> L46
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r1
        L2c:
            defpackage.ta3.H(r4)
            bc0 r4 = defpackage.oe0.a     // Catch: java.lang.Exception -> L46
            zb0 r4 = defpackage.zb0.a     // Catch: java.lang.Exception -> L46
            lo1 r7 = new lo1     // Catch: java.lang.Exception -> L46
            r7.<init>(r5, r6, r1, r2)     // Catch: java.lang.Exception -> L46
            r0.m = r2     // Catch: java.lang.Exception -> L46
            java.lang.Object r4 = defpackage.od4.D(r4, r7, r0)     // Catch: java.lang.Exception -> L46
            e50 r5 = defpackage.e50.a
            if (r4 != r5) goto L43
            return r5
        L43:
            vy2 r4 = defpackage.vy2.a
            return r4
        L46:
            r4 = move-exception
            boolean r5 = r4 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L4c
            goto L5f
        L4c:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L51
            goto L5f
        L51:
            boolean r5 = r4 instanceof java.net.SocketException
            if (r5 == 0) goto L56
            goto L5f
        L56:
            boolean r5 = r4 instanceof java.net.MalformedURLException
            if (r5 == 0) goto L5b
            goto L5f
        L5b:
            boolean r5 = r4 instanceof java.lang.NullPointerException
            if (r5 == 0) goto L62
        L5f:
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_CALL_FAILED
            goto L6b
        L62:
            boolean r4 = r4 instanceof java.io.FileNotFoundException
            if (r4 == 0) goto L69
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR
            goto L6b
        L69:
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_UNEXPECTED_ERROR
        L6b:
            com.inmobi.cmp.ChoiceCmp r5 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            com.inmobi.cmp.ChoiceCmpCallback r5 = r5.getCallback()
            if (r5 != 0) goto L74
            goto L77
        L74:
            r5.onCmpError(r4)
        L77:
            zb3 r5 = new zb3
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh3.b(java.lang.String, java.lang.String, c10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.c10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ye3
            if (r0 == 0) goto L13
            r0 = r6
            ye3 r0 = (defpackage.ye3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            ye3 r0 = new ye3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.m
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L2c
            if (r6 != r2) goto L26
            defpackage.ta3.H(r4)     // Catch: java.lang.Exception -> L4b
            goto L48
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r1
        L2c:
            defpackage.ta3.H(r4)
            java.lang.String r4 = "Calling api"
            defpackage.ej1.f(r4, r5)     // Catch: java.lang.Exception -> L4b
            bc0 r4 = defpackage.oe0.a     // Catch: java.lang.Exception -> L4b
            zb0 r4 = defpackage.zb0.a     // Catch: java.lang.Exception -> L4b
            me3 r6 = new me3     // Catch: java.lang.Exception -> L4b
            r6.<init>(r5, r1, r2)     // Catch: java.lang.Exception -> L4b
            r0.m = r2     // Catch: java.lang.Exception -> L4b
            java.lang.Object r4 = defpackage.od4.D(r4, r6, r0)     // Catch: java.lang.Exception -> L4b
            e50 r5 = defpackage.e50.a
            if (r4 != r5) goto L48
            return r5
        L48:
            pb3 r4 = (defpackage.pb3) r4     // Catch: java.lang.Exception -> L4b
            return r4
        L4b:
            r4 = move-exception
            boolean r5 = r4 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L51
            goto L64
        L51:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L56
            goto L64
        L56:
            boolean r5 = r4 instanceof java.net.SocketException
            if (r5 == 0) goto L5b
            goto L64
        L5b:
            boolean r5 = r4 instanceof java.net.MalformedURLException
            if (r5 == 0) goto L60
            goto L64
        L60:
            boolean r5 = r4 instanceof java.lang.NullPointerException
            if (r5 == 0) goto L67
        L64:
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_CALL_FAILED
            goto L70
        L67:
            boolean r4 = r4 instanceof java.io.FileNotFoundException
            if (r4 == 0) goto L6e
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR
            goto L70
        L6e:
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_UNEXPECTED_ERROR
        L70:
            com.inmobi.cmp.ChoiceCmp r5 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            com.inmobi.cmp.ChoiceCmpCallback r5 = r5.getCallback()
            if (r5 != 0) goto L79
            goto L7c
        L79:
            r5.onCmpError(r4)
        L7c:
            zb3 r5 = new zb3
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh3.c(java.lang.String, c10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.c10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zf3
            if (r0 == 0) goto L13
            r0 = r6
            zf3 r0 = (defpackage.zf3) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            zf3 r0 = new zf3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.m
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L2c
            if (r6 != r2) goto L26
            defpackage.ta3.H(r4)     // Catch: java.lang.Exception -> L4a
            goto L44
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r1
        L2c:
            defpackage.ta3.H(r4)
            bc0 r4 = defpackage.oe0.a     // Catch: java.lang.Exception -> L4a
            zb0 r4 = defpackage.zb0.a     // Catch: java.lang.Exception -> L4a
            me3 r6 = new me3     // Catch: java.lang.Exception -> L4a
            r3 = 2
            r6.<init>(r5, r1, r3)     // Catch: java.lang.Exception -> L4a
            r0.m = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = defpackage.od4.D(r4, r6, r0)     // Catch: java.lang.Exception -> L4a
            e50 r5 = defpackage.e50.a
            if (r4 != r5) goto L44
            return r5
        L44:
            r4.getClass()     // Catch: java.lang.Exception -> L4a
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Exception -> L4a
            return r4
        L4a:
            r4 = move-exception
            boolean r5 = r4 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L50
            goto L63
        L50:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L55
            goto L63
        L55:
            boolean r5 = r4 instanceof java.net.SocketException
            if (r5 == 0) goto L5a
            goto L63
        L5a:
            boolean r5 = r4 instanceof java.net.MalformedURLException
            if (r5 == 0) goto L5f
            goto L63
        L5f:
            boolean r5 = r4 instanceof java.lang.NullPointerException
            if (r5 == 0) goto L66
        L63:
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.FAILED_LOGO_DOWNLOAD
            goto L6f
        L66:
            boolean r4 = r4 instanceof java.io.FileNotFoundException
            if (r4 == 0) goto L6d
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR
            goto L6f
        L6d:
            com.inmobi.cmp.model.ChoiceError r4 = com.inmobi.cmp.model.ChoiceError.NETWORK_UNEXPECTED_ERROR
        L6f:
            com.inmobi.cmp.ChoiceCmp r5 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            com.inmobi.cmp.ChoiceCmpCallback r5 = r5.getCallback()
            if (r5 != 0) goto L78
            goto L7b
        L78:
            r5.onCmpError(r4)
        L7b:
            zb3 r5 = new zb3
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh3.d(java.lang.String, c10):java.lang.Object");
    }
}
