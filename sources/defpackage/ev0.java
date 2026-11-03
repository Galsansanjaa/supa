package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ev0 {
    public n23 a;
    public String b;
    public boolean c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r5, defpackage.c10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cv0
            if (r0 == 0) goto L13
            r0 = r6
            cv0 r0 = (defpackage.cv0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            cv0 r0 = new cv0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.a
            int r6 = r0.m
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L26
            defpackage.ta3.H(r4)     // Catch: java.lang.Throwable -> L65
            goto L52
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r2
        L2c:
            defpackage.ta3.H(r4)
            androidx.credentials.CredentialManager$Companion r4 = androidx.credentials.CredentialManager.Companion     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            androidx.credentials.CredentialManager r4 = r4.create(r5)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            cu0 r6 = new cu0     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            r6.<init>()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            androidx.credentials.GetCredentialRequest$Builder r3 = new androidx.credentials.GetCredentialRequest$Builder     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            r3.<init>()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            androidx.credentials.GetCredentialRequest$Builder r6 = r3.addCredentialOption(r6)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            androidx.credentials.GetCredentialRequest r6 = r6.build()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            r0.m = r1     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            java.lang.Object r4 = r4.getCredential(r5, r6, r0)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            e50 r5 = defpackage.e50.a
            if (r4 != r5) goto L52
            return r5
        L52:
            androidx.credentials.GetCredentialResponse r4 = (androidx.credentials.GetCredentialResponse) r4     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            int r5 = defpackage.av0.b     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            androidx.credentials.Credential r4 = r4.getCredential()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            android.os.Bundle r4 = r4.getData()     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            av0 r4 = defpackage.zu0.c(r4)     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> L65 java.lang.Throwable -> L65
            return r4
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev0.a(android.content.Context, c10):java.lang.Object");
    }

    public final void b(Context context, String str, w72 w72Var) {
        this.c = true;
        l23.c(context);
        this.a = null;
        if (str != null) {
            this.b = str;
        }
        Bundle o = yo0.o(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "loginSource", "google");
        if (w72Var != null) {
            o.putString("responseCode", String.valueOf(w72Var.b));
            String str2 = w72Var.c;
            if (str2 != null) {
                o.putString("exception", str2);
            }
        }
        new xk0(context, 23).w(o, "login");
    }
}
