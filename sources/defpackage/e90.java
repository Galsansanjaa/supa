package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e90 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback m;
    public final /* synthetic */ GetCredentialException n;

    public /* synthetic */ e90(Executor executor, CredentialManagerCallback credentialManagerCallback, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = executor;
        this.m = credentialManagerCallback;
        this.n = getCredentialException;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 invokePlayServices$lambda$2$0;
        vy2 handleGetCredentialResponse$lambda$4;
        int i = this.a;
        GetCredentialException getCredentialException = this.n;
        CredentialManagerCallback credentialManagerCallback = this.m;
        Executor executor = this.b;
        switch (i) {
            case 0:
                invokePlayServices$lambda$2$0 = CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, getCredentialException);
                return invokePlayServices$lambda$2$0;
            default:
                handleGetCredentialResponse$lambda$4 = ResponseUtils.Companion.handleGetCredentialResponse$lambda$4(executor, credentialManagerCallback, getCredentialException);
                return handleGetCredentialResponse$lambda$4;
        }
    }
}
