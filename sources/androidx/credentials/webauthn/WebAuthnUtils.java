package androidx.credentials.webauthn;

import android.os.Build;
import android.util.Base64;
import androidx.credentials.provider.CallingAppInfo;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class WebAuthnUtils {
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
            return Build.VERSION.SDK_INT >= 28 ? WebAuthnUtilsApi28.Companion.appInfoToOrigin(callingAppInfo) : "";
        }

        public final byte[] b64Decode(String str) {
            str.getClass();
            byte[] decode = Base64.decode(str, 11);
            decode.getClass();
            return decode;
        }

        public final String b64Encode(byte[] bArr) {
            bArr.getClass();
            String encodeToString = Base64.encodeToString(bArr, 11);
            encodeToString.getClass();
            return encodeToString;
        }
    }
}
