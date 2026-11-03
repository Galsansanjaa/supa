package androidx.compose.material3;

import android.view.View;
import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class WindowBoundsCalculator {
    public static final int $stable = 8;
    private final View view;

    public WindowBoundsCalculator(View view) {
        this.view = view;
    }

    public final IntRect getVisibleWindowBounds() {
        IntRect windowBounds;
        windowBounds = ExposedDropdownMenu_androidKt.getWindowBounds(this.view);
        return windowBounds;
    }
}
