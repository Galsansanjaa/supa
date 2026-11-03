package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jj2 implements ViewBinding {
    public final /* synthetic */ int a;
    public final RelativeLayout b;
    public final ImageView m;
    public final UptodownTextView n;
    public final UptodownTextView o;

    public /* synthetic */ jj2(RelativeLayout relativeLayout, ImageView imageView, UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, int i) {
        this.a = i;
        this.b = relativeLayout;
        this.m = imageView;
        this.n = uptodownTextView;
        this.o = uptodownTextView2;
    }

    public static jj2 a(View view) {
        int i = R.id.iv_device_user_device_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_device_user_device_item);
        if (imageView != null) {
            i = R.id.iv_enter_user_device_item;
            if (((ImageView) ViewBindings.findChildViewById(view, R.id.iv_enter_user_device_item)) != null) {
                i = R.id.ll_info_user_device_item;
                if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info_user_device_item)) != null) {
                    i = R.id.tv_last_update_user_device_item;
                    UptodownTextView uptodownTextView = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_last_update_user_device_item);
                    if (uptodownTextView != null) {
                        i = R.id.tv_name_user_device_item;
                        UptodownTextView uptodownTextView2 = (UptodownTextView) ViewBindings.findChildViewById(view, R.id.tv_name_user_device_item);
                        if (uptodownTextView2 != null) {
                            return new jj2((RelativeLayout) view, imageView, uptodownTextView, uptodownTextView2, 1);
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
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }
}
