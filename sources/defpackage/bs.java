package defpackage;

import androidx.compose.foundation.lazy.layout.CacheWindowLogic;
import androidx.compose.foundation.lazy.layout.CacheWindowScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class bs implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CacheWindowLogic b;
    public final /* synthetic */ CacheWindowScope m;

    public /* synthetic */ bs(CacheWindowLogic cacheWindowLogic, CacheWindowScope cacheWindowScope, int i) {
        this.a = i;
        this.b = cacheWindowLogic;
        this.m = cacheWindowScope;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        CacheWindowScope cacheWindowScope = this.m;
        CacheWindowLogic cacheWindowLogic = this.b;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return CacheWindowLogic.b(cacheWindowLogic, cacheWindowScope, intValue, intValue2);
            default:
                return CacheWindowLogic.a(cacheWindowLogic, cacheWindowScope, intValue, intValue2);
        }
    }
}
