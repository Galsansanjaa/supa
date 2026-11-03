package androidx.compose.ui;

import android.os.Handler;
import android.os.Looper;
import defpackage.e2;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Actual_androidKt {
    private static final Handler handler = new Handler(Looper.getMainLooper());

    public static final Object postDelayed(long j, os0 os0Var) {
        e2 e2Var = new e2(os0Var, 0);
        handler.postDelayed(e2Var, j);
        return e2Var;
    }

    public static final void removePost(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        handler.removeCallbacks((Runnable) obj);
    }
}
