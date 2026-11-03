package androidx.credentials;

import androidx.credentials.PrepareGetCredentialResponse;
import defpackage.et0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class PrepareGetCredentialResponse$Builder$setFrameworkResponse$1 extends et0 implements ps0 {
    public PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(Object obj) {
        super(1, obj, PrepareGetCredentialResponse.Builder.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
    }

    @Override // defpackage.ps0
    public final Boolean invoke(String str) {
        boolean hasCredentialType;
        str.getClass();
        hasCredentialType = ((PrepareGetCredentialResponse.Builder) this.receiver).hasCredentialType(str);
        return Boolean.valueOf(hasCredentialType);
    }
}
