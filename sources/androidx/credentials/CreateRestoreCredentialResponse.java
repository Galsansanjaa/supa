package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.internal.RequestValidationHelper;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CreateRestoreCredentialResponse extends CreateCredentialResponse {
    public static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE";
    public static final Companion Companion = new Companion(null);
    private final String responseJson;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final CreateRestoreCredentialResponse createFrom(Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new CreateRestoreCredentialResponse(string, bundle, null);
            }
            throw new CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
        }

        public final Bundle toBundle$credentials(String str) {
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialResponse.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE, str);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialResponse(String str) {
        this(str, Companion.toBundle$credentials(str));
        str.getClass();
    }

    private CreateRestoreCredentialResponse(String str, Bundle bundle) {
        super(RestoreCredential.TYPE_RESTORE_CREDENTIAL, bundle);
        this.responseJson = str;
        if (RequestValidationHelper.Companion.isValidJSON(str)) {
            return;
        }
        v5.m("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public /* synthetic */ CreateRestoreCredentialResponse(String str, Bundle bundle, sb0 sb0Var) {
        this(str, bundle);
    }

    public static final CreateRestoreCredentialResponse createFrom(Bundle bundle) {
        return Companion.createFrom(bundle);
    }

    public final String getResponseJson() {
        return this.responseJson;
    }
}
