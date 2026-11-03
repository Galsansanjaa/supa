package defpackage;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import java.nio.charset.Charset;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i70 implements eu2, gy {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ CreateCredentialException e(Object obj) {
        return (CreateCredentialException) obj;
    }

    public static /* bridge */ /* synthetic */ CreateCredentialResponse f(Object obj) {
        return (CreateCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ GetCredentialException g(Object obj) {
        return (GetCredentialException) obj;
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse h(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* synthetic */ void i() {
        throw new rx(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + ((char) i2));
    }

    public static /* synthetic */ void k(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // defpackage.eu2
    public Object apply(Object obj) {
        ha0.b.getClass();
        return j70.a.h((g70) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // defpackage.gy
    public Object b(gn0 gn0Var) {
        Set n = gn0Var.n(ij.class);
        mu0 mu0Var = mu0.m;
        if (mu0Var == null) {
            synchronized (mu0.class) {
                try {
                    mu0Var = mu0.m;
                    if (mu0Var == null) {
                        mu0Var = new mu0(0);
                        mu0.m = mu0Var;
                    }
                } finally {
                }
            }
        }
        return new kc0(n, mu0Var);
    }
}
