package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class iv0 {
    public static iv0 c;
    public final Context a;
    public volatile String b;

    public iv0(Context context) {
        this.a = context.getApplicationContext();
    }

    public static iv0 a(Context context) {
        iv0 iv0Var;
        dn3.o(context);
        synchronized (iv0.class) {
            try {
                iv0Var = c;
                if (iv0Var == null) {
                    a94.a(context);
                    iv0Var = new iv0(context);
                    c = iv0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iv0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv0.c(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static n44 d(PackageInfo packageInfo, n44... n44VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n54 n54Var = new n54(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < n44VarArr.length; i++) {
                if (n44VarArr[i].equals(n54Var)) {
                    return n44VarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r18) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv0.b(int):boolean");
    }
}
