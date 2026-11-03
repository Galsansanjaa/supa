package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.vs0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final vs0 item;
    private final ps0 key;
    private final ts0 span;
    private final ps0 type;

    public LazyGridInterval(ps0 ps0Var, ts0 ts0Var, ps0 ps0Var2, vs0 vs0Var) {
        this.key = ps0Var;
        this.span = ts0Var;
        this.type = ps0Var2;
        this.item = vs0Var;
    }

    public final vs0 getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public ps0 getKey() {
        return this.key;
    }

    public final ts0 getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public ps0 getType() {
        return this.type;
    }
}
