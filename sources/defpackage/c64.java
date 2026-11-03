package defpackage;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c64 implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ c64(boolean z, String str, n54 n54Var) {
        this.a = z;
        this.b = str;
        this.c = n54Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.a;
        String str = this.b;
        n54 n54Var = this.c;
        String str2 = (z || !a94.c(str, n54Var, true, false).a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        dn3.o(messageDigest);
        byte[] digest = messageDigest.digest(n54Var.l);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : digest) {
            char[] cArr2 = ea0.c;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & StylePropertiesKt.RightId];
            i2 += 2;
        }
        StringBuilder D = lt.D(str2, ": pkg=", str, ", sha256=", new String(cArr));
        D.append(", atk=");
        D.append(z);
        D.append(", ver=12451000.false");
        return D.toString();
    }
}
