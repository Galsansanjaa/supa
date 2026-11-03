package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qd extends qe1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd(tf2 tf2Var, int i) {
        super(tf2Var);
        this.b = i;
    }

    @Override // defpackage.tf2
    public final String h() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            default:
                return "kotlin.collections.ArrayList";
        }
    }
}
