package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController b;
    public final /* synthetic */ CreateCredentialException m;

    public /* synthetic */ y80(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = credentialProviderCreatePublicKeyCredentialController;
        this.m = createCredentialException;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 invokePlayServices$lambda$4$0;
        vy2 handleResponse$lambda$3;
        int i = this.a;
        CreateCredentialException createCredentialException = this.m;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                invokePlayServices$lambda$4$0 = CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$4$0(credentialProviderCreatePublicKeyCredentialController, createCredentialException);
                return invokePlayServices$lambda$4$0;
            default:
                handleResponse$lambda$3 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$3(credentialProviderCreatePublicKeyCredentialController, createCredentialException);
                return handleResponse$lambda$3;
        }
    }
}
