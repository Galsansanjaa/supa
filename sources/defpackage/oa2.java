package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class oa2 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final kz0 c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public zx3 g;
    public final SimpleArrayMap a = new SimpleArrayMap();
    public final Messenger e = new Messenger(new yd4(this, Looper.getMainLooper()));

    public oa2(Context context) {
        this.b = context;
        this.c = new kz0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new wo1("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static synchronized void a(Context context, Intent intent) {
        synchronized (oa2.class) {
            try {
                PendingIntent pendingIntent = i;
                if (pendingIntent == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, nb4.a);
                    i = pendingIntent;
                }
                intent.putExtra("app", pendingIntent);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized String c() {
        String num;
        synchronized (oa2.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    public final void b(Bundle bundle, String str) {
        SimpleArrayMap simpleArrayMap = this.a;
        synchronized (simpleArrayMap) {
            try {
                uo2 uo2Var = (uo2) simpleArrayMap.remove(str);
                if (uo2Var != null) {
                    uo2Var.b(bundle);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
                sb.append("Missing callback for ");
                sb.append(str);
                Log.w("Rpc", sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zc4 d(Bundle bundle) {
        String c = c();
        uo2 uo2Var = new uo2();
        SimpleArrayMap simpleArrayMap = this.a;
        synchronized (simpleArrayMap) {
            simpleArrayMap.put(c, uo2Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        int i2 = 2;
        if (this.c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        a(this.b, intent);
        intent.putExtra("kid", sg3.t(new StringBuilder(String.valueOf(c).length() + 5), "|ID|", c, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.a.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            uo2Var.a.a(yd0.m, new oc3(i2, c, this, this.d.schedule(new t8(uo2Var, 14), 30L, TimeUnit.SECONDS)));
            return uo2Var.a;
        }
        int a = this.c.a();
        Context context = this.b;
        if (a != 2) {
            context.startService(intent);
        } else if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
        uo2Var.a.a(yd0.m, new oc3(i2, c, this, this.d.schedule(new t8(uo2Var, 14), 30L, TimeUnit.SECONDS)));
        return uo2Var.a;
    }
}
