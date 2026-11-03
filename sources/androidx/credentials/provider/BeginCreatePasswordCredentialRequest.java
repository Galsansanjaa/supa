package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class BeginCreatePasswordCredentialRequest extends BeginCreateCredentialRequest {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final BeginCreatePasswordCredentialRequest createFrom$credentials(Bundle bundle, CallingAppInfo callingAppInfo) {
            bundle.getClass();
            try {
                return new BeginCreatePasswordCredentialRequest(callingAppInfo, bundle);
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginCreatePasswordCredentialRequest(CallingAppInfo callingAppInfo, Bundle bundle) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, callingAppInfo);
        bundle.getClass();
    }
}
