package androidx.compose.ui.window;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.ps0;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return AndroidDialog_androidKt.b((DialogWrapper) obj2, (DisposableEffectScope) obj);
            case 1:
                return DialogWrapper.b((DialogWrapper) obj2, (OnBackPressedCallback) obj);
            default:
                return AndroidDialog_androidKt$DialogLayout$1$1.a((ArrayList) obj2, (Placeable.PlacementScope) obj);
        }
    }
}
