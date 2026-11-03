package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import defpackage.sb0;
import defpackage.v5;
import org.json.JSONObject;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CreateRestoreCredentialRequest extends CreateCredentialRequest {
    private static final String BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST = "androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST";
    private static final String BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD = "androidx.credentials.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD";
    public static final Companion Companion = new Companion(null);
    private final boolean isCloudBackupEnabled;
    private final String requestJson;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CreateCredentialRequest.DisplayInfo getDisplayInfoFromJson(String str) {
            try {
                String string = new JSONObject(str).getJSONObject("user").getString("id");
                string.getClass();
                return new CreateCredentialRequest.DisplayInfo(string, (CharSequence) null, 2, (sb0) null);
            } catch (Exception unused) {
                v5.m("user.id must be defined in requestJson");
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle toCredentialDataBundle(String str, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putString(CreateRestoreCredentialRequest.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_REQUEST, str);
            bundle.putBoolean(CreateRestoreCredentialRequest.BUNDLE_KEY_SHOULD_BACKUP_TO_CLOUD, z);
            return bundle;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateRestoreCredentialRequest(String str) {
        this(str, false, 2, null);
        str.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreateRestoreCredentialRequest(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            r11.getClass()
            androidx.credentials.CreateRestoreCredentialRequest$Companion r0 = androidx.credentials.CreateRestoreCredentialRequest.Companion
            android.os.Bundle r3 = androidx.credentials.CreateRestoreCredentialRequest.Companion.access$toCredentialDataBundle(r0, r11, r12)
            androidx.credentials.CreateCredentialRequest$DisplayInfo r7 = androidx.credentials.CreateRestoreCredentialRequest.Companion.access$getDisplayInfoFromJson(r0, r11)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r8 = 0
            r9 = 0
            java.lang.String r2 = "androidx.credentials.TYPE_RESTORE_CREDENTIAL"
            r5 = 0
            r6 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.requestJson = r11
            r1.isCloudBackupEnabled = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.CreateRestoreCredentialRequest.<init>(java.lang.String, boolean):void");
    }

    public /* synthetic */ CreateRestoreCredentialRequest(String str, boolean z, int i, sb0 sb0Var) {
        this(str, (i & 2) != 0 ? true : z);
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    public final boolean isCloudBackupEnabled() {
        return this.isCloudBackupEnabled;
    }
}
