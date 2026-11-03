package defpackage;

import androidx.work.impl.WorkerWrapper;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m93 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorkerWrapper b;

    public /* synthetic */ m93(WorkerWrapper workerWrapper, int i) {
        this.a = i;
        this.b = workerWrapper;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        WorkerWrapper workerWrapper = this.b;
        switch (i) {
            case 0:
                return WorkerWrapper.c(workerWrapper);
            default:
                return WorkerWrapper.b(workerWrapper);
        }
    }
}
