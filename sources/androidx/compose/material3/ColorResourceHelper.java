package androidx.compose.material3;

import android.content.Context;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    /* renamed from: getColor-WaAFU9c, reason: not valid java name */
    public final long m2363getColorWaAFU9c(Context context, int i) {
        return ColorKt.Color(context.getResources().getColor(i, context.getTheme()));
    }
}
