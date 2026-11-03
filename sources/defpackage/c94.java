package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.os.EnvironmentCompat;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c94 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c94(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        fa4 fa4Var = (fa4) this.b;
        synchronized (fa4Var) {
            try {
                SparseArray sparseArray = fa4Var.o;
                pb4 pb4Var = (pb4) sparseArray.get(i);
                if (pb4Var == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                sparseArray.remove(i);
                fa4Var.d();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    pb4Var.c(new bv0("Not supported by GmsCore", (Throwable) null));
                    return true;
                }
                switch (pb4Var.e) {
                    case 0:
                        if (data.getBoolean("ack", false)) {
                            pb4Var.b(null);
                            return true;
                        }
                        pb4Var.c(new bv0("Invalid response to one way request", (Throwable) null));
                        return true;
                    default:
                        Bundle bundle = data.getBundle("data");
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        pb4Var.b(bundle);
                        return true;
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                return a(message);
            default:
                int i = message.what;
                if (i == 0) {
                    ua4 ua4Var = (ua4) this.b;
                    synchronized (ua4Var.a) {
                        try {
                            a84 a84Var = (a84) message.obj;
                            b94 b94Var = (b94) ua4Var.a.get(a84Var);
                            if (b94Var != null && b94Var.a.isEmpty()) {
                                if (b94Var.m) {
                                    a84 a84Var2 = b94Var.o;
                                    ua4 ua4Var2 = b94Var.q;
                                    ua4Var2.c.removeMessages(1, a84Var2);
                                    ua4Var2.d.c(ua4Var2.b, b94Var);
                                    b94Var.m = false;
                                    b94Var.b = 2;
                                }
                                ua4Var.a.remove(a84Var);
                            }
                        } finally {
                        }
                    }
                } else {
                    if (i != 1) {
                        return false;
                    }
                    ua4 ua4Var3 = (ua4) this.b;
                    synchronized (ua4Var3.a) {
                        try {
                            a84 a84Var3 = (a84) message.obj;
                            b94 b94Var2 = (b94) ua4Var3.a.get(a84Var3);
                            if (b94Var2 != null && b94Var2.b == 3) {
                                String valueOf = String.valueOf(a84Var3);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                                sb.append("Timeout waiting for ServiceConnection callback ");
                                sb.append(valueOf);
                                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                                ComponentName componentName = b94Var2.p;
                                if (componentName == null) {
                                    a84Var3.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    a84Var3.getClass();
                                    componentName = new ComponentName("com.google.android.gms", EnvironmentCompat.MEDIA_UNKNOWN);
                                }
                                b94Var2.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
