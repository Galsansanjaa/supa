package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a90 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ CredentialManagerCallback m;
    public final /* synthetic */ z42 n;

    public /* synthetic */ a90(Executor executor, CredentialManagerCallback credentialManagerCallback, z42 z42Var, int i) {
        this.a = i;
        this.b = executor;
        this.m = credentialManagerCallback;
        this.n = z42Var;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 invokePlayServices$lambda$2$0;
        vy2 invokePlayServices$lambda$2$02;
        vy2 onClearCredential$lambda$3$0;
        int i = this.a;
        z42 z42Var = this.n;
        CredentialManagerCallback credentialManagerCallback = this.m;
        Executor executor = this.b;
        switch (i) {
            case 0:
                invokePlayServices$lambda$2$0 = CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, z42Var);
                return invokePlayServices$lambda$2$0;
            case 1:
                invokePlayServices$lambda$2$02 = CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0(executor, credentialManagerCallback, z42Var);
                return invokePlayServices$lambda$2$02;
            default:
                onClearCredential$lambda$3$0 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0(executor, credentialManagerCallback, z42Var);
                return onClearCredential$lambda$3$0;
        }
    }
}
