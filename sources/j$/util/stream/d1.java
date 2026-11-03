package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class d1 extends h5 {
    public final /* synthetic */ int b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.b = i;
        this.c = aVar;
    }

    @Override // j$.util.stream.l5, j$.util.stream.m5
    public final void accept(long j) {
        int i = this.b;
        m5 m5Var = this.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                m5Var.accept((m5) ((LongFunction) ((r) aVar).m).apply(j));
                return;
            default:
                ((LongConsumer) ((g1) aVar).m).accept(j);
                m5Var.accept(j);
                return;
        }
    }
}
