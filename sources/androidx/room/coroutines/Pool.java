package androidx.room.coroutines;

import androidx.collection.CircularArray;
import androidx.sqlite.SQLiteConnection;
import defpackage.ef2;
import defpackage.hf2;
import defpackage.ie1;
import defpackage.jf2;
import defpackage.kw;
import defpackage.nb0;
import defpackage.os0;
import defpackage.zd;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class Pool {
    private final CircularArray<ConnectionWithLock> availableConnections;
    private final int capacity;
    private final os0 connectionFactory;
    private final ef2 connectionPermits;
    private final ConnectionWithLock[] connections;
    private boolean isClosed;
    private final ReentrantLock lock;
    private int size;

    /* JADX WARN: Type inference failed for: r2v4, types: [ef2, hf2] */
    public Pool(int i, os0 os0Var) {
        os0Var.getClass();
        this.capacity = i;
        this.connectionFactory = os0Var;
        this.lock = new ReentrantLock();
        this.connections = new ConnectionWithLock[i];
        int i2 = jf2.a;
        this.connectionPermits = new hf2(i);
        this.availableConnections = new CircularArray<>(i);
    }

    private final void tryOpenNewConnectionLocked() {
        if (this.size >= this.capacity) {
            return;
        }
        ConnectionWithLock connectionWithLock = new ConnectionWithLock((SQLiteConnection) this.connectionFactory.invoke(), null, 2, null);
        ConnectionWithLock[] connectionWithLockArr = this.connections;
        int i = this.size;
        this.size = i + 1;
        connectionWithLockArr[i] = connectionWithLock;
        this.availableConnections.addLast(connectionWithLock);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0067, code lost:
    
        r0.p(r3, r6.b);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: all -> 0x0096, TryCatch #2 {all -> 0x0096, blocks: (B:13:0x0086, B:15:0x008a, B:17:0x0092, B:18:0x0098, B:22:0x00a6, B:23:0x00b3), top: B:12:0x0086, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6 A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #2 {all -> 0x0096, blocks: (B:13:0x0086, B:15:0x008a, B:17:0x0092, B:18:0x0098, B:22:0x00a6, B:23:0x00b3), top: B:12:0x0086, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquire(defpackage.a10 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.room.coroutines.Pool$acquire$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.coroutines.Pool$acquire$1 r0 = (androidx.room.coroutines.Pool$acquire$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.coroutines.Pool$acquire$1 r0 = new androidx.room.coroutines.Pool$acquire$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r5 = r0.L$0
            androidx.room.coroutines.Pool r5 = (androidx.room.coroutines.Pool) r5
            defpackage.ta3.H(r6)
            goto L81
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            r5 = 0
            return r5
        L30:
            defpackage.ta3.H(r6)
            ef2 r6 = r5.connectionPermits
            r0.L$0 = r5
            r0.label = r2
            hf2 r6 = (defpackage.hf2) r6
            r6.getClass()
            int r1 = r6.a
        L40:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.hf2.o
            int r2 = r2.getAndDecrement(r6)
            if (r2 > r1) goto L40
            vy2 r3 = defpackage.vy2.a
            e50 r4 = defpackage.e50.a
            if (r2 <= 0) goto L4f
            goto L7e
        L4f:
            a10 r0 = defpackage.m60.u(r0)
            qs r0 = defpackage.jh2.C(r0)
            boolean r2 = r6.a(r0)     // Catch: java.lang.Throwable -> Lc0
            if (r2 != 0) goto L73
        L5d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.hf2.o     // Catch: java.lang.Throwable -> Lc0
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> Lc0
            if (r2 > r1) goto L5d
            if (r2 <= 0) goto L6d
            x7 r6 = r6.b     // Catch: java.lang.Throwable -> Lc0
            r0.p(r3, r6)     // Catch: java.lang.Throwable -> Lc0
            goto L73
        L6d:
            boolean r2 = r6.a(r0)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto L5d
        L73:
            java.lang.Object r6 = r0.s()
            if (r6 != r4) goto L7a
            goto L7b
        L7a:
            r6 = r3
        L7b:
            if (r6 != r4) goto L7e
            r3 = r6
        L7e:
            if (r3 != r4) goto L81
            return r4
        L81:
            java.util.concurrent.locks.ReentrantLock r6 = r5.lock     // Catch: java.lang.Throwable -> La4
            r6.lock()     // Catch: java.lang.Throwable -> La4
            boolean r0 = r5.isClosed     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto La6
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r0 = r5.availableConnections     // Catch: java.lang.Throwable -> L96
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L98
            r5.tryOpenNewConnectionLocked()     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r0 = move-exception
            goto Lb4
        L98:
            androidx.collection.CircularArray<androidx.room.coroutines.ConnectionWithLock> r0 = r5.availableConnections     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.popFirst()     // Catch: java.lang.Throwable -> L96
            androidx.room.coroutines.ConnectionWithLock r0 = (androidx.room.coroutines.ConnectionWithLock) r0     // Catch: java.lang.Throwable -> L96
            r6.unlock()     // Catch: java.lang.Throwable -> La4
            return r0
        La4:
            r6 = move-exception
            goto Lb8
        La6:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            androidx.sqlite.SQLite.throwSQLiteException(r1, r0)     // Catch: java.lang.Throwable -> L96
            rx r0 = new rx     // Catch: java.lang.Throwable -> L96
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        Lb4:
            r6.unlock()     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> La4
        Lb8:
            ef2 r5 = r5.connectionPermits
            hf2 r5 = (defpackage.hf2) r5
            r5.b()
            throw r6
        Lc0:
            r5 = move-exception
            r0.A()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool.acquire(a10):java.lang.Object");
    }

    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (ConnectionWithLock connectionWithLock : this.connections) {
                if (connectionWithLock != null) {
                    connectionWithLock.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void dump(StringBuilder sb) {
        sb.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            ie1 p = nb0.p();
            int size = this.availableConnections.size();
            for (int i = 0; i < size; i++) {
                p.add(this.availableConnections.get(i));
            }
            ie1 k = nb0.k(p);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.capacity + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            hf2 hf2Var = (hf2) this.connectionPermits;
            hf2Var.getClass();
            sb2.append(Math.max(zd.a.getIntVolatile(hf2Var, hf2.p), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + k.size() + ")[" + kw.w0(k, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            ConnectionWithLock[] connectionWithLockArr = this.connections;
            int length = connectionWithLockArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                ConnectionWithLock connectionWithLock = connectionWithLockArr[i3];
                i2++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i2);
                sb3.append("] - ");
                sb3.append(connectionWithLock != null ? connectionWithLock.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (connectionWithLock != null) {
                    connectionWithLock.dump(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final os0 getConnectionFactory() {
        return this.connectionFactory;
    }

    public final void recycle(ConnectionWithLock connectionWithLock) {
        connectionWithLock.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connectionWithLock);
            reentrantLock.unlock();
            ((hf2) this.connectionPermits).b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
