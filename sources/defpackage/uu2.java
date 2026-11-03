package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uu2 extends tu2 {
    public final /* synthetic */ int n;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.n) {
            case 0:
                int i = this.m;
                this.m = i + 2;
                Object[] objArr = this.a;
                return new di1(objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.m;
                this.m = i2 + 2;
                return this.a[i2];
            default:
                int i3 = this.m;
                this.m = i3 + 2;
                return this.a[i3 + 1];
        }
    }
}
