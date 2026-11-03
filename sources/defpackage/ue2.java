package defpackage;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class ue2 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ ue2(SelectionManager selectionManager, int i) {
        this.a = i;
        this.b = selectionManager;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        DisposableEffectResult SelectionContainer$lambda$10$0;
        vy2 _init_$lambda$5;
        vy2 _init_$lambda$6;
        vy2 _get_modifier_$lambda$1;
        vy2 _get_modifier_$lambda$2;
        vy2 _get_modifier_$lambda$3;
        Rect _get_contextMenuAreaModifier_$lambda$0;
        vy2 onSelectionChange$lambda$0;
        vy2 _init_$lambda$0;
        int i = this.a;
        SelectionManager selectionManager = this.b;
        switch (i) {
            case 0:
                SelectionContainer$lambda$10$0 = SelectionContainerKt.SelectionContainer$lambda$10$0(selectionManager, (DisposableEffectScope) obj);
                return SelectionContainer$lambda$10$0;
            case 1:
                _init_$lambda$5 = SelectionManager._init_$lambda$5(selectionManager, ((Long) obj).longValue());
                return _init_$lambda$5;
            case 2:
                _init_$lambda$6 = SelectionManager._init_$lambda$6(selectionManager, ((Long) obj).longValue());
                return _init_$lambda$6;
            case 3:
                _get_modifier_$lambda$1 = SelectionManager._get_modifier_$lambda$1(selectionManager, (LayoutCoordinates) obj);
                return _get_modifier_$lambda$1;
            case 4:
                _get_modifier_$lambda$2 = SelectionManager._get_modifier_$lambda$2(selectionManager, (FocusState) obj);
                return _get_modifier_$lambda$2;
            case 5:
                _get_modifier_$lambda$3 = SelectionManager._get_modifier_$lambda$3(selectionManager, ((Boolean) obj).booleanValue());
                return _get_modifier_$lambda$3;
            case 6:
                _get_contextMenuAreaModifier_$lambda$0 = SelectionManager._get_contextMenuAreaModifier_$lambda$0(selectionManager, (LayoutCoordinates) obj);
                return _get_contextMenuAreaModifier_$lambda$0;
            case 7:
                onSelectionChange$lambda$0 = SelectionManager.onSelectionChange$lambda$0(selectionManager, (Selection) obj);
                return onSelectionChange$lambda$0;
            default:
                _init_$lambda$0 = SelectionManager._init_$lambda$0(selectionManager, ((Long) obj).longValue());
                return _init_$lambda$0;
        }
    }
}
