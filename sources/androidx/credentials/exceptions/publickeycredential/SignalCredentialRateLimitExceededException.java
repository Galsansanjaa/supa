package androidx.credentials.exceptions.publickeycredential;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SignalCredentialRateLimitExceededException extends SignalCredentialStateException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_SIGNAL_CREDENTIAL_STATE_RATE_LIMIT_EXCEEDED_EXCEPTION = "androidx.credentials.SignalCredentialStateException.RATE_LIMIT_EXCEEDED";
    private final long retryMillis;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    public SignalCredentialRateLimitExceededException(long j) {
        this(j, null, 2, null);
    }

    public SignalCredentialRateLimitExceededException(long j, CharSequence charSequence) {
        super(TYPE_SIGNAL_CREDENTIAL_STATE_RATE_LIMIT_EXCEEDED_EXCEPTION, charSequence);
        this.retryMillis = j;
    }

    public /* synthetic */ SignalCredentialRateLimitExceededException(long j, CharSequence charSequence, int i, sb0 sb0Var) {
        this(j, (i & 2) != 0 ? null : charSequence);
    }

    public final long getRetryMillis() {
        return this.retryMillis;
    }
}
