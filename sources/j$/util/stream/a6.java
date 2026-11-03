package j$.util.stream;

import java.util.Comparator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public abstract class a6 extends i5 {
    public final Comparator b;
    public boolean c;

    public a6(m5 m5Var, Comparator comparator) {
        super(m5Var);
        this.b = comparator;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final boolean e() {
        this.c = true;
        return false;
    }
}
