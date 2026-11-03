package androidx.credentials.internal;

import android.credentials.Credential;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import androidx.credentials.Credential;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialResponse;
import defpackage.f2;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FrameworkImplHelper {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final GetCredentialRequest convertGetRequestToFrameworkClass(androidx.credentials.GetCredentialRequest getCredentialRequest) {
            getCredentialRequest.getClass();
            f2.t();
            GetCredentialRequest.Builder f = f2.f(androidx.credentials.GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest));
            for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
                f2.u();
                f.addCredentialOption(f2.d(credentialOption.getRequestData(), credentialOption.getType(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.isSystemProviderRequired()).setAllowedProviders(credentialOption.getAllowedProviders()).build());
            }
            setOriginForGetRequest(getCredentialRequest, f);
            GetCredentialRequest build = f.build();
            build.getClass();
            return build;
        }

        public final GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse getCredentialResponse) {
            getCredentialResponse.getClass();
            Credential credential = getCredentialResponse.getCredential();
            credential.getClass();
            Credential.Companion companion = androidx.credentials.Credential.Companion;
            String type = credential.getType();
            type.getClass();
            Bundle data = credential.getData();
            data.getClass();
            return new GetCredentialResponse(companion.createFrom(type, data));
        }

        public final void setOriginForGetRequest(androidx.credentials.GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
            getCredentialRequest.getClass();
            builder.getClass();
            if (getCredentialRequest.getOrigin() != null) {
                builder.setOrigin(getCredentialRequest.getOrigin());
            }
        }
    }

    public static final GetCredentialRequest convertGetRequestToFrameworkClass(androidx.credentials.GetCredentialRequest getCredentialRequest) {
        return Companion.convertGetRequestToFrameworkClass(getCredentialRequest);
    }

    public static final GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse getCredentialResponse) {
        return Companion.convertGetResponseToJetpackClass(getCredentialResponse);
    }

    public static final void setOriginForGetRequest(androidx.credentials.GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
        Companion.setOriginForGetRequest(getCredentialRequest, builder);
    }
}
