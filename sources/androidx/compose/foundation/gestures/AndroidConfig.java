package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AndroidConfig implements ScrollConfig {
    public static final int $stable = 8;
    private final ViewConfiguration viewConfiguration;

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo494calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j) {
        float f = -getVerticalScrollFactor$foundation(density);
        float f2 = -getHorizontalScrollFactor$foundation(density);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset m5079boximpl = Offset.m5079boximpl(Offset.Companion.m5106getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m5079boximpl = Offset.m5079boximpl(Offset.m5095plusMKHz9U(m5079boximpl.m5100unboximpl(), changes.get(i).m6593getScrollDeltaF1C5BW0()));
        }
        long m5100unboximpl = m5079boximpl.m5100unboximpl();
        float intBitsToFloat = Float.intBitsToFloat((int) (m5100unboximpl >> 32)) * f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m5100unboximpl & 4294967295L)) * f;
        return Offset.m5082constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    public final float getHorizontalScrollFactor$foundation(Density density) {
        return Build.VERSION.SDK_INT > 26 ? ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration) : density.mo473toPx0680j_4(Dp.m8049constructorimpl(64.0f));
    }

    public final float getVerticalScrollFactor$foundation(Density density) {
        return Build.VERSION.SDK_INT > 26 ? ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration) : density.mo473toPx0680j_4(Dp.m8049constructorimpl(64.0f));
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    public final boolean isPreciseWheelScroll(PointerEvent pointerEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    public final boolean isSmoothScrollingEnabled() {
        return true;
    }
}
