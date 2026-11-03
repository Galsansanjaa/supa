package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePasswordCredentialController b;
    public final /* synthetic */ CreateCredentialException m;

    public /* synthetic */ z70(CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = createPasswordCredentialController;
        this.m = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.m;
        CreatePasswordCredentialController createPasswordCredentialController = this.b;
        switch (i) {
            case 0:
                CreatePasswordCredentialController.handleResponse$lambda$1$0(createPasswordCredentialController, createCredentialException);
                return;
            default:
                CreatePasswordCredentialController.handleResponse$lambda$4$0(createPasswordCredentialController, createCredentialException);
                return;
        }
    }
}
