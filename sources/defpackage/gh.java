package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gh extends zv {
    public final dh a;

    public gh(dh dhVar) {
        this.a = dhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zv)) {
            return false;
        }
        zv zvVar = (zv) obj;
        Object obj2 = yv.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((gh) zvVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((yv.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + yv.a + ", androidClientInfo=" + this.a + "}";
    }
}
