package androidx.compose.ui.autofill;

import android.credentials.GetCredentialRequest;
import android.os.OutcomeReceiver;
import android.view.ViewStructure;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AutofillApi35Helper {
    public static final int $stable = 0;
    public static final AutofillApi35Helper INSTANCE = new AutofillApi35Helper();

    private AutofillApi35Helper() {
    }

    public final void clearCredentialManagerRequest(ViewStructure viewStructure) {
        viewStructure.clearCredentialManagerRequest();
    }

    public final void setPendingCredentialRequest(ViewStructure viewStructure, GetCredentialRequest getCredentialRequest, OutcomeReceiver outcomeReceiver) {
        viewStructure.setPendingCredentialRequest(getCredentialRequest, outcomeReceiver);
    }
}
