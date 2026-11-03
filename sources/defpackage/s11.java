package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s11 extends x1 {
    public gs h;

    @Override // defpackage.x1
    public final void a() {
        this.g = true;
        if (this.h != null) {
            this.h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x1
    public final void b(Bitmap bitmap, int i) {
        if (bitmap == null) {
            throw new AssertionError("Attempted to complete action with no result!\n" + this);
        }
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Context context = this.a.c;
        int i2 = ex1.e;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new ex1(context, bitmap, drawable, i));
        gs gsVar = this.h;
        if (gsVar != null) {
            gsVar.onSuccess();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x1
    public final void c(Exception exc) {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        gs gsVar = this.h;
        if (gsVar != null) {
            gsVar.y(exc);
        }
    }
}
