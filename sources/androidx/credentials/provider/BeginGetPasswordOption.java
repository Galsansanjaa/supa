package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.PasswordCredential;
import defpackage.kw;
import defpackage.ri0;
import defpackage.sb0;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class BeginGetPasswordOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);
    private final Set<String> allowedUserIds;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final BeginGetPasswordOption createForTest(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            return createFrom$credentials(bundle, str);
        }

        public final BeginGetPasswordOption createFrom$credentials(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            ArrayList<String> stringArrayList = bundle.getStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            return new BeginGetPasswordOption(stringArrayList != null ? kw.P0(stringArrayList) : ri0.a, bundle, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetPasswordOption(Set<String> set, Bundle bundle, String str) {
        super(str, PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle);
        set.getClass();
        bundle.getClass();
        str.getClass();
        this.allowedUserIds = set;
    }

    public static final BeginGetPasswordOption createForTest(Bundle bundle, String str) {
        return Companion.createForTest(bundle, str);
    }

    public final Set<String> getAllowedUserIds() {
        return this.allowedUserIds;
    }
}
