package androidx.compose.ui.semantics;

import defpackage.nb2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new nb2(23), null, 8, null);
    private static final SemanticsPropertyKey<String> AccessibilityClassName = new SemanticsPropertyKey<>("AccessibilityClassName", true, new nb2(24), null, 8, null);
    private static final SemanticsPropertyKey<CredentialRequestData> CredentialRequest = new SemanticsPropertyKey<>("CredentialRequest", false, new nb2(25), null, 8, null);
    public static final int $stable = 8;

    private SemanticsPropertiesAndroid() {
    }

    public static final String AccessibilityClassName$lambda$0(String str, String str2) {
        return str;
    }

    public static final CredentialRequestData CredentialRequest$lambda$0(CredentialRequestData credentialRequestData, CredentialRequestData credentialRequestData2) {
        return credentialRequestData;
    }

    public static final Boolean TestTagsAsResourceId$lambda$0(Boolean bool, boolean z) {
        return bool;
    }

    public static /* synthetic */ Boolean a(Boolean bool, boolean z) {
        return TestTagsAsResourceId$lambda$0(bool, z);
    }

    public static /* synthetic */ CredentialRequestData b(CredentialRequestData credentialRequestData, CredentialRequestData credentialRequestData2) {
        return CredentialRequest$lambda$0(credentialRequestData, credentialRequestData2);
    }

    public static /* synthetic */ String c(String str, String str2) {
        return AccessibilityClassName$lambda$0(str, str2);
    }

    public final SemanticsPropertyKey<String> getAccessibilityClassName() {
        return AccessibilityClassName;
    }

    public final SemanticsPropertyKey<CredentialRequestData> getCredentialRequest() {
        return CredentialRequest;
    }

    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }
}
