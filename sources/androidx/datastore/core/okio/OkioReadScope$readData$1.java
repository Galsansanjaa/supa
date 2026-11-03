package androidx.datastore.core.okio;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {SubsamplingScaleImageView.ORIENTATION_180, 187}, m = "readData$suspendImpl")
/* loaded from: classes3.dex */
public final class OkioReadScope$readData$1<T> extends c10 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkioReadScope<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioReadScope$readData$1(OkioReadScope<T> okioReadScope, a10 a10Var) {
        super(a10Var);
        this.this$0 = okioReadScope;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OkioReadScope.readData$suspendImpl(this.this$0, this);
    }
}
