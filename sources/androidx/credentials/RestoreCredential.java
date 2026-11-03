package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.RequestValidationHelper;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class RestoreCredential extends Credential {
    private static final String BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE = "androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_RESTORE_CREDENTIAL";
    private final String authenticationResponseJson;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final RestoreCredential createFrom$credentials(Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString(RestoreCredential.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE);
            if (string != null) {
                return new RestoreCredential(string, bundle, null);
            }
            throw new NoCredentialException("The device does not contain a restore credential.");
        }
    }

    private RestoreCredential(String str, Bundle bundle) {
        super(TYPE_RESTORE_CREDENTIAL, bundle);
        this.authenticationResponseJson = str;
        if (RequestValidationHelper.Companion.isValidJSON(str)) {
            return;
        }
        v5.m("authenticationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public /* synthetic */ RestoreCredential(String str, Bundle bundle, sb0 sb0Var) {
        this(str, bundle);
    }

    public final String getAuthenticationResponseJson() {
        return this.authenticationResponseJson;
    }
}
