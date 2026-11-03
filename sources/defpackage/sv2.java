package defpackage;

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
public final class sv2 extends Presenter {
    public int a = -1;
    public int b = -1;
    public int m = -1;
    public int n = -1;

    public final void a(rv2 rv2Var, boolean z) {
        int i = z ? this.a : this.b;
        int i2 = z ? this.n : this.m;
        rv2Var.setBackgroundColor(i);
        View findViewById = rv2Var.findViewById(R.id.info_field);
        if (findViewById != null) {
            findViewById.setBackgroundColor(i);
        }
        TextView textView = (TextView) rv2Var.findViewById(R.id.title_text);
        if (textView != null) {
            textView.setTextColor(i2);
        }
        TextView textView2 = (TextView) rv2Var.findViewById(R.id.content_text);
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        View view = viewHolder.view;
        view.getClass();
        ImageCardView imageCardView = (ImageCardView) view;
        if (!(obj instanceof cc)) {
            if (obj instanceof mx2) {
                Resources resources = imageCardView.getResources();
                imageCardView.setMainImageDimensions(resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height) / 2, resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height) / 2);
                int dimensionPixelSize = resources.getDimensionPixelSize(com.uptodown.R.dimen.margin_m) * 5;
                imageCardView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                imageCardView.setMainImage(ContextCompat.getDrawable(imageCardView.getContext(), com.uptodown.R.drawable.vector_plus));
                TextView textView = (TextView) imageCardView.findViewById(R.id.title_text);
                if (textView != null) {
                    textView.setVisibility(8);
                    textView.setText("");
                }
                TextView textView2 = (TextView) imageCardView.findViewById(R.id.content_text);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    textView2.setText("");
                    return;
                }
                return;
            }
            return;
        }
        cc ccVar = (cc) obj;
        imageCardView.setTitleText(ccVar.b);
        imageCardView.setContentText(ccVar.p);
        TextView textView3 = (TextView) imageCardView.findViewById(R.id.title_text);
        if (textView3 != null) {
            textView3.setVisibility(0);
            textView3.setTextColor(this.m);
            textView3.setTypeface(k13.w);
        }
        TextView textView4 = (TextView) imageCardView.findViewById(R.id.content_text);
        if (textView4 != null) {
            textView4.setVisibility(0);
            textView4.setTextColor(this.m);
            textView4.setTypeface(k13.x);
            textView4.setMaxLines(2);
            textView4.setLines(2);
        }
        Resources resources2 = imageCardView.getResources();
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height);
        imageCardView.setMainImageDimensions(dimensionPixelSize2, resources2.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height));
        l72 e = dx1.d().e(ccVar.g(dimensionPixelSize2));
        e.f();
        e.e(imageCardView.getMainImageView(), null);
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(com.uptodown.R.dimen.margin_m);
        imageCardView.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.b = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.background_color);
        this.a = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.background_color);
        this.m = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.text_secundary);
        this.n = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.text_primary);
        rv2 rv2Var = new rv2(this, viewGroup.getContext());
        rv2Var.setFocusable(true);
        rv2Var.setFocusableInTouchMode(true);
        a(rv2Var, false);
        return new Presenter.ViewHolder(rv2Var);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
        View view = viewHolder.view;
        view.getClass();
        ImageCardView imageCardView = (ImageCardView) view;
        imageCardView.setBadgeImage(null);
        imageCardView.setMainImage(null);
    }
}
