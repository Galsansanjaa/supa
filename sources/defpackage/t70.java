package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CreateDigitalCredentialController b;
    public final /* synthetic */ CreateCredentialException m;

    public /* synthetic */ t70(CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialException createCredentialException, int i) {
        this.a = i;
        this.b = createDigitalCredentialController;
        this.m = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CreateCredentialException createCredentialException = this.m;
        CreateDigitalCredentialController createDigitalCredentialController = this.b;
        switch (i) {
            case 0:
                CreateDigitalCredentialController.handleResponse$lambda$3$0(createDigitalCredentialController, createCredentialException);
                return;
            default:
                CreateDigitalCredentialController.handleResponse$lambda$1$0(createDigitalCredentialController, createCredentialException);
                return;
        }
    }
}
