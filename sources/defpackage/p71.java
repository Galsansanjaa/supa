package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class p71 extends hx1 {
    public final Method c;
    public final Method d;

    public p71(Method method, Method method2) {
        this.c = method;
        this.d = method2;
    }

    @Override // defpackage.hx1
    public final void e(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b = hx1.b(list);
            try {
                this.c.invoke(sSLParameters, b.toArray(new String[b.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (InvocationTargetException e) {
                e = e;
                throw f63.a("unable to set ssl parameters", e);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            e = e2;
        }
    }

    @Override // defpackage.hx1
    public final String h(SSLSocket sSLSocket) {
        try {
            String str = (String) this.d.invoke(sSLSocket, null);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw f63.a("unable to get selected protocols", e);
        }
    }
}
