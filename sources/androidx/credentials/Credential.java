package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class Credential {
    public static final Companion Companion = new Companion(null);
    private final Bundle data;
    private final String type;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Credential createFrom(android.credentials.Credential credential) {
            credential.getClass();
            String type = credential.getType();
            type.getClass();
            Bundle data = credential.getData();
            data.getClass();
            return createFrom(type, data);
        }

        public final Credential createFrom(String str, Bundle bundle) {
            str.getClass();
            bundle.getClass();
            try {
                switch (str.hashCode()) {
                    case -1678407252:
                        if (str.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                            return DigitalCredential.Companion.createFrom$credentials(bundle);
                        }
                        break;
                    case -1072734346:
                        if (str.equals(RestoreCredential.TYPE_RESTORE_CREDENTIAL)) {
                            return RestoreCredential.Companion.createFrom$credentials(bundle);
                        }
                        break;
                    case -543568185:
                        if (str.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                            return PasswordCredential.Companion.createFrom$credentials(bundle);
                        }
                        break;
                    case -95037569:
                        if (str.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            return PublicKeyCredential.Companion.createFrom$credentials(bundle);
                        }
                        break;
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CustomCredential(str, bundle);
            }
        }
    }

    public Credential(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.type = str;
        this.data = bundle;
    }

    public static final Credential createFrom(android.credentials.Credential credential) {
        return Companion.createFrom(credential);
    }

    public static final Credential createFrom(String str, Bundle bundle) {
        return Companion.createFrom(str, bundle);
    }

    public final Bundle getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }
}
