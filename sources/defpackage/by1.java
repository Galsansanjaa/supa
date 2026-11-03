package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import eightbitlab.com.blurview.BlurView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class by1 implements np {
    public final mp a;
    public pp b;
    public Bitmap m;
    public final BlurView n;
    public final int o;
    public final ViewGroup p;
    public final int[] q = new int[2];
    public final int[] r = new int[2];
    public final pa s = new pa(this, 2);
    public boolean t;
    public Drawable u;

    public by1(BlurView blurView, ViewGroup viewGroup, int i, mp mpVar) {
        this.p = viewGroup;
        this.n = blurView;
        this.o = i;
        this.a = mpVar;
        if (mpVar instanceof i62) {
            ((i62) mpVar).f = blurView.getContext();
        }
        a(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [pp, android.graphics.Canvas] */
    public final void a(int i, int i2) {
        c(true);
        mp mpVar = this.a;
        mpVar.getClass();
        float f = i2;
        int ceil = (int) Math.ceil(f / 6.0f);
        BlurView blurView = this.n;
        if (ceil != 0) {
            double d = i / 6.0f;
            if (((int) Math.ceil(d)) != 0) {
                blurView.setWillNotDraw(false);
                int ceil2 = (int) Math.ceil(d);
                int i3 = ceil2 % 64;
                if (i3 != 0) {
                    ceil2 = (ceil2 - i3) + 64;
                }
                int ceil3 = (int) Math.ceil(f / (r8 / ceil2));
                mpVar.a();
                this.m = Bitmap.createBitmap(ceil2, ceil3, Bitmap.Config.ARGB_8888);
                this.b = new Canvas(this.m);
                this.t = true;
                b();
                return;
            }
        }
        blurView.setWillNotDraw(true);
    }

    public final void b() {
        if (this.t) {
            Drawable drawable = this.u;
            if (drawable == null) {
                this.m.eraseColor(0);
            } else {
                drawable.draw(this.b);
            }
            this.b.save();
            ViewGroup viewGroup = this.p;
            int[] iArr = this.q;
            viewGroup.getLocationOnScreen(iArr);
            BlurView blurView = this.n;
            int[] iArr2 = this.r;
            blurView.getLocationOnScreen(iArr2);
            int i = iArr2[0] - iArr[0];
            int i2 = iArr2[1] - iArr[1];
            float height = blurView.getHeight() / this.m.getHeight();
            float width = blurView.getWidth() / this.m.getWidth();
            this.b.translate((-i) / width, (-i2) / height);
            this.b.scale(1.0f / width, 1.0f / height);
            viewGroup.draw(this.b);
            this.b.restore();
            this.m = this.a.c(this.m, 16.0f);
        }
    }

    @Override // defpackage.np
    public final np c(boolean z) {
        ViewGroup viewGroup = this.p;
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        pa paVar = this.s;
        viewTreeObserver.removeOnPreDrawListener(paVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(paVar);
        }
        return this;
    }

    @Override // defpackage.np
    public final void destroy() {
        c(false);
        this.a.destroy();
        this.t = false;
    }

    @Override // defpackage.np
    public final boolean draw(Canvas canvas) {
        if (this.t) {
            if (canvas instanceof pp) {
                return false;
            }
            BlurView blurView = this.n;
            float height = blurView.getHeight() / this.m.getHeight();
            canvas.save();
            canvas.scale(blurView.getWidth() / this.m.getWidth(), height);
            this.a.b(canvas, this.m);
            canvas.restore();
            int i = this.o;
            if (i != 0) {
                canvas.drawColor(i);
            }
        }
        return true;
    }

    @Override // defpackage.np
    public final void e() {
        BlurView blurView = this.n;
        a(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }
}
