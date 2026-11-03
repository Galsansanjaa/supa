package defpackage;

import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CredentialManagerCallback;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CredentialManagerCallback b;
    public final /* synthetic */ CreateCredentialResponse m;

    public /* synthetic */ h80(CredentialManagerCallback credentialManagerCallback, CreateCredentialResponse createCredentialResponse, int i) {
        this.a = i;
        this.b = credentialManagerCallback;
        this.m = createCredentialResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onResult(this.m);
                return;
            default:
                this.b.onResult(this.m);
                return;
        }
    }
}
