package androidx.datastore.core;

import defpackage.a10;
import defpackage.co2;
import defpackage.f31;
import defpackage.j20;
import defpackage.jp0;
import defpackage.nb1;
import defpackage.nm1;
import defpackage.od4;
import defpackage.sb0;
import defpackage.sm1;
import defpackage.ts0;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {
    public static final Companion Companion = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final j20 context;
    private final File file;
    private final nm1 inMemoryMutex;
    private final nb1 lazySharedCounter;
    private final nb1 lockFile$delegate;
    private final jp0 updateNotifications;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:10:0x007b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r10, defpackage.a10 r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                if (r0 == 0) goto L13
                r0 = r11
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r9, r11)
            L18:
                java.lang.Object r9 = r0.result
                int r11 = r0.label
                r1 = 1
                if (r11 == 0) goto L34
                if (r11 != r1) goto L2d
                long r10 = r0.J$0
                java.lang.Object r2 = r0.L$0
                java.io.FileOutputStream r2 = (java.io.FileOutputStream) r2
                defpackage.ta3.H(r9)
                r9 = r2
                r2 = r0
                goto L7b
            L2d:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.hu2.h(r9)
                r9 = 0
                return r9
            L34:
                defpackage.ta3.H(r9)
                long r2 = androidx.datastore.core.MultiProcessCoordinator.access$getINITIAL_WAIT_MILLIS$cp()
                r9 = r10
                r10 = r2
                r2 = r0
            L3e:
                long r3 = androidx.datastore.core.MultiProcessCoordinator.access$getMAX_WAIT_MILLIS$cp()
                int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r0 > 0) goto L80
                java.nio.channels.FileChannel r3 = r9.getChannel()     // Catch: java.io.IOException -> L5a
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r8 = 0
                r4 = 0
                java.nio.channels.FileLock r0 = r3.lock(r4, r6, r8)     // Catch: java.io.IOException -> L5a
                r0.getClass()     // Catch: java.io.IOException -> L5a
                return r0
            L5a:
                r0 = move-exception
                java.lang.String r3 = r0.getMessage()
                if (r3 == 0) goto L7f
                java.lang.String r4 = androidx.datastore.core.MultiProcessCoordinator.access$getDEADLOCK_ERROR_MESSAGE$cp()
                r5 = 0
                boolean r3 = defpackage.um2.l0(r3, r4, r5)
                if (r3 != r1) goto L7f
                r2.L$0 = r9
                r2.J$0 = r10
                r2.label = r1
                java.lang.Object r0 = defpackage.ux2.B(r10, r2)
                e50 r3 = defpackage.e50.a
                if (r0 != r3) goto L7b
                return r3
            L7b:
                r3 = 2
                long r10 = r10 * r3
                goto L3e
            L7f:
                throw r0
            L80:
                java.nio.channels.FileChannel r3 = r9.getChannel()
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r8 = 0
                r4 = 0
                java.nio.channels.FileLock r9 = r3.lock(r4, r6, r8)
                r9.getClass()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, a10):java.lang.Object");
        }
    }

    public MultiProcessCoordinator(j20 j20Var, File file) {
        j20Var.getClass();
        file.getClass();
        this.context = j20Var;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.Companion.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = new sm1();
        this.lockFile$delegate = new co2(new MultiProcessCoordinator$lockFile$2(this));
        this.lazySharedCounter = new co2(new MultiProcessCoordinator$lazySharedCounter$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String str) {
        return new File(this.file.getAbsolutePath() + str);
    }

    private final File getLockFile() {
        return (File) this.lockFile$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return (SharedCounter) this.lazySharedCounter.getValue();
    }

    private final <T> Object withLazyCounter(ts0 ts0Var, a10 a10Var) {
        return this.lazySharedCounter.isInitialized() ? ts0Var.invoke(getSharedCounter(), a10Var) : od4.D(this.context, new MultiProcessCoordinator$withLazyCounter$2(ts0Var, this, null), a10Var);
    }

    public final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public jp0 getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(a10 a10Var) {
        return this.lazySharedCounter.isInitialized() ? new Integer(getSharedCounter().getValue()) : od4.D(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), a10Var);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(a10 a10Var) {
        return this.lazySharedCounter.isInitialized() ? new Integer(getSharedCounter().incrementAndGetValue()) : od4.D(this.context, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), a10Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x007d, code lost:
    
        if (r1 == r6) goto L38;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7 A[Catch: all -> 0x00bb, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00bb, blocks: (B:16:0x00b7, B:30:0x00d5, B:31:0x00d8), top: B:7:0x0022, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[Catch: all -> 0x00bb, TRY_ENTER, TryCatch #4 {all -> 0x00bb, blocks: (B:16:0x00b7, B:30:0x00d5, B:31:0x00d8), top: B:7:0x0022, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [nm1] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, ps0] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object lock(defpackage.ps0 r9, defpackage.a10 r10) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.lock(ps0, a10):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0 A[Catch: all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00e4, blocks: (B:15:0x00e0, B:31:0x00fb, B:32:0x00fe), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb A[Catch: all -> 0x00e4, TRY_ENTER, TryCatch #4 {all -> 0x00e4, blocks: (B:15:0x00e0, B:31:0x00fb, B:32:0x00fe), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r19v0, types: [ts0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [nm1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, int] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object tryLock(defpackage.ts0 r19, defpackage.a10 r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.tryLock(ts0, a10):java.lang.Object");
    }
}
