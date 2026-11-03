package j$.util.stream;

import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class w0 extends g5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(int i, m5 m5Var) {
        super(m5Var);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.b = i;
    }

    @Override // j$.util.stream.k5, j$.util.stream.m5
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                return;
            case 1:
                this.a.accept(i);
                return;
            case 2:
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            case 5:
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
            default:
                IntPredicate intPredicate2 = null;
                intPredicate2.test(i);
                throw null;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public void c(long j) {
        switch (this.b) {
            case 5:
                this.a.c(-1L);
                return;
            case 6:
                this.a.c(-1L);
                return;
            default:
                super.c(j);
                return;
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public boolean e() {
        switch (this.b) {
            case 6:
                return this.a.e();
            default:
                return super.e();
        }
    }
}
