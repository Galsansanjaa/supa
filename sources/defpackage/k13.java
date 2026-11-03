package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.provider.Settings;
import androidx.core.content.res.ResourcesCompat;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.io.File;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class k13 extends Application {
    public static boolean A;
    public static String B;
    public static String C;
    public static String D;
    public static String E;
    public static Activity p;
    public static v31 q;
    public static int r;
    public static String s;
    public static ca2 t;
    public static final zl2 u;
    public static final x32 v;
    public static Typeface w;
    public static Typeface x;
    public static yr1 y;
    public static tr1 z;
    public AtomicBoolean a;
    public AtomicBoolean b;
    public AtomicBoolean m;
    public jm3 n;
    public j13 o;

    static {
        zl2 a = kx.a(null);
        u = a;
        v = np3.f(a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jn0] */
    public static void d(File file) {
        file.getClass();
        ?? obj = new Object();
        obj.a = file;
        obj.b = file.getName();
        obj.c = jh2.E(file.getAbsolutePath());
        obj.e = file.length();
        obj.f = wa2.s(Build.MANUFACTURER, " ", Build.MODEL);
        tr1 tr1Var = z;
        tr1Var.getClass();
        Socket socket = tr1Var.d;
        if (socket == null || socket.isClosed()) {
            ((UptodownApp) tr1Var.a.b).c();
            return;
        }
        dq1 dq1Var = tr1Var.c;
        dq1Var.getClass();
        new Thread(new gt0(5, dq1Var, false, obj)).start();
    }

    public final void a(Context context) {
        jm3 jm3Var = this.n;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        string.getClass();
        if (string.length() > 16) {
            string = string.substring(0, 15);
        }
        int length = string.length();
        int i = 51 - length;
        String str = Build.MANUFACTURER;
        str.getClass();
        String str2 = Build.MODEL;
        str2.getClass();
        String str3 = str + " " + str2;
        if (str3.length() > i) {
            str3 = str3.substring(0, 50 - length);
        }
        s = str3 + "_d:_" + string + "_:d__t:_0";
        if (y == null) {
            y = new yr1(context, jm3Var);
        }
        z = new tr1(context, jm3Var);
    }

    public abstract void b(Throwable th);

    public final void c() {
        if (this.a.compareAndSet(false, true)) {
            try {
                yr1 yr1Var = y;
                if (yr1Var != null) {
                    yr1Var.b.unregisterService(this.o);
                }
            } catch (Exception unused) {
            }
            tr1 tr1Var = z;
            if (tr1Var != null) {
                tr1Var.e();
            }
            yr1 yr1Var2 = y;
            if (yr1Var2 != null) {
                yr1Var2.b();
            }
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        Object d82Var;
        Object d82Var2;
        super.onCreate();
        registerActivityLifecycleCallbacks(new yk0(this, 1));
        try {
            d82Var = ResourcesCompat.getFont((UptodownApp) this, R.font.geomanist_medium);
            d82Var.getClass();
        } catch (Throwable th) {
            d82Var = new d82(th);
        }
        Throwable a = i82.a(d82Var);
        if (a != null) {
            b(a);
            d82Var = Typeface.DEFAULT_BOLD;
        }
        d82Var.getClass();
        Typeface typeface = (Typeface) d82Var;
        try {
            d82Var2 = ResourcesCompat.getFont((UptodownApp) this, R.font.geomanist_regular);
            d82Var2.getClass();
        } catch (Throwable th2) {
            d82Var2 = new d82(th2);
        }
        Throwable a2 = i82.a(d82Var2);
        if (a2 != null) {
            b(a2);
            d82Var2 = Typeface.DEFAULT;
        }
        d82Var2.getClass();
        w = typeface;
        x = (Typeface) d82Var2;
    }
}
