package androidx.credentials;

import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CredentialManagerViewHandler {
    private static final String TAG = "ViewHandler";

    public static final PendingGetCredentialRequest getPendingGetCredentialRequest(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.androidx_credential_pendingCredentialRequest);
        if (tag instanceof PendingGetCredentialRequest) {
            return (PendingGetCredentialRequest) tag;
        }
        return null;
    }

    public static /* synthetic */ void getPendingGetCredentialRequest$annotations(View view) {
    }

    public static final void setPendingGetCredentialRequest(View view, PendingGetCredentialRequest pendingGetCredentialRequest) {
        view.getClass();
        view.setTag(R.id.androidx_credential_pendingCredentialRequest, pendingGetCredentialRequest);
        if (pendingGetCredentialRequest != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35 || (i == 34 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                Api35Impl.INSTANCE.setPendingGetCredentialRequest(view, pendingGetCredentialRequest.getRequest(), pendingGetCredentialRequest.getCallback());
                return;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35 || (i2 == 34 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            Api35Impl.INSTANCE.clearPendingGetCredentialRequest(view);
        }
    }
}
