package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hq1 {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public yp1 c;
    public gq1 d;

    public hq1(Context context) {
        this.a = context;
    }

    public final void a() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i < 24) {
            yp1 yp1Var = new yp1(new eq1(this, 0), new eq1(this, 1));
            this.c = yp1Var;
            context.registerReceiver(yp1Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } else {
            gq1 gq1Var = new gq1(this);
            this.d = gq1Var;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(gq1Var);
        }
    }
}
