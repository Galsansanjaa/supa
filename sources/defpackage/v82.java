package defpackage;

import android.view.View;
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
public final class v82 implements ViewBinding {
    public final UptodownTextView A;
    public final UptodownTextView B;
    public final UsernameTextView C;
    public final RelativeLayout a;
    public final ImageView b;
    public final ImageView m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final ImageView r;
    public final ImageView s;
    public final ImageView t;
    public final LinearLayout u;
    public final LinearLayout v;
    public final UptodownTextView w;
    public final UptodownTextView x;
    public final UptodownTextView y;
    public final UptodownTextView z;

    public v82(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout, LinearLayout linearLayout2, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, UptodownTextView uptodownTextView3, UptodownTextView uptodownTextView4, UptodownTextView uptodownTextView5, UptodownTextView uptodownTextView6, UsernameTextView usernameTextView) {
        this.a = relativeLayout;
        this.b = imageView;
        this.m = imageView2;
        this.n = imageView3;
        this.o = imageView4;
        this.p = imageView5;
        this.q = imageView6;
        this.r = imageView7;
        this.s = imageView8;
        this.t = imageView9;
        this.u = linearLayout;
        this.v = linearLayout2;
        this.w = uptodownTextView;
        this.x = uptodownTextView2;
        this.y = uptodownTextView3;
        this.z = uptodownTextView4;
        this.A = uptodownTextView5;
        this.B = uptodownTextView6;
        this.C = usernameTextView;
    }

    public static v82 a(View view) {
        int i = R.id.iv_author_verified_review;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_author_verified_review);
        if (imageView != null) {
            i = R.id.iv_avatar_review;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_review);
            if (imageView2 != null) {
                i = R.id.iv_follow_user_review;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_follow_user_review);
                if (imageView3 != null) {
                    i = R.id.iv_likes_counter_review;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_likes_counter_review);
                    if (imageView4 != null) {
                        i = R.id.iv_star1_review;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star1_review);
                        if (imageView5 != null) {
                            i = R.id.iv_star2_review;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star2_review);
                            if (imageView6 != null) {
                                i = R.id.iv_star3_review;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star3_review);
                                if (imageView7 != null) {
                                    i = R.id.iv_star4_review;
                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star4_review);
                                    if (imageView8 != null) {
                                        i = R.id.iv_star5_review;
                                        ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_star5_review);
                                        if (imageView9 != null) {
                                            i = R.id.iv_turbo_mark_review;
                                            if (((ImageView) ViewBindings.findChildViewById(view, R.id.iv_turbo_mark_review)) != null) {
                                                i = R.id.ll_likes_review;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_likes_review);
                                                if (linearLayout != null) {
                                                    i = R.id.ll_reviews_counter_review;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_reviews_counter_review);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.ll_stars_review;
                                                        if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_stars_review)) != null) {
                                                            i = R.id.ll_username_review;
                                                            if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_username_review)) != null) {
                                                                i = R.id.tv_body_review;
                                                                UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_body_review);
                                                                if (uptodownTextView != null) {
                                                                    i = R.id.tv_date_review;
                                                                    UptodownTextView uptodownTextView2 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_date_review);
                                                                    if (uptodownTextView2 != null) {
                                                                        i = R.id.tv_likes_counter_review;
                                                                        UptodownTextView uptodownTextView3 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_likes_counter_review);
                                                                        if (uptodownTextView3 != null) {
                                                                            i = R.id.tv_reply_review;
                                                                            UptodownTextView uptodownTextView4 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_reply_review);
                                                                            if (uptodownTextView4 != null) {
                                                                                i = R.id.tv_reviews_counter_review;
                                                                                UptodownTextView uptodownTextView5 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_reviews_counter_review);
                                                                                if (uptodownTextView5 != null) {
                                                                                    i = R.id.tv_show_more_review;
                                                                                    UptodownTextView uptodownTextView6 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_show_more_review);
                                                                                    if (uptodownTextView6 != null) {
                                                                                        i = R.id.tv_username_review;
                                                                                        UsernameTextView usernameTextView = (UsernameTextView) ViewBindings.findChildViewById(view, R.id.tv_username_review);
                                                                                        if (usernameTextView != null) {
                                                                                            return new v82((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, linearLayout, linearLayout2, uptodownTextView, uptodownTextView2, uptodownTextView3, uptodownTextView4, uptodownTextView5, uptodownTextView6, usernameTextView);
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
