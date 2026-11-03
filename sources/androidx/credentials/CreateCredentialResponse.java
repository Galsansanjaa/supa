package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class CreateCredentialResponse {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA";
    private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE";
    private final Bundle data;
    private final String type;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Bundle asBundle(CreateCredentialResponse createCredentialResponse) {
            createCredentialResponse.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE, createCredentialResponse.getType());
            bundle.putBundle(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA, createCredentialResponse.getData());
            return bundle;
        }

        public final CreateCredentialResponse createFrom(String str, Bundle bundle) {
            str.getClass();
            bundle.getClass();
            try {
                int hashCode = str.hashCode();
                if (hashCode != -1678407252) {
                    if (hashCode != -543568185) {
                        if (hashCode == -95037569 && str.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            return CreatePublicKeyCredentialResponse.Companion.createFrom$credentials(bundle);
                        }
                    } else if (str.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                        return CreatePasswordResponse.Companion.createFrom$credentials(bundle);
                    }
                } else if (str.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                    return CreateDigitalCredentialResponse.Companion.createFrom$credentials(bundle);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CreateCustomCredentialResponse(str, bundle);
            }
        }

        public final CreateCredentialResponse fromBundle(Bundle bundle) {
            Bundle bundle2;
            bundle.getClass();
            String string = bundle.getString(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_TYPE);
            if (string == null || (bundle2 = bundle.getBundle(CreateCredentialResponse.EXTRA_CREATE_CREDENTIAL_RESPONSE_DATA)) == null) {
                return null;
            }
            return createFrom(string, bundle2);
        }
    }

    public CreateCredentialResponse(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.type = str;
        this.data = bundle;
    }

    public static final Bundle asBundle(CreateCredentialResponse createCredentialResponse) {
        return Companion.asBundle(createCredentialResponse);
    }

    public static final CreateCredentialResponse createFrom(String str, Bundle bundle) {
        return Companion.createFrom(str, bundle);
    }

    public static final CreateCredentialResponse fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final Bundle getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }
}
