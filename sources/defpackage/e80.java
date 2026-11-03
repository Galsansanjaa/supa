package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePublicKeyCredentialController b;

    public /* synthetic */ e80(CreatePublicKeyCredentialController createPublicKeyCredentialController, int i) {
        this.a = i;
        this.b = createPublicKeyCredentialController;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 handleResponse$lambda$2;
        vy2 invokePlayServices$lambda$0$1;
        int i = this.a;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                handleResponse$lambda$2 = CreatePublicKeyCredentialController.handleResponse$lambda$2(createPublicKeyCredentialController);
                return handleResponse$lambda$2;
            default:
                invokePlayServices$lambda$0$1 = CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1(createPublicKeyCredentialController);
                return invokePlayServices$lambda$0$1;
        }
    }
}
