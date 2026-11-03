package androidx.credentials.provider.utils;

import android.content.pm.SigningInfo;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.ProviderClearCredentialStateRequest;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ClearCredentialUtil {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final ProviderClearCredentialStateRequest convertToJetpackRequest$credentials(ClearCredentialStateRequest clearCredentialStateRequest) {
            clearCredentialStateRequest.getClass();
            CallingAppInfo.Companion companion = CallingAppInfo.Companion;
            String packageName = clearCredentialStateRequest.getCallingAppInfo().getPackageName();
            packageName.getClass();
            SigningInfo signingInfo = clearCredentialStateRequest.getCallingAppInfo().getSigningInfo();
            signingInfo.getClass();
            return new ProviderClearCredentialStateRequest(companion.create(packageName, signingInfo, clearCredentialStateRequest.getCallingAppInfo().getOrigin()));
        }
    }
}
