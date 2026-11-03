package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderCreatePasswordController b;
    public final /* synthetic */ CreateCredentialException m;

    public /* synthetic */ s80(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderCreatePasswordController;
        this.m = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.m;
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.b;
        switch (i) {
            case 0:
                CredentialProviderCreatePasswordController.d(credentialProviderCreatePasswordController, createCredentialException);
                return;
            default:
                CredentialProviderCreatePasswordController.i(credentialProviderCreatePasswordController, createCredentialException);
                return;
        }
    }
}
