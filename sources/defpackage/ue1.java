package defpackage;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkerKt;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ue1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ CallbackToFutureAdapter.Completer m;
    public final /* synthetic */ os0 n;

    public /* synthetic */ ue1(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, os0 os0Var, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.m = completer;
        this.n = os0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        os0 os0Var = this.n;
        CallbackToFutureAdapter.Completer completer = this.m;
        AtomicBoolean atomicBoolean = this.b;
        switch (i) {
            case 0:
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(atomicBoolean, completer, os0Var);
                return;
            default:
                WorkerKt.future$lambda$2$lambda$1(atomicBoolean, completer, os0Var);
                return;
        }
    }
}
