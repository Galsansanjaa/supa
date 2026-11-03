package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderBeginSignInController b;
    public final /* synthetic */ GetCredentialException m;

    public /* synthetic */ q80(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderBeginSignInController;
        this.m = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        GetCredentialException getCredentialException = this.m;
        CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.b;
        switch (i) {
            case 0:
                CredentialProviderBeginSignInController.p(credentialProviderBeginSignInController, getCredentialException);
                return;
            case 1:
                CredentialProviderBeginSignInController.c(credentialProviderBeginSignInController, getCredentialException);
                return;
            default:
                CredentialProviderBeginSignInController.g(credentialProviderBeginSignInController, getCredentialException);
                return;
        }
    }
}
