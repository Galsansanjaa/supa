package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public abstract class r0 implements f8, g8 {
    public final boolean a;

    public r0(boolean z) {
        this.a = z;
    }

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
    }

    @Override // j$.util.stream.m5
    public final boolean e() {
        return false;
    }

    @Override // j$.util.stream.m5
    public final void end() {
    }

    @Override // j$.util.stream.f8
    public final int f() {
        if (this.a) {
            return 0;
        }
        return z6.r;
    }

    public final void g(a aVar, Spliterator spliterator) {
        if (this.a) {
            new s0(aVar, spliterator, this).invoke();
        } else {
            new t0(aVar, spliterator, aVar.R(this)).invoke();
        }
    }
}
