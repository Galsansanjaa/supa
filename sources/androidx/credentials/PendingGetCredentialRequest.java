package androidx.credentials;

import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PendingGetCredentialRequest {
    private final ps0 callback;
    private final GetCredentialRequest request;

    public PendingGetCredentialRequest(GetCredentialRequest getCredentialRequest, ps0 ps0Var) {
        getCredentialRequest.getClass();
        ps0Var.getClass();
        this.request = getCredentialRequest;
        this.callback = ps0Var;
    }

    public final ps0 getCallback() {
        return this.callback;
    }

    public final GetCredentialRequest getRequest() {
        return this.request;
    }
}
