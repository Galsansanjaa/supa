package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import defpackage.a52;
import defpackage.ca1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final ca1 clazz;
    private final ps0 initializer;

    public ViewModelInitializer(ca1 ca1Var, ps0 ps0Var) {
        ca1Var.getClass();
        ps0Var.getClass();
        this.clazz = ca1Var;
        this.initializer = ps0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> cls, ps0 ps0Var) {
        this(a52.a(cls), ps0Var);
        cls.getClass();
        ps0Var.getClass();
    }

    public final ca1 getClazz$lifecycle_viewmodel() {
        return this.clazz;
    }

    public final ps0 getInitializer$lifecycle_viewmodel() {
        return this.initializer;
    }
}
