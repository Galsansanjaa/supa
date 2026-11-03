package androidx.credentials;

import android.os.Bundle;
import android.util.Log;
import androidx.credentials.internal.ConversionUtilsKt;
import defpackage.nb0;
import defpackage.qq;
import defpackage.sb0;
import defpackage.wa2;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SignalUnknownCredentialRequest extends SignalCredentialStateRequest {
    public static final String SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE = "androidx.credentials.SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE";
    private static final String TAG = "SignalUnknownRequest";
    public static final Companion Companion = new Companion(null);
    private static final String RP_ID_KEY = "rpId";
    private static final String CREDENTIAL_ID_KEY = "credentialId";
    private static final List<String> REQUIRED_KEYS = nb0.D(RP_ID_KEY, CREDENTIAL_ID_KEY);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final boolean isValidRequestJson(String str) {
            str.getClass();
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (String str2 : SignalUnknownCredentialRequest.REQUIRED_KEYS) {
                    if (!jSONObject.has(str2)) {
                        Log.e(SignalUnknownCredentialRequest.TAG, "Request json is missing required key " + str2);
                        return false;
                    }
                }
                String string = jSONObject.getString(SignalUnknownCredentialRequest.CREDENTIAL_ID_KEY);
                string.getClass();
                return ConversionUtilsKt.isValidBase64Url(string);
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalUnknownCredentialRequest(String str) {
        this(str, null);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalUnknownCredentialRequest(String str, Bundle bundle, String str2) {
        super(SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE, str, bundle, str2);
        str.getClass();
        bundle.getClass();
        if (Companion.isValidRequestJson(str)) {
            return;
        }
        qq.j(wa2.r("Structural/type validation failed for JSON: '", str, '\''));
        throw null;
    }

    public /* synthetic */ SignalUnknownCredentialRequest(String str, Bundle bundle, String str2, int i, sb0 sb0Var) {
        this(str, bundle, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SignalUnknownCredentialRequest(String str, String str2) {
        this(str, SignalAllAcceptedCredentialIdsRequest.Companion.toRequestData(str), str2);
        str.getClass();
    }
}
