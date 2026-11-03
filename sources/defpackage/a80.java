package defpackage;

import android.os.CancellationSignal;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.lifecycle.MutableLiveData;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements ct1, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Executor m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ a80(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        this.a = 2;
        this.o = credentialProviderPlayServicesImpl;
        this.p = clearCredentialStateRequest;
        this.n = cancellationSignal;
        this.m = executor;
        this.b = credentialManagerCallback;
    }

    public /* synthetic */ a80(Object obj, Object obj2, CredentialManagerCallback credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal, int i) {
        this.a = i;
        this.o = obj;
        this.p = obj2;
        this.b = credentialManagerCallback;
        this.m = executor;
        this.n = cancellationSignal;
    }

    public /* synthetic */ a80(Executor executor, Tracer tracer, String str, os0 os0Var, MutableLiveData mutableLiveData) {
        this.a = 4;
        this.m = executor;
        this.o = tracer;
        this.p = str;
        this.b = os0Var;
        this.n = mutableLiveData;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        vy2 launchOperation$lambda$2;
        launchOperation$lambda$2 = OperationKt.launchOperation$lambda$2(this.m, (Tracer) this.o, (String) this.p, (os0) this.b, (MutableLiveData) this.n, completer);
        return launchOperation$lambda$2;
    }

    @Override // defpackage.ct1
    public void e(Exception exc) {
        int i = this.a;
        Object obj = this.n;
        Object obj2 = this.b;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                CreatePasswordCredentialController.invokePlayServices$lambda$2((CreatePasswordCredentialController) obj4, (CreatePasswordRequest) obj3, (CredentialManagerCallback) obj2, this.m, (CancellationSignal) obj, exc);
                return;
            case 1:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$2((CreatePublicKeyCredentialRequest) obj4, (CreatePublicKeyCredentialController) obj3, (CredentialManagerCallback) obj2, this.m, (CancellationSignal) obj, exc);
                return;
            case 2:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$6((CredentialProviderPlayServicesImpl) obj4, (ClearCredentialStateRequest) obj3, (CancellationSignal) obj, this.m, (CredentialManagerCallback) obj2, exc);
                return;
            default:
                GetCredentialController.invokePlayServices$lambda$2((GetCredentialRequest) obj4, (GetCredentialController) obj3, (CredentialManagerCallback) obj2, this.m, (CancellationSignal) obj, exc);
                return;
        }
    }
}
