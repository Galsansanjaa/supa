package androidx.compose.foundation.lazy;

import defpackage.f31;
import defpackage.ps0;
import defpackage.vs0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ void a(LazyListScope lazyListScope, int i, ps0 ps0Var, ps0 ps0Var2, vs0 vs0Var, int i2, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: items");
            return;
        }
        if ((i2 & 2) != 0) {
            ps0Var = null;
        }
        if ((i2 & 4) != 0) {
            ps0Var2 = new ps0() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
                @Override // defpackage.ps0
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }

                public final Void invoke(int i3) {
                    return null;
                }
            };
        }
        lazyListScope.items(i, ps0Var, ps0Var2, vs0Var);
    }
}
