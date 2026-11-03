package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DefaultHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;
    private final View view;

    public DefaultHapticFeedback(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* renamed from: performHapticFeedback-CdsT49E */
    public void mo6040performHapticFeedbackCdsT49E(int i) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        ViewCompat.performHapticFeedback(this.view, HapticFeedbackType.m6044equalsimpl0(i, companion.m6048getConfirm5zf0vsI()) ? 16 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6049getContextClick5zf0vsI()) ? 6 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6050getGestureEnd5zf0vsI()) ? 13 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6051getGestureThresholdActivate5zf0vsI()) ? 23 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6052getKeyboardTap5zf0vsI()) ? 3 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6053getLongPress5zf0vsI()) ? 0 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6054getReject5zf0vsI()) ? 17 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6055getSegmentFrequentTick5zf0vsI()) ? 27 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6056getSegmentTick5zf0vsI()) ? 26 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6057getTextHandleMove5zf0vsI()) ? 9 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6058getToggleOff5zf0vsI()) ? 22 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6059getToggleOn5zf0vsI()) ? 21 : HapticFeedbackType.m6044equalsimpl0(i, companion.m6060getVirtualKey5zf0vsI()) ? 1 : -1);
    }
}
