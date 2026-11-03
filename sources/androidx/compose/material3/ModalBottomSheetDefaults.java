package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.hd0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ModalBottomSheetDefaults {
    public static final int $stable = 0;
    public static final ModalBottomSheetDefaults INSTANCE = new ModalBottomSheetDefaults();
    private static final ModalBottomSheetProperties properties = new ModalBottomSheetProperties();

    private ModalBottomSheetDefaults() {
    }

    public static /* synthetic */ ModalBottomSheetProperties properties$default(ModalBottomSheetDefaults modalBottomSheetDefaults, SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            secureFlagPolicy = SecureFlagPolicy.Inherit;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return modalBottomSheetDefaults.properties(secureFlagPolicy, z, z2);
    }

    public final ModalBottomSheetProperties getProperties() {
        return properties;
    }

    @hd0
    public final ModalBottomSheetProperties properties(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        return new ModalBottomSheetProperties(secureFlagPolicy, z2, false, 4, (sb0) null);
    }
}
