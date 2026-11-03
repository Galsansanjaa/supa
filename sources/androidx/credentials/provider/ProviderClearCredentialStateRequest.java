package androidx.credentials.provider;

import android.os.Bundle;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ProviderClearCredentialStateRequest {
    public static final Companion Companion = new Companion(null);
    private final CallingAppInfo callingAppInfo;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Bundle asBundle(ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
            providerClearCredentialStateRequest.getClass();
            Bundle bundle = new Bundle();
            CallingAppInfo.Companion.setCallingAppInfo$credentials(bundle, providerClearCredentialStateRequest.getCallingAppInfo());
            return bundle;
        }

        public final ProviderClearCredentialStateRequest fromBundle(Bundle bundle) {
            bundle.getClass();
            CallingAppInfo extractCallingAppInfo = CallingAppInfo.Companion.extractCallingAppInfo(bundle);
            if (extractCallingAppInfo != null) {
                return new ProviderClearCredentialStateRequest(extractCallingAppInfo);
            }
            v5.m("Bundle was missing CallingAppInfo.");
            return null;
        }
    }

    public ProviderClearCredentialStateRequest(CallingAppInfo callingAppInfo) {
        callingAppInfo.getClass();
        this.callingAppInfo = callingAppInfo;
    }

    public static final Bundle asBundle(ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        return Companion.asBundle(providerClearCredentialStateRequest);
    }

    public static final ProviderClearCredentialStateRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }
}
