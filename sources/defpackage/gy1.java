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
public final class gy1 implements ViewBinding {
    public final /* synthetic */ int a;
    public final RelativeLayout b;
    public final UptodownTextView m;
    public final UptodownTextView n;

    public /* synthetic */ gy1(RelativeLayout relativeLayout, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, int i) {
        this.a = i;
        this.b = relativeLayout;
        this.m = uptodownTextView;
        this.n = uptodownTextView2;
    }

    public static gy1 a(View view) {
        int i = R.id.iv_preference_item;
        if (((ImageView) ViewBindings.findChildViewById(view, R.id.iv_preference_item)) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.tv_preference_item_description;
            UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_preference_item_description);
            if (uptodownTextView != null) {
                i2 = R.id.tv_preference_item_title;
                UptodownTextView uptodownTextView2 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_preference_item_title);
                if (uptodownTextView2 != null) {
                    return new gy1(relativeLayout, uptodownTextView, uptodownTextView2, 0);
                }
            }
            i = i2;
        }
        hu2.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static gy1 b(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.tv_preference_list_description;
        UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_preference_list_description);
        if (uptodownTextView != null) {
            i = R.id.tv_preference_list_title;
            UptodownTextView uptodownTextView2 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_preference_list_title);
            if (uptodownTextView2 != null) {
                return new gy1(relativeLayout, uptodownTextView, uptodownTextView2, 1);
            }
        }
        hu2.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
