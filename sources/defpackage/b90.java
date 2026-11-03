package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ z42 m;

    public /* synthetic */ b90(CredentialManagerCallback credentialManagerCallback, z42 z42Var, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.m = z42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        z42 z42Var = this.m;
        CredentialManagerCallback credentialManagerCallback = this.b;
        switch (i) {
            case 0:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0$0(credentialManagerCallback, z42Var);
                return;
            case 1:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0$0(credentialManagerCallback, z42Var);
                return;
            case 2:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0(credentialManagerCallback, z42Var);
                return;
            default:
                SignalCredentialStateController.invokePlayServices$lambda$2$0(credentialManagerCallback, z42Var);
                return;
        }
    }
}
