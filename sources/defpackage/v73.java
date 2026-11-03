package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class v73 implements ViewBinding {
    public final RelativeLayout a;
    public final ImageView b;
    public final RelativeLayout m;
    public final RelativeLayout n;
    public final UptodownTextView o;
    public final UptodownTextView p;
    public final UptodownTextView q;
    public final UptodownTextView r;
    public final UptodownTextView s;
    public final UptodownTextView t;
    public final View u;
    public final View v;

    public v73(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, UptodownTextView uptodownTextView3, UptodownTextView uptodownTextView4, UptodownTextView uptodownTextView5, UptodownTextView uptodownTextView6, View view, View view2) {
        this.a = relativeLayout;
        this.b = imageView;
        this.m = relativeLayout2;
        this.n = relativeLayout3;
        this.o = uptodownTextView;
        this.p = uptodownTextView2;
        this.q = uptodownTextView3;
        this.r = uptodownTextView4;
        this.s = uptodownTextView5;
        this.t = uptodownTextView6;
        this.u = view;
        this.v = view2;
    }

    public static v73 a(View view) {
        int i = R.id.iv_vt_warning;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_vt_warning);
        if (imageView != null) {
            i = R.id.rl_vt_warning_header;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_vt_warning_header);
            if (relativeLayout != null) {
                i = R.id.rl_vt_warning_ia;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_vt_warning_ia);
                if (relativeLayout2 != null) {
                    i = R.id.tv_vt_ia_analysis;
                    UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_vt_ia_analysis);
                    if (uptodownTextView != null) {
                        i = R.id.tv_vt_ia_analysis_title;
                        UptodownTextView uptodownTextView2 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_vt_ia_analysis_title);
                        if (uptodownTextView2 != null) {
                            i = R.id.tv_vt_warning_latest_scan_title;
                            UptodownTextView uptodownTextView3 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_vt_warning_latest_scan_title);
                            if (uptodownTextView3 != null) {
                                i = R.id.tv_vt_warning_placeholder;
                                UptodownTextView uptodownTextView4 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_vt_warning_placeholder);
                                if (uptodownTextView4 != null) {
                                    i = R.id.tv_vt_warning_subtitle;
                                    UptodownTextView uptodownTextView5 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_vt_warning_subtitle);
                                    if (uptodownTextView5 != null) {
                                        i = R.id.tv_vt_warning_title;
                                        UptodownTextView uptodownTextView6 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_vt_warning_title);
                                        if (uptodownTextView6 != null) {
                                            i = R.id.v_bg_stroke;
                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_bg_stroke);
                                            if (findChildViewById != null) {
                                                i = R.id.v_separator;
                                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_separator);
                                                if (findChildViewById2 != null) {
                                                    return new v73((RelativeLayout) view, imageView, relativeLayout, relativeLayout2, uptodownTextView, uptodownTextView2, uptodownTextView3, uptodownTextView4, uptodownTextView5, uptodownTextView6, findChildViewById, findChildViewById2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hu2.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
