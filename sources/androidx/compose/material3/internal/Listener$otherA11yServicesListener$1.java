package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Listener$otherA11yServicesListener$1 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    private final MutableState switchAccessEnabled$delegate;
    final /* synthetic */ Listener this$0;
    private final MutableState voiceAccessEnabled$delegate;

    public Listener$otherA11yServicesListener$1(Listener listener) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.this$0 = listener;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.switchAccessEnabled$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.voiceAccessEnabled$delegate = mutableStateOf$default2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSwitchAccessEnabled() {
        return ((Boolean) this.switchAccessEnabled$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getVoiceAccessEnabled() {
        return ((Boolean) this.voiceAccessEnabled$delegate.getValue()).booleanValue();
    }

    public void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        boolean switchAccessEnabled;
        boolean voiceAccessEnabled;
        switchAccessEnabled = this.this$0.getSwitchAccessEnabled(accessibilityManager);
        setSwitchAccessEnabled(switchAccessEnabled);
        voiceAccessEnabled = this.this$0.getVoiceAccessEnabled(accessibilityManager);
        setVoiceAccessEnabled(voiceAccessEnabled);
    }

    public final void setSwitchAccessEnabled(boolean z) {
        this.switchAccessEnabled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setVoiceAccessEnabled(boolean z) {
        this.voiceAccessEnabled$delegate.setValue(Boolean.valueOf(z));
    }
}
