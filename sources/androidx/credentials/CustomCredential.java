package androidx.credentials;

import android.os.Bundle;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class CustomCredential extends Credential {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCredential(String str, Bundle bundle) {
        super(str, bundle);
        str.getClass();
        bundle.getClass();
        if (str.length() > 0) {
            return;
        }
        v5.m("type should not be empty");
        throw null;
    }
}
