package defpackage;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy1 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fy1(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    public /* synthetic */ fy1(Class cls, Predicate predicate) {
        this.a = 2;
        this.c = cls;
        this.b = predicate;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.a;
        return vg1.b(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final Predicate negate() {
        switch (this.a) {
            case 0:
                return new k00(this, 2);
            case 1:
                return new k00(this, 2);
            default:
                return new k00(this, 2);
        }
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.a;
        return vg1.o(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        boolean lambda$allowExtra$13;
        switch (this.a) {
            case 0:
                return this.b.test(obj) || ((Predicate) this.c).test(obj);
            case 1:
                return this.b.test(obj) && ((Predicate) this.c).test(obj);
            default:
                lambda$allowExtra$13 = IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.c, this.b, obj);
                return lambda$allowExtra$13;
        }
    }
}
