package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class l11 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote(DomExceptionUtils.SEPARATOR);
    public final y41 a;
    public final Context b;
    public final String c;
    public final zn0 d;
    public final ca0 e;
    public fj f;

    /* JADX WARN: Type inference failed for: r2v1, types: [y41, java.lang.Object] */
    public l11(Context context, String str, zn0 zn0Var, ca0 ca0Var) {
        if (context == null) {
            v5.m("appContext must not be null");
            throw null;
        }
        if (str == null) {
            v5.m("appIdentifier must not be null");
            throw null;
        }
        this.b = context;
        this.c = str;
        this.d = zn0Var;
        this.e = ca0Var;
        this.a = new Object();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(1:5))|6|(7:18|19|9|10|11|12|13)|8|9|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vn0 b(boolean r9) {
        /*
            r8 = this;
            p70 r2 = defpackage.p50.q
            o70 r0 = new o70
            r6 = 0
            r7 = 2
            r1 = 0
            java.lang.Class<p70> r3 = defpackage.p70.class
            java.lang.String r4 = "isNotMainThread"
            java.lang.String r5 = "isNotMainThread()Z"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Must not be called on a main thread, was called on "
            r0.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L44
            android.util.Log.d(r2, r0, r1)
        L44:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4 = 10000(0x2710, double:4.9407E-320)
            zn0 r8 = r8.d
            if (r9 == 0) goto L63
            r9 = r8
            yn0 r9 = (defpackage.yn0) r9     // Catch: java.lang.Exception -> L5c
            zc4 r9 = r9.f()     // Catch: java.lang.Exception -> L5c
            java.lang.Object r9 = defpackage.jh2.m(r9, r4, r3)     // Catch: java.lang.Exception -> L5c
            hj r9 = (defpackage.hj) r9     // Catch: java.lang.Exception -> L5c
            java.lang.String r9 = r9.a     // Catch: java.lang.Exception -> L5c
            goto L64
        L5c:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "Error getting Firebase authentication token."
            android.util.Log.w(r2, r0, r9)
        L63:
            r9 = r1
        L64:
            yn0 r8 = (defpackage.yn0) r8     // Catch: java.lang.Exception -> L72
            zc4 r8 = r8.e()     // Catch: java.lang.Exception -> L72
            java.lang.Object r8 = defpackage.jh2.m(r8, r4, r3)     // Catch: java.lang.Exception -> L72
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L72
            r1 = r8
            goto L79
        L72:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Error getting Firebase installation id."
            android.util.Log.w(r2, r0, r8)
        L79:
            vn0 r8 = new vn0
            r8.<init>(r1, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l11.b(boolean):vn0");
    }

    public final synchronized fj c() {
        String str;
        fj fjVar = this.f;
        if (fjVar != null && (fjVar.b != null || !this.e.a())) {
            return this.f;
        }
        jw0 jw0Var = jw0.A;
        jw0Var.o("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        jw0Var.o("Cached Firebase Installation ID: " + string);
        if (this.e.a()) {
            vn0 b = b(false);
            jw0Var.o("Fetched Firebase Installation ID: " + b.a);
            if (b.a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b = new vn0(str, null);
            }
            if (Objects.equals(b.a, string)) {
                this.f = new fj(sharedPreferences.getString("crashlytics.installation.id", null), b.a, b.b);
            } else {
                this.f = new fj(a(sharedPreferences, b.a), b.a, b.b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f = new fj(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f = new fj(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        jw0Var.o("Install IDs: " + this.f);
        return this.f;
    }

    public final String d() {
        String str;
        y41 y41Var = this.a;
        Context context = this.b;
        synchronized (y41Var) {
            try {
                String str2 = y41Var.a;
                if (str2 == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    str2 = installerPackageName;
                    y41Var.a = str2;
                }
                str = "".equals(str2) ? null : y41Var.a;
            } finally {
            }
        }
        return str;
    }
}
