package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class w43 implements ViewBinding {
    public final RelativeLayout a;
    public final LinearLayout b;
    public final LinearLayout m;
    public final LinearLayout n;
    public final LinearLayout o;
    public final Toolbar p;

    public w43(RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, Toolbar toolbar) {
        this.a = relativeLayout;
        this.b = linearLayout;
        this.m = linearLayout2;
        this.n = linearLayout3;
        this.o = linearLayout4;
        this.p = toolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
