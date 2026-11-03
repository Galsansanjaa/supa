package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.core.view.UptodownTextView;
import com.uptodown.util.views.UsernameTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vd0 implements ViewBinding {
    public final RelativeLayout a;
    public final ImageView b;
    public final LinearLayout m;
    public final LinearLayout n;
    public final View o;
    public final UptodownTextView p;
    public final UptodownTextView q;
    public final UptodownTextView r;
    public final UptodownTextView s;
    public final UptodownTextView t;
    public final UsernameTextView u;
    public final UptodownTextView v;
    public final UptodownTextView w;
    public final UptodownTextView x;
    public final UptodownTextView y;

    public vd0(RelativeLayout relativeLayout, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, View view, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, UptodownTextView uptodownTextView3, UptodownTextView uptodownTextView4, UptodownTextView uptodownTextView5, UsernameTextView usernameTextView, UptodownTextView uptodownTextView6, UptodownTextView uptodownTextView7, UptodownTextView uptodownTextView8, UptodownTextView uptodownTextView9) {
        this.a = relativeLayout;
        this.b = imageView;
        this.m = linearLayout;
        this.n = linearLayout2;
        this.o = view;
        this.p = uptodownTextView;
        this.q = uptodownTextView2;
        this.r = uptodownTextView3;
        this.s = uptodownTextView4;
        this.t = uptodownTextView5;
        this.u = usernameTextView;
        this.v = uptodownTextView6;
        this.w = uptodownTextView7;
        this.x = uptodownTextView8;
        this.y = uptodownTextView9;
    }

    public static vd0 a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_feed_options, (ViewGroup) null, false);
        int i = R.id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_icon);
        if (imageView != null) {
            i = R.id.ll_apps_options;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_apps_options);
            if (linearLayout != null) {
                i = R.id.ll_user_options;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_user_options);
                if (linearLayout2 != null) {
                    i = R.id.loading_feed_dialog;
                    View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.loading_feed_dialog);
                    if (findChildViewById != null) {
                        i = R.id.rl_header;
                        if (((RelativeLayout) ViewBindings.findChildViewById(inflate, R.id.rl_header)) != null) {
                            i = R.id.tv_add_to_recommended;
                            UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_add_to_recommended);
                            if (uptodownTextView != null) {
                                i = R.id.tv_add_to_wishlist;
                                UptodownTextView uptodownTextView2 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_add_to_wishlist);
                                if (uptodownTextView2 != null) {
                                    i = R.id.tv_follow_action;
                                    UptodownTextView uptodownTextView3 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_follow_action);
                                    if (uptodownTextView3 != null) {
                                        i = R.id.tv_install;
                                        UptodownTextView uptodownTextView4 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_install);
                                        if (uptodownTextView4 != null) {
                                            i = R.id.tv_like;
                                            UptodownTextView uptodownTextView5 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_like);
                                            if (uptodownTextView5 != null) {
                                                i = R.id.tv_object_name;
                                                UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(inflate, R.id.tv_object_name);
                                                if (usernameTextView != null) {
                                                    i = R.id.tv_open_profile;
                                                    UptodownTextView uptodownTextView6 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_open_profile);
                                                    if (uptodownTextView6 != null) {
                                                        i = R.id.tv_reply;
                                                        UptodownTextView uptodownTextView7 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_reply);
                                                        if (uptodownTextView7 != null) {
                                                            i = R.id.tv_view_app_details;
                                                            UptodownTextView uptodownTextView8 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_view_app_details);
                                                            if (uptodownTextView8 != null) {
                                                                i = R.id.tv_write_comment;
                                                                UptodownTextView uptodownTextView9 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_write_comment);
                                                                if (uptodownTextView9 != null) {
                                                                    i = R.id.v_outside_header;
                                                                    if (ViewBindings.findChildViewById(inflate, R.id.v_outside_header) != null) {
                                                                        return new vd0((RelativeLayout) inflate, imageView, linearLayout, linearLayout2, findChildViewById, uptodownTextView, uptodownTextView2, uptodownTextView3, uptodownTextView4, uptodownTextView5, usernameTextView, uptodownTextView6, uptodownTextView7, uptodownTextView8, uptodownTextView9);
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
                        }
                    }
                }
            }
        }
        hu2.q("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
