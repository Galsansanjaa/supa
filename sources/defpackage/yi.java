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
import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yi implements ViewBinding {
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
    public Object u;

    public /* synthetic */ yi() {
        this.a = 0;
    }

    public /* synthetic */ yi(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, View view6, View view7, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.m = view;
        this.n = view2;
        this.o = view3;
        this.p = view4;
        this.q = view5;
        this.r = view6;
        this.s = view7;
        this.t = uptodownTextView;
        this.u = uptodownTextView2;
    }

    public static yi c(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.feed_item_comment_view, (ViewGroup) null, false);
        int i = R.id.iv_icon_feed_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_icon_feed_item);
        if (imageView != null) {
            i = R.id.iv_options_feed_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_options_feed_item);
            if (imageView2 != null) {
                i = R.id.iv_star1_review_feed_item;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_star1_review_feed_item);
                if (imageView3 != null) {
                    i = R.id.iv_star2_review_feed_item;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_star2_review_feed_item);
                    if (imageView4 != null) {
                        i = R.id.iv_star3_review_feed_item;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_star3_review_feed_item);
                        if (imageView5 != null) {
                            i = R.id.iv_star4_review_feed_item;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_star4_review_feed_item);
                            if (imageView6 != null) {
                                i = R.id.iv_star5_review_feed_item;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.iv_star5_review_feed_item);
                                if (imageView7 != null) {
                                    i = R.id.ll_stars_review_feed_item;
                                    if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.ll_stars_review_feed_item)) != null) {
                                        i = R.id.tv_app_name_feed_item;
                                        UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_app_name_feed_item);
                                        if (uptodownTextView != null) {
                                            i = R.id.tv_body_feed_item;
                                            UptodownTextView uptodownTextView2 = (UptodownTextView) ViewBindings.findChildViewById(inflate, R.id.tv_body_feed_item);
                                            if (uptodownTextView2 != null) {
                                                return new yi((RelativeLayout) inflate, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, uptodownTextView, uptodownTextView2, 2);
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

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.s;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            hu2.h("Property \"autoMetadata\" has not been set");
        }
    }

    public zi b() {
        String str = ((String) this.b) == null ? " transportName" : "";
        if (((xi0) this.p) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.q) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.r) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.s) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new zi((String) this.b, (Integer) this.n, (xi0) this.p, ((Long) this.q).longValue(), ((Long) this.r).longValue(), (HashMap) this.s, (Integer) this.o, (String) this.m, (byte[]) this.t, (byte[]) this.u);
        }
        hu2.h("Missing required properties:".concat(str));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.a) {
            case 1:
                return (LinearLayout) this.b;
            default:
                return (RelativeLayout) this.b;
        }
    }
}
