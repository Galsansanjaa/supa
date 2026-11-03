package j$.util.stream;

import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class t extends f5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.b = i;
    }

    @Override // j$.util.stream.j5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 1:
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 2:
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
            default:
                DoublePredicate doublePredicate2 = null;
                doublePredicate2.test(d);
                throw null;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public void c(long j) {
        switch (this.b) {
            case 2:
                this.a.c(-1L);
                return;
            case 3:
                this.a.c(-1L);
                return;
            default:
                super.c(j);
                return;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.m5
    public boolean e() {
        switch (this.b) {
            case 3:
                return this.a.e();
            default:
                return super.e();
        }
    }
}
