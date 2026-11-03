package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class l72 {
    public static final AtomicInteger f = new AtomicInteger();
    public final dx1 a;
    public final xx0 b;
    public boolean c;
    public int d;
    public Drawable e;

    public l72(dx1 dx1Var, Uri uri, int i) {
        this.a = dx1Var;
        xx0 xx0Var = new xx0();
        xx0Var.h = uri;
        xx0Var.b = i;
        this.b = xx0Var;
    }

    public final xx0 a(long j) {
        f.getAndIncrement();
        xx0 xx0Var = this.b;
        boolean z = xx0Var.e;
        if (z && xx0Var.c == 0 && xx0Var.d == 0) {
            hu2.h("Center crop requires calling resize with positive width and height.");
            return null;
        }
        int i = xx0Var.g;
        if (i == 0) {
            i = 2;
            xx0Var.g = 2;
        }
        xx0 xx0Var2 = new xx0((Uri) xx0Var.h, xx0Var.b, (ArrayList) xx0Var.i, xx0Var.c, xx0Var.d, z, xx0Var.f, i);
        this.a.a.getClass();
        return xx0Var2;
    }

    public final void b(gs gsVar) {
        long nanoTime = System.nanoTime();
        if (this.c) {
            hu2.h("Fit cannot be used with fetch.");
            return;
        }
        xx0 xx0Var = this.b;
        if (((Uri) xx0Var.h) == null && xx0Var.b == 0) {
            return;
        }
        int i = xx0Var.g;
        if (i == 0) {
            if (i != 0) {
                hu2.h("Priority already set.");
                return;
            }
            xx0Var.g = 1;
        }
        xx0 a = a(nanoTime);
        String a2 = i63.a(a, new StringBuilder());
        dx1 dx1Var = this.a;
        if (dx1Var.g(a2) != null) {
            if (gsVar != null) {
                gsVar.onSuccess();
            }
        } else {
            zl0 zl0Var = new zl0(dx1Var, a, a2, gsVar);
            ke0 ke0Var = dx1Var.d.h;
            ke0Var.sendMessage(ke0Var.obtainMessage(1, zl0Var));
        }
    }

    public final Bitmap c() {
        long nanoTime = System.nanoTime();
        StringBuilder sb = i63.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            hu2.h("Method call should not happen from the main thread.");
            return null;
        }
        if (this.c) {
            hu2.h("Fit cannot be used with get.");
            return null;
        }
        xx0 xx0Var = this.b;
        Object obj = null;
        if (((Uri) xx0Var.h) == null && xx0Var.b == 0) {
            return null;
        }
        xx0 a = a(nanoTime);
        dx1 dx1Var = this.a;
        return wo.e(dx1Var, dx1Var.d, dx1Var.e, dx1Var.f, new zt0(dx1Var, obj, a, i63.a(a, new StringBuilder()), 0)).f();
    }

    public final Drawable d() {
        int i = this.d;
        return i != 0 ? this.a.c.getDrawable(i) : this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [s11, x1] */
    public final void e(ImageView imageView, gs gsVar) {
        long nanoTime = System.nanoTime();
        StringBuilder sb = i63.a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            hu2.h("Method call should happen from the main thread.");
            return;
        }
        if (imageView == null) {
            v5.m("Target must not be null.");
            return;
        }
        xx0 xx0Var = this.b;
        Uri uri = (Uri) xx0Var.h;
        dx1 dx1Var = this.a;
        if (uri == null && xx0Var.b == 0) {
            dx1Var.a(imageView);
            ex1.a(imageView, d());
            return;
        }
        if (this.c) {
            if (xx0Var.c != 0 || xx0Var.d != 0) {
                hu2.h("Fit cannot be used with resize.");
                return;
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                ex1.a(imageView, d());
                oc0 oc0Var = new oc0(this, imageView, gsVar);
                WeakHashMap weakHashMap = dx1Var.h;
                if (weakHashMap.containsKey(imageView)) {
                    dx1Var.a(imageView);
                }
                weakHashMap.put(imageView, oc0Var);
                return;
            }
            xx0Var.e(width, height);
        }
        xx0 a = a(nanoTime);
        StringBuilder sb2 = i63.a;
        String a2 = i63.a(a, sb2);
        sb2.setLength(0);
        Bitmap g = dx1Var.g(a2);
        if (g == null) {
            ex1.a(imageView, d());
            ?? x1Var = new x1(dx1Var, imageView, a, a2);
            x1Var.h = gsVar;
            dx1Var.c(x1Var);
            return;
        }
        dx1Var.a(imageView);
        Context context = dx1Var.c;
        int i = ex1.e;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new ex1(context, g, drawable, 1));
        if (gsVar != null) {
            gsVar.onSuccess();
        }
    }

    public final void f() {
        if (this.e == null) {
            this.d = R.drawable.shape_bg_placeholder;
        } else {
            hu2.h("Placeholder image already set.");
        }
    }

    public final void g(Drawable drawable) {
        if (this.d == 0) {
            this.e = drawable;
        } else {
            hu2.h("Placeholder image already set.");
        }
    }

    public final void h(bu2 bu2Var) {
        bu2Var.key();
        xx0 xx0Var = this.b;
        ArrayList arrayList = (ArrayList) xx0Var.i;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            xx0Var.i = arrayList;
        }
        arrayList.add(bu2Var);
    }
}
