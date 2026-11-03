package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import defpackage.ri0;
import defpackage.sb0;
import defpackage.v5;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class GetCustomCredentialOption extends CredentialOption {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(Bundle bundle, String str, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i) {
        super(str, bundle, bundle2, z, z2, set, i);
        bundle.getClass();
        str.getClass();
        bundle2.getClass();
        set.getClass();
        if (str.length() <= 0) {
            v5.m("type should not be empty");
            throw null;
        }
        if (i != 100) {
            return;
        }
        v5.m("Custom types should not have passkey level priority.");
        throw null;
    }

    public /* synthetic */ GetCustomCredentialOption(Bundle bundle, String str, Bundle bundle2, boolean z, boolean z2, Set set, int i, int i2, sb0 sb0Var) {
        this(bundle, str, bundle2, z, (i2 & 16) != 0 ? false : z2, (Set<ComponentName>) ((i2 & 32) != 0 ? ri0.a : set), (i2 & 64) != 0 ? 2000 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z) {
        this(str, bundle, bundle2, z, false, null, 48, null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2) {
        this(str, bundle, bundle2, z, z2, null, 32, null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set) {
        this(bundle, str, bundle2, z, z2, set, 0, 64, (sb0) null);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        set.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i) {
        this(bundle, str, bundle2, z, z2, set, i);
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        set.getClass();
    }

    public /* synthetic */ GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i, int i2, sb0 sb0Var) {
        this(str, bundle, bundle2, z, (i2 & 16) != 0 ? false : z2, (Set<ComponentName>) ((i2 & 32) != 0 ? ri0.a : set), (i2 & 64) != 0 ? 2000 : i);
    }

    public /* synthetic */ GetCustomCredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set set, int i, sb0 sb0Var) {
        this(str, bundle, bundle2, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? ri0.a : set);
    }
}
