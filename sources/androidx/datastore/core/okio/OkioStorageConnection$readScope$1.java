package androidx.datastore.core.okio;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {113}, m = "readScope")
/* loaded from: classes3.dex */
public final class OkioStorageConnection$readScope$1<R> extends c10 {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkioStorageConnection<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorageConnection$readScope$1(OkioStorageConnection<T> okioStorageConnection, a10 a10Var) {
        super(a10Var);
        this.this$0 = okioStorageConnection;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readScope(null, this);
    }
}
