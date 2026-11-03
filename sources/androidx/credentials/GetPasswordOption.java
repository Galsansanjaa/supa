package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import defpackage.kw;
import defpackage.ri0;
import defpackage.sb0;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class GetPasswordOption extends CredentialOption {
    public static final String BUNDLE_KEY_ALLOWED_USER_IDS = "androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS";
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

        public final GetPasswordOption createFrom$credentials(Bundle bundle, Set<ComponentName> set, Bundle bundle2) {
            bundle.getClass();
            set.getClass();
            bundle2.getClass();
            ArrayList<String> stringArrayList = bundle.getStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS);
            return new GetPasswordOption(stringArrayList != null ? kw.P0(stringArrayList) : ri0.a, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set, bundle, bundle2, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 1000), null);
        }

        public final Bundle toBundle$credentials(Set<String> set) {
            set.getClass();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(GetPasswordOption.BUNDLE_KEY_ALLOWED_USER_IDS, new ArrayList<>(set));
            return bundle;
        }
    }

    public GetPasswordOption() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPasswordOption(Set<String> set) {
        this(set, false, null, 6, null);
        set.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPasswordOption(Set<String> set, boolean z) {
        this(set, z, null, 4, null);
        set.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GetPasswordOption(java.util.Set<java.lang.String> r11, boolean r12, java.util.Set<android.content.ComponentName> r13) {
        /*
            r10 = this;
            r11.getClass()
            r13.getClass()
            androidx.credentials.GetPasswordOption$Companion r0 = androidx.credentials.GetPasswordOption.Companion
            android.os.Bundle r5 = r0.toBundle$credentials(r11)
            android.os.Bundle r6 = r0.toBundle$credentials(r11)
            r8 = 32
            r9 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.GetPasswordOption.<init>(java.util.Set, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GetPasswordOption(java.util.Set r2, boolean r3, java.util.Set r4, int r5, defpackage.sb0 r6) {
        /*
            r1 = this;
            r6 = r5 & 1
            ri0 r0 = defpackage.ri0.a
            if (r6 == 0) goto L7
            r2 = r0
        L7:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            r3 = 0
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L11
            r4 = r0
        L11:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.GetPasswordOption.<init>(java.util.Set, boolean, java.util.Set, int, sb0):void");
    }

    private GetPasswordOption(Set<String> set, boolean z, Set<ComponentName> set2, Bundle bundle, Bundle bundle2, int i) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, bundle, bundle2, false, z, set2, i);
        this.allowedUserIds = set;
    }

    public /* synthetic */ GetPasswordOption(Set set, boolean z, Set set2, Bundle bundle, Bundle bundle2, int i, int i2, sb0 sb0Var) {
        this(set, z, set2, bundle, bundle2, (i2 & 32) != 0 ? 1000 : i);
    }

    public /* synthetic */ GetPasswordOption(Set set, boolean z, Set set2, Bundle bundle, Bundle bundle2, int i, sb0 sb0Var) {
        this(set, z, set2, bundle, bundle2, i);
    }

    public final Set<String> getAllowedUserIds() {
        return this.allowedUserIds;
    }
}
