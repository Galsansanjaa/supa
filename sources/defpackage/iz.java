package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class iz extends gz {
    public final boolean m;

    public iz(zo zoVar, boolean z) {
        super(zoVar);
        this.m = z;
    }

    @Override // defpackage.gz
    public final void c(byte b) {
        if (this.m) {
            h(String.valueOf(b & 255));
            return;
        }
        String valueOf = String.valueOf(b & 255);
        valueOf.getClass();
        ((zo) this.b).i(valueOf);
    }

    @Override // defpackage.gz
    public final void e(int i) {
        if (this.m) {
            h(Long.toString(4294967295L & i, 10));
            return;
        }
        String l = Long.toString(4294967295L & i, 10);
        l.getClass();
        ((zo) this.b).i(l);
    }

    @Override // defpackage.gz
    public final void f(long j) {
        int i = 63;
        String str = "0";
        if (this.m) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            h(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((zo) this.b).i(str);
    }

    @Override // defpackage.gz
    public final void g(short s) {
        if (this.m) {
            h(String.valueOf(s & 65535));
            return;
        }
        String valueOf = String.valueOf(s & 65535);
        valueOf.getClass();
        ((zo) this.b).i(valueOf);
    }
}
