package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyLayoutCacheWindowKt {
    public static final LazyLayoutCacheWindow LazyLayoutCacheWindow(float f, float f2) {
        return new FractionLazyLayoutCacheWindow(f, f2);
    }

    public static /* synthetic */ LazyLayoutCacheWindow LazyLayoutCacheWindow$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return LazyLayoutCacheWindow(f, f2);
    }

    /* renamed from: LazyLayoutCacheWindow-YgX7TsA, reason: not valid java name */
    public static final LazyLayoutCacheWindow m1222LazyLayoutCacheWindowYgX7TsA(float f, float f2) {
        return new DpLazyLayoutCacheWindow(f, f2, null);
    }

    /* renamed from: LazyLayoutCacheWindow-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ LazyLayoutCacheWindow m1223LazyLayoutCacheWindowYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m8049constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m8049constructorimpl(0.0f);
        }
        return m1222LazyLayoutCacheWindowYgX7TsA(f, f2);
    }
}
