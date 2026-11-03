package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rb2 implements ViewBinding {
    public final /* synthetic */ int a = 0;
    public final RelativeLayout b;
    public final UptodownTextView m;
    public final UptodownTextView n;
    public final UptodownTextView o;
    public final View p;

    public rb2(RelativeLayout relativeLayout, View view, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, UptodownTextView uptodownTextView3) {
        this.b = relativeLayout;
        this.p = view;
        this.m = uptodownTextView;
        this.n = uptodownTextView2;
        this.o = uptodownTextView3;
    }

    public rb2(RelativeLayout relativeLayout, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, UptodownTextView uptodownTextView3, View view) {
        this.b = relativeLayout;
        this.m = uptodownTextView;
        this.n = uptodownTextView2;
        this.o = uptodownTextView3;
        this.p = view;
    }

    public static rb2 a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.scan_positive, (ViewGroup) null, false);
        int i = R.id.box_positive;
        View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.box_positive);
        if (findChildViewById != null) {
            i = R.id.tv_antivirus_name;
            UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_antivirus_name);
            if (uptodownTextView != null) {
                i = R.id.tv_virus_name;
                UptodownTextView uptodownTextView2 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_virus_name);
                if (uptodownTextView2 != null) {
                    i = R.id.tv_virus_type_badge;
                    UptodownTextView uptodownTextView3 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_virus_type_badge);
                    if (uptodownTextView3 != null) {
                        return new rb2((RelativeLayout) inflate, findChildViewById, uptodownTextView, uptodownTextView2, uptodownTextView3);
                    }
                }
            }
        }
        hu2.q("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
