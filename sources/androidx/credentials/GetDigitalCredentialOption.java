package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.internal.RequestValidationHelper;
import defpackage.ri0;
import defpackage.sb0;
import defpackage.v5;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class GetDigitalCredentialOption extends CredentialOption {
    public static final String BUNDLE_KEY_REQUEST_JSON = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";
    public static final Companion Companion = new Companion(null);
    private final String requestJson;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final GetDigitalCredentialOption createFrom$credentials(Bundle bundle, Bundle bundle2, boolean z, Set<ComponentName> set) {
            bundle.getClass();
            bundle2.getClass();
            set.getClass();
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                string.getClass();
                return new GetDigitalCredentialOption(string, bundle, bundle2, z, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 100));
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final Bundle toBundle$credentials(String str) {
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetDigitalCredentialOption(String str) {
        this(str, Companion.toBundle$credentials(str), new Bundle(), false, false, ri0.a, 100);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDigitalCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i) {
        super(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, bundle, bundle2, z, z2, set, i);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        set.getClass();
        this.requestJson = str;
        if (RequestValidationHelper.Companion.isValidJSON(str)) {
            return;
        }
        v5.m("credentialJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }
}
