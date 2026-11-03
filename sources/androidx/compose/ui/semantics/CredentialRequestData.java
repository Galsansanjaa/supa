package androidx.compose.ui.semantics;

import android.credentials.GetCredentialRequest;
import android.os.OutcomeReceiver;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CredentialRequestData {
    public static final int $stable = 8;
    private final OutcomeReceiver callback;
    private final GetCredentialRequest request;

    public CredentialRequestData(GetCredentialRequest getCredentialRequest, OutcomeReceiver outcomeReceiver) {
        this.request = getCredentialRequest;
        this.callback = outcomeReceiver;
    }

    public final OutcomeReceiver getCallback() {
        return this.callback;
    }

    public final GetCredentialRequest getRequest() {
        return this.request;
    }
}
