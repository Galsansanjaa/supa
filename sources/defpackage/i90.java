package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i90 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderGetSignInIntentController b;
    public final /* synthetic */ GetCredentialException m;

    public /* synthetic */ i90(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderGetSignInIntentController;
        this.m = getCredentialException;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 handleResponse$lambda$4;
        vy2 invokePlayServices$lambda$3$0;
        int i = this.a;
        GetCredentialException getCredentialException = this.m;
        CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.b;
        switch (i) {
            case 0:
                handleResponse$lambda$4 = CredentialProviderGetSignInIntentController.handleResponse$lambda$4(credentialProviderGetSignInIntentController, getCredentialException);
                return handleResponse$lambda$4;
            default:
                invokePlayServices$lambda$3$0 = CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0(credentialProviderGetSignInIntentController, getCredentialException);
                return invokePlayServices$lambda$3$0;
        }
    }
}
