package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wq2 {
    public static final vq2 Companion = new Object();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ wq2(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            nb0.P(uq2.a.getDescriptor(), i, 1);
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public wq2(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wq2) && this.a == ((wq2) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }
}
