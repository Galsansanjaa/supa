package androidx.core.util;

import android.util.Size;
import android.util.SizeF;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SizeKt {
    public static final float component1(SizeF sizeF) {
        return sizeF.getWidth();
    }

    public static final float component1(SizeFCompat sizeFCompat) {
        return sizeFCompat.getWidth();
    }

    public static final int component1(Size size) {
        return size.getWidth();
    }

    public static final float component2(SizeF sizeF) {
        return sizeF.getHeight();
    }

    public static final float component2(SizeFCompat sizeFCompat) {
        return sizeFCompat.getHeight();
    }

    public static final int component2(Size size) {
        return size.getHeight();
    }
}
