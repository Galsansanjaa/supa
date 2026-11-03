package androidx.collection;

import defpackage.ps0;
import defpackage.ts0;
import defpackage.vs0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LruCacheKt {
    private static final long MAX_SIZE = 2147483647L;

    public static final <K, V> LruCache<K, V> lruCache(int i, ts0 ts0Var, ps0 ps0Var, vs0 vs0Var) {
        ts0Var.getClass();
        ps0Var.getClass();
        vs0Var.getClass();
        return new LruCacheKt$lruCache$4(i, ts0Var, ps0Var, vs0Var);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, ts0 ts0Var, ps0 ps0Var, vs0 vs0Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ts0Var = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            ps0Var = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            vs0Var = LruCacheKt$lruCache$3.INSTANCE;
        }
        ts0Var.getClass();
        ps0Var.getClass();
        vs0Var.getClass();
        return new LruCacheKt$lruCache$4(i, ts0Var, ps0Var, vs0Var);
    }
}
