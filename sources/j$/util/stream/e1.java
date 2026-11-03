package j$.util.stream;

import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class e1 extends h5 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(m5 m5Var) {
        super(m5Var);
        this.b = 0;
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(j);
                return;
            case 1:
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                LongPredicate longPredicate2 = null;
                longPredicate2.test(j);
                throw null;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public void c(long j) {
        switch (this.b) {
            case 4:
                this.a.c(-1L);
                return;
            case 5:
                this.a.c(-1L);
                return;
            default:
                super.c(j);
                return;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.m5
    public boolean e() {
        switch (this.b) {
            case 5:
                return this.a.e();
            default:
                return super.e();
        }
    }
}
