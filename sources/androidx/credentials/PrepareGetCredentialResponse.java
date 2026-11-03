package androidx.credentials;

import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import defpackage.os0;
import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PrepareGetCredentialResponse {
    private final ps0 credentialTypeDelegate;
    private final os0 hasAuthResultsDelegate;
    private final os0 hasRemoteResultsDelegate;
    private final boolean isNullHandlesForTest;
    private final PendingGetCredentialHandle pendingGetCredentialHandle;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Builder {
        private android.credentials.PrepareGetCredentialResponse frameworkResponse;
        private os0 hasAuthResultsDelegate;
        private ps0 hasCredentialResultsDelegate;
        private os0 hasRemoteResultsDelegate;
        private PendingGetCredentialHandle pendingGetCredentialHandle;

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasAuthenticationResults() {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            prepareGetCredentialResponse.getClass();
            return prepareGetCredentialResponse.hasAuthenticationResults();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasCredentialType(String str) {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            prepareGetCredentialResponse.getClass();
            return prepareGetCredentialResponse.hasCredentialResults(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasRemoteResults() {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            prepareGetCredentialResponse.getClass();
            return prepareGetCredentialResponse.hasRemoteResults();
        }

        public final PrepareGetCredentialResponse build() {
            return new PrepareGetCredentialResponse(this.pendingGetCredentialHandle, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, false, null);
        }

        public final Builder setFrameworkResponse(android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse) {
            this.frameworkResponse = prepareGetCredentialResponse;
            if (prepareGetCredentialResponse != null) {
                this.hasCredentialResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(this);
                this.hasAuthResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$2(this);
                this.hasRemoteResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$3(this);
            }
            return this;
        }

        public final Builder setPendingGetCredentialHandle(PendingGetCredentialHandle pendingGetCredentialHandle) {
            pendingGetCredentialHandle.getClass();
            this.pendingGetCredentialHandle = pendingGetCredentialHandle;
            return this;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class PendingGetCredentialHandle {
        private final PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle;

        public PendingGetCredentialHandle(PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle) {
            this.frameworkHandle = pendingGetCredentialHandle;
            if (Build.VERSION.SDK_INT >= 34) {
                pendingGetCredentialHandle.getClass();
            }
        }

        public final PrepareGetCredentialResponse.PendingGetCredentialHandle getFrameworkHandle() {
            return this.frameworkHandle;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class TestBuilder {
        private os0 hasAuthResultsDelegate;
        private ps0 hasCredentialResultsDelegate;
        private os0 hasRemoteResultsDelegate;

        public final PrepareGetCredentialResponse build() {
            return new PrepareGetCredentialResponse(null, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, true, null);
        }

        public final TestBuilder setCredentialTypeDelegate(ps0 ps0Var) {
            ps0Var.getClass();
            this.hasCredentialResultsDelegate = ps0Var;
            return this;
        }

        public final TestBuilder setHasAuthResultsDelegate(os0 os0Var) {
            os0Var.getClass();
            this.hasAuthResultsDelegate = os0Var;
            return this;
        }

        public final TestBuilder setHasRemoteResultsDelegate(os0 os0Var) {
            os0Var.getClass();
            this.hasRemoteResultsDelegate = os0Var;
            return this;
        }
    }

    private PrepareGetCredentialResponse(PendingGetCredentialHandle pendingGetCredentialHandle, os0 os0Var, os0 os0Var2, ps0 ps0Var, boolean z) {
        this.pendingGetCredentialHandle = pendingGetCredentialHandle;
        this.hasRemoteResultsDelegate = os0Var;
        this.hasAuthResultsDelegate = os0Var2;
        this.credentialTypeDelegate = ps0Var;
        this.isNullHandlesForTest = z;
        if (Build.VERSION.SDK_INT < 34 || z) {
            return;
        }
        pendingGetCredentialHandle.getClass();
    }

    public /* synthetic */ PrepareGetCredentialResponse(PendingGetCredentialHandle pendingGetCredentialHandle, os0 os0Var, os0 os0Var2, ps0 ps0Var, boolean z, sb0 sb0Var) {
        this(pendingGetCredentialHandle, os0Var, os0Var2, ps0Var, z);
    }

    public final ps0 getCredentialTypeDelegate() {
        return this.credentialTypeDelegate;
    }

    public final os0 getHasAuthResultsDelegate() {
        return this.hasAuthResultsDelegate;
    }

    public final os0 getHasRemoteResultsDelegate() {
        return this.hasRemoteResultsDelegate;
    }

    public final PendingGetCredentialHandle getPendingGetCredentialHandle() {
        return this.pendingGetCredentialHandle;
    }

    public final boolean hasAuthenticationResults() {
        os0 os0Var = this.hasAuthResultsDelegate;
        if (os0Var != null) {
            return ((Boolean) os0Var.invoke()).booleanValue();
        }
        return false;
    }

    public final boolean hasCredentialResults(String str) {
        str.getClass();
        ps0 ps0Var = this.credentialTypeDelegate;
        if (ps0Var != null) {
            return ((Boolean) ps0Var.invoke(str)).booleanValue();
        }
        return false;
    }

    public final boolean hasRemoteResults() {
        os0 os0Var = this.hasRemoteResultsDelegate;
        if (os0Var != null) {
            return ((Boolean) os0Var.invoke()).booleanValue();
        }
        return false;
    }

    public final boolean isNullHandlesForTest() {
        return this.isNullHandlesForTest;
    }
}
