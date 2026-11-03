package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.uptodown.core.view.UptodownTextView;
import com.uptodown.views.FullWidthImageView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jj implements ViewBinding {
    public final /* synthetic */ int a;
    public Object b;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;

    public /* synthetic */ jj(ViewGroup viewGroup, View view, ImageView imageView, ImageView imageView2, View view2, View view3, View view4, View view5, AppCompatTextView appCompatTextView, int i) {
        this.a = i;
        this.b = viewGroup;
        this.m = view;
        this.n = imageView;
        this.o = imageView2;
        this.p = view2;
        this.q = view3;
        this.r = view4;
        this.s = view5;
        this.t = appCompatTextView;
    }

    public jj(RelativeLayout relativeLayout, FullWidthImageView fullWidthImageView, ImageView imageView, LinearLayout linearLayout, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, UptodownTextView uptodownTextView3, UptodownTextView uptodownTextView4, UptodownTextView uptodownTextView5, UptodownTextView uptodownTextView6) {
        this.a = 3;
        this.b = relativeLayout;
        this.m = fullWidthImageView;
        this.n = imageView;
        this.o = uptodownTextView;
        this.p = uptodownTextView2;
        this.q = uptodownTextView3;
        this.r = uptodownTextView4;
        this.s = uptodownTextView5;
        this.t = uptodownTextView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.a) {
            case 1:
                return (RelativeLayout) this.b;
            case 2:
                return (RelativeLayout) this.b;
            case 3:
                return (RelativeLayout) this.b;
            default:
                return (LinearLayout) this.b;
        }
    }
}
