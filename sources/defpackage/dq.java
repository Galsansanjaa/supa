package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.core.content.ContextCompat;
import com.uptodown.R;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class dq implements bu2 {
    public final Context a;

    public dq(Context context) {
        this.a = context;
    }

    @Override // defpackage.bu2
    public final Bitmap a(Bitmap bitmap) {
        bitmap.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = height / 3;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        createBitmap.getClass();
        if (bitmap.getConfig() != null) {
            Bitmap.Config config = bitmap.getConfig();
            config.getClass();
            createBitmap = Bitmap.createBitmap(width, height, config);
        }
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f = height - i;
        float f2 = height;
        LinearGradient linearGradient = new LinearGradient(0.0f, f, 0.0f, f2, 0, ContextCompat.getColor(this.a, R.color.background_color), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, f, width, f2, paint);
        bitmap.recycle();
        return createBitmap;
    }

    @Override // defpackage.bu2
    public final String key() {
        return "bottomGradient";
    }
}
