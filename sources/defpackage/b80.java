package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;

    public /* synthetic */ b80(CredentialManagerCallback credentialManagerCallback, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CredentialManagerCallback credentialManagerCallback = this.b;
        switch (i) {
            case 0:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$0$0(credentialManagerCallback);
                return;
            case 1:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3$0(credentialManagerCallback);
                return;
            case 2:
                CredentialProviderPlayServicesImpl.m8313$r8$lambda$e26TJ45BetGQtJZIcAQ5s9rm3c(credentialManagerCallback);
                return;
            case 3:
                CredentialProviderPlayServicesImpl.$r8$lambda$v2_cK85gsZZQw32xnN1qU13GbKQ(credentialManagerCallback);
                return;
            case 4:
                CredentialProviderPlayServicesImpl.$r8$lambda$eKxW_gs1lUPICybr1syVFaQsVp0(credentialManagerCallback);
                return;
            case 5:
                CredentialProviderPlayServicesImpl.$r8$lambda$Qhj5bSmYMsKY2IK3G30xvMhtcXQ(credentialManagerCallback);
                return;
            case 6:
                CredentialProviderPlayServicesImpl.$r8$lambda$hCjUIdJpkFZZ_R4jPEVDfW9xTXk(credentialManagerCallback);
                return;
            case 7:
                CredentialProviderPlayServicesImpl.$r8$lambda$v5kLi_w59Ybz8Cu6DmJc3hm3YW4(credentialManagerCallback);
                return;
            case 8:
                CredentialProviderPlayServicesImpl.$r8$lambda$ZmeORH0b9a1FJ17DY04w0WU6DDE(credentialManagerCallback);
                return;
            case 9:
                CredentialProviderPlayServicesImpl.m8310$r8$lambda$27hAKj8hhFiHQnNA1lTKsiGOxw(credentialManagerCallback);
                return;
            case 10:
                GetCredentialController.d(credentialManagerCallback);
                return;
            case 11:
                ResponseUtils.Companion.b(credentialManagerCallback);
                return;
            default:
                SignalCredentialStateController.g(credentialManagerCallback);
                return;
        }
    }
}
