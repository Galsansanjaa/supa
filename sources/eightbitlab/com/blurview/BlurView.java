package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bp;
import defpackage.by1;
import defpackage.i32;
import defpackage.i62;
import defpackage.k62;
import defpackage.mp;
import defpackage.np;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class BlurView extends FrameLayout {
    public np a;
    public final int b;

    public BlurView(Context context) {
        super(context);
        this.a = new bp(24);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, i32.a, 0, 0);
        this.b = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new bp(24);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i32.a, 0, 0);
        this.b = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    private mp getBlurAlgorithm() {
        return Build.VERSION.SDK_INT >= 31 ? new i62() : new k62(getContext());
    }

    public final by1 a(ViewGroup viewGroup) {
        this.a.destroy();
        by1 by1Var = new by1(this, viewGroup, this.b, getBlurAlgorithm());
        this.a = by1Var;
        return by1Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.a.draw(canvas)) {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isHardwareAccelerated()) {
            this.a.c(true);
        } else {
            Log.e("BlurView", "BlurView can't be used in not hardware-accelerated window!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.c(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.e();
    }
}
