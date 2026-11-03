package androidx.datastore.core;

import defpackage.f31;
import defpackage.hu2;
import defpackage.nm1;
import defpackage.os0;
import defpackage.sm1;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final os0 onClose;
    private final Serializer<T> serializer;
    private final nm1 transactionMutex;

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator interProcessCoordinator, os0 os0Var) {
        file.getClass();
        serializer.getClass();
        interProcessCoordinator.getClass();
        os0Var.getClass();
        this.file = file;
        this.serializer = serializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = os0Var;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = new sm1();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            hu2.h("StorageConnection has already been disposed.");
        }
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            f31.i(file, "Unable to create parent directories of ");
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

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:41|42))(6:43|44|45|46|47|(1:49)(1:50))|14|15|16|(2:(1:19)|20)(2:22|23)))|55|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [us0] */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object readScope(defpackage.us0 r8, defpackage.a10 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.FileStorageConnection$readScope$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = (androidx.datastore.core.FileStorageConnection$readScope$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = new androidx.datastore.core.FileStorageConnection$readScope$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L36
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.datastore.core.Closeable r8 = (androidx.datastore.core.Closeable) r8
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.FileStorageConnection r0 = (androidx.datastore.core.FileStorageConnection) r0
            defpackage.ta3.H(r9)     // Catch: java.lang.Throwable -> L30
            goto L6a
        L30:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r0
            r0 = r6
            goto L82
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r7)
            return r3
        L3c:
            defpackage.ta3.H(r9)
            r7.checkNotClosed()
            nm1 r9 = r7.transactionMutex
            boolean r9 = r9.tryLock(r3)
            androidx.datastore.core.FileReadScope r1 = new androidx.datastore.core.FileReadScope     // Catch: java.lang.Throwable -> L8b
            java.io.File r4 = r7.file     // Catch: java.lang.Throwable -> L8b
            androidx.datastore.core.Serializer<T> r5 = r7.serializer     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7f
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L7f
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L7f
            r0.label = r2     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r8 = r8.invoke(r1, r4, r0)     // Catch: java.lang.Throwable -> L7f
            e50 r0 = defpackage.e50.a
            if (r8 != r0) goto L66
            return r0
        L66:
            r0 = r7
            r7 = r9
            r9 = r8
            r8 = r1
        L6a:
            r8.close()     // Catch: java.lang.Throwable -> L6f
            r8 = r3
            goto L70
        L6f:
            r8 = move-exception
        L70:
            if (r8 != 0) goto L7a
            if (r7 == 0) goto L79
            nm1 r7 = r0.transactionMutex
            r7.unlock(r3)
        L79:
            return r9
        L7a:
            throw r8     // Catch: java.lang.Throwable -> L7b
        L7b:
            r8 = move-exception
            r9 = r7
            r7 = r0
            goto L8c
        L7f:
            r8 = move-exception
            r0 = r8
            r8 = r1
        L82:
            r8.close()     // Catch: java.lang.Throwable -> L86
            goto L8a
        L86:
            r8 = move-exception
            defpackage.jh2.i(r0, r8)     // Catch: java.lang.Throwable -> L8b
        L8a:
            throw r0     // Catch: java.lang.Throwable -> L8b
        L8b:
            r8 = move-exception
        L8c:
            if (r9 == 0) goto L93
            nm1 r7 = r7.transactionMutex
            r7.unlock(r3)
        L93:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.readScope(us0, a10):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(7:(2:3|(11:5|6|7|(1:(1:(7:11|12|13|14|15|16|(4:18|(2:23|24)|26|27)(1:28))(2:39|40))(1:41))(3:59|(1:61)|48)|42|43|44|45|46|(5:49|14|15|16|(0)(0))|48))|43|44|45|46|(0)|48)|7|(0)(0)|42) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6 A[Catch: all -> 0x00e6, IOException -> 0x00e8, TRY_ENTER, TryCatch #1 {IOException -> 0x00e8, blocks: (B:18:0x00b6, B:20:0x00bc, B:23:0x00c5, B:24:0x00e5, B:28:0x00f1, B:38:0x00fb, B:35:0x00fe), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1 A[Catch: all -> 0x00e6, IOException -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x00e8, blocks: (B:18:0x00b6, B:20:0x00bc, B:23:0x00c5, B:24:0x00e5, B:28:0x00f1, B:38:0x00fb, B:35:0x00fe), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [nm1, int] */
    @Override // androidx.datastore.core.StorageConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeScope(defpackage.ts0 r10, defpackage.a10 r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.writeScope(ts0, a10):java.lang.Object");
    }
}
