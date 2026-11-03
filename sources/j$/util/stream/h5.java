package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public abstract class h5 implements l5 {
    public final m5 a;

    public h5(m5 m5Var) {
        this.a = (m5) Objects.requireNonNull(m5Var);
    }

    @Override // j$.util.stream.m5, j$.util.stream.j5, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    @Override // j$.util.stream.m5
    public final /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.e(this, longConsumer);
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

    @Override // j$.util.stream.l5
    public final /* synthetic */ void l(Long l) {
        w3.i(this, l);
    }
}
