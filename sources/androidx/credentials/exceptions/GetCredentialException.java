package androidx.credentials.exceptions;

import android.os.Bundle;
import androidx.credentials.internal.ConversionUtilsKt;
import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class GetCredentialException extends Exception {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE";
    private static final String EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE";
    private final CharSequence errorMessage;
    private final String type;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Bundle asBundle(GetCredentialException getCredentialException) {
            getCredentialException.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE, getCredentialException.getType());
            CharSequence errorMessage = getCredentialException.getErrorMessage();
            if (errorMessage != null) {
                bundle.putCharSequence(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE, errorMessage);
            }
            return bundle;
        }

        public final GetCredentialException fromBundle(Bundle bundle) {
            bundle.getClass();
            String string = bundle.getString(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE);
            if (string != null) {
                return ConversionUtilsKt.toJetpackGetException(string, bundle.getCharSequence(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE));
            }
            v5.m("Bundle was missing exception type.");
            return null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialException(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        str.getClass();
        this.type = str;
        this.errorMessage = charSequence;
    }

    public /* synthetic */ GetCredentialException(String str, CharSequence charSequence, int i, sb0 sb0Var) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public static final Bundle asBundle(GetCredentialException getCredentialException) {
        return Companion.asBundle(getCredentialException);
    }

    public static final GetCredentialException fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    public String getType() {
        return this.type;
    }
}
