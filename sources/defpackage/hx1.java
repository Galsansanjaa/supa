package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class hx1 {
    public static final hx1 a;
    public static final Logger b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [b00] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [hx1] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    static {
        ?? r7;
        p50 p50Var;
        p50 p50Var2;
        g6 g6Var = null;
        try {
            try {
                Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                r7 = 0;
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
        }
        int i = 21;
        p50 p50Var3 = new p50(g6Var, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i);
        p50 p50Var4 = new p50(g6Var, "setHostname", new Class[]{String.class}, i);
        if (Security.getProvider("GMSCore_OpenSSL") == null) {
            try {
                Class.forName("android.net.Network");
            } catch (ClassNotFoundException unused3) {
                p50Var = null;
                p50Var2 = null;
            }
        }
        p50Var = new p50(byte[].class, "getAlpnSelectedProtocol", new Class[0], i);
        p50Var2 = new p50(g6Var, "setAlpnProtocols", new Class[]{byte[].class}, i);
        r7 = new g6(p50Var3, p50Var4, p50Var, p50Var2);
        if (r7 == 0) {
            if (!("conscrypt".equals(System.getProperty("okhttp.platform")) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (r7 = b00.m()) == 0) {
                try {
                    r7 = new p71(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (NoSuchMethodException unused4) {
                    r7 = 0;
                }
                if (r7 == 0) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        g6Var = new g6(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                    r7 = g6Var != null ? g6Var : new Object();
                }
            }
        }
        a = r7;
        b = Logger.getLogger(ks1.class.getName());
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e12 e12Var = (e12) list.get(i);
            if (e12Var != e12.HTTP_1_0) {
                arrayList.add(e12Var.a);
            }
        }
        return arrayList;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public ux2 c(X509TrustManager x509TrustManager) {
        return new pm(d(x509TrustManager));
    }

    public xu2 d(X509TrustManager x509TrustManager) {
        return new ho(x509TrustManager.getAcceptedIssuers());
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public SSLContext g() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public Object i() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean j(String str) {
        return true;
    }

    public void k(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void l(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(5, str, (Throwable) obj);
    }
}
