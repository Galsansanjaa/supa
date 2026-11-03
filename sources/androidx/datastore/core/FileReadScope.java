package androidx.datastore.core;

import defpackage.a10;
import defpackage.hu2;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class FileReadScope<T> implements ReadScope<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final File file;
    private final Serializer<T> serializer;

    public FileReadScope(File file, Serializer<T> serializer) {
        file.getClass();
        serializer.getClass();
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(7:40|41|42|44|45|(1:47)|48)|30|31))|66|6|7|(0)(0)|30|31|(3:(1:21)|(0)|(1:36))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006b, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.FileReadScope<T> r7, defpackage.a10 r8) {
        /*
            boolean r0 = r8 instanceof androidx.datastore.core.FileReadScope$readData$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.FileReadScope$readData$1 r0 = (androidx.datastore.core.FileReadScope$readData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileReadScope$readData$1 r0 = new androidx.datastore.core.FileReadScope$readData$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            e50 r5 = defpackage.e50.a
            if (r1 == 0) goto L47
            if (r1 == r3) goto L39
            if (r1 != r2) goto L33
            java.lang.Object r7 = r0.L$0
            java.io.Closeable r7 = (java.io.Closeable) r7
            defpackage.ta3.H(r8)     // Catch: java.lang.Throwable -> L30
            goto L99
        L30:
            r8 = move-exception
            goto La1
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r7)
            return r4
        L39:
            java.lang.Object r7 = r0.L$1
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r1 = r0.L$0
            androidx.datastore.core.FileReadScope r1 = (androidx.datastore.core.FileReadScope) r1
            defpackage.ta3.H(r8)     // Catch: java.lang.Throwable -> L45
            goto L67
        L45:
            r8 = move-exception
            goto L72
        L47:
            defpackage.ta3.H(r8)
            r7.checkNotClosed()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L78
            java.io.File r1 = r7.file     // Catch: java.io.FileNotFoundException -> L78
            r8.<init>(r1)     // Catch: java.io.FileNotFoundException -> L78
            androidx.datastore.core.Serializer<T> r1 = r7.serializer     // Catch: java.lang.Throwable -> L6d
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L6d
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L6d
            r0.label = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r1 = r1.readFrom(r8, r0)     // Catch: java.lang.Throwable -> L6d
            if (r1 != r5) goto L63
            goto L95
        L63:
            r6 = r1
            r1 = r7
            r7 = r8
            r8 = r6
        L67:
            defpackage.kx.o(r7, r4)     // Catch: java.io.FileNotFoundException -> L6b
            return r8
        L6b:
            r7 = r1
            goto L78
        L6d:
            r1 = move-exception
            r6 = r1
            r1 = r7
            r7 = r8
            r8 = r6
        L72:
            throw r8     // Catch: java.lang.Throwable -> L73
        L73:
            r3 = move-exception
            defpackage.kx.o(r7, r8)     // Catch: java.io.FileNotFoundException -> L6b
            throw r3     // Catch: java.io.FileNotFoundException -> L6b
        L78:
            java.io.File r8 = r7.file
            boolean r8 = r8.exists()
            if (r8 == 0) goto La7
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r1 = r7.file
            r8.<init>(r1)
            androidx.datastore.core.Serializer<T> r7 = r7.serializer     // Catch: java.lang.Throwable -> L9d
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L9d
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L9d
            r0.label = r2     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = r7.readFrom(r8, r0)     // Catch: java.lang.Throwable -> L9d
            if (r7 != r5) goto L96
        L95:
            return r5
        L96:
            r6 = r8
            r8 = r7
            r7 = r6
        L99:
            defpackage.kx.o(r7, r4)
            return r8
        L9d:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La1:
            throw r8     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            defpackage.kx.o(r7, r8)
            throw r0
        La7:
            androidx.datastore.core.Serializer<T> r7 = r7.serializer
            java.lang.Object r7 = r7.getDefaultValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileReadScope.readData$suspendImpl(androidx.datastore.core.FileReadScope, a10):java.lang.Object");
    }

    public final void checkNotClosed() {
        if (this.closed.get()) {
            hu2.h("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    public final File getFile() {
        return this.file;
    }

    public final Serializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(a10 a10Var) {
        return readData$suspendImpl(this, a10Var);
    }
}
