package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class i8 extends c5 implements o8 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8(e5 e5Var, int i, Predicate predicate, int i2) {
        super(e5Var, i);
        this.l = i2;
        this.m = predicate;
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                return (h2) new r8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (h2) new q8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        int i = 12;
        switch (this.l) {
            case 0:
                return z6.ORDERED.j(aVar.f) ? J(aVar, spliterator, new c1(i)).spliterator() : new v8(aVar.S(spliterator), this.m, 1);
            default:
                return z6.ORDERED.j(aVar.f) ? J(aVar, spliterator, new c1(i)).spliterator() : new v8(aVar.S(spliterator), this.m, 0);
        }
    }

    @Override // j$.util.stream.a
    public final m5 M(int i, m5 m5Var) {
        switch (this.l) {
            case 0:
                return new l(this, m5Var);
            default:
                return new j8(this, m5Var, false);
        }
    }

    @Override // j$.util.stream.o8
    public p8 g(z1 z1Var, boolean z) {
        return new j8(this, z1Var, z);
    }
}
