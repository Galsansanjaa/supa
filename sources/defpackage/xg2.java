package defpackage;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xg2 {
    public final kr2 a;
    public final l63 b;

    public xg2(kr2 kr2Var, l63 l63Var) {
        kr2Var.getClass();
        l63Var.getClass();
        this.a = kr2Var;
        this.b = l63Var;
    }

    public final rg2 a(rg2 rg2Var) {
        String str;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        String lowerCase = bn2.g0(uuid, "-", "", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (rg2Var == null || (str = rg2Var.b) == null) ? lowerCase : str;
        int i = rg2Var != null ? rg2Var.c + 1 : 0;
        this.a.getClass();
        return new rg2(kr2.a().b, lowerCase, str2, i);
    }
}
