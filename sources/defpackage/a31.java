package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class a31 implements ViewBinding {
    public final RelativeLayout a;
    public final Toolbar b;
    public final UptodownTextView m;

    public a31(RelativeLayout relativeLayout, Toolbar toolbar, UptodownTextView uptodownTextView) {
        this.a = relativeLayout;
        this.b = toolbar;
        this.m = uptodownTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
