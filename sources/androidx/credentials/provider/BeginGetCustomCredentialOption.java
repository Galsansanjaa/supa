package androidx.credentials.provider;

import android.os.Bundle;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class BeginGetCustomCredentialOption extends BeginGetCredentialOption {
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final BeginGetCustomCredentialOption createFrom$credentials(Bundle bundle, String str, String str2) {
            bundle.getClass();
            str.getClass();
            str2.getClass();
            return new BeginGetCustomCredentialOption(str, str2, bundle);
        }

        public final BeginGetCustomCredentialOption createFromEntrySlice$credentials(Bundle bundle, String str, String str2) {
            bundle.getClass();
            str.getClass();
            str2.getClass();
            return new BeginGetCustomCredentialOption(str, str2, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginGetCustomCredentialOption(String str, String str2, Bundle bundle) {
        super(str, str2, bundle);
        str.getClass();
        str2.getClass();
        bundle.getClass();
        if (str.length() <= 0) {
            v5.m("id should not be empty");
            throw null;
        }
        if (str2.length() > 0) {
            return;
        }
        v5.m("type should not be empty");
        throw null;
    }
}
