package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class TypedArrayApi26ImplKt {
    public static final TypedArrayApi26ImplKt INSTANCE = new TypedArrayApi26ImplKt();

    private TypedArrayApi26ImplKt() {
    }

    public static final Typeface getFont(TypedArray typedArray, int i) {
        Typeface font = typedArray.getFont(i);
        font.getClass();
        return font;
    }
}
