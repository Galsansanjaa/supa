package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePasswordCredentialController b;

    public /* synthetic */ y70(CreatePasswordCredentialController createPasswordCredentialController, int i) {
        this.a = i;
        this.b = createPasswordCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreatePasswordCredentialController createPasswordCredentialController = this.b;
        switch (i) {
            case 0:
                CreatePasswordCredentialController.k(createPasswordCredentialController);
                return;
            default:
                CreatePasswordCredentialController.o(createPasswordCredentialController);
                return;
        }
    }
}
