package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nt0 implements ViewBinding {
    public final RelativeLayout a;
    public final ImageView b;
    public final RelativeLayout m;
    public final UptodownTextView n;
    public final ViewPager2 o;

    public nt0(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, UptodownTextView uptodownTextView, ViewPager2 viewPager2) {
        this.a = relativeLayout;
        this.b = imageView;
        this.m = relativeLayout2;
        this.n = uptodownTextView;
        this.o = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
