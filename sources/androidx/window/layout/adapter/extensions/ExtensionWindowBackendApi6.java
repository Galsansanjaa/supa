package androidx.window.layout.adapter.extensions;

import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.SupportedWindowFeatures;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.SupportedPosture;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class ExtensionWindowBackendApi6 extends ExtensionWindowBackendApi2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionWindowBackendApi6(WindowLayoutComponent windowLayoutComponent, ConsumerAdapter consumerAdapter) {
        super(windowLayoutComponent, consumerAdapter);
        windowLayoutComponent.getClass();
        consumerAdapter.getClass();
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0, androidx.window.layout.adapter.WindowBackend
    public List<SupportedPosture> getSupportedPostures() {
        ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = ExtensionsWindowLayoutInfoAdapter.INSTANCE;
        SupportedWindowFeatures supportedWindowFeatures = getComponent().getSupportedWindowFeatures();
        supportedWindowFeatures.getClass();
        return extensionsWindowLayoutInfoAdapter.translate$window_release(supportedWindowFeatures);
    }
}
