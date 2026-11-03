package androidx.compose.foundation.layout;

import defpackage.bt0;
import defpackage.jh2;
import defpackage.lt;
import defpackage.ps0;
import defpackage.rs0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlexBoxKt$sam$androidx_compose_foundation_layout_FlexConfig$0 implements FlexConfig, bt0 {
    private final /* synthetic */ ps0 function;

    public FlexBoxKt$sam$androidx_compose_foundation_layout_FlexConfig$0(ps0 ps0Var) {
        this.function = ps0Var;
    }

    @Override // androidx.compose.foundation.layout.FlexConfig
    public final /* synthetic */ void configure(FlexConfigScope flexConfigScope) {
        this.function.invoke(flexConfigScope);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FlexConfig) && (obj instanceof bt0)) {
            return jh2.k(getFunctionDelegate(), ((bt0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.bt0
    public final rs0 getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.layout.FlexConfig
    public final /* synthetic */ FlexConfig then(FlexConfig flexConfig) {
        return lt.c(this, flexConfig);
    }
}
