package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class oc0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final l72 a;
    public final WeakReference b;
    public gs m;

    public oc0(l72 l72Var, ImageView imageView, gs gsVar) {
        this.a = l72Var;
        this.b = new WeakReference(imageView);
        this.m = gsVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            imageView.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        WeakReference weakReference = this.b;
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                if (width > 0 && height > 0) {
                    imageView.removeOnAttachStateChangeListener(this);
                    viewTreeObserver.removeOnPreDrawListener(this);
                    weakReference.clear();
                    l72 l72Var = this.a;
                    l72Var.c = false;
                    l72Var.b.e(width, height);
                    l72Var.e(imageView, this.m);
                }
            }
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
