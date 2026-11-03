package androidx.window.area.adapter;

import androidx.window.area.WindowAreaCapability;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class WindowAreaAdapterApi4 {
    public static final WindowAreaAdapterApi4 INSTANCE = new WindowAreaAdapterApi4();

    private WindowAreaAdapterApi4() {
    }

    public final WindowAreaCapability.Status translate(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED : WindowAreaCapability.Status.WINDOW_AREA_STATUS_ACTIVE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_AVAILABLE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNAVAILABLE : WindowAreaCapability.Status.WINDOW_AREA_STATUS_UNSUPPORTED;
    }
}
