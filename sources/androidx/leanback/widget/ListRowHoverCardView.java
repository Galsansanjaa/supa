package androidx.leanback.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ListRowHoverCardView extends LinearLayout {
    private final TextView mDescriptionView;
    private final TextView mTitleView;

    public ListRowHoverCardView(Context context) {
        this(context, null);
    }

    public ListRowHoverCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListRowHoverCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(androidx.leanback.R.layout.lb_list_row_hovercard, this);
        this.mTitleView = (TextView) findViewById(androidx.leanback.R.id.title);
        this.mDescriptionView = (TextView) findViewById(androidx.leanback.R.id.description);
    }

    public final CharSequence getDescription() {
        return this.mDescriptionView.getText();
    }

    public final CharSequence getTitle() {
        return this.mTitleView.getText();
    }

    public final void setDescription(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mDescriptionView;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.mDescriptionView.setVisibility(0);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTitleView;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.mTitleView.setVisibility(0);
        }
    }
}
