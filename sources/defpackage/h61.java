package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class h61 extends e61 {
    public final int a;
    public final int b;
    public boolean m;
    public int n;

    public h61(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.m = z;
        this.n = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m;
    }

    @Override // defpackage.e61
    public final int nextInt() {
        int i = this.n;
        if (i != this.b) {
            this.n = this.a + i;
            return i;
        }
        if (this.m) {
            this.m = false;
            return i;
        }
        f31.b();
        return 0;
    }
}
