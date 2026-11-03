package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h90 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback m;
    public final /* synthetic */ GetCredentialResponse n;

    public /* synthetic */ h90(Executor executor, CredentialManagerCallback credentialManagerCallback, GetCredentialResponse getCredentialResponse, int i) {
        this.a = i;
        this.b = executor;
        this.m = credentialManagerCallback;
        this.n = getCredentialResponse;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 invokePlayServices$lambda$0$0;
        vy2 handleGetCredentialResponse$lambda$3;
        int i = this.a;
        GetCredentialResponse getCredentialResponse = this.n;
        CredentialManagerCallback credentialManagerCallback = this.m;
        Executor executor = this.b;
        switch (i) {
            case 0:
                invokePlayServices$lambda$0$0 = CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$0(executor, credentialManagerCallback, getCredentialResponse);
                return invokePlayServices$lambda$0$0;
            default:
                handleGetCredentialResponse$lambda$3 = ResponseUtils.Companion.handleGetCredentialResponse$lambda$3(executor, credentialManagerCallback, getCredentialResponse);
                return handleGetCredentialResponse$lambda$3;
        }
    }
}
