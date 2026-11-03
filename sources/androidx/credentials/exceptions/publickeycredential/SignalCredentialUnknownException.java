package androidx.credentials.exceptions.publickeycredential;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SignalCredentialUnknownException extends SignalCredentialStateException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_SIGNAL_CREDENTIAL_STATE_UNKNOWN_EXCEPTION = "androidx.credentials.SignalCredentialStateException.TYPE_UNKNOWN";

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignalCredentialUnknownException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SignalCredentialUnknownException(CharSequence charSequence) {
        super(TYPE_SIGNAL_CREDENTIAL_STATE_UNKNOWN_EXCEPTION, charSequence);
    }

    public /* synthetic */ SignalCredentialUnknownException(CharSequence charSequence, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : charSequence);
    }
}
