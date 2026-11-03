package androidx.credentials.webauthn;

import androidx.credentials.webauthn.WebAuthnUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PublicKeyCredentialRequestOptions {
    private final byte[] challenge;
    private final JSONObject json;
    private final String rpId;
    private final long timeout;
    private final String userVerification;

    public PublicKeyCredentialRequestOptions(String str) {
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        this.json = jSONObject;
        String string = jSONObject.getString("challenge");
        WebAuthnUtils.Companion companion = WebAuthnUtils.Companion;
        string.getClass();
        this.challenge = companion.b64Decode(string);
        this.timeout = jSONObject.optLong("timeout", 0L);
        String optString = jSONObject.optString("rpId", "");
        optString.getClass();
        this.rpId = optString;
        String optString2 = jSONObject.optString("userVerification", "preferred");
        optString2.getClass();
        this.userVerification = optString2;
    }

    public final byte[] getChallenge() {
        return this.challenge;
    }

    public final JSONObject getJson() {
        return this.json;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }
}
