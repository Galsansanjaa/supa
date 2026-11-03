package androidx.datastore.core;

import defpackage.a10;
import defpackage.e50;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class StorageConnectionKt {
    public static final <T> Object readData(StorageConnection<T> storageConnection, a10 a10Var) {
        return storageConnection.readScope(new StorageConnectionKt$readData$2(null), a10Var);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t, a10 a10Var) {
        Object writeScope = storageConnection.writeScope(new StorageConnectionKt$writeData$2(t, null), a10Var);
        return writeScope == e50.a ? writeScope : vy2.a;
    }
}
