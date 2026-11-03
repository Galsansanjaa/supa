package androidx.core.view;

import android.view.ViewParent;
import defpackage.et0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends et0 implements ps0 {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.ps0
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
