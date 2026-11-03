package androidx.room;

import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import defpackage.a10;
import defpackage.j20;
import defpackage.mi0;
import defpackage.od4;
import defpackage.sb0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class RoomTrackingLiveData<T> extends LiveData<T> {
    private final AtomicBoolean computing;
    private final InvalidationLiveDataContainer container;
    private final RoomDatabase database;
    private final boolean inTransaction;
    private final AtomicBoolean invalid;
    private final j20 launchContext;
    private final InvalidationTracker.Observer observer;
    private final AtomicBoolean registeredObserver;

    private RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr) {
        this.database = roomDatabase;
        this.container = invalidationLiveDataContainer;
        this.inTransaction = z;
        this.observer = new RoomTrackingLiveData$observer$1(strArr, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.launchContext = roomDatabase.inCompatibilityMode$room_runtime_release() ? z ? roomDatabase.getTransactionContext$room_runtime_release() : roomDatabase.getQueryContext() : mi0.a;
    }

    public /* synthetic */ RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr, sb0 sb0Var) {
        this(roomDatabase, invalidationLiveDataContainer, z, strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidated() {
        boolean hasActiveObservers = hasActiveObservers();
        if (this.invalid.compareAndSet(false, true) && hasActiveObservers) {
            od4.s(this.database.getCoroutineScope(), this.launchContext, null, new RoomTrackingLiveData$invalidated$1(this, null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[Catch: all -> 0x002d, Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x0029, B:15:0x0060), top: B:10:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x0029, B:13:0x0058, B:15:0x0060, B:25:0x007b, B:38:0x0071, B:39:0x0078), top: B:10:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0056 -> B:12:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:24:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(defpackage.a10 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.room.RoomTrackingLiveData$refresh$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = (androidx.room.RoomTrackingLiveData$refresh$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomTrackingLiveData$refresh$1 r0 = new androidx.room.RoomTrackingLiveData$refresh$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L37
            if (r1 != r4) goto L31
            int r6 = r0.I$0
            java.lang.Object r1 = r0.L$0
            androidx.room.RoomTrackingLiveData r1 = (androidx.room.RoomTrackingLiveData) r1
            defpackage.ta3.H(r7)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            goto L58
        L2d:
            r6 = move-exception
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r6)
            return r2
        L37:
            defpackage.ta3.H(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.registeredObserver
            boolean r7 = r7.compareAndSet(r3, r4)
            if (r7 == 0) goto L4d
            androidx.room.RoomDatabase r7 = r6.database
            androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
            androidx.room.InvalidationTracker$Observer r1 = r6.observer
            r7.addWeakObserver(r1)
        L4d:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.computing
            boolean r7 = r7.compareAndSet(r3, r4)
            r1 = r6
            if (r7 == 0) goto L8a
            r7 = r2
            r6 = r3
        L58:
            java.util.concurrent.atomic.AtomicBoolean r5 = r1.invalid     // Catch: java.lang.Throwable -> L2d
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L79
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r0.I$0 = r4     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r0.label = r4     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.Object r7 = r1.compute(r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            e50 r6 = defpackage.e50.a
            if (r7 != r6) goto L6f
            return r6
        L6f:
            r6 = r4
            goto L58
        L71:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "Exception while computing database live data."
            r7.<init>(r0, r6)     // Catch: java.lang.Throwable -> L2d
            throw r7     // Catch: java.lang.Throwable -> L2d
        L79:
            if (r6 == 0) goto L7e
            r1.postValue(r7)     // Catch: java.lang.Throwable -> L2d
        L7e:
            java.util.concurrent.atomic.AtomicBoolean r7 = r1.computing
            r7.set(r3)
            goto L8b
        L84:
            java.util.concurrent.atomic.AtomicBoolean r7 = r1.computing
            r7.set(r3)
            throw r6
        L8a:
            r6 = r3
        L8b:
            if (r6 == 0) goto L98
            java.util.concurrent.atomic.AtomicBoolean r6 = r1.invalid
            boolean r6 = r6.get()
            if (r6 != 0) goto L96
            goto L98
        L96:
            r6 = r1
            goto L4d
        L98:
            vy2 r6 = defpackage.vy2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomTrackingLiveData.refresh(a10):java.lang.Object");
    }

    public abstract Object compute(a10 a10Var);

    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.container.onActive(this);
        od4.s(this.database.getCoroutineScope(), this.launchContext, null, new RoomTrackingLiveData$onActive$1(this, null), 2);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.container.onInactive(this);
    }
}
