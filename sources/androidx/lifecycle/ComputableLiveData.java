package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.ComputableLiveData;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class ComputableLiveData<T> {
    private final LiveData<T> _liveData;
    private final AtomicBoolean computing;
    private final Executor executor;
    private final AtomicBoolean invalid;
    public final Runnable invalidationRunnable;
    private final LiveData<T> liveData;
    public final Runnable refreshRunnable;

    /* JADX WARN: Multi-variable type inference failed */
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ComputableLiveData(Executor executor) {
        executor.getClass();
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                this.this$0.getExecutor$lifecycle_livedata().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        final int i = 1;
        this.invalid = new AtomicBoolean(true);
        final int i2 = 0;
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable(this) { // from class: oz
            public final /* synthetic */ ComputableLiveData b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ComputableLiveData computableLiveData = this.b;
                switch (i3) {
                    case 0:
                        ComputableLiveData.refreshRunnable$lambda$0(computableLiveData);
                        return;
                    default:
                        ComputableLiveData.invalidationRunnable$lambda$0(computableLiveData);
                        return;
                }
            }
        };
        this.invalidationRunnable = new Runnable(this) { // from class: oz
            public final /* synthetic */ ComputableLiveData b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                ComputableLiveData computableLiveData = this.b;
                switch (i3) {
                    case 0:
                        ComputableLiveData.refreshRunnable$lambda$0(computableLiveData);
                        return;
                    default:
                        ComputableLiveData.invalidationRunnable$lambda$0(computableLiveData);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, defpackage.sb0 r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Lb
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            r1.getClass()
        Lb:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.<init>(java.util.concurrent.Executor, int, sb0):void");
    }

    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata$annotations() {
    }

    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$0(ComputableLiveData computableLiveData) {
        boolean hasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && hasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData computableLiveData) {
        do {
            boolean z = false;
            if (computableLiveData.computing.compareAndSet(false, true)) {
                Object obj = null;
                boolean z2 = false;
                while (computableLiveData.invalid.compareAndSet(true, false)) {
                    try {
                        obj = computableLiveData.compute();
                        z2 = true;
                    } catch (Throwable th) {
                        computableLiveData.computing.set(false);
                        throw th;
                    }
                }
                if (z2) {
                    computableLiveData.getLiveData().postValue(obj);
                }
                computableLiveData.computing.set(false);
                z = z2;
            }
            if (!z) {
                return;
            }
        } while (computableLiveData.invalid.get());
    }

    public abstract T compute();

    public final AtomicBoolean getComputing$lifecycle_livedata() {
        return this.computing;
    }

    public final Executor getExecutor$lifecycle_livedata() {
        return this.executor;
    }

    public final AtomicBoolean getInvalid$lifecycle_livedata() {
        return this.invalid;
    }

    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }
}
