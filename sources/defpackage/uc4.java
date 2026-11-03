package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uc4 {
    public final s52 a;
    public final s52 b;
    public final UUID c;

    public uc4(s52 s52Var, s52 s52Var2, UUID uuid) {
        this.a = s52Var;
        this.b = s52Var2;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uc4)) {
            return false;
        }
        uc4 uc4Var = (uc4) obj;
        return this.a.equals(uc4Var.a) && this.b.equals(uc4Var.b) && this.c.equals(uc4Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }
}
