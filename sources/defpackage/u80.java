package defpackage;

import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import org.json.JSONException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u80 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController b;
    public final /* synthetic */ JSONException m;

    public /* synthetic */ u80(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i) {
        this.a = i;
        this.b = credentialProviderCreatePublicKeyCredentialController;
        this.m = jSONException;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 handleResponse$lambda$5;
        vy2 invokePlayServices$lambda$0;
        int i = this.a;
        JSONException jSONException = this.m;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                handleResponse$lambda$5 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$5(credentialProviderCreatePublicKeyCredentialController, jSONException);
                return handleResponse$lambda$5;
            default:
                invokePlayServices$lambda$0 = CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
                return invokePlayServices$lambda$0;
        }
    }
}
