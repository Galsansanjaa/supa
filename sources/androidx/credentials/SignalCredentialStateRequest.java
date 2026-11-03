package androidx.credentials;

import android.os.Bundle;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class SignalCredentialStateRequest {
    public static final Companion Companion = new Companion(null);
    private static final String SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE = "androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE";
    private static final String SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE = "androidx.credentials.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE";
    public static final String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";
    private static final String SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE = "androidx.credentials.SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE";
    private final String origin;
    private final Bundle requestData;
    private final String requestJson;
    private final String type;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final SignalCredentialStateRequest createFrom(String str, Bundle bundle, String str2) {
            str.getClass();
            bundle.getClass();
            String string = bundle.getString("androidx.credentials.signal_request_json_key");
            if (string != null) {
                return createFrom(str, string, str2);
            }
            v5.m("Bundle was missing requestJson");
            return null;
        }

        public final SignalCredentialStateRequest createFrom(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            int hashCode = str.hashCode();
            if (hashCode != -1620108889) {
                if (hashCode != 661746467) {
                    if (hashCode == 847956843 && str.equals("androidx.credentials.SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE")) {
                        return new SignalUnknownCredentialRequest(str2, str3);
                    }
                } else if (str.equals("androidx.credentials.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE")) {
                    return new SignalCurrentUserDetailsRequest(str2, str3);
                }
            } else if (str.equals("androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE")) {
                return new SignalAllAcceptedCredentialIdsRequest(str2, str3);
            }
            v5.m("Request type is not supported");
            return null;
        }
    }

    public SignalCredentialStateRequest(String str, String str2, Bundle bundle, String str3) {
        str.getClass();
        str2.getClass();
        bundle.getClass();
        this.type = str;
        this.requestJson = str2;
        this.requestData = bundle;
        this.origin = str3;
    }

    public /* synthetic */ SignalCredentialStateRequest(String str, String str2, Bundle bundle, String str3, int i, sb0 sb0Var) {
        this(str, str2, bundle, (i & 8) != 0 ? null : str3);
    }

    public static final SignalCredentialStateRequest createFrom(String str, Bundle bundle, String str2) {
        return Companion.createFrom(str, bundle, str2);
    }

    public static final SignalCredentialStateRequest createFrom(String str, String str2, String str3) {
        return Companion.createFrom(str, str2, str3);
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final Bundle getRequestData() {
        return this.requestData;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public final String getType() {
        return this.type;
    }
}
