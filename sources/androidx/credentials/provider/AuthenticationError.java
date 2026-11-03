package androidx.credentials.provider;

import android.util.Log;
import defpackage.dv1;
import defpackage.fi1;
import defpackage.jh2;
import defpackage.sb0;
import j$.util.Objects;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AuthenticationError {
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_CODE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK = "BIOMETRIC_AUTH_ERROR_CODE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE = "androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_MESSAGE";
    public static final String EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK = "BIOMETRIC_AUTH_ERROR_MESSAGE";
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackErrorMap;
    private final int errorCode;
    private final CharSequence errorMsg;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AuthenticationError";

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ AuthenticationError createFrom$credentials$default(Companion companion, int i, CharSequence charSequence, boolean z, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return companion.createFrom$credentials(i, charSequence, z);
        }

        public final int convertFrameworkBiometricErrorToJetpack$credentials(int i) {
            if (getBiometricFrameworkToJetpackErrorMap$credentials().containsKey(Integer.valueOf(i))) {
                Integer num = getBiometricFrameworkToJetpackErrorMap$credentials().get(Integer.valueOf(i));
                num.getClass();
                return num.intValue();
            }
            Log.i(getTAG$credentials(), "Unexpected error code, " + i + ", ");
            return i;
        }

        public final AuthenticationError createFrom$credentials(int i, CharSequence charSequence) {
            charSequence.getClass();
            return createFrom$credentials$default(this, i, charSequence, false, 4, null);
        }

        public final AuthenticationError createFrom$credentials(int i, CharSequence charSequence, boolean z) {
            charSequence.getClass();
            if (z) {
                i = convertFrameworkBiometricErrorToJetpack$credentials(i);
            }
            return new AuthenticationError(i, charSequence);
        }

        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackErrorMap$credentials() {
            return AuthenticationError.biometricFrameworkToJetpackErrorMap;
        }

        public final String getTAG$credentials() {
            return AuthenticationError.TAG;
        }
    }

    static {
        dv1[] dv1VarArr = {new dv1(5, 5), new dv1(12, 12), new dv1(1, 1), new dv1(7, 7), new dv1(9, 9), new dv1(11, 11), new dv1(14, 14), new dv1(4, 4), new dv1(15, 15), new dv1(3, 3), new dv1(2, 2), new dv1(10, 10), new dv1(8, 8)};
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(fi1.P(13));
        fi1.S(linkedHashMap, dv1VarArr);
        biometricFrameworkToJetpackErrorMap = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationError(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    public AuthenticationError(int i, CharSequence charSequence) {
        this.errorCode = i;
        this.errorMsg = charSequence;
    }

    public /* synthetic */ AuthenticationError(int i, CharSequence charSequence, int i2, sb0 sb0Var) {
        this(i, (i2 & 2) != 0 ? null : charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationError) {
            AuthenticationError authenticationError = (AuthenticationError) obj;
            if (this.errorCode == authenticationError.errorCode && jh2.k(this.errorMsg, authenticationError.errorMsg)) {
                return true;
            }
        }
        return false;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final CharSequence getErrorMsg() {
        return this.errorMsg;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.errorCode), this.errorMsg);
    }
}
