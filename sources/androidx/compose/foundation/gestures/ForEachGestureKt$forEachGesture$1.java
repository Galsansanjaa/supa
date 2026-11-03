package androidx.compose.foundation.gestures;

import androidx.compose.foundation.style.StylePropertiesKt;
import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {48, 51, StylePropertiesKt.InnerShadowId}, m = "forEachGesture", v = 1)
/* loaded from: classes.dex */
public final class ForEachGestureKt$forEachGesture$1 extends c10 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ForEachGestureKt$forEachGesture$1(a10 a10Var) {
        super(a10Var);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ForEachGestureKt.forEachGesture(null, null, this);
    }
}
