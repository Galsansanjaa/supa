package androidx.credentials.webauthn;

import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.webauthn.WebAuthnUtils;
import defpackage.sb0;
import java.security.MessageDigest;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class WebAuthnUtilsApi28 {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final String appInfoToOrigin(CallingAppInfo callingAppInfo) {
            callingAppInfo.getClass();
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(callingAppInfo.getSigningInfo().getApkContentsSigners()[0].toByteArray());
            StringBuilder sb = new StringBuilder("android:apk-key-hash:");
            WebAuthnUtils.Companion companion = WebAuthnUtils.Companion;
            digest.getClass();
            sb.append(companion.b64Encode(digest));
            return sb.toString();
        }
    }
}
