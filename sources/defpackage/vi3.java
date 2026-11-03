package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vi3 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final ArrayList j;

    public vi3(String str, ArrayList arrayList, String str2, String str3, String str4, int i) {
        str = (i & 4) != 0 ? "" : str;
        List list = (i & 8) != 0 ? oi0.a : arrayList;
        str2 = (i & 32) != 0 ? "" : str2;
        str3 = (i & 64) != 0 ? "" : str3;
        str4 = (i & 128) != 0 ? "" : str4;
        ArrayList arrayList2 = new ArrayList();
        this.a = "";
        this.b = "";
        this.c = str;
        this.d = list;
        this.e = "";
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = "";
        this.j = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi3)) {
            return false;
        }
        vi3 vi3Var = (vi3) obj;
        return this.a.equals(vi3Var.a) && this.b.equals(vi3Var.b) && this.c.equals(vi3Var.c) && this.d.equals(vi3Var.d) && this.e.equals(vi3Var.e) && this.f.equals(vi3Var.f) && this.g.equals(vi3Var.g) && this.h.equals(vi3Var.h) && this.i.equals(vi3Var.i) && this.j.equals(vi3Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + k93.j(k93.j(k93.j(k93.j(k93.j((this.d.hashCode() + k93.j(k93.j(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "PremiumUiLabels(linksTitle=" + this.a + ", nonIabVendorsLabel=" + this.b + ", uspDnsTitle=" + this.c + ", uspDnsText=" + this.d + ", uspDoNotSellToggleText=" + this.e + ", uspPrivacyPolicyLinkText=" + this.f + ", uspDeleteDataLinkText=" + this.g + ", uspAccessDataLinkText=" + this.h + ", uspAcceptButton=" + this.i + ", initScreenCustomLinks=" + this.j + ')';
    }
}
