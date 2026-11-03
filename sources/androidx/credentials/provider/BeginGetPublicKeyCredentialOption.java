package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.RequestValidationUtil;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class BeginGetPublicKeyCredentialOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final byte[] clientDataHash;
    private final String requestJson;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final BeginGetPublicKeyCredentialOption createFrom$credentials(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                string.getClass();
                return new BeginGetPublicKeyCredentialOption(bundle, str, string, byteArray);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }

        public final BeginGetPublicKeyCredentialOption createFromEntrySlice$credentials(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return new BeginGetPublicKeyCredentialOption(bundle, str, "{\"dummy_key\":\"dummy_value\"}", null, 8, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2) {
        this(bundle, str, str2, null, 8, null);
        bundle.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2, byte[] bArr) {
        super(str, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, bundle);
        bundle.getClass();
        str.getClass();
        str2.getClass();
        this.requestJson = str2;
        this.clientDataHash = bArr;
        if (RequestValidationUtil.Companion.isValidJSON(str2)) {
            return;
        }
        v5.m("requestJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public /* synthetic */ BeginGetPublicKeyCredentialOption(Bundle bundle, String str, String str2, byte[] bArr, int i, sb0 sb0Var) {
        this(bundle, str, str2, (i & 8) != 0 ? null : bArr);
    }

    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    public final String getRequestJson() {
        return this.requestJson;
    }
}
