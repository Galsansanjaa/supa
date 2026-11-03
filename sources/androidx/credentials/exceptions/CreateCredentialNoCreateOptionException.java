package androidx.credentials.exceptions;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CreateCredentialNoCreateOptionException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CREATE_CREDENTIAL_NO_CREATE_OPTION = "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS";

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
    public CreateCredentialNoCreateOptionException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CreateCredentialNoCreateOptionException(CharSequence charSequence) {
        super(TYPE_CREATE_CREDENTIAL_NO_CREATE_OPTION, charSequence);
    }

    public /* synthetic */ CreateCredentialNoCreateOptionException(CharSequence charSequence, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : charSequence);
    }
}
