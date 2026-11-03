package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import defpackage.ps0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.m = obj2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.m;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return PagerCacheWindowScope.a((ts0) obj3, (PagerCacheWindowScope) obj2, (LazyLayoutPrefetchState.PrefetchResultScope) obj);
            default:
                return PagerWrapperFlingBehavior.a((PagerWrapperFlingBehavior) obj3, (ScrollScope) obj2, ((Float) obj).floatValue());
        }
    }
}
