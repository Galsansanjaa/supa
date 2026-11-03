package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class o extends f5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.j5, java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.b;
        m5 m5Var = this.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                m5Var.accept((m5) ((DoubleFunction) ((r) aVar).m).apply(d));
                return;
            case 1:
                m5Var.accept(((DoubleUnaryOperator) ((s) aVar).m).applyAsDouble(d));
                return;
            default:
                ((DoubleConsumer) ((s) aVar).m).accept(d);
                m5Var.accept(d);
                return;
        }
    }
}
