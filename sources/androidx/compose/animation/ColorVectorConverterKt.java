package androidx.compose.animation;

import androidx.compose.ui.graphics.Color;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ColorVectorConverterKt {
    private static final ps0 ColorToVector = ColorVectorConverterKt$ColorToVector$1.INSTANCE;

    public static final ps0 getVectorConverter(Color.Companion companion) {
        return ColorToVector;
    }
}
