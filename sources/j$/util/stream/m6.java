package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class m6 extends a6 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        if (j < 2147483639) {
            this.d = new Object[(int) j];
        } else {
            j$.time.f.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        m5 m5Var = this.a;
        m5Var.c(j);
        if (this.c) {
            while (i < this.e && !m5Var.e()) {
                m5Var.accept((m5) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                m5Var.accept((m5) this.d[i]);
                i++;
            }
        }
        m5Var.end();
        this.d = null;
    }
}
