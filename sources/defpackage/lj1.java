package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class lj1 {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
    public final jj1 a;

    public lj1(Context context, ComponentName componentName, ij1 ij1Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new jj1(context, componentName, ij1Var);
        } else {
            this.a = new jj1(context, componentName, ij1Var);
        }
    }
}
