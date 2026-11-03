package j$.util.stream;

import java.util.function.Supplier;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o1 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ o1(u1 u1Var, int i) {
        this.a = i;
        this.b = u1Var;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new t1(this.b);
            case 1:
                return new t1(this.b);
            default:
                return new t1(this.b);
        }
    }
}
