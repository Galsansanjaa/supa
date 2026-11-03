package androidx.activity.compose;

import defpackage.bb1;
import defpackage.os0;
import defpackage.v42;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ReportDrawnComposition$observeReporter$1 extends bb1 implements os0 {
    final /* synthetic */ os0 $predicate;
    final /* synthetic */ v42 $reporterPassed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnComposition$observeReporter$1(v42 v42Var, os0 os0Var) {
        super(0);
        this.$reporterPassed = v42Var;
        this.$predicate = os0Var;
    }

    @Override // defpackage.os0
    public /* bridge */ /* synthetic */ Object invoke() {
        m10invoke();
        return vy2.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m10invoke() {
        this.$reporterPassed.a = ((Boolean) this.$predicate.invoke()).booleanValue();
    }
}
