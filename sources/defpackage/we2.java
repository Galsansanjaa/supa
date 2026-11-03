package defpackage;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class we2 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectionManager b;

    public /* synthetic */ we2(SelectionManager selectionManager, int i) {
        this.a = i;
        this.b = selectionManager;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        vy2 _get_modifier_$lambda$0;
        vy2 _init_$lambda$4;
        LayoutCoordinates layoutCoordinates;
        Rect contentRect;
        MouseSelectionObserver mouseSelectionObserver_delegate$lambda$0;
        vy2 addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0;
        boolean addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1;
        vy2 addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2;
        int i = this.a;
        SelectionManager selectionManager = this.b;
        switch (i) {
            case 0:
                return SelectionContainerKt.l(selectionManager);
            case 1:
                return SelectionContainerKt.d(selectionManager);
            case 2:
                _get_modifier_$lambda$0 = SelectionManager._get_modifier_$lambda$0(selectionManager);
                return _get_modifier_$lambda$0;
            case 3:
                _init_$lambda$4 = SelectionManager._init_$lambda$4(selectionManager);
                return _init_$lambda$4;
            case 4:
                layoutCoordinates = selectionManager.containerLayoutCoordinates;
                return layoutCoordinates;
            case 5:
                contentRect = selectionManager.getContentRect();
                return contentRect;
            case 6:
                mouseSelectionObserver_delegate$lambda$0 = SelectionManager.mouseSelectionObserver_delegate$lambda$0(selectionManager);
                return mouseSelectionObserver_delegate$lambda$0;
            case 7:
                return SelectionManagerKt.c(selectionManager);
            case 8:
                return SelectionManagerKt.a(selectionManager);
            case 9:
                addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0(selectionManager);
                return addSelectionContainerTextContextMenuComponents$lambda$0$1$0$0;
            case 10:
                addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1(selectionManager);
                return Boolean.valueOf(addSelectionContainerTextContextMenuComponents$lambda$0$1$0$1);
            default:
                addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2(selectionManager);
                return addSelectionContainerTextContextMenuComponents$lambda$0$1$0$2;
        }
    }
}
