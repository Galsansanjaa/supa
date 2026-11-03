package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.leanback.widget.SearchOrbView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class TitleViewAdapter {
    public static final int BRANDING_VIEW_VISIBLE = 2;
    public static final int FULL_VIEW_VISIBLE = 6;
    public static final int SEARCH_VIEW_VISIBLE = 4;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public interface Provider {
        TitleViewAdapter getTitleViewAdapter();
    }

    public Drawable getBadgeDrawable() {
        return null;
    }

    public SearchOrbView.Colors getSearchAffordanceColors() {
        return null;
    }

    public abstract View getSearchAffordanceView();

    public CharSequence getTitle() {
        return null;
    }

    public void setAnimationEnabled(boolean z) {
    }

    public void setBadgeDrawable(Drawable drawable) {
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        View searchAffordanceView = getSearchAffordanceView();
        if (searchAffordanceView != null) {
            searchAffordanceView.setOnClickListener(onClickListener);
        }
    }

    public void setSearchAffordanceColors(SearchOrbView.Colors colors) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void updateComponentsVisibility(int i) {
    }
}
