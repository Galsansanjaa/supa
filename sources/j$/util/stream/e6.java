package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class e6 extends z implements o8 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(a aVar, int i, int i2) {
        super(aVar, i);
        this.l = i2;
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.l) {
            case 0:
                if (z6.SORTED.j(aVar.f)) {
                    return aVar.B(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((b2) aVar.B(spliterator, true, intFunction)).b();
                Arrays.sort(dArr);
                return new t2(dArr);
            case 1:
                return (h2) new r8(this, aVar, spliterator, intFunction).invoke();
            default:
                return (h2) new q8(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public Spliterator K(a aVar, Spliterator spliterator) {
        final int i = 0;
        final int i2 = 1;
        switch (this.l) {
            case 1:
                return z6.ORDERED.j(aVar.f) ? J(aVar, spliterator, new IntFunction() { // from class: j$.util.stream.m8
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i3) {
                        switch (i) {
                            case 0:
                                return new Double[i3];
                            default:
                                return new Double[i3];
                        }
                    }
                }).spliterator() : new s8((j$.util.u0) aVar.S(spliterator), i2);
            case 2:
                return z6.ORDERED.j(aVar.f) ? J(aVar, spliterator, new IntFunction() { // from class: j$.util.stream.m8
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i3) {
                        switch (i2) {
                            case 0:
                                return new Double[i3];
                            default:
                                return new Double[i3];
                        }
                    }
                }).spliterator() : new s8((j$.util.u0) aVar.S(spliterator), i);
            default:
                return super.K(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final m5 M(int i, m5 m5Var) {
        switch (this.l) {
            case 0:
                Objects.requireNonNull(m5Var);
                if (z6.SORTED.j(i)) {
                    return m5Var;
                }
                return z6.SIZED.j(i) ? new f5(m5Var) : new f5(m5Var);
            case 1:
                return new t(this, m5Var, 3);
            default:
                return new n8(this, m5Var, false);
        }
    }

    @Override // j$.util.stream.o8
    public p8 g(z1 z1Var, boolean z) {
        return new n8(this, z1Var, z);
    }
}
