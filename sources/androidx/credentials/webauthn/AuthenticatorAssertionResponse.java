package androidx.credentials.webauthn;

import androidx.credentials.webauthn.WebAuthnUtils;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import defpackage.ru;
import defpackage.sb0;
import defpackage.wd;
import java.security.MessageDigest;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AuthenticatorAssertionResponse implements AuthenticatorResponse {
    private byte[] authenticatorData;
    private final boolean be;
    private final boolean bs;
    private final byte[] clientDataHash;
    private JSONObject clientJson;
    private final byte[] credentialId;
    private final String origin;
    private final String packageName;
    private final PublicKeyCredentialRequestOptions requestOptions;
    private byte[] signature;
    private final boolean up;
    private byte[] userHandle;
    private final boolean uv;

    public AuthenticatorAssertionResponse(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr, String str, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr2, String str2, byte[] bArr3) {
        publicKeyCredentialRequestOptions.getClass();
        bArr.getClass();
        str.getClass();
        bArr2.getClass();
        this.requestOptions = publicKeyCredentialRequestOptions;
        this.credentialId = bArr;
        this.origin = str;
        this.up = z;
        this.uv = z2;
        this.be = z3;
        this.bs = z4;
        this.userHandle = bArr2;
        this.packageName = str2;
        this.clientDataHash = bArr3;
        this.clientJson = new JSONObject();
        this.signature = new byte[0];
        getClientJson().put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "webauthn.get");
        getClientJson().put("challenge", WebAuthnUtils.Companion.b64Encode(publicKeyCredentialRequestOptions.getChallenge()));
        getClientJson().put("origin", str);
        if (str2 != null) {
            getClientJson().put("androidPackageName", str2);
        }
        this.authenticatorData = defaultAuthenticatorData();
    }

    public /* synthetic */ AuthenticatorAssertionResponse(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr, String str, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr2, String str2, byte[] bArr3, int i, sb0 sb0Var) {
        this(publicKeyCredentialRequestOptions, bArr, str, z, z2, z3, z4, bArr2, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bArr3);
    }

    public final byte[] dataToSign() {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bArr = this.clientDataHash;
        if (bArr == null) {
            String jSONObject = getClientJson().toString();
            jSONObject.getClass();
            byte[] bytes = jSONObject.getBytes(ru.a);
            bytes.getClass();
            bArr = messageDigest.digest(bytes);
            bArr.getClass();
        }
        return wd.L0(this.authenticatorData, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final byte[] defaultAuthenticatorData() {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = this.requestOptions.getRpId().getBytes(ru.a);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        boolean z = this.up;
        boolean z2 = z;
        if (this.uv) {
            z2 = (z ? 1 : 0) | 4;
        }
        boolean z3 = z2;
        if (this.be) {
            z3 = (z2 ? 1 : 0) | '\b';
        }
        int i = z3;
        if (this.bs) {
            i = (z3 ? 1 : 0) | 16;
        }
        digest.getClass();
        return wd.L0(wd.L0(digest, new byte[]{(byte) i}), new byte[]{0, 0, 0, 0});
    }

    public final byte[] getAuthenticatorData() {
        return this.authenticatorData;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject getClientJson() {
        return this.clientJson;
    }

    public final byte[] getSignature() {
        return this.signature;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public JSONObject json() {
        String jSONObject = getClientJson().toString();
        jSONObject.getClass();
        byte[] bytes = jSONObject.getBytes(ru.a);
        bytes.getClass();
        JSONObject jSONObject2 = new JSONObject();
        if (this.clientDataHash == null) {
            jSONObject2.put("clientDataJSON", WebAuthnUtils.Companion.b64Encode(bytes));
        }
        WebAuthnUtils.Companion companion = WebAuthnUtils.Companion;
        jSONObject2.put("authenticatorData", companion.b64Encode(this.authenticatorData));
        jSONObject2.put("signature", companion.b64Encode(this.signature));
        jSONObject2.put("userHandle", companion.b64Encode(this.userHandle));
        return jSONObject2;
    }

    public final void setAuthenticatorData(byte[] bArr) {
        bArr.getClass();
        this.authenticatorData = bArr;
    }

    @Override // androidx.credentials.webauthn.AuthenticatorResponse
    public void setClientJson(JSONObject jSONObject) {
        jSONObject.getClass();
        this.clientJson = jSONObject;
    }

    public final void setSignature(byte[] bArr) {
        bArr.getClass();
        this.signature = bArr;
    }
}
