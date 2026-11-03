package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.squareup.picasso.PicassoProvider;
import com.uptodown.R;
import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class dx1 {
    public static final cx1 j = new cx1(Looper.getMainLooper(), 0, false);
    public static volatile dx1 k = null;
    public final jw0 a;
    public final List b;
    public final Context c;
    public final me0 d;
    public final jm3 e;
    public final dm2 f;
    public final WeakHashMap g;
    public final WeakHashMap h;
    public final ReferenceQueue i;

    public dx1(Context context, me0 me0Var, jm3 jm3Var, jw0 jw0Var, dm2 dm2Var) {
        this.c = context;
        this.d = me0Var;
        this.e = jm3Var;
        this.a = jw0Var;
        ArrayList arrayList = new ArrayList(7);
        int i = 1;
        arrayList.add(new m00(context, i));
        arrayList.add(new j00(context));
        int i2 = 0;
        arrayList.add(new wj1(context, i2));
        arrayList.add(new m00(context, i2));
        arrayList.add(new ae(context));
        arrayList.add(new wj1(context, i));
        arrayList.add(new kq1(me0Var.c, dm2Var));
        this.b = DesugarCollections.unmodifiableList(arrayList);
        this.f = dm2Var;
        this.g = new WeakHashMap();
        this.h = new WeakHashMap();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.i = referenceQueue;
        new zw(referenceQueue, j).start();
    }

    public static dx1 d() {
        if (k == null) {
            synchronized (dx1.class) {
                try {
                    if (k == null) {
                        Context context = PicassoProvider.a;
                        if (context == null) {
                            throw new IllegalStateException("context == null");
                        }
                        k = new dc0(context).b();
                    }
                } finally {
                }
            }
        }
        return k;
    }

    public final void a(Object obj) {
        StringBuilder sb = i63.a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            hu2.h("Method call should happen from the main thread.");
            return;
        }
        x1 x1Var = (x1) this.g.remove(obj);
        if (x1Var != null) {
            x1Var.a();
            ke0 ke0Var = this.d.h;
            ke0Var.sendMessage(ke0Var.obtainMessage(2, x1Var));
        }
        if (obj instanceof ImageView) {
            oc0 oc0Var = (oc0) this.h.remove((ImageView) obj);
            if (oc0Var != null) {
                oc0Var.m = null;
                WeakReference weakReference = oc0Var.b;
                ImageView imageView = (ImageView) weakReference.get();
                if (imageView == null) {
                    return;
                }
                weakReference.clear();
                imageView.removeOnAttachStateChangeListener(oc0Var);
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(oc0Var);
                }
            }
        }
    }

    public final void b(Bitmap bitmap, int i, x1 x1Var, Exception exc) {
        if (x1Var.g) {
            return;
        }
        if (!x1Var.f) {
            this.g.remove(x1Var.d());
        }
        if (bitmap == null) {
            x1Var.c(exc);
        } else if (i != 0) {
            x1Var.b(bitmap, i);
        } else {
            qq.e("LoadedFrom cannot be null.");
        }
    }

    public final void c(x1 x1Var) {
        Object d = x1Var.d();
        if (d != null) {
            WeakHashMap weakHashMap = this.g;
            if (weakHashMap.get(d) != x1Var) {
                a(d);
                weakHashMap.put(d, x1Var);
            }
        }
        ke0 ke0Var = this.d.h;
        ke0Var.sendMessage(ke0Var.obtainMessage(1, x1Var));
    }

    public final l72 e(String str) {
        if (str == null) {
            return new l72(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return new l72(this, Uri.parse(str), 0);
        }
        v5.m("Path must not be empty.");
        return null;
    }

    public final l72 f() {
        return new l72(this, null, R.drawable.vector_user_default);
    }

    public final Bitmap g(String str) {
        xg1 xg1Var = (xg1) ((yb) this.e.b).get(str);
        Bitmap bitmap = xg1Var != null ? xg1Var.a : null;
        ke0 ke0Var = this.f.b;
        if (bitmap != null) {
            ke0Var.sendEmptyMessage(0);
            return bitmap;
        }
        ke0Var.sendEmptyMessage(1);
        return bitmap;
    }
}
