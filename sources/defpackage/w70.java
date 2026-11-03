package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ Exception m;

    public /* synthetic */ w70(CredentialManagerCallback credentialManagerCallback, Exception exc, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.m = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CreateDigitalCredentialController.e(this.b, this.m);
                return;
            case 1:
                CredentialProviderCreateRestoreCredentialController.g(this.b, this.m);
                return;
            case 2:
                CredentialProviderGetRestoreCredentialController.i(this.b, this.m);
                return;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0(this.b, this.m);
                return;
        }
    }
}
