package androidx.collection;

import defpackage.bb1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ScatterSet$toString$1 extends bb1 implements ps0 {
    final /* synthetic */ ScatterSet<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSet$toString$1(ScatterSet<E> scatterSet) {
        super(1);
        this.this$0 = scatterSet;
    }

    @Override // defpackage.ps0
    public final CharSequence invoke(E e) {
        return e == this.this$0 ? "(this)" : String.valueOf(e);
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((ScatterSet$toString$1) obj);
    }
}
