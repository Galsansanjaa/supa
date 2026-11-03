package androidx.activity.contextaware;

import android.content.Context;
import defpackage.d82;
import defpackage.os;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ os $co;
    final /* synthetic */ ps0 $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(os osVar, ps0 ps0Var) {
        this.$co = osVar;
        this.$onContextAvailable = ps0Var;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object d82Var;
        context.getClass();
        os osVar = this.$co;
        try {
            d82Var = this.$onContextAvailable.invoke(context);
        } catch (Throwable th) {
            d82Var = new d82(th);
        }
        osVar.resumeWith(d82Var);
    }
}
