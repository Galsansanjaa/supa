package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class a84 {
    public final String a;
    public final boolean b;

    public a84(String str, boolean z) {
        dn3.l(str);
        this.a = str;
        dn3.l("com.google.android.gms");
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a84)) {
            return false;
        }
        a84 a84Var = (a84) obj;
        return od4.k(this.a, a84Var.a) && od4.k("com.google.android.gms", "com.google.android.gms") && od4.k(null, null) && this.b == a84Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, "com.google.android.gms", null, 4225, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        dn3.o(null);
        throw null;
    }
}
