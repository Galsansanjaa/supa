package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.CredentialOption;
import androidx.credentials.internal.FrameworkClassParsingException;
import defpackage.kw;
import defpackage.lw;
import defpackage.nb0;
import defpackage.sb0;
import defpackage.v5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class GetCredentialRequest {
    private static final String BUNDLE_KEY_PREFER_IDENTITY_DOC_UI = "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI";
    public static final String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";
    private static final String BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME = "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME";
    public static final Companion Companion = new Companion(null);
    private final List<CredentialOption> credentialOptions;
    private final String origin;
    private final boolean preferIdentityDocUi;
    private final boolean preferImmediatelyAvailableCredentials;
    private final ComponentName preferUiBrandingComponentName;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Builder {
        private List<CredentialOption> credentialOptions = new ArrayList();
        private String origin;
        private boolean preferIdentityDocUi;
        private boolean preferImmediatelyAvailableCredentials;
        private ComponentName preferUiBrandingComponentName;

        public final Builder addCredentialOption(CredentialOption credentialOption) {
            credentialOption.getClass();
            this.credentialOptions.add(credentialOption);
            return this;
        }

        public final GetCredentialRequest build() {
            return new GetCredentialRequest(kw.L0(this.credentialOptions), this.origin, this.preferIdentityDocUi, this.preferUiBrandingComponentName, this.preferImmediatelyAvailableCredentials);
        }

        public final Builder setCredentialOptions(List<? extends CredentialOption> list) {
            list.getClass();
            this.credentialOptions = new ArrayList(list);
            return this;
        }

        public final Builder setOrigin(String str) {
            str.getClass();
            this.origin = str;
            return this;
        }

        public final Builder setPreferIdentityDocUi(boolean z) {
            this.preferIdentityDocUi = z;
            return this;
        }

        public final Builder setPreferImmediatelyAvailableCredentials(boolean z) {
            this.preferImmediatelyAvailableCredentials = z;
            return this;
        }

        public final Builder setPreferUiBrandingComponentName(ComponentName componentName) {
            this.preferUiBrandingComponentName = componentName;
            return this;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final GetCredentialRequest createFrom(android.credentials.GetCredentialRequest getCredentialRequest) {
            getCredentialRequest.getClass();
            List<android.credentials.CredentialOption> credentialOptions = getCredentialRequest.getCredentialOptions();
            credentialOptions.getClass();
            List<android.credentials.CredentialOption> list = credentialOptions;
            ArrayList arrayList = new ArrayList(lw.Z(list, 10));
            for (android.credentials.CredentialOption credentialOption : list) {
                CredentialOption.Companion companion = CredentialOption.Companion;
                credentialOption.getClass();
                arrayList.add(companion.createFrom(credentialOption));
            }
            String origin = getCredentialRequest.getOrigin();
            Bundle data = getCredentialRequest.getData();
            data.getClass();
            return createFrom(arrayList, origin, data);
        }

        public final GetCredentialRequest createFrom(List<? extends CredentialOption> list, String str, Bundle bundle) {
            list.getClass();
            bundle.getClass();
            try {
                boolean z = bundle.getBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI);
                Builder preferImmediatelyAvailableCredentials = new Builder().setCredentialOptions(list).setPreferIdentityDocUi(z).setPreferUiBrandingComponentName((ComponentName) bundle.getParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME)).setPreferImmediatelyAvailableCredentials(bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"));
                if (str != null) {
                    preferImmediatelyAvailableCredentials.setOrigin(str);
                }
                return preferImmediatelyAvailableCredentials.build();
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle getRequestMetadataBundle(GetCredentialRequest getCredentialRequest) {
            getCredentialRequest.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI, getCredentialRequest.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", getCredentialRequest.preferImmediatelyAvailableCredentials());
            bundle.putParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME, getCredentialRequest.getPreferUiBrandingComponentName());
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(List<? extends CredentialOption> list) {
        this(list, null, false, null, false, 30, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str) {
        this(list, str, false, null, false, 28, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z) {
        this(list, str, z, null, false, 24, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z, ComponentName componentName) {
        this(list, str, z, componentName, false, 16, null);
        list.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z, ComponentName componentName, boolean z2) {
        list.getClass();
        this.credentialOptions = list;
        this.origin = str;
        this.preferIdentityDocUi = z;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z2;
        if (list.isEmpty()) {
            v5.m("credentialOptions should not be empty");
            throw null;
        }
        if (list.size() > 1) {
            List<? extends CredentialOption> list2 = list;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if ((((CredentialOption) it.next()) instanceof GetDigitalCredentialOption) && (i = i + 1) < 0) {
                        nb0.N();
                        throw null;
                    }
                }
            }
            if (i > 0 && i != this.credentialOptions.size()) {
                v5.m("Digital Credential Option cannot be used with other credential option.");
                throw null;
            }
            Iterator<CredentialOption> it2 = this.credentialOptions.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof GetRestoreCredentialOption) {
                    v5.m("Only a single GetRestoreCredentialOption should be provided.");
                    throw null;
                }
            }
        }
    }

    public /* synthetic */ GetCredentialRequest(List list, String str, boolean z, ComponentName componentName, boolean z2, int i, sb0 sb0Var) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : componentName, (i & 16) != 0 ? false : z2);
    }

    public static final GetCredentialRequest createFrom(android.credentials.GetCredentialRequest getCredentialRequest) {
        return Companion.createFrom(getCredentialRequest);
    }

    public static final GetCredentialRequest createFrom(List<? extends CredentialOption> list, String str, Bundle bundle) {
        return Companion.createFrom(list, str, bundle);
    }

    public static final Bundle getRequestMetadataBundle(GetCredentialRequest getCredentialRequest) {
        return Companion.getRequestMetadataBundle(getCredentialRequest);
    }

    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    public final boolean preferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }
}
