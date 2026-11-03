package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.hd0;
import defpackage.jh2;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ModalBottomSheetProperties {
    public static final int $stable = 0;
    private final Boolean isAppearanceLightNavigationBars;
    private final Boolean isAppearanceLightStatusBars;
    private final SecureFlagPolicy securePolicy;
    private final boolean shouldDismissOnBackPress;
    private final boolean shouldDismissOnClickOutside;

    public ModalBottomSheetProperties() {
        this.securePolicy = SecureFlagPolicy.Inherit;
        this.shouldDismissOnBackPress = true;
        this.shouldDismissOnClickOutside = true;
        this.isAppearanceLightStatusBars = null;
        this.isAppearanceLightNavigationBars = null;
    }

    @hd0
    public /* synthetic */ ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z) {
        this(secureFlagPolicy, z, true);
    }

    public /* synthetic */ ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z);
    }

    public ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        this.securePolicy = secureFlagPolicy;
        this.shouldDismissOnBackPress = z;
        this.shouldDismissOnClickOutside = z2;
        this.isAppearanceLightNavigationBars = null;
        this.isAppearanceLightStatusBars = null;
    }

    public /* synthetic */ ModalBottomSheetProperties(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }

    @hd0
    public /* synthetic */ ModalBottomSheetProperties(boolean z) {
        this(z, true);
    }

    public ModalBottomSheetProperties(boolean z, boolean z2) {
        this.securePolicy = SecureFlagPolicy.Inherit;
        this.shouldDismissOnBackPress = z;
        this.shouldDismissOnClickOutside = z2;
        this.isAppearanceLightNavigationBars = null;
        this.isAppearanceLightStatusBars = null;
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    @hd0
    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3) {
        this.shouldDismissOnBackPress = z3;
        this.shouldDismissOnClickOutside = true;
        this.securePolicy = secureFlagPolicy;
        this.isAppearanceLightStatusBars = Boolean.valueOf(z);
        this.isAppearanceLightNavigationBars = Boolean.valueOf(z2);
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, int i, sb0 sb0Var) {
        this(z, z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3);
    }

    public ModalBottomSheetProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        this.shouldDismissOnBackPress = z3;
        this.shouldDismissOnClickOutside = z4;
        this.securePolicy = secureFlagPolicy;
        this.isAppearanceLightStatusBars = Boolean.valueOf(z);
        this.isAppearanceLightNavigationBars = Boolean.valueOf(z2);
    }

    public /* synthetic */ ModalBottomSheetProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i, sb0 sb0Var) {
        this(z, z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheetProperties)) {
            return false;
        }
        ModalBottomSheetProperties modalBottomSheetProperties = (ModalBottomSheetProperties) obj;
        return this.securePolicy == modalBottomSheetProperties.securePolicy && jh2.k(this.isAppearanceLightStatusBars, modalBottomSheetProperties.isAppearanceLightStatusBars) && jh2.k(this.isAppearanceLightNavigationBars, modalBottomSheetProperties.isAppearanceLightNavigationBars) && this.shouldDismissOnClickOutside == modalBottomSheetProperties.shouldDismissOnClickOutside && this.shouldDismissOnBackPress == modalBottomSheetProperties.shouldDismissOnBackPress;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    public int hashCode() {
        int hashCode = ((this.securePolicy.hashCode() * 31) + (this.shouldDismissOnBackPress ? 1231 : 1237)) * 31;
        Boolean bool = this.isAppearanceLightStatusBars;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isAppearanceLightNavigationBars;
        return ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.shouldDismissOnClickOutside ? 1231 : 1237);
    }

    public final Boolean isAppearanceLightNavigationBars$material3() {
        return this.isAppearanceLightNavigationBars;
    }

    public final Boolean isAppearanceLightStatusBars$material3() {
        return this.isAppearanceLightStatusBars;
    }

    public final boolean shouldDismissOnClickOutside() {
        return this.shouldDismissOnClickOutside;
    }
}
