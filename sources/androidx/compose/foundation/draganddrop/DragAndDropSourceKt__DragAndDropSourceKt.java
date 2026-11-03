package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final /* synthetic */ class DragAndDropSourceKt__DragAndDropSourceKt {
    public static final Modifier dragAndDropSource(Modifier modifier, ps0 ps0Var) {
        return modifier.then(new DragAndDropSourceWithDefaultShadowElement(DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), ps0Var));
    }

    public static final Modifier dragAndDropSource(Modifier modifier, ps0 ps0Var, ps0 ps0Var2) {
        return modifier.then(new DragAndDropSourceElement(ps0Var, DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), ps0Var2));
    }
}
