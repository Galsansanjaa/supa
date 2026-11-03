package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class i62 implements mp {
    public int b;
    public int c;
    public k62 e;
    public Context f;
    public final RenderNode a = n1.e();
    public float d = 1.0f;

    @Override // defpackage.mp
    public final void a() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    @Override // defpackage.mp
    public final void b(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.a);
            return;
        }
        k62 k62Var = this.e;
        if (k62Var == null) {
            k62Var = new k62(this.f);
            this.e = k62Var;
        }
        k62Var.c(bitmap, this.d);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.e.a);
    }

    @Override // defpackage.mp
    public final Bitmap c(Bitmap bitmap, float f) {
        this.d = f;
        if (bitmap.getHeight() != this.b || bitmap.getWidth() != this.c) {
            this.b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.c = width;
            this.a.setPosition(0, 0, width, this.b);
        }
        this.a.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.a.endRecording();
        this.a.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
        return bitmap;
    }

    @Override // defpackage.mp
    public final void destroy() {
        this.a.discardDisplayList();
        k62 k62Var = this.e;
        if (k62Var != null) {
            k62Var.destroy();
        }
    }
}
