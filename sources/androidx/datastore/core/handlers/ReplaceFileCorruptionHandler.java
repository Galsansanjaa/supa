package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import defpackage.a10;
import defpackage.ps0;
import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final ps0 produceNewData;

    public ReplaceFileCorruptionHandler(ps0 ps0Var) {
        ps0Var.getClass();
        this.produceNewData = ps0Var;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, a10 a10Var) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
