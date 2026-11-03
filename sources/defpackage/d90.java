package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d90 implements ct1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CancellationSignal b;
    public final /* synthetic */ Executor m;
    public final /* synthetic */ CredentialManagerCallback n;
    public final /* synthetic */ Object o;

    public /* synthetic */ d90(Object obj, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, int i) {
        this.a = i;
        this.o = obj;
        this.b = cancellationSignal;
        this.m = executor;
        this.n = credentialManagerCallback;
    }

    @Override // defpackage.ct1
    public final void e(Exception exc) {
        int i = this.a;
        CredentialManagerCallback credentialManagerCallback = this.n;
        Executor executor = this.m;
        CancellationSignal cancellationSignal = this.b;
        Object obj = this.o;
        switch (i) {
            case 0:
                CredentialProviderGetDigitalCredentialController.f((CredentialProviderGetDigitalCredentialController) obj, cancellationSignal, executor, credentialManagerCallback, exc);
                return;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2((CredentialProviderPlayServicesImpl) obj, cancellationSignal, executor, credentialManagerCallback, exc);
                return;
        }
    }
}
