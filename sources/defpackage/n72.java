package defpackage;

import android.graphics.BitmapFactory;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class n72 {
    public static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, xx0 xx0Var) {
        int min;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor(i3 / i);
            } else if (i == 0) {
                floor = Math.floor(i4 / i2);
            } else {
                min = Math.min((int) Math.floor(i4 / i2), (int) Math.floor(i3 / i));
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options c(xx0 xx0Var) {
        boolean b = xx0Var.b();
        if (!b) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = b;
        options.inInputShareable = false;
        options.inPurgeable = false;
        return options;
    }

    public abstract boolean b(xx0 xx0Var);

    public int d() {
        return 0;
    }

    public abstract m72 e(xx0 xx0Var, int i);

    public boolean f(NetworkInfo networkInfo) {
        return false;
    }
}
