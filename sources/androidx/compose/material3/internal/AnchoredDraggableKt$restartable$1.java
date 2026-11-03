package androidx.compose.material3.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {TypedValues.TransitionType.TYPE_STAGGERED}, m = "restartable")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$1<I> extends c10 {
    int label;
    /* synthetic */ Object result;

    public AnchoredDraggableKt$restartable$1(a10 a10Var) {
        super(a10Var);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        Object restartable;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        restartable = AnchoredDraggableKt.restartable(null, null, this);
        return restartable;
    }
}
