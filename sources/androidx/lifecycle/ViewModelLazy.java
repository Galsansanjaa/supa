package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import defpackage.ca1;
import defpackage.m73;
import defpackage.nb1;
import defpackage.os0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ViewModelLazy<VM extends ViewModel> implements nb1 {
    private VM cached;
    private final os0 extrasProducer;
    private final os0 factoryProducer;
    private final os0 storeProducer;
    private final ca1 viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(ca1 ca1Var, os0 os0Var, os0 os0Var2) {
        this(ca1Var, os0Var, os0Var2, null, 8, null);
        ca1Var.getClass();
        os0Var.getClass();
        os0Var2.getClass();
    }

    public ViewModelLazy(ca1 ca1Var, os0 os0Var, os0 os0Var2, os0 os0Var3) {
        ca1Var.getClass();
        os0Var.getClass();
        os0Var2.getClass();
        os0Var3.getClass();
        this.viewModelClass = ca1Var;
        this.storeProducer = os0Var;
        this.factoryProducer = os0Var2;
        this.extrasProducer = os0Var3;
    }

    public /* synthetic */ ViewModelLazy(ca1 ca1Var, os0 os0Var, os0 os0Var2, os0 os0Var3, int i, sb0 sb0Var) {
        this(ca1Var, os0Var, os0Var2, (i & 8) != 0 ? new m73(0) : os0Var3);
    }

    @Override // defpackage.nb1
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) ViewModelProvider.Companion.create((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    @Override // defpackage.nb1
    public boolean isInitialized() {
        return this.cached != null;
    }
}
