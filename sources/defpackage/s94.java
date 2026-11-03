package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s94 {
    public final at0 a;
    public final boolean b;
    public final k21 c;
    public volatile String d = null;

    public s94(at0 at0Var, boolean z, k21 k21Var) {
        this.a = at0Var;
        this.b = z;
        this.c = k21Var;
    }

    public final String a(Context context) {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.a.apply(context);
        this.d = str2;
        return str2;
    }
}
