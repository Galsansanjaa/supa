package androidx.credentials;

import android.credentials.GetCredentialException;
import android.os.OutcomeReceiver;
import android.util.Log;
import android.view.View;
import androidx.credentials.internal.FrameworkImplHelper;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class Api35Impl {
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public final void clearPendingGetCredentialRequest(View view) {
        view.getClass();
        view.clearPendingCredentialRequest();
    }

    public final void setPendingGetCredentialRequest(View view, GetCredentialRequest getCredentialRequest, final ps0 ps0Var) {
        view.getClass();
        getCredentialRequest.getClass();
        ps0Var.getClass();
        view.setPendingCredentialRequest(FrameworkImplHelper.Companion.convertGetRequestToFrameworkClass(getCredentialRequest), new OutcomeReceiver() { // from class: androidx.credentials.Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1
            public void onError(GetCredentialException getCredentialException) {
                getCredentialException.getClass();
                Log.w("ViewHandler", "Error: " + getCredentialException.getType() + " , " + getCredentialException.getMessage());
            }

            public void onResult(android.credentials.GetCredentialResponse getCredentialResponse) {
                getCredentialResponse.getClass();
                ps0.this.invoke(FrameworkImplHelper.Companion.convertGetResponseToJetpackClass(getCredentialResponse));
            }
        });
    }
}
