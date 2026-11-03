package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import com.uptodown.core.view.UptodownEditText;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rv1 implements ViewBinding {
    public final RelativeLayout a;
    public final UptodownEditText b;
    public final UptodownEditText m;
    public final View n;
    public final UptodownTextView o;

    public rv1(RelativeLayout relativeLayout, UptodownEditText uptodownEditText, UptodownEditText uptodownEditText2, View view, UptodownTextView uptodownTextView) {
        this.a = relativeLayout;
        this.b = uptodownEditText;
        this.m = uptodownEditText2;
        this.n = view;
        this.o = uptodownTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
