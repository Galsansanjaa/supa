package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import defpackage.bb1;
import defpackage.nf2;
import defpackage.ps0;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ViewGroupKt$descendants$1$1 extends bb1 implements ps0 {
    public static final ViewGroupKt$descendants$1$1 INSTANCE = new ViewGroupKt$descendants$1$1();

    public ViewGroupKt$descendants$1$1() {
        super(1);
    }

    @Override // defpackage.ps0
    public final Iterator<View> invoke(View view) {
        nf2 children;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
