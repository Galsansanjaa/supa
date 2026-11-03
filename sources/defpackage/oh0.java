package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class oh0 implements ViewBinding {
    public final /* synthetic */ int a;
    public final LinearLayout b;
    public final UptodownTextView m;

    public /* synthetic */ oh0(LinearLayout linearLayout, UptodownTextView uptodownTextView, int i) {
        this.a = i;
        this.b = linearLayout;
        this.m = uptodownTextView;
    }

    public static oh0 a(View view) {
        int i = R.id.iv_version_details_update_item;
        if (((ImageView) ViewBindings.findChildViewById(view, R.id.iv_version_details_update_item)) != null) {
            i = R.id.tv_order_label_selector;
            if (((UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_order_label_selector)) != null) {
                i = R.id.tv_order_selector;
                UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_order_selector);
                if (uptodownTextView != null) {
                    return new oh0((LinearLayout) view, uptodownTextView, 0);
                }
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
