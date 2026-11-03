package androidx.datastore.core;

import defpackage.a10;
import defpackage.e50;
import defpackage.hu2;
import defpackage.lb0;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.datastore.core.StorageConnectionKt$writeData$2", f = "StorageConnection.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StorageConnectionKt$writeData$2 extends tn2 implements ts0 {
    final /* synthetic */ T $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageConnectionKt$writeData$2(T t, a10 a10Var) {
        super(2, a10Var);
        this.$value = t;
    }

    @Override // defpackage.cm
    public final a10 create(Object obj, a10 a10Var) {
        StorageConnectionKt$writeData$2 storageConnectionKt$writeData$2 = new StorageConnectionKt$writeData$2(this.$value, a10Var);
        storageConnectionKt$writeData$2.L$0 = obj;
        return storageConnectionKt$writeData$2;
    }

    @Override // defpackage.ts0
    public final Object invoke(WriteScope<T> writeScope, a10 a10Var) {
        return ((StorageConnectionKt$writeData$2) create(writeScope, a10Var)).invokeSuspend(vy2.a);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ta3.H(obj);
            WriteScope writeScope = (WriteScope) this.L$0;
            T t = this.$value;
            this.label = 1;
            Object writeData = writeScope.writeData(t, this);
            e50 e50Var = e50.a;
            if (writeData == e50Var) {
                return e50Var;
            }
        } else {
            if (i != 1) {
                hu2.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ta3.H(obj);
        }
        return vy2.a;
    }
}
