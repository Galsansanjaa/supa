package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class h2 implements ct0, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel = false;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public h2(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.isTopLevel == h2Var.isTopLevel && this.arity == h2Var.arity && this.flags == h2Var.flags && jh2.k(this.receiver, h2Var.receiver) && jh2.k(this.owner, h2Var.owner) && this.name.equals(h2Var.name) && this.signature.equals(h2Var.signature);
    }

    @Override // defpackage.ct0
    public int getArity() {
        return this.arity;
    }

    public da1 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return a52.a(cls);
        }
        a52.a.getClass();
        return new su1(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((k93.j(k93.j((hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        a52.a.getClass();
        return b52.a(this);
    }
}
