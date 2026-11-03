package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class on2 implements mn2 {
    public volatile mn2 a;
    public volatile boolean b;
    public Object m;

    @Override // defpackage.mn2
    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        mn2 mn2Var = this.a;
                        Objects.requireNonNull(mn2Var);
                        Object obj = mn2Var.get();
                        this.m = obj;
                        this.b = true;
                        this.a = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.m;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.m);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
