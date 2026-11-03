package androidx.work;

import androidx.lifecycle.LiveData;
import androidx.work.Operation;
import defpackage.se1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class OperationImpl implements Operation {
    private final se1 future;
    private final LiveData<Operation.State> state;

    public OperationImpl(LiveData<Operation.State> liveData, se1 se1Var) {
        liveData.getClass();
        se1Var.getClass();
        this.state = liveData;
        this.future = se1Var;
    }

    @Override // androidx.work.Operation
    public se1 getResult() {
        return this.future;
    }

    @Override // androidx.work.Operation
    public LiveData<Operation.State> getState() {
        return this.state;
    }
}
