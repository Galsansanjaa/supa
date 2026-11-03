package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import defpackage.hn0;
import defpackage.hu2;
import defpackage.nm1;
import defpackage.os0;
import defpackage.sm1;
import defpackage.tv1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final hn0 fileSystem;
    private final os0 onClose;
    private final tv1 path;
    private final OkioSerializer<T> serializer;
    private final nm1 transactionMutex;

    public OkioStorageConnection(hn0 hn0Var, tv1 tv1Var, OkioSerializer<T> okioSerializer, InterProcessCoordinator interProcessCoordinator, os0 os0Var) {
        hn0Var.getClass();
        tv1Var.getClass();
        okioSerializer.getClass();
        interProcessCoordinator.getClass();
        os0Var.getClass();
        this.fileSystem = hn0Var;
        this.path = tv1Var;
        this.serializer = okioSerializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = os0Var;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = new sm1();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            hu2.h("StorageConnection has already been disposed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(3:9|10|11)(2:42|43))(7:44|45|46|47|48|49|(1:51)(1:52))|13|14|15|(2:(1:18)|19)(2:21|22)))|56|6|(0)(0)|13|14|15|(0)(0)|(2:(0)|(1:40))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object readScope(defpackage.us0 r9, defpackage.a10 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = (androidx.datastore.core.okio.OkioStorageConnection$readScope$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioStorageConnection$readScope$1 r0 = new androidx.datastore.core.okio.OkioStorageConnection$readScope$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L36
            boolean r8 = r0.Z$0
            java.lang.Object r9 = r0.L$1
            androidx.datastore.core.Closeable r9 = (androidx.datastore.core.Closeable) r9
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.okio.OkioStorageConnection r0 = (androidx.datastore.core.okio.OkioStorageConnection) r0
            defpackage.ta3.H(r10)     // Catch: java.lang.Throwable -> L30
            goto L6c
        L30:
            r10 = move-exception
            r7 = r10
            r10 = r8
            r8 = r0
            r0 = r7
            goto L84
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r8)
            return r3
        L3c:
            defpackage.ta3.H(r10)
            r8.checkNotClosed()
            nm1 r10 = r8.transactionMutex
            boolean r10 = r10.tryLock(r3)
            androidx.datastore.core.okio.OkioReadScope r1 = new androidx.datastore.core.okio.OkioReadScope     // Catch: java.lang.Throwable -> L8d
            hn0 r4 = r8.fileSystem     // Catch: java.lang.Throwable -> L8d
            tv1 r5 = r8.path     // Catch: java.lang.Throwable -> L8d
            androidx.datastore.core.okio.OkioSerializer<T> r6 = r8.serializer     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L81
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L81
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L81
            r0.Z$0 = r10     // Catch: java.lang.Throwable -> L81
            r0.label = r2     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r9.invoke(r1, r4, r0)     // Catch: java.lang.Throwable -> L81
            e50 r0 = defpackage.e50.a
            if (r9 != r0) goto L68
            return r0
        L68:
            r0 = r8
            r8 = r10
            r10 = r9
            r9 = r1
        L6c:
            r9.close()     // Catch: java.lang.Throwable -> L71
            r9 = r3
            goto L72
        L71:
            r9 = move-exception
        L72:
            if (r9 != 0) goto L7c
            if (r8 == 0) goto L7b
            nm1 r8 = r0.transactionMutex
            r8.unlock(r3)
        L7b:
            return r10
        L7c:
            throw r9     // Catch: java.lang.Throwable -> L7d
        L7d:
            r9 = move-exception
            r10 = r8
            r8 = r0
            goto L8e
        L81:
            r9 = move-exception
            r0 = r9
            r9 = r1
        L84:
            r9.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r9 = move-exception
            defpackage.jh2.i(r0, r9)     // Catch: java.lang.Throwable -> L8d
        L8c:
            throw r0     // Catch: java.lang.Throwable -> L8d
        L8d:
            r9 = move-exception
        L8e:
            if (r10 == 0) goto L95
            nm1 r8 = r8.transactionMutex
            r8.unlock(r3)
        L95:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.readScope(us0, a10):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7 A[Catch: all -> 0x0107, IOException -> 0x010a, TRY_ENTER, TryCatch #9 {IOException -> 0x010a, all -> 0x0107, blocks: (B:18:0x00f7, B:20:0x00ff, B:24:0x0113, B:34:0x011e, B:31:0x0121), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113 A[Catch: all -> 0x0107, IOException -> 0x010a, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x010a, all -> 0x0107, blocks: (B:18:0x00f7, B:20:0x00ff, B:24:0x0113, B:34:0x011e, B:31:0x0121), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a10, java.lang.Object, androidx.datastore.core.okio.OkioStorageConnection$writeScope$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, hn0] */
    /* JADX WARN: Type inference failed for: r11v1, types: [tv1] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [nm1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hn0] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [nm1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ts0] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeScope(defpackage.ts0 r11, defpackage.a10 r12) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.writeScope(ts0, a10):java.lang.Object");
    }
}
