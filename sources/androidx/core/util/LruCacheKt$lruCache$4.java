package androidx.core.util;

import android.util.LruCache;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.vs0;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ ps0 $create;
    final /* synthetic */ vs0 $onEntryRemoved;
    final /* synthetic */ ts0 $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(int i, ts0 ts0Var, ps0 ps0Var, vs0 vs0Var) {
        super(i);
        this.$sizeOf = ts0Var;
        this.$create = ps0Var;
        this.$onEntryRemoved = vs0Var;
    }

    @Override // android.util.LruCache
    public V create(K k) {
        return (V) this.$create.invoke(k);
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z, K k, V v, V v2) {
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }

    @Override // android.util.LruCache
    public int sizeOf(K k, V v) {
        return ((Number) this.$sizeOf.invoke(k, v)).intValue();
    }
}
