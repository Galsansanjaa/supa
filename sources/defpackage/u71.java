package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u71 extends et0 implements ps0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u71(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((v71) this.receiver).l((Throwable) obj);
                return vy2.a;
            case 1:
                return Boolean.valueOf(((s03) this.receiver).c((String) obj));
            case 2:
                String str = (String) obj;
                str.getClass();
                ((e13) this.receiver).getClass();
                return Boolean.valueOf(e13.l(str));
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((e13) this.receiver).getClass();
                return Boolean.valueOf(e13.l(str2));
        }
    }
}
