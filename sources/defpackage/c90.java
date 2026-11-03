package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialProviderFrameworkImpl;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c90 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;

    public /* synthetic */ c90(CredentialManagerCallback credentialManagerCallback, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        CredentialManagerCallback credentialManagerCallback = this.b;
        switch (i) {
            case 0:
                return CredentialProviderFrameworkImpl.a(credentialManagerCallback);
            case 1:
                return CredentialProviderFrameworkImpl.b(credentialManagerCallback);
            case 2:
                return CredentialProviderFrameworkImpl.d(credentialManagerCallback);
            case 3:
                return CredentialProviderFrameworkImpl.e(credentialManagerCallback);
            default:
                return CredentialProviderFrameworkImpl.c(credentialManagerCallback);
        }
    }
}
