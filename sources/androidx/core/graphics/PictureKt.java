package androidx.core.graphics;

import android.graphics.Picture;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, ps0 ps0Var) {
        try {
            ps0Var.invoke(picture.beginRecording(i, i2));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
