package defpackage;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class yj1 implements ps0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ yj1(y42 y42Var, y42 y42Var2, Handle handle, TextFieldSelectionState textFieldSelectionState, boolean z) {
        this.m = y42Var;
        this.n = textFieldSelectionState;
        this.b = z;
        this.o = handle;
        this.p = y42Var2;
    }

    public /* synthetic */ yj1(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2) {
        this.b = z;
        this.m = mutableTransitionState;
        this.n = mutableState;
        this.o = state;
        this.p = state2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 detectSelectionHandleDragGestures$lambda$0;
        int i = this.a;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (i) {
            case 0:
                return MenuKt.c(this.b, (MutableTransitionState) obj5, (MutableState) obj4, (State) obj3, (State) obj2, (GraphicsLayerScope) obj);
            default:
                detectSelectionHandleDragGestures$lambda$0 = TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$0((y42) obj5, (TextFieldSelectionState) obj4, this.b, (Handle) obj3, (y42) obj2, (Offset) obj);
                return detectSelectionHandleDragGestures$lambda$0;
        }
    }
}
