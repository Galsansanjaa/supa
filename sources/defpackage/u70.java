package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u70 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback m;
    public final /* synthetic */ Exception n;

    public /* synthetic */ u70(Exception exc, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        this.a = 3;
        this.n = exc;
        this.b = executor;
        this.m = credentialManagerCallback;
    }

    public /* synthetic */ u70(Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc, int i) {
        this.a = i;
        this.b = executor;
        this.m = credentialManagerCallback;
        this.n = exc;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 invokePlayServices$lambda$2$0;
        vy2 invokePlayServices$lambda$0$1;
        vy2 invokePlayServices$lambda$0$12;
        vy2 runFallbackClearCredFlow$lambda$2$0$0;
        int i = this.a;
        CredentialManagerCallback credentialManagerCallback = this.m;
        Executor executor = this.b;
        Exception exc = this.n;
        switch (i) {
            case 0:
                invokePlayServices$lambda$2$0 = CreateDigitalCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, exc);
                return invokePlayServices$lambda$2$0;
            case 1:
                invokePlayServices$lambda$0$1 = CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1(executor, credentialManagerCallback, exc);
                return invokePlayServices$lambda$0$1;
            case 2:
                invokePlayServices$lambda$0$12 = CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1(executor, credentialManagerCallback, exc);
                return invokePlayServices$lambda$0$12;
            default:
                runFallbackClearCredFlow$lambda$2$0$0 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0(exc, executor, credentialManagerCallback);
                return runFallbackClearCredFlow$lambda$2$0$0;
        }
    }
}
