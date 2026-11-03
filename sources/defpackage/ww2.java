package defpackage;

import android.content.Context;
import androidx.leanback.widget.ImageCardView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ww2 extends ImageCardView {
    public final /* synthetic */ xw2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww2(xw2 xw2Var, Context context) {
        super(context);
        this.a = xw2Var;
    }

    @Override // androidx.leanback.widget.BaseCardView, android.view.View
    public void setSelected(boolean z) {
        this.a.a(this, z);
        super.setSelected(z);
    }
}
