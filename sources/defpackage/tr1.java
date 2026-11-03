package defpackage;

import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.uptodown.UptodownApp;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class tr1 {
    public final jm3 a;
    public final gn0 b;
    public final dq1 c;
    public Socket d;
    public Socket e;
    public jn0 f;

    public tr1(Context context, jm3 jm3Var) {
        jm3Var.getClass();
        this.a = jm3Var;
        this.b = new gn0(context, jm3Var, this);
        this.c = new dq1(jm3Var, this);
    }

    public final void a() {
        yr1 yr1Var = k13.y;
        NsdServiceInfo nsdServiceInfo = yr1Var != null ? yr1Var.f : null;
        if (nsdServiceInfo != null) {
            jm3 jm3Var = this.a;
            try {
                InetAddress host = nsdServiceInfo.getHost();
                if (Build.VERSION.SDK_INT >= 34) {
                    Iterator<InetAddress> it = nsdServiceInfo.getHostAddresses().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InetAddress next = it.next();
                        if (next != null) {
                            host = next;
                            break;
                        }
                    }
                }
                b(new Socket(host, nsdServiceInfo.getPort()));
                jm3Var.getClass();
                jm3.T(nsdServiceInfo);
            } catch (ConnectException unused) {
                ((UptodownApp) jm3Var.b).c();
            } catch (IOException unused2) {
                ((UptodownApp) jm3Var.b).c();
            }
        }
    }

    public final synchronized void b(Socket socket) {
        try {
            Socket socket2 = this.d;
            if (socket2 == null || !socket2.isConnected()) {
                this.d = socket;
            } else {
                c(socket);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Socket socket) {
        Socket socket2 = this.e;
        if (socket2 != null && socket2.isConnected()) {
            try {
                Socket socket3 = this.e;
                if (socket3 != null) {
                    socket3.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.e = socket;
    }

    public final void d(boolean z) {
        Socket socket = this.d;
        if (socket == null || socket.isClosed()) {
            ((UptodownApp) this.a.b).c();
            return;
        }
        dq1 dq1Var = this.c;
        dq1Var.getClass();
        new Thread(new sr1(dq1Var, z)).start();
    }

    public final void e() {
        gn0 gn0Var = this.b;
        Thread thread = (Thread) gn0Var.p;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            ServerSocket serverSocket = (ServerSocket) gn0Var.o;
            if (serverSocket != null) {
                serverSocket.close();
            }
            gn0Var.o = null;
        } catch (IOException unused) {
        }
        try {
            Socket socket = this.e;
            if (socket != null) {
                socket.close();
            }
            this.e = null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Socket socket2 = this.d;
            if (socket2 != null) {
                socket2.close();
            }
            this.d = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
