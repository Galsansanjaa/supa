package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x70 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePasswordCredentialController b;

    public /* synthetic */ x70(CreatePasswordCredentialController createPasswordCredentialController, int i) {
        this.a = i;
        this.b = createPasswordCredentialController;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 invokePlayServices$lambda$0$0;
        vy2 handleResponse$lambda$2;
        int i = this.a;
        CreatePasswordCredentialController createPasswordCredentialController = this.b;
        switch (i) {
            case 0:
                invokePlayServices$lambda$0$0 = CreatePasswordCredentialController.invokePlayServices$lambda$0$0(createPasswordCredentialController);
                return invokePlayServices$lambda$0$0;
            default:
                handleResponse$lambda$2 = CreatePasswordCredentialController.handleResponse$lambda$2(createPasswordCredentialController);
                return handleResponse$lambda$2;
        }
    }
}
