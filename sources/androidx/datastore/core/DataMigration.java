package androidx.datastore.core;

import defpackage.a10;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface DataMigration<T> {
    Object cleanUp(a10 a10Var);

    Object migrate(T t, a10 a10Var);

    Object shouldMigrate(T t, a10 a10Var);
}
