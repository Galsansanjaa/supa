package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import defpackage.a10;
import defpackage.hn0;
import defpackage.hu2;
import defpackage.tv1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final hn0 fileSystem;
    private final tv1 path;
    private final OkioSerializer<T> serializer;

    public OkioReadScope(hn0 hn0Var, tv1 tv1Var, OkioSerializer<T> okioSerializer) {
        hn0Var.getClass();
        tv1Var.getClass();
        okioSerializer.getClass();
        this.fileSystem = hn0Var;
        this.path = tv1Var;
        this.serializer = okioSerializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e A[Catch: FileNotFoundException -> 0x0088, TryCatch #7 {FileNotFoundException -> 0x0088, blocks: (B:40:0x008e, B:42:0x0092, B:55:0x0084, B:52:0x007f), top: B:51:0x007f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[Catch: FileNotFoundException -> 0x0088, TRY_LEAVE, TryCatch #7 {FileNotFoundException -> 0x0088, blocks: (B:40:0x008e, B:42:0x0092, B:55:0x0084, B:52:0x007f), top: B:51:0x007f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope<T> r7, defpackage.a10 r8) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioReadScope.readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope, a10):java.lang.Object");
    }

    public final void checkClose() {
        if (this.closed.get()) {
            hu2.h("This scope has already been closed.");
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    public final hn0 getFileSystem() {
        return this.fileSystem;
    }

    public final tv1 getPath() {
        return this.path;
    }

    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(a10 a10Var) {
        return readData$suspendImpl(this, a10Var);
    }
}
