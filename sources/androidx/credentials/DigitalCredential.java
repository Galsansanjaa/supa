package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import defpackage.ru;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DigitalCredential extends Credential {
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final Companion Companion = new Companion(null);
    private static final int STRING_LEN_THRESHOLD = 250000;
    public static final String TYPE_DIGITAL_CREDENTIAL = "androidx.credentials.TYPE_DIGITAL_CREDENTIAL";
    private final String credentialJson;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final DigitalCredential createFrom$credentials(Bundle bundle) {
            bundle.getClass();
            try {
                Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                obj.getClass();
                sb0 sb0Var = null;
                return obj instanceof byte[] ? new DigitalCredential(new String((byte[]) obj, ru.a), bundle, sb0Var) : new DigitalCredential((String) obj, bundle, sb0Var);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials(String str) {
            str.getClass();
            Bundle bundle = new Bundle();
            if (str.length() < DigitalCredential.STRING_LEN_THRESHOLD) {
                bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
                return bundle;
            }
            byte[] bytes = str.getBytes(ru.a);
            bytes.getClass();
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", bytes);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DigitalCredential(String str) {
        this(str, Companion.toBundle$credentials(str));
        str.getClass();
    }

    private DigitalCredential(String str, Bundle bundle) {
        super(TYPE_DIGITAL_CREDENTIAL, bundle);
        this.credentialJson = str;
        if (RequestValidationHelper.Companion.isValidJSON(str)) {
            return;
        }
        v5.m("credentialJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public /* synthetic */ DigitalCredential(String str, Bundle bundle, sb0 sb0Var) {
        this(str, bundle);
    }

    public final String getCredentialJson() {
        return this.credentialJson;
    }
}
