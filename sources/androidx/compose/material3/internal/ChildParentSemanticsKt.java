package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.cq;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ChildParentSemanticsKt {
    public static /* synthetic */ vy2 a(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return childSemantics$lambda$0(semanticsPropertyReceiver);
    }

    public static final Modifier childSemantics(Modifier modifier, ps0 ps0Var) {
        return modifier.then(new ChildSemanticsNodeElement(ps0Var));
    }

    public static /* synthetic */ Modifier childSemantics$default(Modifier modifier, ps0 ps0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ps0Var = new cq(11);
        }
        return childSemantics(modifier, ps0Var);
    }

    public static final vy2 childSemantics$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return vy2.a;
    }

    public static final Modifier parentSemantics(Modifier modifier, ps0 ps0Var) {
        return modifier.then(new ParentSemanticsNodeElement(ps0Var));
    }
}
