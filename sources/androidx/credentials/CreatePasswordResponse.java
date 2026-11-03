package androidx.credentials;

import android.os.Bundle;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CreatePasswordResponse extends CreateCredentialResponse {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final CreatePasswordResponse createFrom$credentials(Bundle bundle) {
            bundle.getClass();
            return new CreatePasswordResponse(bundle, null);
        }
    }

    public CreatePasswordResponse() {
        this(new Bundle());
    }

    private CreatePasswordResponse(Bundle bundle) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle);
    }

    public /* synthetic */ CreatePasswordResponse(Bundle bundle, sb0 sb0Var) {
        this(bundle);
    }
}
