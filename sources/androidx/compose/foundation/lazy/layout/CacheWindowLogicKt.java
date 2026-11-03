package androidx.compose.foundation.lazy.layout;

import defpackage.os0;
import defpackage.us0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CacheWindowLogicKt {
    private static final boolean DebugEnabled = false;
    public static final int InvalidIndex = -1;
    private static final int InvalidItemSize = -1;
    private static final int UnsetItemCount = -1;

    private static final void debugLog(os0 os0Var) {
    }

    public static final void forEachVisibleItem(CacheWindowScope cacheWindowScope, us0 us0Var) {
        int visibleLineCount = cacheWindowScope.getVisibleLineCount();
        for (int i = 0; i < visibleLineCount; i++) {
            us0Var.invoke(Integer.valueOf(cacheWindowScope.getVisibleItemLine(i)), cacheWindowScope.getVisibleLineKey(i), Integer.valueOf(cacheWindowScope.getVisibleItemSize(i)));
        }
    }
}
