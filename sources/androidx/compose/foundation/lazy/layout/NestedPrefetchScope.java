package androidx.compose.foundation.lazy.layout;

import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface NestedPrefetchScope {
    int getNestedPrefetchItemCount();

    void schedulePrecomposition(int i);

    /* renamed from: schedulePrecompositionAndPremeasure-0kLqBqw */
    void mo1249schedulePrecompositionAndPremeasure0kLqBqw(int i, long j);

    @hd0
    void schedulePrefetch(int i);

    @hd0
    /* renamed from: schedulePrefetch-0kLqBqw */
    void mo1250schedulePrefetch0kLqBqw(int i, long j);
}
