package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uh extends f70 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final n60 g;
    public final e70 h;
    public final d70 i;
    public final o60 j;
    public final List k;
    public final int l;

    public uh(String str, String str2, String str3, long j, Long l, boolean z, n60 n60Var, e70 e70Var, d70 d70Var, o60 o60Var, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = n60Var;
        this.h = e70Var;
        this.i = d70Var;
        this.j = o60Var;
        this.k = list;
        this.l = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th, java.lang.Object] */
    @Override // defpackage.f70
    public final th a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.m = (byte) 7;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f70) {
            uh uhVar = (uh) ((f70) obj);
            if (this.a.equals(uhVar.a) && this.b.equals(uhVar.b)) {
                String str = uhVar.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == uhVar.d) {
                        Long l = uhVar.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == uhVar.f && this.g.equals(uhVar.g)) {
                                e70 e70Var = uhVar.h;
                                e70 e70Var2 = this.h;
                                if (e70Var2 != null ? e70Var2.equals(e70Var) : e70Var == null) {
                                    d70 d70Var = uhVar.i;
                                    d70 d70Var2 = this.i;
                                    if (d70Var2 != null ? d70Var2.equals(d70Var) : d70Var == null) {
                                        o60 o60Var = uhVar.j;
                                        o60 o60Var2 = this.j;
                                        if (o60Var2 != null ? o60Var2.equals(o60Var) : o60Var == null) {
                                            List list = uhVar.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == uhVar.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        e70 e70Var = this.h;
        int hashCode4 = (hashCode3 ^ (e70Var == null ? 0 : e70Var.hashCode())) * 1000003;
        d70 d70Var = this.i;
        int hashCode5 = (hashCode4 ^ (d70Var == null ? 0 : d70Var.hashCode())) * 1000003;
        o60 o60Var = this.j;
        int hashCode6 = (hashCode5 ^ (o60Var == null ? 0 : o60Var.hashCode())) * 1000003;
        List list = this.k;
        return this.l ^ ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return lt.A(sb, "}", this.l);
    }
}
