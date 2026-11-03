package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.Interaction;
import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.style.MutableStyleState$processInteractions$2", f = "StyleState.kt", l = {619}, m = "emit", v = 1)
/* loaded from: classes.dex */
public final class MutableStyleState$processInteractions$2$emit$1 extends c10 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MutableStyleState$processInteractions$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MutableStyleState$processInteractions$2$emit$1(MutableStyleState$processInteractions$2<? super T> mutableStyleState$processInteractions$2, a10 a10Var) {
        super(a10Var);
        this.this$0 = mutableStyleState$processInteractions$2;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Interaction) null, (a10) this);
    }
}
