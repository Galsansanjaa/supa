package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ck0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public ck0(AtomicLong atomicLong) {
        this.a = 0;
        this.b = atomicLong;
    }

    public ck0(ty3 ty3Var) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new bk0(runnable, 0));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = ((ThreadFactory) obj).newThread(runnable);
                newThread2.setName("ScionFrontendApi");
                return newThread2;
        }
    }
}
