package defpackage;

import android.util.Base64OutputStream;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xb0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ xb0(yb0 yb0Var, int i) {
        this.a = i;
        this.b = yb0Var;
    }

    private final Object a() {
        String byteArrayOutputStream;
        yb0 yb0Var = this.b;
        synchronized (yb0Var) {
            try {
                mw0 mw0Var = (mw0) yb0Var.a.get();
                ArrayList b = mw0Var.b();
                mw0Var.a();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < b.size(); i++) {
                    ej ejVar = (ej) b.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", ejVar.a);
                    jSONObject.put("dates", new JSONArray((Collection) ejVar.b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", ExifInterface.GPS_MEASUREMENT_2D);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return a();
            default:
                yb0 yb0Var = this.b;
                synchronized (yb0Var) {
                    ((mw0) yb0Var.a.get()).i(System.currentTimeMillis(), ((kc0) yb0Var.c.get()).a());
                }
                return null;
        }
    }
}
