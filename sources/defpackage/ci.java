package defpackage;

import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ci extends w60 {
    public final u60 a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final v60 e;
    public final List f;
    public final int g;

    public ci(u60 u60Var, List list, List list2, Boolean bool, v60 v60Var, List list3, int i) {
        this.a = u60Var;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = v60Var;
        this.f = list3;
        this.g = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bi, java.lang.Object] */
    @Override // defpackage.w60
    public final bi a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w60) {
            ci ciVar = (ci) ((w60) obj);
            if (this.a.equals(ciVar.a)) {
                List list = ciVar.b;
                List list2 = this.b;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = ciVar.c;
                    List list4 = this.c;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        Boolean bool = ciVar.d;
                        Boolean bool2 = this.d;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            v60 v60Var = ciVar.e;
                            v60 v60Var2 = this.e;
                            if (v60Var2 != null ? v60Var2.equals(v60Var) : v60Var == null) {
                                List list5 = ciVar.f;
                                List list6 = this.f;
                                if (list6 != null ? list6.equals(list5) : list5 == null) {
                                    if (this.g == ciVar.g) {
                                        return true;
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
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        v60 v60Var = this.e;
        int hashCode5 = (hashCode4 ^ (v60Var == null ? 0 : v60Var.hashCode())) * 1000003;
        List list3 = this.f;
        return this.g ^ ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return lt.A(sb, "}", this.g);
    }
}
