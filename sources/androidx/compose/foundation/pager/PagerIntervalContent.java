package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import defpackage.ps0;
import defpackage.vs0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PagerIntervalContent implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final vs0 item;
    private final ps0 key;

    public PagerIntervalContent(ps0 ps0Var, vs0 vs0Var) {
        this.key = ps0Var;
        this.item = vs0Var;
    }

    public final vs0 getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public ps0 getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final /* synthetic */ ps0 getType() {
        return androidx.compose.foundation.lazy.layout.a.a();
    }
}
