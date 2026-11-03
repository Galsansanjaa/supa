package androidx.compose.foundation.text.contextmenu.gestures;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt", f = "RightClickGestures.kt", l = {45}, m = "awaitFirstRightClickDown", v = 1)
/* loaded from: classes.dex */
public final class RightClickGesturesKt$awaitFirstRightClickDown$1 extends c10 {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public RightClickGesturesKt$awaitFirstRightClickDown$1(a10 a10Var) {
        super(a10Var);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        Object awaitFirstRightClickDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitFirstRightClickDown = RightClickGesturesKt.awaitFirstRightClickDown(null, this);
        return awaitFirstRightClickDown;
    }
}
