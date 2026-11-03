package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.uptodown.activities.Gallery;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mt0 extends ViewPager2.OnPageChangeCallback {
    public final /* synthetic */ Gallery a;

    public mt0(Gallery gallery) {
        this.a = gallery;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        int i2 = Gallery.V;
        this.a.D0(i);
    }
}
