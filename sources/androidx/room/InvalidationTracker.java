package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.support.AutoCloser;
import androidx.sqlite.SQLiteConnection;
import defpackage.a10;
import defpackage.dv1;
import defpackage.e50;
import defpackage.f31;
import defpackage.fi1;
import defpackage.hd0;
import defpackage.hu2;
import defpackage.iq0;
import defpackage.jh2;
import defpackage.jp0;
import defpackage.k93;
import defpackage.kw;
import defpackage.mi0;
import defpackage.os0;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.vq;
import defpackage.vy2;
import defpackage.xd;
import defpackage.yt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class InvalidationTracker {
    public static final Companion Companion = new Companion(null);
    private AutoCloser autoCloser;
    private final RoomDatabase database;
    private final TriggerBasedInvalidationTracker implementation;
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;
    private Intent multiInstanceInvalidationIntent;
    private final Map<Observer, ObserverWrapper> observerMap;
    private final ReentrantLock observerMapLock;
    private final os0 onRefreshCompleted;
    private final os0 onRefreshScheduled;
    private final Map<String, String> shadowTablesMap;
    private final String[] tableNames;
    private final Object trackerLock;
    private final Map<String, Set<String>> viewTables;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class MultiInstanceClientInitState {
        private final Context context;
        private final String name;
        private final Intent serviceIntent;

        public MultiInstanceClientInitState(Context context, String str, Intent intent) {
            context.getClass();
            str.getClass();
            intent.getClass();
            this.context = context;
            this.name = str;
            this.serviceIntent = intent;
        }

        public static /* synthetic */ MultiInstanceClientInitState copy$default(MultiInstanceClientInitState multiInstanceClientInitState, Context context, String str, Intent intent, int i, Object obj) {
            if ((i & 1) != 0) {
                context = multiInstanceClientInitState.context;
            }
            if ((i & 2) != 0) {
                str = multiInstanceClientInitState.name;
            }
            if ((i & 4) != 0) {
                intent = multiInstanceClientInitState.serviceIntent;
            }
            return multiInstanceClientInitState.copy(context, str, intent);
        }

        public final Context component1() {
            return this.context;
        }

        public final String component2() {
            return this.name;
        }

        public final Intent component3() {
            return this.serviceIntent;
        }

        public final MultiInstanceClientInitState copy(Context context, String str, Intent intent) {
            context.getClass();
            str.getClass();
            intent.getClass();
            return new MultiInstanceClientInitState(context, str, intent);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiInstanceClientInitState)) {
                return false;
            }
            MultiInstanceClientInitState multiInstanceClientInitState = (MultiInstanceClientInitState) obj;
            return jh2.k(this.context, multiInstanceClientInitState.context) && jh2.k(this.name, multiInstanceClientInitState.name) && jh2.k(this.serviceIntent, multiInstanceClientInitState.serviceIntent);
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getName() {
            return this.name;
        }

        public final Intent getServiceIntent() {
            return this.serviceIntent;
        }

        public int hashCode() {
            return this.serviceIntent.hashCode() + k93.j(this.context.hashCode() * 31, 31, this.name);
        }

        public String toString() {
            return "MultiInstanceClientInitState(context=" + this.context + ", name=" + this.name + ", serviceIntent=" + this.serviceIntent + ')';
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static abstract class Observer {
        private final String[] tables;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Observer(java.lang.String r3, java.lang.String... r4) {
            /*
                r2 = this;
                r3.getClass()
                r4.getClass()
                ew0 r0 = new ew0
                r1 = 2
                r0.<init>(r1)
                r0.a(r3)
                r0.d(r4)
                java.util.ArrayList r3 = r0.a
                int r4 = r3.size()
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.Object[] r3 = r3.toArray(r4)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.Observer.<init>(java.lang.String, java.lang.String[]):void");
        }

        public Observer(String[] strArr) {
            strArr.getClass();
            this.tables = strArr;
        }

        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(Set<String> set);
    }

    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        roomDatabase.getClass();
        map.getClass();
        map2.getClass();
        strArr.getClass();
        this.database = roomDatabase;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.tableNames = strArr;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(roomDatabase, map, map2, strArr, roomDatabase.getUseTempTrackingTable$room_runtime_release(), new InvalidationTracker$implementation$1(this));
        this.implementation = triggerBasedInvalidationTracker;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        final int i = 0;
        this.onRefreshScheduled = new os0(this) { // from class: a71
            public final /* synthetic */ InvalidationTracker b;

            {
                this.b = this;
            }

            @Override // defpackage.os0
            public final Object invoke() {
                vy2 onRefreshScheduled$lambda$0;
                vy2 onRefreshCompleted$lambda$1;
                boolean _init_$lambda$2;
                int i2 = i;
                InvalidationTracker invalidationTracker = this.b;
                switch (i2) {
                    case 0:
                        onRefreshScheduled$lambda$0 = InvalidationTracker.onRefreshScheduled$lambda$0(invalidationTracker);
                        return onRefreshScheduled$lambda$0;
                    case 1:
                        onRefreshCompleted$lambda$1 = InvalidationTracker.onRefreshCompleted$lambda$1(invalidationTracker);
                        return onRefreshCompleted$lambda$1;
                    default:
                        _init_$lambda$2 = InvalidationTracker._init_$lambda$2(invalidationTracker);
                        return Boolean.valueOf(_init_$lambda$2);
                }
            }
        };
        final int i2 = 1;
        this.onRefreshCompleted = new os0(this) { // from class: a71
            public final /* synthetic */ InvalidationTracker b;

            {
                this.b = this;
            }

            @Override // defpackage.os0
            public final Object invoke() {
                vy2 onRefreshScheduled$lambda$0;
                vy2 onRefreshCompleted$lambda$1;
                boolean _init_$lambda$2;
                int i22 = i2;
                InvalidationTracker invalidationTracker = this.b;
                switch (i22) {
                    case 0:
                        onRefreshScheduled$lambda$0 = InvalidationTracker.onRefreshScheduled$lambda$0(invalidationTracker);
                        return onRefreshScheduled$lambda$0;
                    case 1:
                        onRefreshCompleted$lambda$1 = InvalidationTracker.onRefreshCompleted$lambda$1(invalidationTracker);
                        return onRefreshCompleted$lambda$1;
                    default:
                        _init_$lambda$2 = InvalidationTracker._init_$lambda$2(invalidationTracker);
                        return Boolean.valueOf(_init_$lambda$2);
                }
            }
        };
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(roomDatabase);
        this.trackerLock = new Object();
        final int i3 = 2;
        triggerBasedInvalidationTracker.setOnAllowRefresh$room_runtime_release(new os0(this) { // from class: a71
            public final /* synthetic */ InvalidationTracker b;

            {
                this.b = this;
            }

            @Override // defpackage.os0
            public final Object invoke() {
                vy2 onRefreshScheduled$lambda$0;
                vy2 onRefreshCompleted$lambda$1;
                boolean _init_$lambda$2;
                int i22 = i3;
                InvalidationTracker invalidationTracker = this.b;
                switch (i22) {
                    case 0:
                        onRefreshScheduled$lambda$0 = InvalidationTracker.onRefreshScheduled$lambda$0(invalidationTracker);
                        return onRefreshScheduled$lambda$0;
                    case 1:
                        onRefreshCompleted$lambda$1 = InvalidationTracker.onRefreshCompleted$lambda$1(invalidationTracker);
                        return onRefreshCompleted$lambda$1;
                    default:
                        _init_$lambda$2 = InvalidationTracker._init_$lambda$2(invalidationTracker);
                        return Boolean.valueOf(_init_$lambda$2);
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @defpackage.hd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InvalidationTracker(androidx.room.RoomDatabase r2, java.lang.String... r3) {
        /*
            r1 = this;
            r2.getClass()
            r3.getClass()
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            pi0 r0 = defpackage.pi0.a
            r1.<init>(r2, r0, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.<init>(androidx.room.RoomDatabase, java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(InvalidationTracker invalidationTracker) {
        return !invalidationTracker.database.inCompatibilityMode$room_runtime_release() || invalidationTracker.database.isOpenInternal();
    }

    private final boolean addObserverOnly(Observer observer) {
        dv1 validateTableNames$room_runtime_release = this.implementation.validateTableNames$room_runtime_release(observer.getTables$room_runtime_release());
        String[] strArr = (String[]) validateTableNames$room_runtime_release.a;
        int[] iArr = (int[]) validateTableNames$room_runtime_release.b;
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, strArr);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            boolean containsKey = this.observerMap.containsKey(observer);
            Map<Observer, ObserverWrapper> map = this.observerMap;
            ObserverWrapper put = containsKey ? (ObserverWrapper) fi1.O(observer, map) : map.put(observer, observerWrapper);
            reentrantLock.unlock();
            return put == null && this.implementation.onObserverAdded$room_runtime_release(iArr);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static /* synthetic */ jp0 createFlow$default(InvalidationTracker invalidationTracker, String[] strArr, boolean z, int i, Object obj) {
        if (obj != null) {
            f31.f("Super calls with default arguments not supported in this target, function: createFlow");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return invalidationTracker.createFlow(strArr, z);
    }

    private final List<Observer> getAllObservers() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return kw.L0(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyInvalidatedObservers(Set<Integer> set) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List L0 = kw.L0(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = L0.iterator();
            while (it.hasNext()) {
                ((ObserverWrapper) it.next()).notifyByTableIds$room_runtime_release(set);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    List<Observer> allObservers = getAllObservers();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : allObservers) {
                        if (!((Observer) obj).isRemote$room_runtime_release()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        multiInstanceInvalidationClient.stop();
                    }
                }
                this.implementation.resetSync$room_runtime_release();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 onRefreshCompleted$lambda$1(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.decrementCountAndScheduleClose();
        }
        return vy2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 onRefreshScheduled$lambda$0(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        return vy2.a;
    }

    private final boolean removeObserverOnly(Observer observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper remove = this.observerMap.remove(observer);
            return remove != null && this.implementation.onObserverRemoved$room_runtime_release(remove.getTableIds$room_runtime_release());
        } finally {
            reentrantLock.unlock();
        }
    }

    public void addObserver(Observer observer) {
        observer.getClass();
        if (addObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$addObserver$1(this, null));
        }
    }

    public final void addRemoteObserver$room_runtime_release(Observer observer) {
        observer.getClass();
        if (observer.isRemote$room_runtime_release()) {
            addObserverOnly(observer);
        } else {
            hu2.h("isRemote was false of observer argument");
        }
    }

    public void addWeakObserver(Observer observer) {
        observer.getClass();
        addObserver(new WeakObserver(this, observer));
    }

    public final jp0 createFlow(String... strArr) {
        strArr.getClass();
        return createFlow$default(this, strArr, false, 2, null);
    }

    public final jp0 createFlow(String[] strArr, boolean z) {
        strArr.getClass();
        dv1 validateTableNames$room_runtime_release = this.implementation.validateTableNames$room_runtime_release(strArr);
        String[] strArr2 = (String[]) validateTableNames$room_runtime_release.a;
        jp0 createFlow$room_runtime_release = this.implementation.createFlow$room_runtime_release(strArr2, (int[]) validateTableNames$room_runtime_release.b, z);
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        jp0 createFlow = multiInstanceInvalidationClient != null ? multiInstanceInvalidationClient.createFlow(strArr2) : null;
        if (createFlow == null) {
            return createFlow$room_runtime_release;
        }
        jp0[] jp0VarArr = {createFlow$room_runtime_release, createFlow};
        int i = iq0.a;
        return new yt(new xd(jp0VarArr, 0), mi0.a, -2, vq.a, 1);
    }

    @hd0
    public <T> LiveData<T> createLiveData(String[] strArr, Callable<T> callable) {
        strArr.getClass();
        callable.getClass();
        return createLiveData(strArr, false, (Callable) callable);
    }

    public <T> LiveData<T> createLiveData(String[] strArr, boolean z, Callable<T> callable) {
        strArr.getClass();
        callable.getClass();
        this.implementation.validateTableNames$room_runtime_release(strArr);
        return this.invalidationLiveDataContainer.create(strArr, z, callable);
    }

    public final <T> LiveData<T> createLiveData(String[] strArr, boolean z, ps0 ps0Var) {
        strArr.getClass();
        ps0Var.getClass();
        this.implementation.validateTableNames$room_runtime_release(strArr);
        return this.invalidationLiveDataContainer.create(strArr, z, ps0Var);
    }

    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    public final String[] getTableNames$room_runtime_release() {
        return this.tableNames;
    }

    public final void initMultiInstanceInvalidation$room_runtime_release(Context context, String str, Intent intent) {
        context.getClass();
        str.getClass();
        intent.getClass();
        this.multiInstanceInvalidationIntent = intent;
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, str, this);
    }

    public final void internalInit$room_runtime_release(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        this.implementation.configureConnection(sQLiteConnection);
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    multiInstanceInvalidationClient.start(intent);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void notifyObserversByTableNames$room_runtime_release(Set<String> set) {
        set.getClass();
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> L0 = kw.L0(this.observerMap.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : L0) {
                if (!observerWrapper.getObserver$room_runtime_release().isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(set);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Object refresh(String[] strArr, a10 a10Var) {
        return this.implementation.refreshInvalidation$room_runtime_release(strArr, this.onRefreshScheduled, this.onRefreshCompleted, a10Var);
    }

    public final void refreshAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime_release(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void refreshVersionsAsync() {
        this.implementation.refreshInvalidationAsync$room_runtime_release(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void refreshVersionsSync() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$refreshVersionsSync$1(this, null));
    }

    public void removeObserver(Observer observer) {
        observer.getClass();
        if (removeObserverOnly(observer)) {
            RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$removeObserver$1(this, null));
        }
    }

    public final void setAutoCloser$room_runtime_release(AutoCloser autoCloser) {
        autoCloser.getClass();
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new InvalidationTracker$setAutoCloser$1(this));
    }

    public final void stop$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
    }

    public final Object sync$room_runtime_release(a10 a10Var) {
        Object syncTriggers$room_runtime_release;
        boolean inCompatibilityMode$room_runtime_release = this.database.inCompatibilityMode$room_runtime_release();
        vy2 vy2Var = vy2.a;
        return ((!inCompatibilityMode$room_runtime_release || this.database.isOpenInternal()) && (syncTriggers$room_runtime_release = this.implementation.syncTriggers$room_runtime_release(a10Var)) == e50.a) ? syncTriggers$room_runtime_release : vy2Var;
    }

    public final void syncBlocking$room_runtime_release() {
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new InvalidationTracker$syncBlocking$1(this, null));
    }
}
