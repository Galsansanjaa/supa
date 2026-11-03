package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g80 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback m;

    public /* synthetic */ g80(Executor executor, CredentialManagerCallback credentialManagerCallback, int i) {
        this.a = i;
        this.b = executor;
        this.m = credentialManagerCallback;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 invokePlayServices$lambda$0$0;
        vy2 invokePlayServices$lambda$0$3;
        vy2 onGetCredential$lambda$0;
        vy2 onGetCredential$lambda$1;
        vy2 onClearCredential$lambda$4$0;
        vy2 runFallbackClearCredFlow$lambda$0$0;
        vy2 onClearCredential$lambda$1$0;
        vy2 onCreateCredential$lambda$0;
        vy2 onClearCredential$lambda$0;
        vy2 invokePlayServices$lambda$0$02;
        vy2 handleGetCredentialResponse$lambda$2;
        int i = this.a;
        CredentialManagerCallback credentialManagerCallback = this.m;
        Executor executor = this.b;
        switch (i) {
            case 0:
                invokePlayServices$lambda$0$0 = CreatePublicKeyCredentialController.invokePlayServices$lambda$0$0(executor, credentialManagerCallback);
                return invokePlayServices$lambda$0$0;
            case 1:
                invokePlayServices$lambda$0$3 = CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3(executor, credentialManagerCallback);
                return invokePlayServices$lambda$0$3;
            case 2:
                onGetCredential$lambda$0 = CredentialProviderPlayServicesImpl.onGetCredential$lambda$0(executor, credentialManagerCallback);
                return onGetCredential$lambda$0;
            case 3:
                onGetCredential$lambda$1 = CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(executor, credentialManagerCallback);
                return onGetCredential$lambda$1;
            case 4:
                onClearCredential$lambda$4$0 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0(executor, credentialManagerCallback);
                return onClearCredential$lambda$4$0;
            case 5:
                runFallbackClearCredFlow$lambda$0$0 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0(executor, credentialManagerCallback);
                return runFallbackClearCredFlow$lambda$0$0;
            case 6:
                onClearCredential$lambda$1$0 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0(executor, credentialManagerCallback);
                return onClearCredential$lambda$1$0;
            case 7:
                onCreateCredential$lambda$0 = CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0(executor, credentialManagerCallback);
                return onCreateCredential$lambda$0;
            case 8:
                onClearCredential$lambda$0 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(executor, credentialManagerCallback);
                return onClearCredential$lambda$0;
            case 9:
                invokePlayServices$lambda$0$02 = GetCredentialController.invokePlayServices$lambda$0$0(executor, credentialManagerCallback);
                return invokePlayServices$lambda$0$02;
            default:
                handleGetCredentialResponse$lambda$2 = ResponseUtils.Companion.handleGetCredentialResponse$lambda$2(executor, credentialManagerCallback);
                return handleGetCredentialResponse$lambda$2;
        }
    }
}
