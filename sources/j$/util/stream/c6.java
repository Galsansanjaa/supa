package j$.util.stream;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class c6 extends y5 {
    public r6 c;

    @Override // j$.util.stream.k5, j$.util.stream.m5
    public final void accept(int i) {
        this.c.accept(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.r6] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void c(long j) {
        if (j < 2147483639) {
            this.c = j > 0 ? new v6((int) j) : new v6();
        } else {
            j$.time.f.c("Stream size exceeds max array size");
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.m5
    public final void end() {
        int[] iArr = (int[]) this.c.b();
        Arrays.sort(iArr);
        long length = iArr.length;
        m5 m5Var = this.a;
        m5Var.c(length);
        int i = 0;
        if (this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (m5Var.e()) {
                    break;
                }
                m5Var.accept(i2);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                m5Var.accept(iArr[i]);
                i++;
            }
        }
        m5Var.end();
    }
}
