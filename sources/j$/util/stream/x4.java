package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public abstract class x4 extends s4 implements r4 {
    public long b;

    public /* synthetic */ void accept(double d) {
        w3.c();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.m5
    public final void c(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.m5
    public final boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final void end() {
    }
}
