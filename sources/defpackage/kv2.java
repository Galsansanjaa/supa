package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.leanback.R;
import androidx.leanback.widget.DetailsOverviewLogoPresenter;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.Presenter;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class kv2 extends DetailsOverviewLogoPresenter {
    @Override // androidx.leanback.widget.DetailsOverviewLogoPresenter, androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        FullWidthDetailsOverviewRowPresenter parentPresenter;
        viewHolder.getClass();
        if (obj == null) {
            return;
        }
        DetailsOverviewRow detailsOverviewRow = (DetailsOverviewRow) obj;
        View view = viewHolder.view;
        view.getClass();
        ((ImageView) view).setImageDrawable(detailsOverviewRow.getImageDrawable());
        jv2 jv2Var = (jv2) viewHolder;
        if (!isBoundToImage(jv2Var, detailsOverviewRow) || (parentPresenter = jv2Var.getParentPresenter()) == null) {
            return;
        }
        parentPresenter.notifyOnBindLogo(jv2Var.getParentViewHolder());
    }

    @Override // androidx.leanback.widget.DetailsOverviewLogoPresenter, androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_fullwidth_details_overview_logo, viewGroup, false);
        inflate.getClass();
        ImageView imageView = (ImageView) inflate;
        Resources resources = viewGroup.getResources();
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_detail_thumb_width), resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_detail_thumb_height)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new DetailsOverviewLogoPresenter.ViewHolder(imageView);
    }
}
