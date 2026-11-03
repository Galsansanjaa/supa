package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.collection.ArraySet;
import androidx.core.content.ContextCompat;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class tu0 {
    public final Context a;
    public final String b;
    public final ea2 c;
    public final xk0 d;
    public final m7 e;
    public final o7 f;
    public final Looper g;
    public final int h;
    public final ok3 i;
    public final jw0 j;
    public final yu0 k;

    public tu0(Context context, xk0 xk0Var, m7 m7Var, su0 su0Var) {
        dn3.p(context, "Null context is not permitted.");
        dn3.p(xk0Var, "Api must not be null.");
        dn3.p(su0Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        dn3.p(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = i >= 30 ? ContextCompat.getAttributionTag(context) : null;
        this.b = attributionTag;
        this.c = i >= 31 ? new ea2(context.getAttributionSource(), 2) : null;
        this.d = xk0Var;
        this.e = m7Var;
        this.g = su0Var.b;
        this.f = new o7(xk0Var, m7Var, attributionTag);
        this.i = new ok3(this);
        yu0 e = yu0.e(applicationContext);
        this.k = e;
        this.h = e.r.getAndIncrement();
        this.j = su0Var.a;
        cx1 cx1Var = e.w;
        cx1Var.sendMessage(cx1Var.obtainMessage(7, this));
    }

    public final p50 a() {
        p50 p50Var = new p50(6);
        Set set = Collections.EMPTY_SET;
        ArraySet arraySet = (ArraySet) p50Var.b;
        if (arraySet == null) {
            arraySet = new ArraySet();
            p50Var.b = arraySet;
        }
        arraySet.addAll(set);
        Context context = this.a;
        p50Var.n = context.getClass().getName();
        p50Var.m = context.getPackageName();
        return p50Var;
    }

    public final zc4 b(int i, ll2 ll2Var) {
        uo2 uo2Var = new uo2();
        yu0 yu0Var = this.k;
        yu0Var.getClass();
        yu0Var.c(uo2Var, ll2Var.b, this);
        tk3 tk3Var = new tk3(new gl3(i, ll2Var, uo2Var, this.j), yu0Var.s.get(), this);
        cx1 cx1Var = yu0Var.w;
        cx1Var.sendMessage(cx1Var.obtainMessage(4, tk3Var));
        return uo2Var.a;
    }
}
