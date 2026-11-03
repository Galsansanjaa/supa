package androidx.compose.ui.input.pointer;

import androidx.core.view.PointerIconCompat;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointerIcon_androidKt {
    private static final PointerIcon pointerIconDefault = new AndroidPointerIconType(1000);
    private static final PointerIcon pointerIconCrosshair = new AndroidPointerIconType(PointerIconCompat.TYPE_CROSSHAIR);
    private static final PointerIcon pointerIconText = new AndroidPointerIconType(PointerIconCompat.TYPE_TEXT);
    private static final PointerIcon pointerIconHand = new AndroidPointerIconType(PointerIconCompat.TYPE_HAND);

    public static final PointerIcon PointerIcon(int i) {
        return new AndroidPointerIconType(i);
    }

    public static final PointerIcon PointerIcon(android.view.PointerIcon pointerIcon) {
        return new AndroidPointerIcon(pointerIcon);
    }

    public static final PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    public static final PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    public static final PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }

    public static final PointerIcon getPointerIconText() {
        return pointerIconText;
    }
}
