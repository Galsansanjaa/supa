package androidx.credentials;

import android.os.Bundle;
import defpackage.jh2;
import defpackage.k93;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ClearCredentialStateRequest {
    private static final String BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST";
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_CLEAR_CREDENTIAL_STATE = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";
    public static final String TYPE_CLEAR_RESTORE_CREDENTIAL = "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL";
    private final Bundle requestBundle;
    private final String requestType;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialStateRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ClearCredentialStateRequest(String str) {
        str.getClass();
        this.requestType = str;
        Bundle bundle = new Bundle();
        this.requestBundle = bundle;
        if (!jh2.k(str, TYPE_CLEAR_CREDENTIAL_STATE) && !jh2.k(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            v5.m(k93.m("The request type ", str, " is not supported."));
            throw null;
        }
        if (jh2.k(str, TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            bundle.putBoolean(BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST, true);
        }
    }

    public /* synthetic */ ClearCredentialStateRequest(String str, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? TYPE_CLEAR_CREDENTIAL_STATE : str);
    }

    public final Bundle getRequestBundle() {
        return this.requestBundle;
    }

    public final String getRequestType() {
        return this.requestType;
    }
}
