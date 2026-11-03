package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreatePublicKeyCredentialController b;
    public final /* synthetic */ CreateCredentialException m;

    public /* synthetic */ f80(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = createPublicKeyCredentialController;
        this.m = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.m;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.b;
        switch (i) {
            case 0:
                CreatePublicKeyCredentialController.handleResponse$lambda$1$0(createPublicKeyCredentialController, createCredentialException);
                return;
            default:
                CreatePublicKeyCredentialController.handleResponse$lambda$4$0(createPublicKeyCredentialController, createCredentialException);
                return;
        }
    }
}
