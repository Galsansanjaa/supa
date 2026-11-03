package androidx.credentials.provider;

import android.util.Log;
import defpackage.dv1;
import defpackage.fi1;
import defpackage.sb0;
import j$.util.Objects;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AuthenticationResult {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE = "androidx.credentials.provider.BIOMETRIC_AUTH_RESULT";
    public static final String EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK = "BIOMETRIC_AUTH_RESULT";
    private static final LinkedHashMap<Integer, Integer> biometricFrameworkToJetpackResultMap;
    private final int authenticationType;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ AuthenticationResult createFrom$credentials$default(Companion companion, int i, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            return companion.createFrom$credentials(i, z);
        }

        public final int convertFrameworkBiometricResultToJetpack$credentials(int i) {
            if (getBiometricFrameworkToJetpackResultMap$credentials().containsKey(Integer.valueOf(i))) {
                Integer num = getBiometricFrameworkToJetpackResultMap$credentials().get(Integer.valueOf(i));
                num.getClass();
                return num.intValue();
            }
            Log.i(AuthenticationError.Companion.getTAG$credentials(), "Non framework result code, " + i + ", ");
            return i;
        }

        public final AuthenticationResult createFrom$credentials(int i) {
            return createFrom$credentials$default(this, i, false, 2, null);
        }

        public final AuthenticationResult createFrom$credentials(int i, boolean z) {
            if (z) {
                i = convertFrameworkBiometricResultToJetpack$credentials(i);
            }
            return new AuthenticationResult(i);
        }

        public final LinkedHashMap<Integer, Integer> getBiometricFrameworkToJetpackResultMap$credentials() {
            return AuthenticationResult.biometricFrameworkToJetpackResultMap;
        }
    }

    static {
        dv1[] dv1VarArr = {new dv1(2, 2), new dv1(1, 1)};
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(fi1.P(2));
        fi1.S(linkedHashMap, dv1VarArr);
        biometricFrameworkToJetpackResultMap = linkedHashMap;
    }

    public AuthenticationResult(int i) {
        this.authenticationType = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthenticationResult) && this.authenticationType == ((AuthenticationResult) obj).authenticationType;
    }

    public final int getAuthenticationType() {
        return this.authenticationType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.authenticationType));
    }
}
