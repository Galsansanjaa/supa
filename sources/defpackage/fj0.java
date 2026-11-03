package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fj0 extends r0 implements ej0, Serializable {
    public final Enum[] a;

    public fj0(Enum[] enumArr) {
        enumArr.getClass();
        this.a = enumArr;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) wd.E0(r3.ordinal(), this.a)) == r3;
    }

    @Override // defpackage.r0, java.util.List
    public final Object get(int i) {
        n0 n0Var = r0.Companion;
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        n0Var.getClass();
        n0.b(i, length);
        return enumArr[i];
    }

    @Override // defpackage.r0, defpackage.o
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.r0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) wd.E0(ordinal, this.a)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.r0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) wd.E0(ordinal, this.a)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
