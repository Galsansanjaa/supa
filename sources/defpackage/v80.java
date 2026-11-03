package defpackage;

import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController b;
    public final /* synthetic */ Throwable m;

    public /* synthetic */ v80(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th, int i) {
        this.a = i;
        this.b = credentialProviderCreatePublicKeyCredentialController;
        this.m = th;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 handleResponse$lambda$6;
        vy2 invokePlayServices$lambda$1;
        int i = this.a;
        Throwable th = this.m;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                handleResponse$lambda$6 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$6(credentialProviderCreatePublicKeyCredentialController, th);
                return handleResponse$lambda$6;
            default:
                invokePlayServices$lambda$1 = CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1(credentialProviderCreatePublicKeyCredentialController, th);
                return invokePlayServices$lambda$1;
        }
    }
}
