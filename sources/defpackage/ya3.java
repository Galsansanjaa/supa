package defpackage;

import com.inmobi.cmp.core.model.Vector;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ya3 extends bb1 implements ts0 {
    public final /* synthetic */ Vector a;
    public final /* synthetic */ Vector b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya3(Vector vector, Vector vector2) {
        super(2);
        this.a = vector;
        this.b = vector2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        ((Boolean) obj2).getClass();
        Vector vector = this.a;
        if (vector != null && !vector.contains(intValue)) {
            this.b.unset(intValue);
        }
        return vy2.a;
    }
}
