package androidx.datastore.core;

import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(File file, Serializer<T> serializer) {
        super(file, serializer);
        file.getClass();
        serializer.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(T r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.FileWriteScope$writeData$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = (androidx.datastore.core.FileWriteScope$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileWriteScope$writeData$1 r0 = new androidx.datastore.core.FileWriteScope$writeData$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            java.lang.Object r4 = r0.L$1
            java.io.FileOutputStream r4 = (java.io.FileOutputStream) r4
            java.lang.Object r5 = r0.L$0
            java.io.Closeable r5 = (java.io.Closeable) r5
            defpackage.ta3.H(r6)     // Catch: java.lang.Throwable -> L2e
            goto L5f
        L2e:
            r4 = move-exception
            goto L6e
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r3
        L36:
            defpackage.ta3.H(r6)
            r4.checkNotClosed()
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            java.io.File r1 = r4.getFile()
            r6.<init>(r1)
            androidx.datastore.core.Serializer r4 = r4.getSerializer()     // Catch: java.lang.Throwable -> L6c
            androidx.datastore.core.UncloseableOutputStream r1 = new androidx.datastore.core.UncloseableOutputStream     // Catch: java.lang.Throwable -> L6c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L6c
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L6c
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L6c
            r0.label = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r4 = r4.writeTo(r5, r1, r0)     // Catch: java.lang.Throwable -> L6c
            e50 r5 = defpackage.e50.a
            if (r4 != r5) goto L5d
            return r5
        L5d:
            r4 = r6
            r5 = r4
        L5f:
            java.io.FileDescriptor r4 = r4.getFD()     // Catch: java.lang.Throwable -> L2e
            r4.sync()     // Catch: java.lang.Throwable -> L2e
            defpackage.kx.o(r5, r3)
            vy2 r4 = defpackage.vy2.a
            return r4
        L6c:
            r4 = move-exception
            r5 = r6
        L6e:
            throw r4     // Catch: java.lang.Throwable -> L6f
        L6f:
            r6 = move-exception
            defpackage.kx.o(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileWriteScope.writeData(java.lang.Object, a10):java.lang.Object");
    }
}
