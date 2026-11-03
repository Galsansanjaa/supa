package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class w24 implements Comparable {
    public static int d(byte b) {
        return (b >> 5) & 7;
    }

    public static w24 e(byte... bArr) {
        bArr.getClass();
        c34 c34Var = new c34(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return ux2.T(c34Var);
        } finally {
            try {
                c34Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final w24 c(Class cls) {
        if (cls.isInstance(this)) {
            return (w24) cls.cast(this);
        }
        throw new Exception("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }
}
