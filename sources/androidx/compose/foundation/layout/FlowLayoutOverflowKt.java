package androidx.compose.foundation.layout;

import defpackage.nb1;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlowLayoutOverflowKt {
    public static final nb1 lazyInt(String str, os0 os0Var) {
        return new LazyImpl(os0Var, str);
    }

    public static /* synthetic */ nb1 lazyInt$default(String str, os0 os0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return lazyInt(str, os0Var);
    }
}
