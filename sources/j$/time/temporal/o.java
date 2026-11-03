package j$.time.temporal;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements n {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.n
    public final m j(m mVar) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                int e = mVar.e(a.DAY_OF_WEEK);
                if (e == i2) {
                    return mVar;
                }
                return mVar.b(e - i2 >= 0 ? 7 - r0 : -r0, b.DAYS);
            default:
                int e2 = mVar.e(a.DAY_OF_WEEK);
                if (e2 == i2) {
                    return mVar;
                }
                return mVar.t(i2 - e2 >= 0 ? 7 - r2 : -r2, b.DAYS);
        }
    }
}
