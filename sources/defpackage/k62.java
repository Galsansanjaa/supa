package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class k62 implements mp {
    public final RenderScript b;
    public final ScriptIntrinsicBlur c;
    public Allocation d;
    public final Paint a = new Paint(2);
    public int e = -1;
    public int f = -1;

    public k62(Context context) {
        RenderScript create = RenderScript.create(context);
        this.b = create;
        this.c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    @Override // defpackage.mp
    public final void a() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    @Override // defpackage.mp
    public final void b(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
    }

    @Override // defpackage.mp
    public final Bitmap c(Bitmap bitmap, float f) {
        RenderScript renderScript = this.b;
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        if (bitmap.getHeight() != this.f || bitmap.getWidth() != this.e) {
            Allocation allocation = this.d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.d = Allocation.createTyped(renderScript, createFromBitmap.getType());
            this.e = bitmap.getWidth();
            this.f = bitmap.getHeight();
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.c;
        scriptIntrinsicBlur.setRadius(f);
        scriptIntrinsicBlur.setInput(createFromBitmap);
        scriptIntrinsicBlur.forEach(this.d);
        this.d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }

    @Override // defpackage.mp
    public final void destroy() {
        this.c.destroy();
        this.b.destroy();
        Allocation allocation = this.d;
        if (allocation != null) {
            allocation.destroy();
        }
    }
}
