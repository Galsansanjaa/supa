package androidx.compose.foundation.layout;

import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {301, 327, 352}, m = "fling-huYlsQE", v = 1)
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends c10 {
    float F$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, a10 a10Var) {
        super(a10Var);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        Object m1150flinghuYlsQE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m1150flinghuYlsQE = this.this$0.m1150flinghuYlsQE(0L, 0.0f, false, this);
        return m1150flinghuYlsQE;
    }
}
