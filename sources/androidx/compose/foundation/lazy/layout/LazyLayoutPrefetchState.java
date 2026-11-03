package androidx.compose.foundation.lazy.layout;

import defpackage.hd0;
import defpackage.oi0;
import defpackage.ps0;
import defpackage.sb0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyLayoutPrefetchState {
    public static final int $stable = 0;
    private int idealNestedPrefetchCount;
    private int lastNumberOfNestedPrefetchItems;
    private ps0 onNestedPrefetch;
    private PrefetchHandleProvider prefetchHandleProvider;
    private final PrefetchMetrics prefetchMetrics;
    private PrefetchScheduler prefetchScheduler;
    private int realizedNestedPrefetchCount;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public final class NestedPrefetchScopeImpl implements NestedPrefetchScope {
        private final List<PrefetchRequest> _requests = new ArrayList();
        private final int nestedPrefetchItemCount;

        public NestedPrefetchScopeImpl(int i) {
            this.nestedPrefetchItemCount = i;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public int getNestedPrefetchItemCount() {
            return this.nestedPrefetchItemCount;
        }

        public final List<PrefetchRequest> getRequests() {
            return this._requests;
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public void schedulePrecomposition(int i) {
            PrefetchHandleProvider prefetchHandleProvider$foundation = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation();
            if (prefetchHandleProvider$foundation == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation.createNestedPrefetchRequest(i, LazyLayoutPrefetchState.this.prefetchMetrics));
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: schedulePrecompositionAndPremeasure-0kLqBqw */
        public void mo1249schedulePrecompositionAndPremeasure0kLqBqw(int i, long j) {
            PrefetchHandleProvider prefetchHandleProvider$foundation = LazyLayoutPrefetchState.this.getPrefetchHandleProvider$foundation();
            if (prefetchHandleProvider$foundation == null) {
                return;
            }
            this._requests.add(prefetchHandleProvider$foundation.m1262createNestedPrefetchRequestVKLhPVY(i, j, LazyLayoutPrefetchState.this.prefetchMetrics));
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        public final void schedulePrefetch(int i) {
            schedulePrecomposition(i);
        }

        @Override // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
        /* renamed from: schedulePrefetch-0kLqBqw */
        public final void mo1250schedulePrefetch0kLqBqw(int i, long j) {
            mo1249schedulePrecompositionAndPremeasure0kLqBqw(i, j);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public interface PrefetchResultScope {
        int getIndex();

        int getPlaceablesCount();

        /* renamed from: getSize-YEO4UFw */
        long mo1251getSizeYEO4UFw(int i);
    }

    public LazyLayoutPrefetchState() {
        this.prefetchMetrics = new PrefetchMetrics();
        this.realizedNestedPrefetchCount = -1;
        this.idealNestedPrefetchCount = -1;
    }

    @hd0
    public LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, ps0 ps0Var) {
        this();
        this.prefetchScheduler = prefetchScheduler;
        this.onNestedPrefetch = ps0Var;
    }

    public /* synthetic */ LazyLayoutPrefetchState(PrefetchScheduler prefetchScheduler, ps0 ps0Var, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : prefetchScheduler, (i & 2) != 0 ? null : ps0Var);
    }

    public LazyLayoutPrefetchState(ps0 ps0Var) {
        this();
        this.onNestedPrefetch = ps0Var;
    }

    public /* synthetic */ LazyLayoutPrefetchState(ps0 ps0Var, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : ps0Var);
    }

    private static /* synthetic */ void getOnNestedPrefetch$annotations() {
    }

    public static /* synthetic */ void getPrefetchHandleProvider$foundation$annotations() {
    }

    public static /* synthetic */ void getPrefetchScheduler$foundation$annotations() {
    }

    /* renamed from: schedulePrecompositionAndPremeasure-VKLhPVY$default */
    public static /* synthetic */ PrefetchHandle m1245schedulePrecompositionAndPremeasureVKLhPVY$default(LazyLayoutPrefetchState lazyLayoutPrefetchState, int i, long j, ps0 ps0Var, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            ps0Var = null;
        }
        return lazyLayoutPrefetchState.m1247schedulePrecompositionAndPremeasureVKLhPVY(i, j, ps0Var);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation$default */
    public static /* synthetic */ PrefetchHandle m1246schedulePrecompositionAndPremeasure_EkL_Y$foundation$default(LazyLayoutPrefetchState lazyLayoutPrefetchState, int i, long j, boolean z, ps0 ps0Var, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            ps0Var = null;
        }
        return lazyLayoutPrefetchState.m1248schedulePrecompositionAndPremeasure_EkL_Y$foundation(i, j, z, ps0Var);
    }

    public final List<PrefetchRequest> collectNestedPrefetchRequests$foundation() {
        ps0 ps0Var = this.onNestedPrefetch;
        if (ps0Var == null) {
            return oi0.a;
        }
        NestedPrefetchScopeImpl nestedPrefetchScopeImpl = new NestedPrefetchScopeImpl(this.realizedNestedPrefetchCount);
        ps0Var.invoke(nestedPrefetchScopeImpl);
        List<PrefetchRequest> requests = nestedPrefetchScopeImpl.getRequests();
        this.lastNumberOfNestedPrefetchItems = requests.size();
        return requests;
    }

    public final int getIdealNestedPrefetchCount$foundation() {
        return this.idealNestedPrefetchCount;
    }

    public final int getLastNumberOfNestedPrefetchItems$foundation() {
        return this.lastNumberOfNestedPrefetchItems;
    }

    public final PrefetchHandleProvider getPrefetchHandleProvider$foundation() {
        return this.prefetchHandleProvider;
    }

    public final PrefetchScheduler getPrefetchScheduler$foundation() {
        return this.prefetchScheduler;
    }

    public final int getRealizedNestedPrefetchCount$foundation() {
        return this.realizedNestedPrefetchCount;
    }

    public final PrefetchHandle schedulePrecomposition(int i) {
        return schedulePrecomposition$foundation(i, true);
    }

    public final PrefetchHandle schedulePrecomposition$foundation(int i, boolean z) {
        PrefetchHandle schedulePrecomposition;
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (schedulePrecomposition = prefetchHandleProvider.schedulePrecomposition(i, z, this.prefetchMetrics)) == null) ? DummyHandle.INSTANCE : schedulePrecomposition;
    }

    /* renamed from: schedulePrecompositionAndPremeasure-VKLhPVY */
    public final PrefetchHandle m1247schedulePrecompositionAndPremeasureVKLhPVY(int i, long j, ps0 ps0Var) {
        return m1248schedulePrecompositionAndPremeasure_EkL_Y$foundation(i, j, true, ps0Var);
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation */
    public final PrefetchHandle m1248schedulePrecompositionAndPremeasure_EkL_Y$foundation(int i, long j, boolean z, ps0 ps0Var) {
        PrefetchHandle m1263schedulePremeasurem8Kt_7k;
        PrefetchHandleProvider prefetchHandleProvider = this.prefetchHandleProvider;
        return (prefetchHandleProvider == null || (m1263schedulePremeasurem8Kt_7k = prefetchHandleProvider.m1263schedulePremeasurem8Kt_7k(i, j, this.prefetchMetrics, z, ps0Var)) == null) ? DummyHandle.INSTANCE : m1263schedulePremeasurem8Kt_7k;
    }

    public final void setIdealNestedPrefetchCount$foundation(int i) {
        this.idealNestedPrefetchCount = i;
    }

    public final void setLastNumberOfNestedPrefetchItems$foundation(int i) {
        this.lastNumberOfNestedPrefetchItems = i;
    }

    public final void setPrefetchHandleProvider$foundation(PrefetchHandleProvider prefetchHandleProvider) {
        this.prefetchHandleProvider = prefetchHandleProvider;
    }

    public final void setPrefetchScheduler$foundation(PrefetchScheduler prefetchScheduler) {
        this.prefetchScheduler = prefetchScheduler;
    }

    public final void setRealizedNestedPrefetchCount$foundation(int i) {
        this.realizedNestedPrefetchCount = i;
    }
}
