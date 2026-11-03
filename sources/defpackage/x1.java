package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class x1 {
    public final dx1 a;
    public final xx0 b;
    public final w1 c;
    public final String d;
    public final x1 e;
    public boolean f;
    public boolean g;

    public x1(dx1 dx1Var, Object obj, xx0 xx0Var, String str) {
        this.a = dx1Var;
        this.b = xx0Var;
        this.c = obj == null ? null : new w1(this, obj, dx1Var.i);
        this.d = str;
        this.e = this;
    }

    public void a() {
        this.g = true;
    }

    public abstract void b(Bitmap bitmap, int i);

    public abstract void c(Exception exc);

    public Object d() {
        w1 w1Var = this.c;
        if (w1Var == null) {
            return null;
        }
        return w1Var.get();
    }
}
