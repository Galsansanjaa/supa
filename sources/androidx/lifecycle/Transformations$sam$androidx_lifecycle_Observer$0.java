package androidx.lifecycle;

import defpackage.bt0;
import defpackage.jh2;
import defpackage.ps0;
import defpackage.rs0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, bt0 {
    private final /* synthetic */ ps0 function;

    public Transformations$sam$androidx_lifecycle_Observer$0(ps0 ps0Var) {
        ps0Var.getClass();
        this.function = ps0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof bt0)) {
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

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
