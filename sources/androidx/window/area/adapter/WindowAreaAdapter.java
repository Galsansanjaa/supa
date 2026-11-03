package androidx.window.area.adapter;

import androidx.window.area.WindowAreaCapability;
import androidx.window.core.ExtensionsUtil;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WindowAreaAdapter {
    public static final WindowAreaAdapter INSTANCE = new WindowAreaAdapter();

    private WindowAreaAdapter() {
    }

    public static /* synthetic */ WindowAreaCapability.Status translate$window_release$default(WindowAreaAdapter windowAreaAdapter, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
        }
        return windowAreaAdapter.translate$window_release(i, z, i2);
    }

    public final WindowAreaCapability.Status translate$window_release(int i, boolean z, int i2) {
        return i2 <= 3 ? WindowAreaAdapterApi3.INSTANCE.translate(i, z) : WindowAreaAdapterApi4.INSTANCE.translate(i);
    }
}
