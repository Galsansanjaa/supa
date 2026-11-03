package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class la2 extends RuntimeException {
    public static final Method b;
    public IOException a;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        b = method;
    }

    public la2(IOException iOException) {
        super(iOException);
        this.a = iOException;
    }
}
