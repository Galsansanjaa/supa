package androidx.credentials.exceptions.publickeycredential;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class SignalCredentialStateException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String type;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final SignalCredentialStateException createFrom(String str) {
            return new SignalCredentialUnknownException(str);
        }

        public final SignalCredentialStateException createFrom(String str, String str2) {
            str.getClass();
            int hashCode = str.hashCode();
            if (hashCode != 23095403) {
                if (hashCode != 1509209331) {
                    if (hashCode == 1902044575 && str.equals(SignalCredentialUnknownException.TYPE_SIGNAL_CREDENTIAL_STATE_UNKNOWN_EXCEPTION)) {
                        return new SignalCredentialUnknownException(str2);
                    }
                } else if (str.equals(SignalCredentialStateProviderConfigurationException.TYPE_SIGNAL_CREDENTIAL_STATE_PROVIDER_CONFIGURATION_EXCEPTION)) {
                    return new SignalCredentialStateProviderConfigurationException(str2);
                }
            } else if (str.equals(SignalCredentialSecurityException.TYPE_SIGNAL_CREDENTIAL_STATE_SECURITY_EXCEPTION)) {
                return new SignalCredentialSecurityException(str2);
            }
            return new SignalCredentialUnknownException(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignalCredentialStateException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateException(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        str.getClass();
        this.type = str;
    }

    public /* synthetic */ SignalCredentialStateException(String str, CharSequence charSequence, int i, sb0 sb0Var) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public final String getType() {
        return this.type;
    }
}
