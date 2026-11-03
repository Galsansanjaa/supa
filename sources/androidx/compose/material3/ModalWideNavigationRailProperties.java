package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ModalWideNavigationRailProperties {
    public static final int $stable = 0;
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;

    /* JADX WARN: Multi-variable type inference failed */
    public ModalWideNavigationRailProperties() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public ModalWideNavigationRailProperties(SecureFlagPolicy secureFlagPolicy, boolean z) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
    }

    public /* synthetic */ ModalWideNavigationRailProperties(SecureFlagPolicy secureFlagPolicy, boolean z, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z);
    }

    public ModalWideNavigationRailProperties(boolean z) {
        this(SecureFlagPolicy.Inherit, z);
    }

    public /* synthetic */ ModalWideNavigationRailProperties(boolean z, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? true : z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModalWideNavigationRailProperties) && this.securePolicy == ((ModalWideNavigationRailProperties) obj).securePolicy;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public int hashCode() {
        return (this.securePolicy.hashCode() * 31) + (this.shouldDismissOnBackPress ? 1231 : 1237);
    }
}
