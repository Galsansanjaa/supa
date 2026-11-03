package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public abstract class f5 implements j5 {
    public final m5 a;

    public f5(m5 m5Var) {
        this.a = (m5) Objects.requireNonNull(m5Var);
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.m5
    public void c(long j) {
        this.a.c(j);
    }

    @Override // j$.util.stream.m5
    public boolean e() {
        return this.a.e();
    }

    @Override // j$.util.stream.m5
    public void end() {
        this.a.end();
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void n(Double d) {
        w3.d(this, d);
    }
}
