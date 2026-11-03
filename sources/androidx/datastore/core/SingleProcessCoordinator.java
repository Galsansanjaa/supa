package androidx.datastore.core;

import defpackage.a10;
import defpackage.jp0;
import defpackage.nm1;
import defpackage.np0;
import defpackage.sm1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    private final String filePath;
    private final nm1 mutex;
    private final jp0 updateNotifications;
    private final AtomicInt version;

    public SingleProcessCoordinator(String str) {
        str.getClass();
        this.filePath = str;
        this.mutex = new sm1();
        this.version = new AtomicInt(0);
        this.updateNotifications = new np0(new SingleProcessCoordinator$updateNotifications$1(null), 3);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public jp0 getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(a10 a10Var) {
        return new Integer(this.version.get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(a10 a10Var) {
        return new Integer(this.version.incrementAndGet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r8 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.datastore.core.SingleProcessCoordinator] */
    /* JADX WARN: Type inference failed for: r6v1, types: [nm1] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [nm1] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object lock(defpackage.ps0 r7, defpackage.a10 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.datastore.core.SingleProcessCoordinator$lock$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$lock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$lock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$lock$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            e50 r5 = defpackage.e50.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.L$0
            nm1 r6 = (defpackage.nm1) r6
            defpackage.ta3.H(r8)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L2f:
            r7 = move-exception
            goto L66
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r6)
            return r4
        L37:
            java.lang.Object r6 = r0.L$1
            nm1 r6 = (defpackage.nm1) r6
            java.lang.Object r7 = r0.L$0
            ps0 r7 = (defpackage.ps0) r7
            defpackage.ta3.H(r8)
            goto L55
        L43:
            defpackage.ta3.H(r8)
            nm1 r6 = r6.mutex
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r6.lock(r4, r0)
            if (r8 != r5) goto L55
            goto L61
        L55:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2f
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L2f
            r0.label = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L62
        L61:
            return r5
        L62:
            r6.unlock(r4)
            return r8
        L66:
            r6.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.lock(ps0, a10):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object tryLock(defpackage.ts0 r6, defpackage.a10 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = (androidx.datastore.core.SingleProcessCoordinator$tryLock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.SingleProcessCoordinator$tryLock$1 r0 = new androidx.datastore.core.SingleProcessCoordinator$tryLock$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$0
            nm1 r6 = (defpackage.nm1) r6
            defpackage.ta3.H(r7)     // Catch: java.lang.Throwable -> L2c
            goto L54
        L2c:
            r7 = move-exception
            goto L5f
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r5)
            return r3
        L34:
            defpackage.ta3.H(r7)
            nm1 r5 = r5.mutex
            boolean r7 = r5.tryLock(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L5a
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5a
            r0.Z$0 = r7     // Catch: java.lang.Throwable -> L5a
            r0.label = r2     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r6.invoke(r1, r0)     // Catch: java.lang.Throwable -> L5a
            e50 r0 = defpackage.e50.a
            if (r6 != r0) goto L50
            return r0
        L50:
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L54:
            if (r5 == 0) goto L59
            r6.unlock(r3)
        L59:
            return r7
        L5a:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5f:
            if (r5 == 0) goto L64
            r6.unlock(r3)
        L64:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.tryLock(ts0, a10):java.lang.Object");
    }
}
