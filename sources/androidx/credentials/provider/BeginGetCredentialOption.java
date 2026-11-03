package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final Bundle candidateQueryData;
    private final String id;
    private final String type;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final BeginGetCredentialOption createFrom$credentials(String str, String str2, Bundle bundle) {
            str.getClass();
            str2.getClass();
            bundle.getClass();
            return str2.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? BeginGetPasswordOption.Companion.createFrom$credentials(bundle, str) : str2.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? BeginGetPublicKeyCredentialOption.Companion.createFrom$credentials(bundle, str) : new BeginGetCustomCredentialOption(str, str2, bundle);
        }
    }

    public BeginGetCredentialOption(String str, String str2, Bundle bundle) {
        str.getClass();
        str2.getClass();
        bundle.getClass();
        this.id = str;
        this.type = str2;
        this.candidateQueryData = bundle;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }
}
