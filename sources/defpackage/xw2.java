package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.R;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xw2 extends Presenter {
    public int a;
    public int b;
    public int m;
    public int n;

    public final void a(ww2 ww2Var, boolean z) {
        int i = z ? this.a : this.b;
        int i2 = z ? this.n : this.m;
        ww2Var.setBackgroundColor(i);
        ww2Var.findViewById(R.id.info_field).setBackgroundColor(i);
        View findViewById = ww2Var.findViewById(R.id.title_text);
        findViewById.getClass();
        ((TextView) findViewById).setTextColor(i2);
        View findViewById2 = ww2Var.findViewById(R.id.content_text);
        findViewById2.getClass();
        ((TextView) findViewById2).setTextColor(i2);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        View view = viewHolder.view;
        view.getClass();
        ImageCardView imageCardView = (ImageCardView) view;
        if (obj instanceof r7) {
            r7 r7Var = (r7) obj;
            imageCardView.setTitleText(r7Var.b);
            Context context = imageCardView.getContext();
            context.getClass();
            imageCardView.setContentText(jh2.X(context, r7Var.x));
            Resources resources = imageCardView.getResources();
            imageCardView.setMainImageDimensions(resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height), resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height));
            yb ybVar = ac.a;
            ac.b(imageCardView, r7Var.m, new ok2(imageCardView, 12));
            imageCardView.setPadding(18, 18, 18, 18);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.b = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.background_color);
        this.a = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.background_color);
        this.m = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.text_primary);
        this.n = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.text_secundary);
        ww2 ww2Var = new ww2(this, viewGroup.getContext());
        ww2Var.setFocusable(true);
        ww2Var.setFocusableInTouchMode(true);
        a(ww2Var, false);
        return new Presenter.ViewHolder(ww2Var);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
        View view = viewHolder.view;
        view.getClass();
        ImageCardView imageCardView = (ImageCardView) view;
        yb ybVar = ac.a;
        Object tag = imageCardView.getTag(com.uptodown.R.id.tag_app_icon_job);
        r71 r71Var = tag instanceof r71 ? (r71) tag : null;
        if (r71Var != null) {
            r71Var.cancel(null);
        }
        imageCardView.setTag(com.uptodown.R.id.tag_app_icon_job, null);
        imageCardView.setBadgeImage(null);
        imageCardView.setMainImage(null);
    }
}
