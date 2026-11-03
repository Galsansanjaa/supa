package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderBeginSignInController b;
    public final /* synthetic */ GetCredentialException m;

    public /* synthetic */ p80(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderBeginSignInController;
        this.m = getCredentialException;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 handleResponse$lambda$4;
        vy2 invokePlayServices$lambda$2$0;
        int i = this.a;
        GetCredentialException getCredentialException = this.m;
        CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.b;
        switch (i) {
            case 0:
                handleResponse$lambda$4 = CredentialProviderBeginSignInController.handleResponse$lambda$4(credentialProviderBeginSignInController, getCredentialException);
                return handleResponse$lambda$4;
            default:
                invokePlayServices$lambda$2$0 = CredentialProviderBeginSignInController.invokePlayServices$lambda$2$0(credentialProviderBeginSignInController, getCredentialException);
                return invokePlayServices$lambda$2$0;
        }
    }
}
