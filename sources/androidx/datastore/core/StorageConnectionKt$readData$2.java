package androidx.datastore.core;

import defpackage.a10;
import defpackage.e50;
import defpackage.hu2;
import defpackage.lb0;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.us0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StorageConnectionKt$readData$2 extends tn2 implements us0 {
    private /* synthetic */ Object L$0;
    int label;

    public StorageConnectionKt$readData$2(a10 a10Var) {
        super(3, a10Var);
    }

    public final Object invoke(ReadScope<T> readScope, boolean z, a10 a10Var) {
        StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new StorageConnectionKt$readData$2(a10Var);
        storageConnectionKt$readData$2.L$0 = readScope;
        return storageConnectionKt$readData$2.invokeSuspend(vy2.a);
    }

    @Override // defpackage.us0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (a10) obj3);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ta3.H(obj);
                return obj;
            }
            hu2.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ta3.H(obj);
        ReadScope readScope = (ReadScope) this.L$0;
        this.label = 1;
        Object readData = readScope.readData(this);
        e50 e50Var = e50.a;
        return readData == e50Var ? e50Var : readData;
    }
}
