package defpackage;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.ResponseUtils;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ GetCredentialException m;

    public /* synthetic */ f90(CredentialManagerCallback credentialManagerCallback, GetCredentialException getCredentialException, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.m = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        GetCredentialException getCredentialException = this.m;
        CredentialManagerCallback credentialManagerCallback = this.b;
        switch (i) {
            case 0:
                credentialManagerCallback.onError(getCredentialException);
                return;
            case 1:
                credentialManagerCallback.onError(getCredentialException);
                return;
            default:
                ResponseUtils.Companion.handleGetCredentialResponse$lambda$4$0(credentialManagerCallback, getCredentialException);
                return;
        }
    }
}
