package androidx.credentials.exceptions;

import defpackage.sb0;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class GetCredentialCustomException extends GetCredentialException {
    private final String type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialCustomException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialCustomException(String str, CharSequence charSequence) {
        super(str, charSequence);
        str.getClass();
        this.type = str;
        if (getType().length() > 0) {
            return;
        }
        v5.m("type must not be empty");
        throw null;
    }

    public /* synthetic */ GetCredentialCustomException(String str, CharSequence charSequence, int i, sb0 sb0Var) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    public String getType() {
        return this.type;
    }
}
