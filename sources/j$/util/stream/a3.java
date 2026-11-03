package j$.util.stream;

import java.util.function.IntFunction;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public abstract class a3 implements h2 {
    @Override // j$.util.stream.h2
    public h2 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.h2
    public final long count() {
        return 0L;
    }

    public final void f(int i, Object obj) {
    }

    public final void g(Object obj) {
    }

    @Override // j$.util.stream.h2
    public /* synthetic */ h2 j(long j, long j2, IntFunction intFunction) {
        return w3.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.h2
    public final Object[] m(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.h2
    public final int o() {
        return 0;
    }
}
